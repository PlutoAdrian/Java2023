
public class Stozek extends Kolo{

	Stozek(String a, int r, int h) {
		super(a, r);
		wysokosc = h;
	}
	int wysokosc;
	double Objetosc() {
		double objetosc = (wysokosc * Math.pow(promien, 2)*Math.PI)/3;
		return objetosc;
	}
	double Pole() {
		double l = Math.sqrt((Math.pow(wysokosc, 2)+Math.pow(promien, 2)));
		double pole = Math.PI * promien * l;
		return pole;
	}
	void Wyswietl() {
		super.Wyswietl();
		System.out.println("objetosc:" + Objetosc());
	}

}
