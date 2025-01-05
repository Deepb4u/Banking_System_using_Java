package bankingSystem;

import java.util.Scanner;

public class ATM {

	private int Bal=5000;
	 private int Deposite;
	 private int Withdrow;
	 private int password=1234;
	 void Status()
	 {
	     System.out.println("Enter a Password : ");
	     Scanner s=new Scanner (System.in);
	     int pass=s.nextInt();
	     if (pass==password)
	     {
	         System.out.println("Total Balance : "+Bal);
	     }
	     else
	     {
	         System.out.println("Invalid password !");
	     }
	 }
	 void Deposite()
	 {
	     System.out.println("Enter a Password : ");
	     Scanner a=new Scanner (System.in);
	     int pass=a.nextInt();
	     if (pass==password)
	     {
	         System.out.println("Enter a Deposite amount : ");
	         Deposite=a.nextInt();
	         Bal=Bal+Deposite;
	         System.out.println("Total balanse : "+Bal);
	     }
	     else
	     {
	         System.out.println("Invalid password !");
	     }
	 }    
	 void Withdrow()
	 {
	     System.out.println("Enter a Password : ");
	     Scanner b=new Scanner (System.in);
	     int pass=b.nextInt();
	     if (pass==password)
	     {
	         System.out.println("Enter a Withdrow amount : ");
	         Withdrow=b.nextInt();
	         Bal=Bal-Withdrow;
	         System.out.println("Total balanse : "+Bal);
	     }
	     else
	     {
	         System.out.println("Invalid password !");
	     }
	 }

}
class B extends ATM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         System.out.println("1.Status");
	         System.out.println("2.Deposite");
	         System.out.println("3.Withdrow");
	         Scanner c=new Scanner (System.in);
	         int op=c.nextInt();
	         ATM n=new ATM();
	         switch(op)
	         {
	             case 1:
	                 n.Status();
	                 break;
	             case 2:
	                 n.Deposite();
	                 break;
	             case 3:
	                 n.Withdrow();
	                 break;
	         }
	}
}

