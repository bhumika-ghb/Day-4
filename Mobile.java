public class Mobile{
   public void showDetails(String storeName,String brand,int price){
     System.out.println("Store Name:"+ storeName + "\n Mobile Brand:" + brand +"\n Mobile Price:" +price);
     System.out.println("------------------------");
}
public static void main(String[] args){
      Mobile details=new Mobile();
      details.showDetails("Tech World","Apple",1200);
details.showDetails("Tech World","Samsung",900);
}
}