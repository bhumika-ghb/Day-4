public class Car{
     public void displayDetails(String showroomName,String modelName,int price){
      System.out.println("Showroom Name:"+showroomName + "\n  Car Model:"+modelName + "\n Car Price:" +price);
System.out.println("--------------------");
}
public static void main(String[] args){
      Car c1=new Car();
      c1.displayDetails("Elite Motors", "Tesla Models",80000);
      c1.displayDetails("Elite Motors","BMW X5",75000);
}
}
      