class super8 {
	 void show()
	 {
		 System.out.println("hellow viewer");
	 }
}
	 class super9 extends super8
	 {
		void show()
		{
			super.show();//esko comment karne par answer kuch aur aayega
			System.out.println("hellow learner");
			//System.out.println(super.a);
		}
	 }
	 class super6
	 {
		 public static void main(String[] args) {
			 super9 r=new super9();
			 r.show();
	 }
	 }

