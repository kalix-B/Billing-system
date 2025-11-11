import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
     boolean r =true;
     int R=5,C=1;
     
     String clear ="----";
     String bill[][]=new String[R][C];
     bill[0][0]=clear;
     bill[1][0]=clear;
     bill[2][0]=clear;
     bill[3][0]=clear;
     bill[4][0]=clear;
     int itemcount=0;
     Double price[][]=new Double[R][C];
     price[0][0]=0.0;
     price[1][0]=0.0;
     price[2][0]=0.0;
     price[3][0]=0.0;
     price[4][0]=0.0;
     
     
     while(r) 
    {System.out.println();
     System.out.println("|--------------------|");
     System.out.println("|---Billing System---|");
     System.out.println("|--------Menu--------|");
     System.out.println("|  [1]Insert Product |");
     System.out.println("|  [2]Check List     |");
     System.out.println("|  [3]Delete Product |");
     System.out.println("|  [4]Pay            |");
     System.out.println("|  [5]Exit           |");
     System.out.println("|--------------------|");
     System.out.print("Menu:");
     int menu=scan.nextInt(); 
     scan.nextLine();
      
    if(menu==1) 
    {System.out.println("|----------------|");
     System.out.println("|-Insert Product-|");
     System.out.println("|----------------|");
     System.out.print("Product:");
    	 String product=scan.nextLine();
    	 System.out.print("Price:");
      double value=scan.nextDouble(); scan.nextLine();
      
      boolean productcheck=false;
      
          
    if(bill[0][0].equals(clear)) 
    {bill[0][0]=product;
     price[0][0]=value;
     System.out.println();
     System.out.println("PRODUCT ADDED!");
     System.out.println("Product:"+product);
     System.out.println("Price:"+value);
     productcheck=true;}
     
    else if(bill[1][0].equals(clear)) 
     {bill[1][0]=product;
      price[1][0]=value;
      System.out.println();
      System.out.println("PRODUCT ADDED!");
      System.out.println("Product:"+product);
      System.out.println("Price:"+value); 
      productcheck=true;}
     
    else if(bill[2][0].equals(clear)) 
     {bill[2][0]=product;
      price[2][0]=value;
      System.out.println();
      System.out.println("PRODUCT ADDED!");
      System.out.println("Product:"+product);
      System.out.println("Price:"+value);
      productcheck=true;}
     
     else if(bill[3][0].equals(clear)) 
     {bill[3][0]=product;
      price[3][0]=value;
      System.out.println();
      System.out.println("PRODUCT ADDED!");
      System.out.println("Product:"+product);
      System.out.println("Price:"+value);
      productcheck=true;}
     
     else if(bill[4][0].equals(clear)) 
     {bill[4][0]=product;
      price[4][0]=value;
      System.out.println();
      System.out.println("PRODUCT ADDED!");
      System.out.println("Product:"+product);
      System.out.println("Price:"+value);
      productcheck=true;}
     
    
    if(!productcheck) 
    {System.out.println();
     System.out.println("List is Full");}}//choice1
     
    else if(menu==2)
    {System.out.println();
     System.out.println("|--------------------------|");
     System.out.println("|-------All Product--------|");
     System.out.println("|--------------------------|");   
     System.out.println();
     System.out.println("Product:"+bill[0][0]+" Price:"+price[0][0]);
     System.out.println("Product:"+bill[1][0]+" Price:"+price[1][0]);
     System.out.println("Product:"+bill[2][0]+" Price:"+price[2][0]);
     System.out.println("Product:"+bill[3][0]+" Price:"+price[3][0]);
     System.out.println("Product:"+bill[4][0]+" Price:"+price[4][0]);}
    
     else if(menu==3) 
     {System.out.println("|----------------|");
      System.out.println("|--Void Product--|");
      System.out.println("|----------------|");
      System.out.print("Product:");
    	 String product=scan.nextLine();
         boolean del=false;
        
         
         
      if(bill[0][0].equals(product)) 
      {bill[0][0]=clear;
       price[0][0]=0.0;
       System.out.println();
       System.out.println("PRODUCT Remove!");
       System.out.println("Product:"+product);
       del=true;}              
    	  
      else if(bill[1][0].equals(product)) 
      {bill[1][0]=clear;
      price[1][0]=0.0;
      System.out.println();
      System.out.println("PRODUCT Remove!");
      System.out.println("Product:"+product);
      del=true;}              
    	  
      else if(bill[2][0].equals(product)) 
      {bill[2][0]=clear;
      price[2][0]=0.0;
      System.out.println();
      System.out.println("PRODUCT Remove!");
      System.out.println("Product:"+product);
      del=true;}     
      
      else if(bill[3][0].equals(product)) 
      {bill[3][0]=clear;
      price[3][0]=0.0;
      System.out.println();
      System.out.println("PRODUCT Remove!");
      System.out.println("Product:"+product);
      del=true;}   
     
      else if(bill[4][0].equals(product)) 
      {bill[4][0]=clear;
      price[4][0]=0.0;
      System.out.println();
      System.out.println("Product Remove!");
      System.out.println("Product:"+product);
      del=true;}} 
    
     else if (menu==4)
     {System.out.println();
      System.out.println("|----------------|");
      System.out.println("|------PAY-------|");
      System.out.println("|----------------|");
      System.out.println("Product:"+bill[0][0]+" Price:"+price[0][0]);
      System.out.println("Product:"+bill[1][0]+" Price:"+price[1][0]);
      System.out.println("Product:"+bill[2][0]+" Price:"+price[2][0]);
      System.out.println("Product:"+bill[3][0]+" Price:"+price[3][0]);
      System.out.println("Product:"+bill[4][0]+" Price:"+price[4][0]);
      double total=price[0][0]+price[1][0]+price[2][0]+price[3][0]+price[4][0];
      System.out.println("Total:"+total);
      System.out.println("Paid Successfully");
      bill[0][0]=clear;
      bill[1][0]=clear;
      bill[2][0]=clear;
      bill[3][0]=clear;
      bill[4][0]=clear;
      
      price[0][0]=0.0;
      price[1][0]=0.0;
      price[2][0]=0.0;
      price[3][0]=0.0;
      price[4][0]=0.0;}
    
     else if(menu==4) 
     {r=false;
     System.out.println("Goodbye!");}
    
     else 
     {System.out.println();
      System.out.println("Invalid Menu");}} //run
     
     }
}