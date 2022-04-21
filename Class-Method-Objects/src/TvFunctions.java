
public class TvFunctions {
	int channel=0;
	int volume=0;
	boolean state=false;
	public void turnOn() {
		state=true;
	}
	private void turnOff() {
		state=false;
	}
	
	public void setChannel(int newChannel) {
		if(state && newChannel>=0 && newChannel<=100) {
			channel=newChannel;
		}
	}
	
	public void setVolume(int newVolume) {
		if(state && newVolume>=0 && newVolume<=100) {
			volume=newVolume;
		}
	}
	public void channelUp() {
		if(state && channel<=100) {
			channel++;
		}
	}
	public void volumeUp() {
		if(state && volume<100) {
			volume++;
		}
	}

	
	
	public static void main(String[] args) {
		TvFunctions tv1=new TvFunctions();
		tv1.turnOn();
		tv1.setChannel(40);
		tv1.setVolume(15);
		tv1.channelUp();
		tv1.volumeUp();
		tv1.turnOff();
		tv1.channelUp();

		TvFunctions tv2= new TvFunctions();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.setVolume(30);
		
		if(tv1.state) {
			System.out.printf("The volume level for TV1 is %d and channel level is %d and the state of TV is ON\n",tv1.volume,tv1.channel);
		}
		else {
			System.out.printf("The volume level for TV1 is %d and channel level is %d and the state of TV is OFF\n",tv1.volume,tv1.channel);
		}
		
		if(tv2.state) {
			System.out.printf("The volume level for TV2 is %d and channel level is %d and the state of TV is ON\n",tv2.volume,tv2.channel);
		}
		else {
			System.out.printf("The volume level for TV2 is %d and channel level is %d and the state of TV is OFF\n",tv2.volume,tv2.channel);
		}
	}

}
