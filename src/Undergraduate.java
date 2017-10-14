/**
 *@ClassName:Undergraduate
 *@Description:
 *@author Chenjiao
 *@date:2017年10月14日
 */
public class Undergraduate extends Student{
	public String specialty;  //专业
	Undergraduate(String name1,int age1,String education1,String specialty1)  //构造函数
	{
		super(name1,age1,education1);   //利用super关键字显式调用父类的构造函数
		specialty=specialty1;
	}
	public void show()
	{
		System.out.println("姓名："+name+"    年龄:"+age+"   学历:"+education+"    专业:"+specialty);
	}
}
