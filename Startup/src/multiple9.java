 interface arav45
   {
	 void show();//public+abstract
	     //abstract void show(); ye bhi likh sakte hai
   }
	 
 interface arav46
 {
	 void show();//public+abstract by default hai
 }

 
  class multiple9 implements arav45,arav46
  {
	 public void show() //esliye yaha public likhana hoga 
	                    //agar hm public yaha nhi likhenge to usse yaha par
	                    //by default access modifier default rahega aur
	                    //default public ke mukable chota hota hai weak hota hai
	  {
		  System.out.println("interface arav45 & arav46");
	  }
	  public static void main(String[] args) {
	    	 
	  	   multiple9 m=new multiple9();
	  	   m.show();
	  
  }
  }

