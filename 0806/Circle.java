import java.util.Scanner;
public class Circle {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入围成一圈的人数：");
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
				System.out.print("原来在第"+(i+1)+"位的人留下了");
			}
		}
	}
}