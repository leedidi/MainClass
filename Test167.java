/*======================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

// Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�
//   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�(�����ؾ� �ϸ�)
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.


/*
�� HashMap<K, V> Ŭ����

   - Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
     HashMap Ŭ������ ����� Hashtable �� ����������
	 Synchronozation �� ���� ������ ���ü� ������ ���ٸ�
	 (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	 HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�.

   - ����, HashMap �� Hashtable Ŭ�����ʹ� �޸� null �� ����Ѵ�.

   //@ Hashtable, HashMap ����� �Ȱ����� ����ȭ�� table�� ����! �÷�����Ʈ�ִ� ������... �׷��� ����� table�� ������ map�� ������...

*/

import java.util.HashMap;
import java.util.Map;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map �̶�� �ؽø� �ڷᱸ���� ��� �߰�
		// �� put()
		map.put("���", "����");
		map.put("��ȭ", "�׷���Ƽ");
		map.put("��ȭ", "���󿡸�");

		// ���� Ȯ��
		//System.out.println(map);
		//--==>> {���=����, ��ȭ=�׷���Ƽ, ��ȭ=���󿡸�}


		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		map.put(null, "�����ϴ»��");
		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//   ������ null �� key �� ���ε� "�����ϴ»��"��
		//   ���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap �� null �� �ϳ��� ������ key ������ �����Ѵ�.(�ν��Ѵ�.)

		// ���� Ȯ��
		//System.out.println(map);
		//@ set�� map�� ������ �������! ����ִ� key�� �����ϴ� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ī�װ���, Ÿ��Ʋ �Է�(�ĸ� ����) : ");	// "�׸�, �𳪸���"
		String[] temp;

		for (String str; ((str=br.readLine()) != null); )
		{
			temp = str.split(",");	//{"�׸�", "�𳪸���"}
			if (temp.length<2)
			{
				System.out.print("ī�װ���, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}

		//@ cntl + c : �ϰ� �۾��� �����ðڽ��ϱ� (Y/N)? 
	}
}