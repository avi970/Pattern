package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class grocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your budget :");
		int bdt=scn.nextInt();

HashMap<String,HashMap<String,Integer>> list=new HashMap<>();
while(true) {
System.out.println("1.Add an item");
System.out.println("2.Exit");
System.out.println("Enter your choice :");
int choice=scn.nextInt();
if(choice==1) {
	System.out.println("Enter product :");
	String product=scn.next();
	System.out.println("Enter quantity :");
	String quantity=scn.next();
	System.out.println("Enter price :");
	int price=scn.nextInt();
	if(list.containsKey(product)) {
		for (Entry<String, HashMap<String, Integer>> e : list.entrySet()) { 
			for(Entry<String,Integer> a : e.getValue().entrySet())
				if(product.contentEquals(e.getKey())) {
		    bdt=bdt+a.getValue();}
		}
		
		
	}
	
	if(bdt>=price) {
		//bdt=bdt-price;
		
			HashMap<String,Integer> ch=new HashMap<>();
			ch.put(quantity, price);
			
		list.put(product,ch );
		bdt=bdt-price;
		System.out.println("Remaining budget is "+bdt);
		
	
		
		
		
	}
	else {
		System.out.println("Can't Buy the product ###(because budget left is "+bdt); 
			
	}

		

}
else {
	break;
}}
for (Entry<String, HashMap<String, Integer>> w : list.entrySet()) { 
	for(Entry<String,Integer> b : w.getValue().entrySet())
    if(b.getValue()<=bdt) {
    	System.out.println("Amount left can buy you "+w.getKey());
    }
} 
System.out.println("Grocery List is");
System.out.println("Product name   Quantity    Price" );
for (Entry<String, HashMap<String, Integer>> e : list.entrySet()) { 
	for(Entry<String,Integer> a : e.getValue().entrySet())
    System.out.println(  e.getKey() 
                       + "              " + a.getKey()+"             "+a.getValue()); 
} 


}}
