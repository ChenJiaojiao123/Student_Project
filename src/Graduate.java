/**
 *@ClassName:Graduate
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class Graduate extends Student{
	public String direction;  //�о�����
	Graduate(String name1,int age1,String education1,String direction1)  //���캯��
	{
		super(name1,age1,education1);   //����super�ؼ�����ʽ���ø���Ĺ��캯��
		direction=direction1;	
	}
	public void show()
	{
		System.out.println("������"+name+"   ����:"+age+"   ѧ��:"+education+"        �о�����:"+direction);
	}

}
