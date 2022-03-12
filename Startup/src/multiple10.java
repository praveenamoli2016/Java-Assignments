interface arav47
   {
	 void show();//public+abstract
	     //abstract void show(); ye bhi likh sakte hai
   }
	 
 interface arav48
 {
	 void disp();//public+abstract by default hai
 }

       //agar dono ke pass alag alag requiement hai
  class multiple10 implements arav47,arav48
  {
	 public void show() //esliye yaha public likhana hoga 
	                    //agar hm public yaha nhi likhenge to usse yaha par
	                    //by default access modifier default rahega aur
	                    //default public ke mukable chota hota hai weak hota hai
	  {
		  System.out.println("interface arav47");
	  }
	  public void disp()
	  {
		  System.out.println("interface arav48"); 
	  }
	  public static void main(String[] args) {
	    	 
	  	   multiple10 m=new multiple10();
	  	   m.show();m.disp();
	  
  }
  }


