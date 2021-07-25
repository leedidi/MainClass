/*===================================
  ���� ������(Operator) ����
  - ���� ������ == ���� ������
 ===================================*/

 // ����ڷκ��� ������ ������ �Է¹޾�
 // �Է¹��� ������ �������, ��������, 0���� �����Ϸ� (@��������!)
 // �� ����� ����ϴ� ���α׷��� �����Ѵ�.
 // ��, �Է� �����ʹ� BufferedReader �� readLine() �� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
 // ����, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

 // ���� ��)
 // ������ ���� �Է� : -12
 // -12 �� ����
 // ����Ϸ��� �ƹ� Ű�� ��������...

 // ������ ���� �Է� : 257
 // 257 �� ���
 // ����Ϸ��� �ƹ� Ű�� ��������...
 
 // ������ ���� �Է� : 0
 // 0 �� ��
 // ����Ϸ��� �ƹ� Ű�� ��������...
/*
[���� ���� �ڵ�]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		// 0���� Ȧ������ ¦�������� ���� �Ǻ� ����

		strResult = n==0 ? "��" : ((n<0)? "����" : "���");

		// ��� ���
		System.out.printf("%d �� %s\n", n, strResult);
	}
}
*/
//@ ����Ʈ ������ �� Ŭ���� !��!�� �־�� ��!
//@ �ڹپ� Ŭ�������� �̰� ���Ŵϱ� ��ΰ��� �̰� ���� �����ϰ� ��~!
//@ ������ ��� ����!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*; //@ �̷��� ���°� ������ ������ ��õ���� ����
					//@ 1> ��������� é�� �����ε� �ڹ����� ���� å �ѱ� ���϶�� �ϴ� ��!
					//@    �ڹٰ� Ȥ����� �Ф� ���� ���� ģ���ϰ� �ڹ����� �ȳ� ���ִ� ��. �� ȿ������
					//@ 2> ���� �츮�� ����� ��� X, �ִ°� �����ٰ� ���
					//@    �ð� ������ �츮�� ���� ���赵 ����� ��
					//@      
					//@  ex)  com > test > Circle
					//@       com > test > Rent
					//@       
					//@       com > run > Circle
					//@       com > run > Rent
					//@      
					//@  
					//@      import com.test.Circle;
					//@      import com.run.rent
					//@  
					//@ ���� , import com.test.*;
					//@        import com.run.rent ���ٸ� rent�� �ι�! rent ����Ҽ�X
					//@  
					//@ 3> ����°, �츮�� input~buffered~ �̸� �ѹ��̶� �� ������ 
					//@	   ����ִ��� �ѹ��̶� �� ����� �ϱ� ����!
					//@
					//@ *> �츮�� �ϴ� � ����� �ֱ��� ���� �˰� ������ ��������
					//@ �ǹ����� �����ϴ°� class����. ��� ��� �ڵ��Ǿ��ִ��� �˼�����, �����Ҽ��� ����!
					//@ java ���� : ���� �ִ� ������ǰ. ����� ��� ����, ����Ǿ��ִ��� �˼����� class������ ������� �˼�X
					//@ �̰�ó�� io ~~ �� �ȿ� ���� �����. ������ ����,,,,!! �ϴ��� � ����� �ֱ����� �˸� ��������
					//@ ī���̼� : �ϴ� ��������� �˸� ����. ���߿� ���� �����ؼ� ����ī���̼����Ǹ� ���� ���а���, ���� �˾Ƽ�
					//@ �������� ������ �� ���̸� ���̷��� �ϱ� ���ؼ� �� ���� �˷��� �ϴ°�.. �������� ������ ���� �츮 �����̿�����
					//@ �����Ƿ� ����Ű�°� �ϴ� �����!


//import java.lang,*;

//[���� ������ �ڵ�]
public class Test027
{
	public static void main(String[] args) throws IOException
	{	
		// �ֿ� ���� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- ����� �Է°��� ���� ����
		String strResult;	//-- �������� ������� ������ �Ǻ� ����� ���� ����
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		/*
		n�� 0���� ũ�� �� true	�� n�� ���
					   �� false �� n�� 0�̴� �� true  �� n�� ��
					   						 �� false �� n�� ����
		*/

		strResult = (n>0)? ("���") : ( (n<0) ? ("����") : ("��") );
		// 10
		// strResult = (10>0)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = (true)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = "���"

		//-4
		// strResult = (-4>0)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = (false)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = = ( (-4<0) ? ("����") : ("��") );
		// strResult = ( (true) ? ("����") : ("��") );
		// strResult = : ( (true) ? ("����") : ("��") );
		// strResult = ("����");
		// strResult = "����";

		//0
		// strResult = (0>0)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = (false)? ("���") : ( (n<0) ? ("����") : ("��") );
		// strResult = ( (0<0) ? ("����") : ("��") );
		// strResult = ( false ? ("����") : ("��") );
		// strResult = ( ("��") );
		// strResult = "��";


		// ��� ���
		System.out.println(n + " �� " + strResult);

	}
}

//[���� ������ �ڵ�] ���� ���
/*
������ ���� �Է� : -11
-11 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 84
84 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/


//[���� ���� �ڵ�] ���� ���

/*
������ ���� �Է� : -12
-12 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 10
10 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/