/**
 *@ClassName:TestExtends
 *@Description:
 *@author Chenjiao
 *@date:2017��10��14��
 */
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("XiaoMing",18,"high shool");
		Undergraduate undergraduate=new Undergraduate("XiaoHua",19,"university","software");
		Graduate graduate=new Graduate("XiaoFang",20,"master","big date");
		student.show();
		undergraduate.show();
		graduate.show();
	}
}
