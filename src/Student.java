/**
 *@ClassName:Student 
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class Student {
	public String name;  //����
	public int age;      //����
	public String education; //ѧ��
	Student(String name1,int age1,String education1)    //���캯��
	{
		name=name1;
		age=age1;
		education=education1;
	}
	public void show()
	{
		System.out.println("������"+name+"   ����:"+age+"   ѧ��:"+education);
	}
}
