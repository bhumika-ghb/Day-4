public class Order{
   public  String getOrderDetails(String restaurantName,String foodItem,int quantity){
          return "Restaurant Name: " + restaurantName +
               "\nFood Item: " + foodItem +
               "\nQuantity: " + quantity;
}
public static void main(String[] args){
     Order result =new Order();
String result1= result.getOrderDetails("Spice Garden","panner Butter Masala",2);
String result2= result.getOrderDetails("Spice Garden", "Chicken Biryani"
,1);
System.out.println(result1);
System.out.println("------------------------");

System.out.println(result2);
System.out.println("------------------------");
}
}