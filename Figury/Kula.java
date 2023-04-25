
public class Kula extends Kolo{

	Kula(String a, int r) {
		super(a, r);
	}
	double Objetosc() {
		double objetosc = (4*Math.pow(promien, 3)*Math.PI)/3;
		return objetosc;
	}
	double Pole() {
		double pole = super.Pole()*4;
		return pole;
	}
	void Wyswietl() {
		super.Wyswietl();
		System.out.println("objetosc:" + Objetosc());
	}

}
