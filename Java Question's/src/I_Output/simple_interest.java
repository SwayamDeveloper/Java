package I_Output;

//Simple Interest = (P × R × T)/100  
//where P = Principal Amount, R = Rate per Annum, T = Time (years) 
public class simple_interest {
	public static void main(String[] args) {
		float p, r, t, si; // principal amount, rate, time and simple interest respectively
		p = 10;
		r = 2;
		t = 2;
		si = (p * r * t) / 100;
		System.out.println("Simple Interest is: " + si);
	}
}
