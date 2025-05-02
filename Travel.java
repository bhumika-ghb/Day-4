public class Travel{
 public String getBookingDetails(String agency,String destination,int travellers){
 return "Agency:"+ agency +"\n Destination:"+destination +"\n Travellers:" +travellers;
}
public static void main(String[] args){
     Travel result =new Travel();
String result1= result.getBookingDetails("Wanderlust Travels","Paris",2);
String result2= result.getBookingDetails("Wanderlust Travels"," Tokyo",3);
System.out.println(result1);
System.out.println("--------------------");

System.out.println(result2);

System.out.println("-----------------------");
}
}
