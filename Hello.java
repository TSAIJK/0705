public class Hello{
  public static void main (String args[]){
  	System.out.println("这是一个简单的java程序");
        Student stu=new Student();
  	stu.speak("we are students");
}
}

class Student
{
  public void speak(String s)
{
  System.out.println(s);
}
}