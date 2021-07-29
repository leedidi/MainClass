/*===========================
   ���� �迭 ����
   - �迭�� �迭(2���� �迭)
 ============================*/
 
 // �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 // ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�.
 // �� ����� ����ϴ� ���α׷��� �����Ѵ�.

  // ���� ��)
 /*
  1	  2  3  4  10		00 01 02 03 04
  5   6  7  8  26		10 11 12 13 14
  9  10 11 12  42		20 21 22 23 24
  13 14 15 16  58		30 31 32 33 34
  28 32 36 40 136		40 41 42 43 44..

����Ϸ��� �ƹ� Ű�� ��������...
*/
// �� ����ϸ鼭 ���������� ������ ���ϸ� ��!

/*
public class Test086
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		
		int n=1;
	
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5 ;j++ )
			{
				if(i<4)
				{ 
					arr[i][j] = n;
					n++;
				}

				if(j==4)
				{	
					arr[i][j] = 1;
				}
			
				if(i==4)
				{
					arr[i][j] = 2;
				}

		}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
	}
}
*/


public class Test086
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		
		// �迭�� �迭 �� �濡 ��� ä���ֱ�
		int n=0;
		for (int i=0; i<4; i++)				// ��~ i �� 0 1 2 3
		{
			for (int j=0; j<4; j++)			// ��~ j �� 0 1 2 3
	 		{
				n++;						// n �� 1 2 3 4 5 ... 16
				arr[i][j] = n;

				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}


// ���� ���
/*
  1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/