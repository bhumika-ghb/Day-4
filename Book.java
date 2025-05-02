public class Book{
    public void displayInfo(String libraryName,String title,String author){
      System.out.println("Library Name:" +libraryName + "\n Book Title:"+title +"\n Book Author:"+ author);
System.out.println("-----------------------");
}
public static void main(String[] args){
    Book details=new Book();
    details.displayInfo("City Public Library","The Great Gatsby","F.Scott Fitzgerald");
details.displayInfo("City Public Library","1984","George Orwell");
}
} 