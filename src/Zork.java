import java.util.Scanner;
import java.util.Random;


public class Zork 
{
	static int amt = 0;
	static int curr = 0;
	static int flag = 0;
	static int tflag = 0;
	static int lflag = 0;
	static int r1 = 0;
	static int r2 = 0;
	static int r3 = 0;
	static int r4 = 0;
	static int r5 = 0;
	static int r6 = 0;
	static int r7 = 0;
	static int r8 = 0;
	static int r1l = 0;
	static int r2l = 0;
	static int r3l = 0;
	static int r4l = 0;
	static int r5l = 0;
	static int r6l = 0;
	static int r7l = 0;
	static int r8l = 0;
	static Random theif = new Random();
	static int th =  2 + theif.nextInt(8);
	static Random lamp = new Random();
	static int lm =  2 + lamp.nextInt(8);
	
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
		int coin = 1 + d.nextInt(2);
		System.out.println("\nA crazy theif appreared\n");
		System.out.println("He wants to gamble you for your money\n");
		System.out.println("You agree because he has a gun\n");
		System.out.println("Call heads\"1\" or tails \"2\"");
		int o = sc.nextInt();
		if (coin==1)
			System.out.println("Theif flips Heads\n");
		else if (coin==2)
			System.out.println("Theif flips Tails\n");
		if (coin==o)
			System.out.println("Theif is sad and leaves you alone\n");
		else 
		{
			System.out.println("You lose your money\n");
			amt = 0;
		}
		System.out.println("your total money is $" + amt + "\n");
	}
	public static void lamp()
	{
		System.out.println("\n You see a Lamp.\n");
		System.out.println("\nDo you want to take the \" Lamp \" or \"No\"\n");
		String o = sc.next();
		o = o.toLowerCase();
		if (o.equals("lamp"))
		{
			System.out.println("\n Now, you can see the hidden features of the room much clearer \n");
			lflag = 1;
			lm = - 1;
		}
		else if (o.equals("no"))
			System.out.println("You cant see clearly \n");
	}
	public static int room1(int p)
	{
		r1++;
		curr =1;
		String o;
		System.out.println("\nYou are in a foyer in an old house.\nIt has a dead rhino\n");
		if(lflag==1 && r1l==0)
		{
			System.out.println("\n The lamp shows you a spider web containing gold coins \n");
			System.out.println("\n Take gold coins \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r1l = 1;
			}
			
			
		}
		System.out.println("You can go north \"N\" to get to \"Front-room\" or walk out of the house \"Q\"\n");
		
		o = sc.next();
		o = o.toLowerCase();
		System.out.println(o);
		if (o.equals("n")||o.equals("front-room"))
			p = 2;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room2(int p)
	{
		r2++;
		curr =2;
		String o;
		System.out.println("\nYou reach the front room and see a beautiful piano\n");
		if(lflag==1)
		{
			System.out.println("\n With the help of the lamp now you see sheets of music of your favourite song.  \n");
			System.out.println("\n Do you want to Play the song? \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r2l = 1;
			}
			
			
		}
		System.out.println("You can go south \"S\" to \"Foyer\", west \"w\" to \"Library\" or east \"E\" to \"Kitchen\" \n or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase();
		if (o.equals("s")||o.equals("foyer"))
			p = 1;
		else if (o.equals("w")||o.equals("library"))
			p =3;
		else if (o.equals("e")||o.equals("kitchen"))
			p =4;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room3(int p)
	{
		r3++;
		curr =3;
		String o;
		System.out.println("\nYou are in the library of doom. There are spiders eveywhere\n");
		if(lflag==1 && r3l<3)
		{
			System.out.println("\n The lamp reveals a secret message  \n");
			System.out.println("\n What walks on four legs in the morning, two legs in the afternoon and three legs at night? \n");
			System.out.println("\n You have " +(3-r3l)+"tries to solve the riddle  \n");
			r3l++;
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("man"))
			{
				
				amt = amt + 1000;
				System.out.println("Congratulations you have won 1000 dollars");
				System.out.println("your total money is $" + amt + "\n");
			}
			
			
		}
		
		
		System.out.println("You can go north \"N\" to \"Dinning-room\", east \"E\" back to \"Front-Room\" \n or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase(); 
		if (o.equals("n")||o.equals("dinning-room"))
			p = 5;
		else if (o.equals("e")||o.equals("front-room"))
			p =2;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room4(int p)
	{
		r4++;
		curr =4;
		String o;
		System.out.println("\nYou are in Hell's Kitchen. There are bats everywhere\n");
		if(lflag==1 && r4l==0)
		{
			System.out.println("\n With the help of the lamp you see food inside the fridge.  \n");
			System.out.println("\n Do you want to drink coke and eat cake? \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r4l = 1;
			}
			
			
		}
		
		System.out.println("You can go west \"W\" to \"Front-Room\", north \"N\" to the \"Parlor\" \n or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase(); 
		if (o.equals("w")||o.equals("front-room"))
			p = 2;
		else if (o.equals("n")||o.equals("parlor"))
			p =7;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room5(int p)
	{		
		r5++;
		curr =5;
		String o;
		System.out.println("\nYou have reached a dusty dinning room.\n On the table is an empty box\n");
		if(lflag==1 && r5l==0)
		{
			System.out.println("\n The empty box is not actually empty. It contains an amazon gift card  \n");
			System.out.println("\n Do you want to take it? \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r5l = 1;
			}
			
			
		}
		System.out.println("You can go south \"S\" to the \"Library\" or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase();
		if (o.equals("s")||o.equals("library"))
			p = 3;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room6(int p)
	{
		r6++;
		curr =6;
		String o;
		System.out.println("\nYou have reached the vault.\nThere are 3 scary walking skeletons\n");
		
		if (flag==0)
			System.out.println("You can go east \"E\"  or quit without your money or gold \"Q\"\n");
		else if (flag == 1)
			System.out.println("You can go east  \"Parlor\" or to  \"secret-room\" or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase();
		Random rnd = new Random();
		int r = 1+ rnd.nextInt(4);
		if (o.equals("e"))
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
		else if (o.equals("parlor"))
			p =7;
		else if (o.equals("secret-room"))
			p =8;
		else if (o.equals("q)"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room7(int p)
	{
		r7++;
		curr =7;
		String o;
		System.out.println("\nYou have the reached the parlor.\nYou found a treasure chest.\n");
		if(lflag==1 && r7l==0)
		{
			System.out.println("\n You find tickets to your favourite movie star's latest blockbuster release.  \n");
			System.out.println("\n Do you want to take the tickets ? \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r7l = 1;
			}
			
			
		}
		System.out.println("You can go south \"S\" to \"Kitchen\", west \"W\" to \"Vault\" \n or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase(); 
		if ((o.equals("s")||o.equals("kitchen")))
			p = 4;
		else if ((o.equals("w")||o.equals("vault")))
			p = 6;
		else if (o.equals("q"))
			p =0;
		else 
			System.out.println("\nInvalid option");
		return p;
	
	}
	public static int room8(int p)
	{
		r8++;
		curr =8;
		String o;
		System.out.println("\nYou have the reached the secret room and found a mountain of gold.\n");
		if(lflag==1 && r8l==0)
		{
			System.out.println("\n You see a treasure map with the help of the lamp.  \n");
			System.out.println("\n Do you want to take the treasure map? \"Yes\" or \"No\" \n");
			o = sc.next();
			o = o.toLowerCase();
			if(o.equals("yes"))
			{
				r8l = 1;
			}
			
			
		}
		System.out.println("You can go west \"w\" to the \"Vault\" or quit without your money or gold \"Q\"\n");
		o = sc.next();
		o = o.toLowerCase(); 
		if ((o.equals("w")||o.equals("vault")))		
			p = 6;
		else if (o.equals("q"))
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
			if(lm==p)
			{
				lamp();
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
		System.out.println("\nThe number of rooms visited is " + c );
		System.out.println("\nThe number of times you have seen the dead rhino is " + r1 );
		System.out.println("\nThe number of times you have seen the beautiful piano is " + r2 );
		System.out.println("\nThe number of times you have seen the dcreepy spiders " + r3 );
		System.out.println("\nThe number of times you have seen the dscary bats is " + r4 );
		System.out.println("\nThe number of times you have seen the empty box is " + r5 );
		System.out.println("\nThe number of times you have seen the walking skeletons is " + r6 );
		System.out.println("\nThe number of times you have seen the treasure chest " + r7 );
		if (r8>=1 && curr==1)
		{
			System.out.println("\nCongratualtions you walked out with the mountain of gold\n");
			System.out.println("\nAlso, the total amount of money you found is " + amt + "\n");
			System.out.println("\n Your stash contains: ");
			if(r1l>=1) System.out.println("Pure silk web with gold coins");
			if(r5l>=1) System.out.println("Amazon gift card");
			if(r7l>=1) System.out.println("Movie Tickets");
			if(r8l>=1) System.out.println("Treasure Map");
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
