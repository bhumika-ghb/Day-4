public class Faculty{
     public void showFacultyDetails(String universityName, String facultyName,String departement){
       System.out.println("University Name :"+universityName +"\n Faculty Name:" +facultyName +"\n Department:" +departement);
System.out.println("----------------------");
}
public static void main(String[] args){
    Faculty result=new Faculty();
    result.showFacultyDetails("Stanford University","Dr.Robert Brown","Computer Science");
result.showFacultyDetails("Stanford University","Dr.Lisa Green","Physics");
}
}