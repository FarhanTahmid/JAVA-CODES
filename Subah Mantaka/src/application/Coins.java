package application;

public class Coins {
	private String correctAnswer;
	private String coinsWon;
	private String coinsLost;
	private String totalCoins;
	public Coins(String correctAnswer, String coinsWon, String coinsLost, String totalCoins) {
		super();
		this.correctAnswer = correctAnswer;
		this.coinsWon = coinsWon;
		this.coinsLost = coinsLost;
		this.totalCoins = totalCoins;
	}
	public void setCoinsLost(String coinsLost) {
		this.coinsLost = coinsLost;
	}
	public void setCoinsWon(String coinsWon) {
		this.coinsWon = coinsWon;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public void setTotalCoins(String totalCoins) {
		this.totalCoins = totalCoins;
	}
	public String getCoinsLost() {
		return coinsLost;
	}
	public String getCoinsWon() {
		return coinsWon;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public String getTotalCoins() {
		return totalCoins;
	}

}
