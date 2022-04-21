package emailApplication;

import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class LoginService extends Service<EmailLoginResult> {
	EmailAccount emailAccount;
	EmailManager emailManager;
	
	public LoginService(EmailAccount emailAccountl,EmailManager emailManager){
		this.emailAccount=emailAccountl;
		this.emailManager=emailManager;
	}
	
	private EmailLoginResult login() {
		
		Authenticator authenticator=new Authenticator() {
		
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(emailAccount.getAddress(), emailAccount.getPassword());
		}
		};
		
		try {
			Thread.sleep(6000);
			Session session=Session.getInstance(emailAccount.getProperties(),authenticator);
			Store store=session.getStore("imaps");
			store.connect(emailAccount.getProperties().getProperty("incomingHost"),emailAccount.getAddress(),emailAccount.getPassword());
			emailAccount.setStore(store);
			emailManager.addEmailAccount(emailAccount);
			
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return EmailLoginResult.FAILED_BY_NETWORK;			
		}catch (AuthenticationFailedException e) {
			return EmailLoginResult.FAILED_BY_UNEXPECTED_ERROR;
			
		}catch (MessagingException e) {
			
			e.printStackTrace();
			return EmailLoginResult.FAILED_BY_UNEXPECTED_ERROR;
		}catch (Exception e) {
			e.printStackTrace();
			return EmailLoginResult.FAILED_BY_UNEXPECTED_ERROR;
		}
		
		return EmailLoginResult.SUCCESS;
		
		
	}

	@Override
	protected Task<EmailLoginResult> createTask() {
		// TODO Auto-generated method stub
		return new Task<EmailLoginResult>() {

			@Override
			protected EmailLoginResult call() throws Exception {
				
				return login();
			}
		
		};
	}
	
}
