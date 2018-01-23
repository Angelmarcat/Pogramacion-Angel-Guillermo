/*******************************************************************
***************       Angel Guillermo Martínez Cruz    *************
***************       PrintPurchaseOrder.java          *************
***************       oreder amount                    *************
********************************************************************/
import java.util.Scanner;
  public class PrintPurchaseOrder{
    public static void main(String[] args) {
      Scanner userData = new Scanner(System.in);
      double price ;
      int quantity;
      String nameProduct;
      System.out.println("Enter the nameProduct");
      nameProduct=userData.nextLine();
      System.out.println("Enter the price");
      price = userData.nextDouble();
      System.out.println("Enter the quantity ");
      quantity = userData.nextInt();

      System.out.println("Totl purchase order \n" + price * quantity);
    }
  }
