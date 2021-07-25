/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
 ==========================================================*/

// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 8/9 + 9/10

//					n(n+1)
// n			��  n �� 1 ~ 9 ���� 1�� ����
// |
// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 8/9 + 9/10
//   |
//   n			��  n �� 2 ~ 10 ���� 1�� ����
//                  (n-1)/n

// n/(n+1)

// 1
// 1/2 2/3 3/4 ....

// (n-1)/n

//       2    3   4
//      1/2 2/3 3/4 ....

// sum += (double)(6/7) // 6/7 �Ѵ����� ����� ����(�Ǽ�)�� ����ȯX, 6�� ������ ����ȯ�� ������ 7�� ���� O


//@ ���� ������̸� ���� ������ ������ ������...?? �� ȿ����,,? 
// >> ���� ������ �������� ����! �ٵ� ������ ����ó�� ������ ������������ ���� �ѵΰ� �� ����, �� �����ص�
// �̰ɷ� �Ǵ��ϱ⿡�� ������ ����! ū ���� �� �� 

// ���� ��)
// ���� ��� : xxx (�� �Ǽ� ��� ����)
// ��� �Ϸ��� �ƹ� Ű�� ��������...

/*

// [���� �ۼ��� �ڵ�]

public class Test044
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		int a = 1;
		double b = 2;
		double div = 0;

		// ���� �� ó��

		while (a<=9)
		{
			div += a/b;
		//	System.out.printf("\n���� ��� : %d / %f = %f\n", a, b, div) // ��� ���� Ȯ�ο�
			a++;
			b++;
			
		}
		
		// ��� ���
		System.out.printf("���� ��� : %f\n", div);
		
	}
}

*/

// [���� �ۼ��� �ڵ�]

public class Test044
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n=0;						//-- 1���� 1�� �����ϰ� �� ����
		double sum=0;						//-- �������� ���� ����(�Ǽ� ����) 

		// ���� �� ó��(�ݺ��� ����)
		while (n<9)						//-- 0 1 2 3 4 5 6 7 8
		{
			// ������ ����
			//-- ���������� �ݺ����� ������ ���ʶ߸��� �Ǵ� ���谡 �Ǵ� ����
			n++;						//-- 1 2 3 4 5 6 7 8 9

			//
			sum += (double)n/(n+1);		//-- 1.0/2 + 2.0/3 + 3.0/4 ... 9.0/10
			//-- ���� ��� ������ ����dml ���� ��ȯ�ϱ� ������
			//   �Ǽ� ��� ������ �����ϵ��� ó���ϱ� ���ؼ�
			//   ������ �����ڸ� �߽����� �ǿ����� �� �ϳ���
			//   �Ǽ� ���·� ������ִ� ���� �߿��ϴ�.
		}
		

		// ��� ���
		// ������ ���� ������� ������ ���� ������ ������ ���� �ڵ��ΰ���..??
		System.out.printf("���� ��� : %f\n", sum);
	}
}

// ���� ���
/*
���� ��� : 7.071032
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/