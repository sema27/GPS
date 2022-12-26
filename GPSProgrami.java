
public class GPSProgrami {
	private String konum;
	public String cumleTuru;
	private String enlem;
	private String boylam;
	
	public GPSProgrami(GPSAlicisi gA) {

		konum=gA.programaVeriGonder();
		konumBilgisi(konum);
		}
	
	private void konumBilgisi(String konumVerisi) {
		if(konumVerisi == "$GPGGA, N, 40, 30, E") {
			cumleTuru = konumVerisi.substring(1, 6);
			enlem = "40 KUZEY";
			boylam = "30 GÜNEY";
		}
		if(konumVerisi == "$GPRMC, 41, N, E, 31") {
			cumleTuru = konumVerisi.substring(1, 6);
			enlem = "41 KUZEY";
			boylam = "31 GÜNEY";
		}
		if(konumVerisi == "$GPGLL, N, E, 42, 32") {
			cumleTuru = konumVerisi.substring(1, 6);
			enlem = "42 KUZEY";
			boylam = "32 GÜNEY";
		}
		System.out.println("GPS türü :"+cumleTuru);
		System.out.println("Enlem :"+enlem);
		System.out.println("Boylam :"+boylam);
	}
}
