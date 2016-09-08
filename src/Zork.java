import java.util.Scanner;
import java.util.Random;


public class Zork 
{
	static int amt =0;
	static int curr =0;
	static int flag,mflag;
	static int tflag =0;
	static int r1 = 0;
	static int r2 = 0;
	static int r3 = 0;
	static int r4 = 0;
	static int r5 = 0;
	static int r6 = 0;
	static int r7 = 0;
	static int r8 = 0;
	static Random theif = new Random();
	static int th =  2 + theif.nextInt(8);
	static Scanner sc = new Scanner(System.in);
	public static void money()
	{
		Random mon = new Random();
		int m =  mon.nextInt(1001);
		System.out.println("You found $" + m + "\n");
		amt = amt + m;
		System.out.println("your total money is $" + amt + "\n");
	}
	public static void theif()
	{
		Random d = new Random();
		int coin =  d.nextInt(2);
		System.out.println("\nA crazy theif appreared\n");
		System.out.println("He wants to gamble you for your money\n");
		System.out.println("You agree because he has a gun\n");
		System.out.println("Call heads\"1\" or tails \"2\"");
		int o = sc.nextInt();
		if (coin==0)
			System.out.println("Theif flips Heads\n");
		else if (o==0)
			System.out.println("Theif flips Tails\n");
		if (coin==o)
			System.out.println("Theif is sad and leaves you alone\n");
		else 
			System.out.println("You lose your money\n");
			amt = 0;
		System.out.println("your total money is $" + amt + "\n");
	}
	public static int room1(int p)
	{
		r1++;
		curr =1;
		System.out.println("\nYou are in a foyer in an old house.\nIt has a dead rhino\n");
		System.out.println("You can go north \"1\" or walk out of the house \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 2;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room2(int p)
	{
		r2++;
		curr =2;
		System.out.println("\nYou reach the front room and see a beautiful piano\n");
		System.out.println("You can go south \"1\", west \"2\" east \"3\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 1;
		else if (o==2)
			p =3;
		else if (o==3)
			p =4;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room3(int p)
	{
		r3++;
		curr =3;
		System.out.println("\nYou are in the library of doom. There are spiders eveywhere\n");
		System.out.println("You can go north \"1\", east \"2\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 5;
		else if (o==2)
			p =2;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room4(int p)
	{
		r4++;
		curr =4;
		System.out.println("\nYou are in Hell's Kitchen. There are bats everywhere\n");
		System.out.println("You can go west \"1\", north \"2\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 2;
		else if (o==2)
			p =7;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room5(int p)
	{		
		r5++;
		curr =5;
		System.out.println("\nYou have reached a dusty dinning room.\n On the table is an empty box\n");
		System.out.println("You can go south \"1\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 3;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room6(int p)
	{
		r6++;
		curr =6;
		System.out.println("\nYou have reached the vault.\nThere are 3 scary walking skeletons\n");
		if (flag==0)
			System.out.println("You can go east \"1\" or quit without your money or gold \"0\"\n");
		else if (flag == 1)
			System.out.println("You can go east (parlor) \"8\" or to secret room \"9\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt();
		Random rnd = new Random();
		int r = 1+ rnd.nextInt(4);
		if (o==1)
		{
			//System.out.print(r);
			if(r==1)
			{
				p = 8;
				flag = 1;
			}

			else 
				p=7;
		}
		else if (o==8)
			p =7;
		else if (o==9)
			p =8;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room7(int p)
	{
		r7++;
		curr =7;
		System.out.println("\nYou have the reached the parlor.\nYou found a treasure chest.\n");
		System.out.println("You can go south \"1\", west \"2\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)
			p = 4;
		else if (o==2)
			p = 6;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room8(int p)
	{
		r8++;
		curr =8;
		System.out.println("\nYou have the reached the secret room and found a mountain of gold.\n");
		System.out.println("You can go west \"1\" or quit without your money or gold \"0\"\n");
		int o = sc.nextInt(); 
		if (o==1)		
			p = 6;
		else if (o==0)
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static void main(String[] args)
	{
		int p = 1;
		int c = 0;
		do
		{
			//if (p==1 && r1==0) money();
			if (p==2 && r2==0) money();
			if (p==3 && r3==0) money();
			if (p==4 && r4==0) money();
			if (p==5 && r5==0) money();
			if (p==6 && r6==0) money();
			if (p==7 && r7==0) money();
			if (p==8 && r8==0) money();
			if (th==p && tflag==0)
			{
				theif();
				tflag=1;
			}
			switch (p)
			{
				case 1: p = room1(p);
						c++;
						break;
				case 2: p = room2(p);
						c++;
						break;
				case 3: p = room3(p);
						c++;
						break;
				case 4: p = room4(p);
						c++;		
						break;
				case 5: p = room5(p);
						c++;
						break;
				case 6: p = room6(p);
						c++;		
						break;
				case 7: p = room7(p);
						c++;
						break;
				case 8: p = room8(p);
						c++;
						break;
			
			}
		}while(p!=0);
		System.out.println("\nThe number of rooms visited is " + c + "\n");
		System.out.println("\nThe number of times you have seen the dead rhino is " + r1 + "\n");
		System.out.println("\nThe number of times you have seen the beautiful piano is " + r2 + "\n");
		System.out.println("\nThe number of times you have seen the dcreepy spiders " + r3 + "\n");
		System.out.println("\nThe number of times you have seen the dscary bats is " + r4 + "\n");
		System.out.println("\nThe number of times you have seen the empty box is " + r5 + "\n");
		System.out.println("\nThe number of times you have seen the walking skeletons is " + r6 + "\n");
		System.out.println("\nThe number of times you have seen the treasure chest " + r7 + "\n");
		if (r8>=1 && curr==1)
		{
			System.out.println("\nCongratualtions you walked out with the mountain of gold\n");
			System.out.println("\nAlso, the total amount of money you found is " + amt + "\n");
		}
		else if (curr==1)
		{
			System.out.println("\nThe total amount of money you found is $" + amt + "\n");
			System.out.println("\nHowever you did not find the hidden gold\n");
		}
		else
		{
			System.out.println("\nYou do not get any money or gold for being a QUITTER\n");
		}
		Random rnd2 = new Random();
		int g = 1+ rnd2.nextInt(4);
		if (g == 4)
		{
			System.out.println("\nYou have exited the house but look behind\n");
			System.out.println("\nYou are followed by a ghost\n");
		}
		else
			System.out.println("\nYou have exited the house");
		
		
	}
	
	

}
