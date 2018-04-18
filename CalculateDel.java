public class CalculateDel {
	
	public static void main(String []args){
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
			double sum = first + second;
			double raz = first - second;
			double del = first / second;
			double umn = first * second;
			double step = first*first;
			double step1 =  second*second;
		System.out.println("Sum: " +sum + " Raz: " + raz + " Del: " + del + " Umn: " + umn + " Step(2)f: " + step + " Step(2)s: " + step1);
		
		
	}
	
}