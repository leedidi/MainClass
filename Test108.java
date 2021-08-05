/*===========================
   ���� Ŭ���� ���� ����
   - ���(Inheritance)
 ============================*/

// �� �����ڿ� Ŭ���� ��Ӱ��� ����
//
//	  ���� Ŭ������ ���� Ŭ������ ����� ��ӹ�����,
//    �����ڴ� ��� ��󿡼� ���ܵȴ�.
//	  �׸���, ���� Ŭ������ �����ڰ� ȣ��� ��
//    �ڵ����� ���� Ŭ������ �����ڰ� ȣ��ȴ�.
//    �� ��, ȣ��Ǵ� ���� Ŭ������ �����ڴ�
//    �μ��� ���� ������(default ������ ����)�� �ȴ�.

//    ���� Ŭ���� �� ���� Ŭ������ �����ϴ� ��������
//    ���� Ŭ������ �����ڸ� ��������(�ۼ�����) �ʰų�
//    �μ��� ���� �����ڸ��� ������(�ۼ���) ���
//    ���������� ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ������ �ʾƵ�
//    �ƹ��� ������ �߻����� ������
//    ���� Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϴ� ��쿡��
//    �����ؾ� �Ѵ�.

//    ���� ���... ��������...
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			// super();
		}
	}
*/
//	   ���� Ŭ������ B_class �� �����ڿ���
//	   ���������� A_class �� �����ڸ� ȣ������ ������
//	   �ڵ����� ���� ���� �����ڸ� ȣ���Ѵ�.
//	   ������, A_class ���� ���ڰ� �ִ� �����ڸ� �����ϰ�
//     ���ڰ� ���� �����ڴ� �������� �ʱ� ������ ���� �߻��Ѵ�.
//     ����, B_class �������� ���ο�
//     ����ó�� ���������� ���� Ŭ������ ������ ȣ�� ������
//     �ۼ��ؾ� �Ѵ�.
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10);
			...
			...
		}
	}
*/

//@ ��Ʈ��Ű ������ ����Ű ������ Ű���� ������ ä�� ȭ�� ���Ʒ��� ������!
/*
=========================================================================================================================
  ���� Ŭ����    |  ���� Ŭ����       |  ���
-------------------------------------------------------------------------------------------------------------------------
 �����ڸ�        | ������ ���� ����   | �� �����ϴ�.
 ��������	     | �μ��� ���� ������ | �� �����ϴ�.
 ����			 | �μ��� �ִ� ������ | �� �����ϴ�.
-------------------------------------------------------------------------------------------------------------------------
 �μ���          | ������ ���� ����   | �� �����ϴ�.
 ����		     | �μ��� ���� ������ | �� �����ϴ�.
 �����ڸ� ����   | �μ��� �ִ� ������ | �� �����ϴ�.
-------------------------------------------------------------------------------------------------------------------------
 �μ���          | ������ ���� ����   | �� ���� �߻�. //@����Ʈ �ڵ�����
 �ִ�            | �μ��� ���� ������ | �� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻� //@ȣ�ⱸ�� ������ ��� ��
 �����ڸ� ����   | �μ��� �ִ� ������ | �� ���� Ŭ������ �ش� �����ڸ� ȣ������ ������ ���� �߻�
=========================================================================================================================
*/


// Rect108 Ŭ������ Circle108 Ŭ������ �θ� Ŭ����
 class SuperTest108
 {
	 protected double area; //@ ��κ� private ���.. protected ����Ѵٸ� ��� ���ο� �аŶ�� �����ص� ��
	 private String title;	//@ private -> �������� ���ϰ�, ����� ���� ���Ѵ�....��� �����ϱ�
	                        //@ �θ���� ȥ�ڸ� ��бݰ��� �ϱ��� �־���� ȥ�� ���� ��ŵ� �̰� ����Ҽ� X
							//@ ���� ���ϰ����� ������ٰ�~ �̰� ��°� ����
	
	 // �θ� Ŭ������ ���� ���� ����� ���� ������
	 public SuperTest108()
	 {
		 System.out.println("SuperTest108... ���� ���� ������");
	 }

	 // �θ� Ŭ������ ���ڿ��� ���ڷ� �޴� ����� ���� ������
	 public SuperTest108(String title)
	 {
		 this.title = title;
		 System.out.println("SuperTest108... ���ڿ��� ���ڷ� �޴� ������");
	 }

	 public void write()
	 {
		 System.out.println(title + " - " + area);
	 }

 }

// SuperTest108 Ŭ������ ��ӹ޴� �ڽ� Ŭ����
 class Rect108 extends SuperTest108
 {	
	 // ��ӹ��� �͵�
	 /*
	protected double area; 

	 public void write()
	 {
		 System.out.println(title + " - " + area);
	 }
	*/

	 private int w, h;

	// �ڽ� Ŭ������ ���� ���� ����� ���� ������
	 public Rect108()
	 {
		 // �ڵ����� ����
		 //super();	/@���Ե� Ŭ���� -> ������ ��ӹ޳� ���� -> �� SuperTest108();
	 }

	 public void calc(int w, int h)
	 {
		 this.w = w;
		 this.h = h;
		 area = (double)this.w * this.h;
		 // super.area = (double)this.w * this.h; // ����(�������� �����)
		 // this.area = (double)this.w * this.h;  // ����(���� ���� �����)(�θ�����κ��� ���� ����.ĳ����(��) ��������. 
												  //@ ���� ���� ĳ���� = �θ�����κ��� �������� ĳ����
												  
												  //@ �׳� ĳ���� =>=> ���� �����ְ� �� ĳ����
												  //@ �¼��� ����!
		 write();
	 }
	
	//�Ǽ��Ѱ� �ƴ϶� �Ϻη� Ʃ���Ѱž�~!
	 @Override			//-- ������̼�(annotation) - metadata - JDK 1.5
						//@ "@Override" �̰� �ᵵ�ǰ� �Ƚᵵ�ǰ� x. ����� ��!
	 public void write()
	 {
		 System.out.println("w : " + w + ", h : " + h);
		 System.out.println("�簢�� - " + area);
	 }
	 //@ �¼���X, �̰� �ϴ� ���� �������! 
	 //@ �θ�Բ� �������� ĳ����.. ���ڸ��� ������ī�� �����ļ� ������
	 //@ ���� ������ ĳ���� �����޾����� ����� ������ī�� ����. ������ ������ ���� ĳ������ ����
	 //@ ���̻� ��ӹ�����, �ش����� ���ư��� ����~!!!

	 // �� �޼ҵ� �������̵�(Method Overriding)
	 //    ���� Ŭ����(�θ� Ŭ����)�� ��ӹ��� ���� Ŭ����(�ڽ� Ŭ����)����
	 //    ���� Ŭ������ ���ǵ� �޼ҵ带 �ٽ� �����ϴ� ������(������)
	 //    ��ü ���� ���α׷����� Ư¡�� �������� ��Ÿ����.
	 //    ������(Overriding)�� �ݵ�� ��� ���迡 �־�� �ϸ�,
	 //    �޼ҵ��� �̸�, ���� Ÿ��, �Ű������� ������ Ÿ����
	 //    ������ ��ġ�ؾ� �Ѵ�.
	 //@  (�޼ҵ� �����ε��� ����, �������̵��� ��ӿ����� ����!)
 }

// SuperTest108 Ŭ������ ��ӹ޴� �ڽ� Ŭ���� 
class Circle108 extends SuperTest108
{	
	// ��ӹ��� �͵�
	/*
	protected double area; 

	 public void write()
	 {
		 System.out.println(title + " - " + area);
	 }
	*/
	
	/* default ������ �� �Ʒ��� ����� ���� �����ڰ� �ֱ� ������ �ڵ����� ���Ե��� �ʴ´�.
	public Circle108()
	{
	}
	*/

	// �ڽ� Ŭ������ ���ڿ��� ���ڷ� �޴� ����� ���� ������
	public Circle108(String title)
	{	
		// super();   //@ �̰� �ڵ����� ���Ե� //--==>> SuperTest108... ���� ���� ������
		super(title); //@ �����ִ� ������ �����ϰ� �ʹٸ� �̰� ���� //--==>> SuperTest108... ���ڿ��� ���ڷ� �޴� ������
	}
	//@@@ ���ڿ��� ���ڷ� �޴� ����� ���� �����ڿ����� super(); ����Ʈ�� ���� �ǳ�,,,? �ȵǳ�,,,? �ȵǴ°� ����,,! �� �Ǵ°Ű��⵵,,
	//@@@ defalt �����ڴ� public Circle108() ~ super(); �̰� ����ϴ� �ǰ� �ͱ⵵ ��

	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();		//@ �θ�κ��� �������� write! Ʃ���Ѱ� ù° ����.... ��°�� �״�� ������̶� ����!
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test108
{
	public static void main(String[] args)
	{
		Rect108 ob1 = new Rect108(); //@ �ڽ�Ŭ���� ��� �ν��Ͻ� ����
		//--==>> SuperTest108... ���� ���� ������

		//Circle108 ob2 = new Circle108();
		//--==>> ���� �߻�(������ ����)
		//-- ���� Circle108 Ŭ��������
		//   �Ű������� �ʿ�� �ϴ� ����� ���� �����ڰ� ������� ������
		//   �̷� ���� default �����ڰ� �ڵ����� ���Ե��� �ʴ� ��Ȳ.

		Circle108 ob = new Circle108("��"); // 
		//--==>> SuperTest108... ���� ���� ������
		//--==>> SuperTest108... ���ڿ��� ���ڷ� �޴� ������
	}
	
}