import java.util.Scanner;
public class RetirementCalculator1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Are you ready for retirement? Let's find out.");
		System.out.println("How much money is currently in your stock portfolio?");
		

		System.out.println("WHat is the expected annual rate of return on your portfolio?");
		double rate = Double.parseDouble(in.nextLine());

		System.out.println("How old are you?");
		int currentAge = Integer.parseInt(in.nextLine());

		System.out.println("What is your yearly salary?");
		double income = Double.parseDouble(in.nextLine());

		System.out.println("How much do you contribute every year to retirement?");
		double yearlyContr = Double.parseDouble(in.nextLine());

		System.out.println("When would you like to retire?");
		int retirementAge = Integer.parseInt(in.nextLine());

		System.out.println("At what age do you expect to die?");
		int ageOfDeath = Integer.parseInt(in.nextLine());

		System.out.println("What is your initial balance in your portfolio?");
		double initialBalance = Double.parseDouble(in.nextLine());
		Portfolio myPortfolio = new Portfolio(rate, initialBalance);
		RetirementCalculator rc = new RetirementCalculator(myPortfolio, income, yearlyContr, currentAge, retirementAge, ageOfDeath);

		rc.readyForRetirement();


		in.close();

	}
}