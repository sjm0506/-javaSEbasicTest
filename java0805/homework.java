import java.util.*;
public class homework{
	public static void main(String[] args){
		// 打印正方形
		//for( int i=0;i<5;i++){
		//	for(int c=0;c<5;c++){
		//		System.out.print("* ");
		//	}
		//	System.out.println(" ");
		//}
		//打印九九乘法表
		/*for(int i =1;i<=9;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i+ "*"+j +"="+ i*j+" " );
			}
			System.out.println();
		}*/
		// 1-100的和 跳过所有各位为3的数
		/*int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%10== 3){
				continue;//跳过
			}
			sum += i;
		} 
		System.out.print(sum);*/
		//for(int i =0; i<=100;i++){
		//	System.out.println(i);
		//}
		//合并数组
		/*byte[] a = {1,7,9,11,13,15,17,19};
		byte[] b = {2,4,6,8,10};
		byte[] c = new byte[a.length+b.length];// a和b数组的长度和
		System.arraycopy(a,0,c,0,a.length);// 从哪复制，第几位开始，复制到哪，从哪开始，复制多长
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);  // 按升序的方式排列数组
		System.out.print(Arrays.toString(c));*/
		// 打印镂空正方形
		/*for(int i=0; i<9;i++){
			for(int j=0;j<9;j++){
			    if(i == 0 || i == 8){
					System.out.print("* ");
				}else{
					if(j == 0 || j == 8){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
					
				}
			}
			System.out.println();
		}*/
		// 1000以内的水仙花数 
		// 就是每个位的三次方相加等于这个数
		// 个位i%10  十位i/10%10  百位 i/100
		/*for(int i=100;i<1000;i++){
			int result = (int)Math.pow(i%10,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i/100,3);
			if(i == result){
				System.out.println(i);
			}
		}*/
		// 四位整数 每位数字都加5 然后用除以10的余数代替该数字，一四位交换，二三位交换
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//个位
		int first = num%10;
		//十位
		int sec = num/10%10;
		//百位
		int thrid = num/100%10;
		//千位
		int forth = num/1000;
		// 各位加上5
		first = (first+5)%10;
		sec = (sec+5)%10;
		thrid = (thrid+5)%10;
		forth = (forth+5)%10;
		int result = first*1000+thrid*10+sec*100+forth;
		System.out.print(result);
		
	} 
}