import java.util.*;
public class Test7{
	public static void main(String[] args){
		// 数组
		// 引用数据类型 数组 Class interface
		// 数组里可以存放任意类型
		      //数组名
	    // 第一种创建数组的方式
		/*byte[] nums = {1,5,7,9,10};
		//数组特点 连续的 (有几个元素长度就是几)长度固定 
		//类型明确 下标从0开始
		// nums.length()方法 不带括号是属性
		// System.out.print(nums[2]);
		// 数组下标越界 异常
		for(int i=0;i<nums.length;i++){
		//	System.out.print(nums[i]);
		}
		
		
		// 第二种创建数组的方式
		byte[] nums2 = new byte[5];
		nums2[0] = 10;
		nums2[1] = 50;
		System.out.print(nums2[1]);
		
		
		// 第三种创建数组的方式
		byte[] nums3 = new byte[]{
			1,5,7,9,10
		};*/
		// 复制一个数组出来
		// 引用数据 类型 默认值 null空 什么都没有
		/*byte[] bytes = {1,5,7,9,10};
		byte[] bytes2 = new byte[bytes.length];
		for(int i=0; i < bytes. length; i++){
			bytes2[i] = bytes[i];
		}
		System.out.print("bytes的第一位"+bytes[0]);
		System.out.print("bytes2的第一位"+bytes2[0]); 
		bytes[0] = 100;
		System.out.print("bytes的第一位"+bytes[0]);
		System.out.print("bytes2的第一位"+bytes2[0]); 
		//Arrays.toString();
		System.out.print(Arrays.toString(bytes));*/
		// 数组扩容
		// sourceArray  源数组
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length+1];// 新建数组
		for(int i=0;i<sourceArray.length;i++){
			newArray[i] = sourceArray[i];
		}
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));*/
		
		// jdk提供了数组扩容的API方法
		// System.arraycopy(src源数组, srcPos源数组位置, 
		// dest目标数组, destPos目标数组, length要复制元素的长度):
		// 这个方法是Java API 提供的，底层 实用C++写的
		// 所以速度非常快，比for()循环实现数组的拷贝效率要高得多
		// 多以推荐使用 
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));*/
		
		// Arrays.copyOf(src,length): 是 JDK1.6版本提供的方法
		// 比起 System.arraycopy()使用更简便，但需要注意的是你的开发环境
		// JDK 版本必须是 1.6 及以上。copyOf() 方法的底层就是arraycopy
	    /*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,3); 
		System.out.print(Arrays.toString(newArray));*/
		
		// 数组扩容    重点：创建数组副本的同时将数组长度增加就变通的实现了数组扩容
	    // 源数组
		/*byte[] sourceArray = {1,5,7,9,10};
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);// +1就是扩容一个数组副本
	    newArray[newArray.length-1] = 100; //给倒数第一位数组赋值
		System.out.print(Arrays.toString(newArray));*/
		
		//  System.arraycopy() 可以复制数组 
		//  Arrays.copyOf() 可以简单的创建数组副本
		/*char[] arr = {'天' ,'津'};
		char[] temp = Arrays.copyOf(arr,4);
		// System.out.println(temp);
		char[] newArr = temp;
		newArr[2] = '东';
		newArr[3] = '软';
		System.out.println(newArr);*/
      }
}