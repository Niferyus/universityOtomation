
public class Calisan {
	private String adsoyad;
	private String telefon;
	private String eposta;
	
	public Calisan(String adsoyad,String telefon,String eposta) {
		this.adsoyad = adsoyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}

	public String getAdsoyad() {
		return adsoyad;
	}

	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	public void giris() {
		System.out.println(this.adsoyad+" üniversiteye giriş yaptı");
	}
	
	public void cikis() {
		System.out.println(this.adsoyad+" üniversiteden çıktı");
		
	}
	public void yemekhane() {
		System.out.println(this.adsoyad+" yemekhaneye geldi");
	}
	
}	

