public class Test2{
    public static void main(String[] args){
	    char c = '\u0000';
		System.out.print("content:"+c);
		// System.out.print(getSum(10,15));// 被调用
		// 不够用 +80          //实参
		int sumResult = getSum(10,15);
		System.out.print(sumResult+80);// +80
    }
	// 定义方法
	// 求和方法              // 形参
	public static int getSum(int num1,int num2){
		// 方法体
		int result = num1+num2;
		return result;// 调用
	}
}