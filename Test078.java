/*=======================
   ���� �迭 ����
   - �迭�� �⺻�� Ȱ��
 ========================*/

 // �� ����
 // ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾Ƽ�
 // �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
 // ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

 // ���� ��)
 // �Է��� �������� ����   : 10
 // ������ �Է�(���� ����) : 74 65 13 91 5 67 41 2 50 11
 // >> ���� ū �� �� 91
 // ����Ϸ��� �ƹ� Ű�� �������� ...

import java.util.Scanner;

public class Test078
{
	public static void main(String[] args) 
	{	
		// �Է��� �������� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int numCount=0;	//�Է��� �������� ����

		System.out.print("�Է��� �������� ���� : ");
		numCount = sc.nextInt();
	
		// ������ ���� �Է¹ޱ�
		int[] nums = new int[numCount];	// *���Ⱑ String�� �ƴ϶� int

		System.out.print("������ �Է�(���� ����) : ");
		// 1, 2, 3, 4
		// nums[0] = 1, nums[1] = 2, num[2] = 3, num[3] = 4

		for (int i=0;i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}

		// ���� ū �� ���ϱ�
		int maxN = nums[0];	// �迭�� ù ��°�� maxN�� ����

		for (int i = 1; i<nums.length; i++) // *��ó��ĭ�� int ������ ����!!
		{
			if(maxN < nums[i])
			 maxN = nums[i];
		}

		// ���
		System.out.printf(">> ���� ū �� �� %d\n", maxN);
		
	}
}

// ���� ���
/*
�Է��� �������� ���� : 10
������ �Է�(���� ����) : 74 65 13 91 5 67 41 2 50 11
>> ���� ū �� �� 91
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/