import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Hour {
	int tenHour;
	int Hour;
	int tenMin;
	int Min;
	int GetSum() {
		return ((tenHour*1000)+(Hour*100)+(tenMin*10)+Min);
	}
	void GetHour() {
		System.out.println(tenHour+""+Hour+":"+tenMin+""+Min);
	}
	
}

public class Main {
	static char[] GetChar(String str) {
		return str.toCharArray();
	}
	
	public static void main(String[] args) {
		List<Hour> ListAll = new ArrayList<Hour>();
		List<Hour> ListGood = new ArrayList<Hour>();
		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Podaj ciąg 4 cyfr");
		String userInp = myScanner.nextLine();
		myScanner.close();
		char[] userChar = GetChar(userInp);
		
		/////////////////////
		for	(int i = 0; i<4;i++) {
			for	(int j = 0; j<4;j++) {
				if (i!=j) {
				for	(int k = 0; k<4;k++) {
					if (i!=k&&j!=k) {
					for	(int l = 0; l<4;l++) {
						if (i!=l&&j!=l&&k!=l) {
						Hour Temp = new Hour();
						Temp.tenHour = Character.getNumericValue(userChar[i]);
						Temp.Hour = Character.getNumericValue(userChar[j]);
						Temp.tenMin = Character.getNumericValue(userChar[k]);
						Temp.Min = Character.getNumericValue(userChar[l]);
						ListAll.add(Temp);
						}
					}
					}
				}
				}
			}
			
		}
		//////////////////////////////////
		for (var element : ListAll) {
			if(element.tenHour==2) {
				if(element.Hour<4&&element.tenMin<6) {
					ListGood.add(element);
				}
			}else if(element.tenHour<2){
				if(element.tenMin<6) {
					ListGood.add(element);
				}
			}
		}
		int licznik = 0;
		Hour BestHour = new Hour();
		for (var element : ListGood) {
			if (element.GetSum()>BestHour.GetSum()) {
				BestHour=element;
				licznik++;
			}
		}
		if (licznik==0) {
			System.out.println("Nie można stworzyć godziny");
		}
		else 
		{
		BestHour.GetHour();
		}
	}

}
