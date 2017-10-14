/**
 *@ClassName:Graduate
 *@Description:
 *@author Chenjiao
 *@date:2017年10月14日
 */
public class Graduate extends Student{
	public String direction;  //研究方向
	Graduate(String name1,int age1,String education1,String direction1)  //构造函数
	{
		super(name1,age1,education1);   //利用super关键字显式调用父类的构造函数
		direction=direction1;	
	}
	public void show()
	{
		System.out.println("姓名："+name+"   年龄:"+age+"   学历:"+education+"        研究方向:"+direction);
	}

}
