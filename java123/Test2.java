public class Test2{
    public static void main(String[] args){
	    char c = '\u0000';
		System.out.print("content:"+c);
		// System.out.print(getSum(10,15));// ������
		// ������ +80          //ʵ��
		int sumResult = getSum(10,15);
		System.out.print(sumResult+80);// +80
    }
	// ���巽��
	// ��ͷ���              // �β�
	public static int getSum(int num1,int num2){
		// ������
		int result = num1+num2;
		return result;// ����
	}
}