package CSCI2020;

public class FibDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fib series: 0,1,1,2,3,5,8,13,21,34,55
		
		FibonacciNumber fibObj = new FibonacciNumber();
		final int N = 50; 
		long fibMem[] = new long[N+1];
		for(int i = 0; i < fibMem.length; i++) {
			fibMem[i] = -1;
		}
		System.out.println("Fib Number usig optimum algorithm: " + fibObj.fibOpt(N, fibMem));
		System.out.println("Fib Number: " + fibObj.fib(N));
	}

}
