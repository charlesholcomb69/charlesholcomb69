package ReviewClass11;

public abstract class Card {
    // abstract String name; not allowed
    //private abstract void showInterest(); // not allowed
    // static abstract void showInterest(); //// not allowed
    // abstract final void showInterest();  // not allowed
    abstract void showInterest();
   /* abstract Card(){
         //dont' participate in inheritance
     }*/
}
class  Visa extends Card{
    @Override
    void showInterest() {
        //  super.showInterest(); no body inside the parent class we can't call it.
        System.out.println("23%");
    }
}