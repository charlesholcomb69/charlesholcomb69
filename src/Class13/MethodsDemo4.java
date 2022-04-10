package Class13;

public class MethodsDemo4 {

	// create a method that takes  boolean isSaleOn  double originalPrice double discount
	// if isSaleOn=true return discounted price other wise return original price
	double checkDiscount(boolean isSaleOn,double originalPrice,double discount) {
		if(isSaleOn) {
			return (originalPrice-originalPrice*discount);
		}else {
			return originalPrice;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));
	}
}
