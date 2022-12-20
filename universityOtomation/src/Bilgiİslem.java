
public class Bilgiİslem extends Memur {
 
	private String gorev;
	public Bilgiİslem(String adsoyad, String telefon, String eposta, String departman, String mesai,String gorev) {
		super(adsoyad, telefon, eposta, departman, mesai);
		this.gorev = gorev;
		
	}
	public String getGorev() {
		return gorev;
	}
	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public void networkKurulum() {
		System.out.println(this.getAdsoyad()+" Networku kurdu");
	}
}
