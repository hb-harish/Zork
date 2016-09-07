import java.util.Scanner;
import java.util.Random;


public class Zork 
{
	static int flag;
	public static int room1(int p)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou are in a foyer in an old house.\nIt has a dead rhino\n");
		System.out.println("You can go north \"1\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou reach the front room and see a beautiful piano\n");
		System.out.println("You can go south \"1\", west \"2\" east \"3\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou are in the library of doom. There are spiders eveywhere\n");
		System.out.println("You can go north \"1\", east \"2\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou are in Hell's Kitchen. There are bats everywhere\n");
		System.out.println("You can go west \"1\", north \"2\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have reached a dusty dinning room.\n On the table is an empty box\n");
		System.out.println("You can go south \"1\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have reached the vault.\nThere are 3 scary walking skeletons\n");
		if (flag==0)
			System.out.println("You can go east \"1\" or quit \"0\"\n");
		else if (flag == 1)
			System.out.println("You can go east (parlor) \"8\" or to secret room \"9\" or quit \"0\"\n");
		int o = sc.nextInt();
		Random rnd = new Random();
		int r = 1+ rnd.nextInt(4);
		if (o==1)
		{
			System.out.print(r);
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have the reached the parlor.\nYou found a treasure chest.\n");
		System.out.println("You can go south \"1\", west \"2\" or quit \"0\"\n");
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\nYou have the reached the secret room and found a mountain of gold.\n");
		System.out.println("You can go west \"1\" or quit \"0\"\n");
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
