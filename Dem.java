class Dem {
   public void getName1 ( int num) {
   System.out.println(num);
   }
   public static void getName(){
       getName();	   
   }
   public static void main(String args[]) {
   Dem obj = new Dem();
   
   obj.getName1(10);
}
   
   }
   