class Task4{
	public static void main(String[] args){
	
	//Q1
	int Quantity=40;
	int PriceKg=100;
	
	//Q2
	int Books=15;
	int BookPrice=200;
	
	//Q3
	int Fuel=20;
	double FuelPrice=180.25;

	//Q4
	int SpecialCoffee=2;
	int SimpleCoffee=2;

	double SpecialCoffeePrice=40.25;
	double SimpleCoffeePrice=30.25;

	int total =Quantity*PriceKg;
	int Totalprice =Books*BookPrice;
	double Pricefuel=Fuel*FuelPrice;
	double TotalCoffee= SpecialCoffee+SimpleCoffee;
	double TotalCoffeePrice= SpecialCoffeePrice+SimpleCoffeePrice;
	double TotalPriceofCoffeecups=TotalCoffee*TotalCoffeePrice;

	System.out.println("Total suger bill RS= " +total + " PKR");
	System.out.println("Total bill of BOOKS RS=" +Totalprice +"PKR");
	System.out.println("Total cost of the Fuel RS=" +Pricefuel +"PKR");
	System.out.println("Total bill of Coffee RS=" +TotalPriceofCoffeecups +"PKR");
	System.out.println("Print by Govind Rai");
	}
}