import java.util.*;
public class Practice{
	public static void main(String[] args){
		// �žų˷���
		/*for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}*/
		// ��ӡ������
		/*for(int i=1;i<9;i++){
			for(int j=1;j<9;j++){
				System.out.print("* ");
			}
			System.out.println();
		}*/
		// �ο�������
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(i ==0 || i ==8){
					System.out.print("* ");
				}else{
					if(j ==0 || j ==8){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}*/
		/*for(int i=0;i<9;i++){
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
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(i == 0 || i == 8){
					System.out.print("* ");
				}else{
					if(j == 0|| j == 8){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}*/
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print("* ");
			}
			System.out.println();
		}*/
		/*for(int i=0;i<=9;i++){
			for(int j=0;j<i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}*/
		//��������
		/*byte[] a = {1,3,5,7,9};
		byte[] b = {2,4,6,8,10};
		byte[] c = new byte[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));*/
		//1-100�ۼӺ�
		/*int sum =0;
		for(int i=0;i<=100;i++){
			sum += i;
		}
		System.out.print(sum);*/
		// 1000���ڵ�ˮ�ɻ���
		// ��λ i%0 ʮλi/10%10 ��λ/100
	   /*for(int i=100;i<1000;i++){
		   int result = (int)Math.pow(i%10,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i/100,3);
		   if(i == result){
			   System.out.println(result);
		   }
	   }*/
	    // ��λ���� ÿλ���ֶ���5 Ȼ���ó���10��������������֣�һ��λ����������λ����
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		// ��λ
		int first = num%10;
		// ʮλ
		int sec = num/10%10;
		// ��λ
		int thrid = num/100%10;
		// ǧλ
		int forth = num/1000;
		// ÿ��λ��+5
		first = (first+5)%10;
		sec = (sec+5)%10;
		thrid = (thrid+5)%10;
		forth = ( forth+5)%10;
		int result = first*1000+thrid*10+sec*100+forth;
		System.out.print(result);*/
		/*Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int first = num%10;
		int sec = num/10%10;
		int thrid = num/100%10;
		int forth = num/1000;
		first = (first+5)%10;
		sec = (sec+5)%10;
		thrid = (thrid+5)%10;
		forth  = (forth +5)%10;
		int result = first*1000+thrid*10+sec*100+forth;
		System.out.print(result);*/
		// 1-100�ĺ� �������и�λ��3 ����
		/*int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%10 == 3){
				continue; // ����
			}
			sum += i;
		}
		System.out.print(sum);*/
		// �ϲ�����
		byte[] a = {1,3,5,7,9};
		byte[] b = {2,4,6,8,10};
		byte[] c = new byte[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		Arrays.sort(c); // ������ķ�ʽ����
		System.out.print(Arrays.toString(c));
	}
}