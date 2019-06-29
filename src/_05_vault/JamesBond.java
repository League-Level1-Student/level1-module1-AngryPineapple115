package _05_vault;

public class JamesBond {

	static int guessnumber;
	static int SecretCode = 294;
	static int matchingnumber = -1;

	public static void main(String[] args) {

		Vault v = new Vault();

		new JamesBond().findCode(v);

		System.out.println(matchingnumber);

	}

	public void findCode(Vault jamesbond) {

		for (int guessnumber = 0; guessnumber < 1000000; guessnumber++) {
			if (jamesbond.tryCode(guessnumber)) {
				matchingnumber = guessnumber;
			}
		}
	}
}