import java.util.*;

public class Fraction {
	int numerateur;
	int denominateur;

	public Fraction (int num, int denom) {
		numerateur = num;
		denominateur = denom;
	}

	public String toString () {
		return numerateur + "/" + denominateur;
	}
	
	public static void main (String [] args) {
		Fraction f1 = new Fraction (44, 121);
		System.out.println(f1.toString());
	}


}