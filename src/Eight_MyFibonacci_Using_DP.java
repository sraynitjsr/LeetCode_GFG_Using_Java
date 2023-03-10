class Eight_MyFibonacci_Using_DP {
    public static int fib(int n) {
	    int i, f[] = new int[n+2];
	    f[0] = 0;
	    f[1] = 1;
	    for (i = 2; i <= n; i++) {
		    f[i] = f[i-1] + f[i-2];
	    }
	    return f[n];
	}
	public static void start() {
		System.out.println("\nInside Eighth Module");
		System.out.println(fib(7));
	}
}
