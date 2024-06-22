package comprehension.sample;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IT_Calculator {
 
	public static void main(String[] args) {
		double TaxableIncome=0.00,TaxPaidPerYear=0.00,TaxPayablePerMonth=0.00;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the Taxable income: ");
		TaxableIncome = myObj.nextDouble();
		if(TaxableIncome ==0) {
			System.out.println("Pls enter the amount greater than zero.");
		}else if(TaxableIncome !=0 && TaxableIncome <= 25000) {
			TaxPaidPerYear=0.00;
			TaxPayablePerMonth=0.00;
		}else if(TaxableIncome !=0 && TaxableIncome <= 50000 && TaxableIncome > 25000) {
			TaxPaidPerYear=TaxableIncome*(0.01);
			TaxPayablePerMonth=TaxPaidPerYear/12;
		}else if(TaxableIncome !=0 && TaxableIncome <= 75000 && TaxableIncome > 50000) {
			TaxPaidPerYear=TaxableIncome*(0.02);
			TaxPayablePerMonth=TaxPaidPerYear/12;
		}else {
			TaxPaidPerYear=TaxableIncome*(0.03);
			TaxPayablePerMonth=TaxPaidPerYear/12;
		}
		
		if(TaxableIncome !=0) {
			System.out.println("Tax to be paid for a year is : "+(new DecimalFormat("#.00")).format(TaxPaidPerYear));
			System.out.println("Tax to be paid for a month is : "+(new DecimalFormat("#.00")).format(TaxPayablePerMonth));
		}
	}

}
