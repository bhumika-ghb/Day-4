public class Enrollment{
 public String getEnrollmentInfo(String platform,String course,String student){
 return "Platform:"+ platform +"\n Course:"+course +"\n Student:" +student;
}
public static void main(String[] args){
     Enrollment result =new Enrollment();
String result1= result.getEnrollmentInfo("udemy","Java Programming","Alice");
String result2= result.getEnrollmentInfo("Udemy","Web Development","Bob");
System.out.println(result1);
System.out.println("--------------------");

System.out.println(result2);

System.out.println("-----------------------");
}
}