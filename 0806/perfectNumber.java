import java.util.*;
public class perfectNumber{
	public static void main(String[] args){
		for(int x=1,tempSum=0;x<=1000;x++)
			{
				tempSum=0;
				for(int y=1;y<x;y++)
				{
					if(x%y==0)
					{
						tempSum+=y;
					}
				}
				if(tempSum==x)
				{
					System.out.print(x+" ");
				}
			}
			System.out.println("´òÓ¡Íê±Ï¡£\n");
		}
    }	
