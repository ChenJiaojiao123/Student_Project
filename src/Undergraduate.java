/**
 *@ClassName:Undergraduate
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class Undergraduate extends Student{
	public String specialty;  //רҵ
	Undergraduate(String name1,int age1,String education1,String specialty1)  //���캯��
	{
		super(name1,age1,education1);   //����super�ؼ�����ʽ���ø���Ĺ��캯��
		specialty=specialty1;
	}
	public void show()
	{
		System.out.println("������"+name+"    ����:"+age+"   ѧ��:"+education+"    רҵ:"+specialty);
	}
}
