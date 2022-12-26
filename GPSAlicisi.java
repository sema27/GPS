
public class GPSAlicisi {

	private int sicaklik;
	boolean aktifMi = false;
	private String cumleDepolama;
	
	public GPSAlicisi() {
		sicaklikOlc();
		if( sicaklik >=5 && sicaklik <= 50 ) {
			aktifMi = true;
		}
	}
	
	private int sicaklikOlc () {
		return sicaklik =(int)(Math.random()*40+1);
	}

	public void uydudanVeriAl (int cumleCesidi) {
		if(cumleCesidi == 1) {
			cumleDepolama = "$GPGGA, N, 40, 30, E";
		}
		if(cumleCesidi == 2) {
			cumleDepolama = "$GPRMC, 41, N, E, 31";
		}
		if(cumleCesidi == 3) {
			cumleDepolama = "$GPGLL, N, E, 42, 32";
		}
		
	}

	public String programaVeriGonder () {
		return cumleDepolama;
	}
}
