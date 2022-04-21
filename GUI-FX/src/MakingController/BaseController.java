package MakingController;

public class BaseController {
	
	private String fxmlName;
	public BaseController(String fxmlName) {
		this.fxmlName=fxmlName;
	}
	public void setFxmlName(String fxmlName) {
		this.fxmlName = fxmlName;
	}
	public String getFxmlName() {
		return fxmlName;
	}
}
