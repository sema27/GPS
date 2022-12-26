
public class Uydu {
	int sayi;
	public Uydu () {
		System.out.println("GPS Alıcısına Bağlanılamadı!");
	}

	public Uydu(GPSAlicisi gA) {
		System.out.println("GPS Alıcısına Bağlanıldı!");
		sayi = veriTuruSec();
		gA.uydudanVeriAl(sayi);
	}
	private int veriTuruSec() {
		return sayi = (int)(Math.random()*3+1);
	}
}
