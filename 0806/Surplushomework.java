import java.util.*;
public class Surplushomework{
	public static void main(String[] args){
		// int n = 5; 小房子
		// drawHouse(n);小房子
		// 输入一个数，得出他的阶乘
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = scanner.nextInt();
		int factorial = 1;
		for(int i=1;i<=n;i++){
			factorial = factorial*i;
		}
		System.out.print("这个数的阶乘是："+factorial);*/
		
		}
		// 打印完成小房子
		/*public static void drawHouse(int n){
			// 房子上半部
			for (int i=1;i<=n;i++){
			    for(int j=1;j<=2*n;j++){
					if(j == n - i +1){
						System.out.print("*****");
					}else if(j == n + i -1){
							System.out.print("*");
					}else{
						System.out.print(" ");
					}	
				}
				System.out.println();
			}
		    // 房屋下半部，矩形 
		    // 墙壁 (int) Math.ceil(n * 3 / 5); 向上取整，成比例增高墙壁的高度
		        int m = (int) Math.ceil(n * 3 / 5); 
		        // m：墙壁高度
		        for (int i = 1; i <= m + 2; i++) { 
		        //矩形m + 2,，为房屋下半部矩形的总高度
		        for (int j = 1; j <= n * 2 + 3; j++) {
		        if (i == 1 || i == m + 2) { 
		        // 矩形上部，下部
		        System.out.print("*");
		        } else if (j == 1 || j == n * 2 + 3) { 
		        // 墙壁
		        System.out.print("*");
		        } else {
		        System.out.print(" ");
		        }
	        }
		    System.out.println();
        } 
    }
}
