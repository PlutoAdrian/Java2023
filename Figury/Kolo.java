
public class Kolo extends Figura{
Kolo(String a, int r) {
		super(a);
		promien = r;
	}
double promien;
double Pole() {
	double pole = Math.pow(promien, 2) * Math.PI;
	return pole;
}
void Wyswietl() {
	super.Wyswietl();
	System.out.println(nazwa);
	System.out.println("pole figury:" + Pole());
}
}
