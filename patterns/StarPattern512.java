import java.util.*;
class StarPattern512
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of star rows you want to print: ");
int a=sc.nextInt();

for(int h=1;h<=a;h++)
{
for(int o=a;o>=h;o--)
{
System.out.print(" ");
}
System.out.print("*");
System.out.println();
}

for(int k=1;k<=a;k++)
{
for(int l=1;l<=k;l++)
{
System.out.print(" ");
}
System.out.print("*");
System.out.println();
}

}
}