import java.util.*;
public class Test7{
	public static void main(String[] args){
		// ����
		// ������������ ���� Class interface
		// ��������Դ����������
		      //������
	    // ��һ�ִ�������ķ�ʽ
		/*byte[] nums = {1,5,7,9,10};
		//�����ص� ������ (�м���Ԫ�س��Ⱦ��Ǽ�)���ȹ̶� 
		//������ȷ �±��0��ʼ
		// nums.length()���� ��������������
		// System.out.print(nums[2]);
		// �����±�Խ�� �쳣
		for(int i=0;i<nums.length;i++){
		//	System.out.print(nums[i]);
		}
		
		
		// �ڶ��ִ�������ķ�ʽ
		byte[] nums2 = new byte[5];
		nums2[0] = 10;
		nums2[1] = 50;
		System.out.print(nums2[1]);
		
		
		// �����ִ�������ķ�ʽ
		byte[] nums3 = new byte[]{
			1,5,7,9,10
		};*/
		// ����һ���������
		// �������� ���� Ĭ��ֵ null�� ʲô��û��
		/*byte[] bytes = {1,5,7,9,10};
		byte[] bytes2 = new byte[bytes.length];
		for(int i=0; i < bytes. length; i++){
			bytes2[i] = bytes[i];
		}
		System.out.print("bytes�ĵ�һλ"+bytes[0]);
		System.out.print("bytes2�ĵ�һλ"+bytes2[0]); 
		bytes[0] = 100;
		System.out.print("bytes�ĵ�һλ"+bytes[0]);
		System.out.print("bytes2�ĵ�һλ"+bytes2[0]); 
		//Arrays.toString();
		System.out.print(Arrays.toString(bytes));*/
		// ��������
		// sourceArray  Դ����
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length+1];// �½�����
		for(int i=0;i<sourceArray.length;i++){
			newArray[i] = sourceArray[i];
		}
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));*/
		
		// jdk�ṩ���������ݵ�API����
		// System.arraycopy(srcԴ����, srcPosԴ����λ��, 
		// destĿ������, destPosĿ������, lengthҪ����Ԫ�صĳ���):
		// ���������Java API �ṩ�ģ��ײ� ʵ��C++д��
		// �����ٶȷǳ��죬��for()ѭ��ʵ������Ŀ���Ч��Ҫ�ߵö�
		// �����Ƽ�ʹ�� 
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));*/
		
		// Arrays.copyOf(src,length): �� JDK1.6�汾�ṩ�ķ���
		// ���� System.arraycopy()ʹ�ø���㣬����Ҫע�������Ŀ�������
		// JDK �汾������ 1.6 �����ϡ�copyOf() �����ĵײ����arraycopy
	    /*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,3); 
		System.out.print(Arrays.toString(newArray));*/
		
		// ��������    �ص㣺�������鸱����ͬʱ�����鳤�����Ӿͱ�ͨ��ʵ������������
	    // Դ����
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);// +1��������һ�����鸱��
	    newArray[newArray.length-1] = 100; //��������һλ���鸳ֵ
		System.out.print(Arrays.toString(newArray));*/
		
		//  System.arraycopy() ���Ը������� 
		//  Arrays.copyOf() ���Լ򵥵Ĵ������鸱��
		/*char[] arr = {'��' ,'��'};
		char[] temp = Arrays.copyOf(arr,4);
		// System.out.println(temp);
		char[] newArr = temp;
		newArr[2] = '��';
		newArr[3] = '��';
		System.out.println(newArr);*/
      }
}