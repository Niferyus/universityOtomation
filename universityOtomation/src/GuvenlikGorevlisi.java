
public class GuvenlikGorevlisi extends Memur {
private String belge;
	public GuvenlikGorevlisi(String adsoyad, String telefon, String eposta, String departman, String mesai,String belge) {
		super(adsoyad, telefon, eposta, departman, mesai);
		this.belge = belge;
		
	}
 
	public String getBelge() {
		return this.belge;
	}
	
	public void setBelge(String belge) {
		this.belge = belge;
	}
	
	public void nobet() {
		System.out.println(this.getAdsoyad()+" nobete geçti");
	}
}

