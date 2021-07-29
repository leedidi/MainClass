/*=======================
   ���� �迭 ����
   - �迭�� �⺻�� Ȱ��
 ========================*/

 // �� ����
 // ����ڷκ��� �л� ���� �Է¹ް�
 // �׸�ŭ�� ����(���� ����)�� �Է¹޾�
 // ��ü �л� ������ ��, ���, ������ ���Ͽ�
 // ����� ����ϴ� ���α׷��� �����Ѵ�.
 // ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

 // ���� ��)
 // �л� �� �Է� : 5
 // 1�� �л��� ���� �Է� : 90
 // 2�� �л��� ���� �Է� : 82
 // 3�� �л��� ���� �Է� : 64
 // 4�� �л��� ���� �Է� : 36
 // 5�� �л��� ���� �Է� : 98

 // >> �� : 370
 // >> ��� : 74.0
 // >> ����
 // 90 : 16.0
 // 82 : 8.0
 // 64 : -10.0
 // 36 : -38.0
 // 98 : 24.0
 // ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test079
{
	public static void main(String[] args)
	{
	  // ����ڷκ��� �л� �� �Է¹ޱ�
		
	  int n=0;				// ����ڷκ��� �Է¹��� �л� ��
	  int hap=0; 			// �л��� ������ ��
	  double avg=0, dev=0;	// �л��� ������ ���, ����

	  Scanner sc = new Scanner(System.in);
	  System.out.print("�л� �� �Է� : ");
	  n = sc.nextInt();

	  // ����ڷκ��� ���� �Է¹ޱ�
	  
	  int[] score = new int[n]; //�迭 ����
		
	  for (int i=0; i<score.length; i++)
	  {
		 System.out.printf("%d�� �л��� ���� �Է� : ", (i+1));
		 score[i] = sc.nextInt();
	  }

	  // ��, ���, ���� ���ϱ�

	  for (int i=0; i<n; i++) // (i<n == i<score.length)
	  {
		  hap += score[i];
	  }
		  avg = hap/n;

	  // ��� ���
	  System.out.println();
	  System.out.printf(">> �� : %d\n", hap);
	  System.out.printf(">> ��� : %.1f\n", avg);
	  System.out.println(">> ����");
	  for (int i=0; i<score.length; i++)
	  {
		  dev = score[i]-avg;
		  System.out.printf("%d : %.1f\n", score[i], dev); // printf�� �Ǽ��� : ��%f�� //*printf - f ������ ����!
	  }

	}
}

// ���� ���
/*
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 36
5�� �л��� ���� �Է� : 98

>> �� : 370
>> ��� : 74.0
>> ����
90 : 16.0
82 : 8.0
64 : -10.0
36 : -38.0
98 : 24.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/