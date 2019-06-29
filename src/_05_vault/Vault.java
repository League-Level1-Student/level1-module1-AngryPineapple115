package _05_vault;

public class Vault {

	static int SecretCode = 294;

	public static void main(String[] args) {

		tryCode(56);
		tryCode(294);

		System.out.println(tryCode(294));

	}

	static boolean tryCode(int guess) {

		if (guess == SecretCode) {
			return true;
		}

		else {
			return false;
		}
	}

}