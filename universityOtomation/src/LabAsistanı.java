
public class LabAsistanı extends Asistan {

	public LabAsistanı(String adsoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
		super(adsoyad, telefon, eposta, bolum, unvan, ofisSaati);
		
	}

	public void lablaraGir() {
		System.out.println(this.getAdsoyad()+" lablaraın tammaına girdi");
	}
	public void derslerGir() {
		System.out.println(this.getAdsoyad()+" derslerin tammaına girdi");
	}
}
