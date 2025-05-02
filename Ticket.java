public class Ticket{
 public String getTicketInfo(String theaterName,String movieName,String seatNo){
 return "Theater Name:"+ theaterName +"\n Movie Name:"+movieName +"\n Seat No:" +seatNo;
}
public static void main(String[] args){
     Ticket result =new Ticket();
String result1= result.getTicketInfo("galaxy Cinemas","InterStellar","A10");
String result2= result.getTicketInfo("galaxy Cinemas","Inception","B12");
System.out.println(result1);
System.out.println("--------------------");

System.out.println(result2);

System.out.println("-----------------------");
}
}