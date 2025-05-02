public class Patient{
   public void printDetails(String hospitalName,String patientName, int age){
     System.out.println("Hospital Name:" +hospitalName +"\n Patient Name:" +patientName +"\n Patient Age:" +age);
     System.out.println("-------------------------");
}
public static void main(String[] args){
   Patient details=new Patient();
   details.printDetails("City Care Hospital","John Doe",45);
   details.printDetails("City Care Hospital","Emma watson",30);
}
}