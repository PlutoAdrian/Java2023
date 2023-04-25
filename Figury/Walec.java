
public class Walec extends Kolo{

	Walec(String a, int r, int h) {
		super(a, r);
		wysokosc = h;
	}
	int wysokosc;
	double Objetosc() {
		double objetosc = super.Pole()*wysokosc;
		return objetosc;
	}
	double Pole() {
		double pole = 2*Math.PI * promien * wysokosc;
		return pole;
	}
	void Wyswietl() {
		super.Wyswietl();
		System.out.println("objetosc:" + Objetosc());
	}

}

