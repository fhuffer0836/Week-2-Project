
public class App {

	public static void main(String[] args) {

		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;

		double costOfMilk = 2.75;
		double moneyInWallet = 10.25;
		int thirstLevel = 3;

		//---------------------------------

		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2);

		System.out.println("You should buy ice cream: " + shouldBuyIcecream);
		System.out.println("You should go swimming: " + willGoSwimming);
		System.out.println("It is a good day: " + isAGoodDay);
		System.out.println("You should buy milk: " + willBuyMilk);
	}

}
