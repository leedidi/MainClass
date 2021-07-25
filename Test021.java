/*==========================================
  ���� ������(Operator) ����
  - ��Ʈ ���� ������
 ===========================================*/
//@������. ���� �츮�� ���⿣ �����..�׷��� ƴ���� ��� �����غ���

public class Test021
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;
		System.out.printf("~a : %d\n", ~a);
		System.out.printf("~b : %d\n", ~b);
	}
}

/*
~a : -11
~b : 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
a = 10 �� 00001010

			�� ~a
       1  1111111  
		  11110101 �� -11 �� check? �� OK!
		+ 00001011 �� 11
        -----------------
		  00000000 �� 0

b = -10		10 �� 00001010 �� 2�� ����
                              --------
							  1�� ���� + 1
							  ---------
							  ��Ʈ�� ����
	              11110101
				 +       1
				 ----------
				  11110110 �� -10 �� check? �� OK!
			    + 00001010 �� 10  
				----------
                  00000000

				  11110110
				    �� ��Ʈ�� ����
 				  00001001  �� 9

*/