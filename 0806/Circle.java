import java.util.Scanner;
public class Circle {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Χ��һȦ��������");
		int num = scanner.nextInt();
		boolean[] arr = new boolean[num];
		for(int i=0;i<arr.length;i++){
			arr[i] = true;
		}
		
		int leftCount = num;
		int countNum = 0;
		int index = 0;
		while(leftCount>1){
			if(arr[index]==true){
				countNum++;
				if(countNum==3){
					countNum=0;
					arr[index]=false;
					leftCount--;
				}
			}
			index++;
			if(index==num){
				index=0;
			}
		}
		for(int i=0;i<num;i++){
			if(arr[i]==true){
				System.out.print("ԭ���ڵ�"+(i+1)+"λ����������");
			}
		}
	}
}