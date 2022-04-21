package emailApplication;

import java.util.Date;

import javax.mail.Message;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class MessagesOnEmail {
	
	private boolean emailIsRead;
	private SimpleStringProperty subjectofEmail;
	private SimpleStringProperty emailsender;
	private SimpleStringProperty emailreciever;
	private SimpleIntegerProperty size;
	private SimpleObjectProperty<Date>dateofemail;
	private Message message;
	
	public MessagesOnEmail(String subject,String emailsender,String emailReciever,int size,Date emailDate,boolean emailRead,Message message) {
		this.subjectofEmail=new SimpleStringProperty(subject);
		this.emailsender=new SimpleStringProperty(emailsender);
		this.emailreciever=new SimpleStringProperty(emailReciever);
		this.size=new SimpleIntegerProperty(size);
		this.dateofemail=new SimpleObjectProperty<Date>(emailDate);
		this.emailIsRead=emailRead;
		this.message=message;
	}
	public String getEmailsender() {
		return emailsender.get();
	}
	public String getEmailreciever() {
		return emailreciever.get();
	}
	public String getSubjectofEmail() {
		return subjectofEmail.get();
	}
	public Integer getSize() {
		return size.get();
	}
	
}
