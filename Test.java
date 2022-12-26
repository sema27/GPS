
public class Test {

	public static void main(String[] args) {
		GPSAlicisi gpsalicisi = new GPSAlicisi();
		if(gpsalicisi.aktifMi == true) {
			Uydu uydu1 = new Uydu();
		    Uydu uydu2 = new Uydu(gpsalicisi);
		    GPSProgrami gpsprogrami = new GPSProgrami(gpsalicisi);
		}
		
	}
	

}

