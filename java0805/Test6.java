import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
		// ��˰���ֹ���
		// salary����;нˮ
		/*System.out.print("���������Ĺ��ʣ�");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		//���ÿ�˰�Ĺ���
		double minStandrad = 5000;
		// ����˰��׼
		double finalSalary = salary - minStandrad;
		// ����һ��
		double oneMoney = 1000;
		// ����
		double subSidy = 500;
		// ���ֵĹ���
		double realSalary = 0;
		// ��� <1500 3%
		// 1500-4500 10%
		// 4500-9000 20%
		// 9000-35000 25%
		// 35000-55000 30%
		if(finalSalary<=1500){       // ħ��ֵ
			realSalary = finalSalary*0.97 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >1500 && finalSalary <= 4500){
			realSalary = finalSalary*0.90 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >4500 && finalSalary <= 9000){
			realSalary = finalSalary*0.80 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >9000 && finalSalary <= 35000){
			realSalary = finalSalary*0.75 + minStandrad - oneMoney + subSidy;
		}else if(finalSalary >35000 && finalSalary <= 55000){
			realSalary = finalSalary*0.70 + minStandrad - oneMoney + subSidy;
		}else{
			realSalary = minStandrad - oneMoney + subSidy;
		}
		System.out.print("�����ֹ��ʣ�"+realSalary);
		*/
		// ȡ����ż��λ��
		// 692116851128
		// �ַ���
		String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		// ���� charAt();
		System.out.print(str.charAt(0));  //0�����һλ'6'���±�
		for(int i=0;i<str.length();i++){
			// ȡ����λ
			if(i%2 == 0){
		
				oldNum += str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
				System.out.print("����λ�ͣ�"+oldNum);
				System.out.print("ż��λ�ͣ�"+evenNum);
		 
	}
}