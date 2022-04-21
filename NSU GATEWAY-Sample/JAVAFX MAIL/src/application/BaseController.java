package application;

public abstract class BaseController {
	protected EmailManager emailManager;
	protected ViewFactory viewFactory;
	protected String fxmlName;
	public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
		super();
		this.emailManager = emailManager;
		this.viewFactory = viewFactory;
		this.fxmlName = fxmlName;
	}
	public String getFxmlName() {
	
		return fxmlName;
	}
	
	
}
