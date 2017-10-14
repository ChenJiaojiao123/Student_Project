/**
 *@ClassName:Student 
 *@Description:
 *@author Chenjiao
 *@date:2017年10月14日
 */
public class Student {
	public String name;  //姓名
	public int age;      //年龄
	public String education; //学历
	Student(String name1,int age1,String education1)    //构造函数
	{
		name=name1;
		age=age1;
		education=education1;
	}
	public void show()
	{
		System.out.println("姓名："+name+"   年龄:"+age+"   学历:"+education);
	}
}
