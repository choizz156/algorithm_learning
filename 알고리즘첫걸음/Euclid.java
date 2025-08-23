public class Euclid {

	Scanner sc = new Scanner(System.in);
	int a, b;

	a = sc.nextInt();
	b = sc.nextInt();

	sc.close();


	//빼기로 구하는 법
	while(a != b){
		if(a > b){
			a -= b;
		}else{
			b -= a;
		}
	}

	//나누기로 구하는 법
	while(b != 0){
		int tmp = b;
		b = a % b;
		a = tmp;
	}

	// 위 로직과 같음
	int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}