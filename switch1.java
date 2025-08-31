import java.util.Scanner;

class switch1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your choice:");	
		int choice = scan.nextInt();
		
		int n=5;

		switch(choice)
		{
			case 1:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");	
				}
				System.out.println("");	
			}
			break;
	
			case 2:
			for(int i=1;i<=n;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print("*");	
				}
				System.out.println("");	
			}
			break;

			case 3:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("*");	
				}
				System.out.println("");	
			}
			break;

			case 4:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("1");	
				}
				System.out.println("");	
			}
			break;
			
			case 5:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

			case 6:
			for(int i=n;i>=1;i--)
			{
				for(int j=i;j>=1;j--)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
			break;

			case 7:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;

			case 8:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==1 || i==n || j==1 || j==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;

			case 9:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");	
				}

				System.out.println("");	
			}
			break;
 		 
			case 10:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=6-i;k++)
				{
					System.out.print("* ");	
				}

				System.out.println("");	
			}
			break;

			case 11:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");	
				}
				System.out.println("");	
			}
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=5-i;k++)
				{
					System.out.print("* ");	
				}

				System.out.println("");	
			}
			break;
			
			case 12:
			char ch='A';
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
					ch++;	
				}
				System.out.println(" ");
			}
			break;
	
			case 13:
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");	
				}

				System.out.println("");	
			}
			break;

                        case 14:
			int num=1;
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(num+" ");
					num++;	
				}
				System.out.println(" ");
			}
                	break;         
		
			case 15:
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=6-i;k++)
				{
					System.out.print("* ");	
				}

				System.out.println("");	
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");	
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");	
				}

				System.out.println("");	
			}
			break;
                                    
			//default:
				//System.out.println("Not Possible");
		}
	}
}