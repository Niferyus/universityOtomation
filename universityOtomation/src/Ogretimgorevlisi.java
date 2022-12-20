
public class Ogretimgorevlisi extends Akademisyen {
	private String kapino;
	public Ogretimgorevlisi(String adsoyad, String telefon, String eposta, String bolum, String unvan,String kapino) {
		super(adsoyad, telefon, eposta, bolum, unvan);
		this.kapino = kapino;
		
	}
	public String getKapino() {
		return kapino;
	}
	public void setKapino(String kapino) {
		this.kapino = kapino;
	}

}
