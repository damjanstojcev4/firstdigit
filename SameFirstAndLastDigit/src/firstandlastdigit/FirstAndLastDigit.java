package firstandlastdigit;

public class FirstAndLastDigit {	
	private boolean areSame(int n) {
		int arr[] = {1, 22, 230, 4025, 1001};
		int temp = n/10;
		
		if(temp == 0) {
			return true;
		}
		int firstDigit = 0;
		int lastDigit = n % 10;
		
		while(n / 10 != 0) {
			firstDigit = n;
			n /= 10;
		}
		if(firstDigit == lastDigit) {
			return true;
		} else {
			return false;
		}
	}
}

