/*=================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ������ �ν��Ͻ� Ȱ��
 =================================*/

 // 1. Record Ŭ����
 //    - �Ӽ��� �����ϴ� Ŭ������ ������ ��~!!!


//[���� �ۼ��� �ڵ�]
/*
public class Record
{
	Static String name;
	Staitc int kor, eng, mat;
	Static int sum, avr;
}
*/


//[�Բ� �ۼ��� �ڵ�]
public class Record
{
	// �л� �� ���� ǥ���� �� �ִ� �Ӽ���� ����~!!! check~!!!

	String name;				//-- �̸�
    //int kor, eng, mat;		//-- �� ������ ����(����, ����, ����) 
	int[] score = new int[3];	// score[0] = ����, score[1] = ����, score[2] = ����
	int tot;					//-- ����
	double avg;					//-- ���
	int rank;					//-- ����(���)
}