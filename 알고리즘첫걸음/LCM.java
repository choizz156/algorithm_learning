public class LCM {

	int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	//최소공배수
	long lcm(int a, int b){
		return (long) a * b / gcd(a,b);
	}
}