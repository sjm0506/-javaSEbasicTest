import java.util.*;
public class chooseSort{
	public static void main(String[] args){
		// ѡ������ ÿһλ�����һλ��
		/*int[] nums ={4,-8,20,66,878};
		// ��������
		for(int i=0;i<nums.length-1;i++){
			//����ÿһ�˵Ĵ���
			for(int j=i+1;j<nums.length;j++){
				//�Ƚ�
				if(nums[i]>nums[j]){
					//����������
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(nums));*/
		int[] nums ={3,657,2,-876,2};
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(nums));
	}
}