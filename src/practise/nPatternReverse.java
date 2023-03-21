package practise;
public class nPatternReverse   
{  
public static void main(String[] args)  
{  
int n=7;  
//inner loop  
for (int i= 1; i<= n; i++)  
{  
//outer loop  
for (int j=1; j<=n-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  
System.out.print(k);  
}   
System.out.println("");  
}  
}  
}  