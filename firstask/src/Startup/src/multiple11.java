interface arav49
   {
	 void show();//public+abstract
	     //abstract void show(); ye bhi likh sakte hai
   }
	 
 interface arav50
 {
	 void show();//public+abstract by default hai
 }

       //agar dono ke pass alag alag requiement hai
  class multiple11 implements arav49,arav50
  {
	 public void show() //esliye yaha public likhana hoga 
	                    //agar hm public yaha nhi likhenge to usse yaha par
	                    //by default access modifier default rahega aur
	                    //default public ke mukable chota hota hai weak hota hai
	  {
		  System.out.println("interface arav49 & arav50");
	  }
	  
	  public static void main(String[] args) {
	    	 
	  	   multiple11 m=new multiple11();
	  	   m.show();
	  
  }
  }



