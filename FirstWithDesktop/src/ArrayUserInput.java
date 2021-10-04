package interview_Normal;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args)
	{
		int arr[],n,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element which is less than 100 to store ");
		n=sc.nextInt();
		arr=new int[n];
		
		if(n<100)
		{	
		System.out.print("Enter elements: ");
		  for(int i=0;i<n;i++)
		   {
			 arr[i]=sc.nextInt();
			
		   }
		}
		else {System.out.println("Please enter lesser number");}
		
		
		for(int i=0;i<n;i++)
		{
			total=total+arr[i];
		}
         System.out.println("Sum of total no is :"+total);
		
         int square=0;
         for(int i=0;i<n;i++)
 		{
 			square=arr[i]*arr[i];
 			System.out.println("Square of "+arr[i] +" is:"+square);
 		}
         
         int stotal=0;
         for(int i=0;i<n;i++)
  		{
  			stotal=stotal+arr[i]*arr[i];
  		}
         System.out.println("Sum of square of all number is :"+stotal);
         
   	  int max=arr[0];
   	  for(int i=0; i<n ;i++)
   	  {
   		  if(max<arr[i])
   		  {
   			  max=arr[i];
   		  }
   	  }
   	  
   	  System.out.println("maxium number is :"+max);
	}

}
