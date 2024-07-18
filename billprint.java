import java.util.*;
class billprint{
	 public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		System.out.println("===================================================================================");
        System.out.println(" __          __  _                            _          _ __  __            _   ");
        System.out.println(" \\ \\        / / | |                          | |        (_)  \\/  |          | |  ");
        System.out.println("  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_ ");
        System.out.println("   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
        System.out.println("    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_ ");
        System.out.println("     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
        System.out.println("                                                                                  ");
        System.out.println("===================================================================================");
        System.out.println();
        
        System.out.print("Enter Customer Phone Number -");
        int Number = input.nextInt();
        input.nextLine(); 
        System.out.println();
        
        System.out.print("Enter Customer Name -");
        String Name = input.nextLine();
        System.out.println();
        
        System.out.println("===================================================================================");
        System.out.println(); 
        
        double Basmathi = 250;
        double Dhal = 180;
        double Sugar = 150;
        double Highland = 1200;
        double Yoghurt = 50;
        double Flour = 120;
        double Soap = 160;
        
        System.out.print("\nBasmathi Qty(Kg) -");
        int BasmathiQyt = input.nextInt();
        System.out.print("\nDhal Qty(Kg)     -");
        int DhalQty = input.nextInt();
        System.out.print("\nSugar Qty(Kg)    -");
        int SugarQty = input.nextInt();
        System.out.print("\nHighland Qty     -");
        int HighlandQty = input.nextInt();
        System.out.print("\nYoghurt Qty      -");
        int YoghurtQty = input.nextInt();
        System.out.print("\nFlour Qty(Kg)    -");
        int FlourQty = input.nextInt();
        System.out.print("\nSoap Qty         -");
        int SoapQty = input.nextInt();
         
        double BasmathiPrice = Basmathi*BasmathiQyt;
        double DhalPrice = Dhal*DhalQty;
        double SugarPrice = Sugar*SugarQty;
        double HighlandPrice = Highland*HighlandQty;
        double YoghurtPrice = Yoghurt*YoghurtQty;
        double FlourPrice = Flour*FlourQty;
        double SoapPrice = Soap*SoapQty;
        
        double Total= BasmathiPrice+DhalPrice+SugarPrice+HighlandPrice+YoghurtPrice+FlourPrice+SoapPrice;
        double discount= Total*10/100;
        double Price= Total-discount;
        
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|\t        _   __  __          _____ _______        \t|");
        System.out.println("|\t       (_) |  \\/  |   /\\   |  __ \\__   __|       \t|");
        System.out.println("|\t        _  | \\  / |  /  \\  | |__) | | |          \t|");
        System.out.println("|\t       | | | |\\/| | / /\\ \\ |  _  /  | |          \t|");
        System.out.println("|\t       | | | |  | |/ ____ \\| | \\ \\  | |          \t|");
        System.out.println("|\t       |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|          \t|");
        System.out.println("|                   225,Galle Road, Panadura.                   |");
        System.out.println("|                                                               |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|\t\t\t# Tel\t:" + Number + "\t\t\t|");
        System.out.println("|\t\t\t# Name\t:" + Name + "\t\t\t\t|");
        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("|\t\t|\tQty\t|  unit price   |\t  Price |");
        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("| #Basmathi\t|\t" + BasmathiQyt + "\t|\t" + Basmathi + "   |\t" + BasmathiPrice + "  |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Dhal\t\t|\t" + DhalQty + "\t|\t" + Dhal + "   |\t" + DhalPrice + "   |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Sugar\t|\t" + SugarQty + "\t|\t" + Sugar + "   |\t" + SugarPrice + "   |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Highland\t|\t" + HighlandQty + "\t|\t" + Highland + "  |\t" + HighlandPrice + "  |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Yoghurt\t|\t" + YoghurtQty + "\t|\t" + Yoghurt + "    |\t" + YoghurtPrice + "   |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Flour\t|\t" + FlourQty + "\t|\t" + Flour + "   |\t" + FlourPrice + "   |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("| #Soap\t\t|\t" + SoapQty + "\t|\t" + Soap + "   |\t" + SoapPrice + "   |");
        System.out.println("|\t\t|\t\t|\t\t|\t\t|");

        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("|\t\t\t\t|   Total       |\t" + Total + "  |");
        System.out.println("|                               +---------------+---------------+");
        System.out.println("|\t\t\t\t| Discount(10%) |\t" + discount + "   |");
        System.out.println("|                               +---------------+---------------+");
        System.out.println("|\t\t\t\t|  Price        |\t" + Price + "  |");
        System.out.println("+-------------------------------+---------------+---------------+");
        System.out.println();
        
        System.out.print("\nEnter Customer Given Amount -");
        int Cash = input.nextInt();
        
        double Netamount = Price;
        double Change = Cash-Netamount;
        System.out.println();
        
        int x =(int)Change; 
        
        int noOf5000Notes = x/5000;
        int remOf5000 = x%5000;
        int noOf2000Notes = remOf5000/2000;
        int remOf2000 = remOf5000%2000;
        int noOf1000Notes = remOf2000/1000;
        int remOf1000 = remOf2000%1000;
        int noOf500Notes = remOf1000/500;
        int remOf500 = remOf1000%500;
        int noOf100Notes = remOf500/100;
        int remOf100 = remOf500%100;
        int noOf50Notes = remOf100/50;
        int remOf50 = remOf100%50;
        int noOf20Notes = remOf50/20;
        int remOf20 = remOf50%20;
        int noOf10Notes = remOf20/10;
        int remOf10 = remOf20%10;
        int noOf5Coins = remOf10/5;
        int remOf5 = remOf10%5;
        int noOf2Coins = remOf5/2;
        int remOf2 = remOf5%2;
        int noOf1Coins = remOf2/1;
        
        int noOfNotes=noOf5000Notes+noOf2000Notes+noOf1000Notes+noOf500Notes+noOf100Notes+noOf20Notes+noOf10Notes;
        int noOfCoins=noOf5Coins+noOf2Coins+noOf1Coins;
        
        System.out.println("\n+---------------+-----------------------+");
        System.out.println("|  Net Amount   |  " + Price + "\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Cash         |  " + Cash + "\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Change       |  " + Change + " \t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println();

        System.out.println("\n+---------------+-----------------------+");
        System.out.println("|  Value        |  No\t\t\t|");
        System.out.println("+---------------+-----------------------+"); 
        System.out.println("|  Rs.5000      |  " + noOf5000Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.2000      |  " + noOf2000Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.1000      |  " + noOf1000Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+"); 
        System.out.println("|  Rs.500       |  " + noOf500Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.100       |  " + noOf100Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.50        |  " + noOf50Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.20        |  " + noOf20Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.10        |  " + noOf10Notes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.5         |  " + noOf5Coins + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.2         |  " + noOf2Coins + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  Rs.1         |  " + noOf1Coins + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  No of Notes  |  " + noOfNotes + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println("|  No of Coins  |  " + noOfCoins + "\t\t\t|");
        System.out.println("+---------------+-----------------------+");
        System.out.println();
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("\t THANK YOU FOR SHOPPING WITH US \t");
        System.out.println("---------------------------------------------------");
        
	}
} 

