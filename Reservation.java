public class Reservation{
 public String getReservationDetails(String hotelName,String guestName,int nights){
 return "Hotel Name:"+ hotelName +"\n Guest Name:"+guestName +"\n Nights:" +nights;
}
public static void main(String[] args){
     Reservation result =new Reservation();
String result1= result.getReservationDetails("Grand Palace","David",3);
String result2= result.getReservationDetails("Grand Palace"," Maria",2);
System.out.println(result1);
System.out.println("--------------------");

System.out.println(result2);

System.out.println("-----------------------");
}
}