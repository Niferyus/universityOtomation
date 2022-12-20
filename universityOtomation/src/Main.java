
public class Main {

	public static void main(String[] args) {
		Calisan calisan = new Calisan("hasan mutlu", "52398", "kıjoj@jgfo");
		Akademisyen akademisyen = new Akademisyen("mustafa", "+959+5+", "nj@fg","CENG","PROF");
		akademisyen.derseGir();
		
		//Calisan m1 = new Memur("mahmut ali", "523", "klfgıo@kgjf", "bilgi işlem", "8-12");
		// memur fonskiyonlarını alamz
		
		Memur memur = new Memur("mahmut ali", "523", "klfgıo@kgjf", "bilgi işlem", "8-12");
		Ogretimgorevlisi og = new Ogretimgorevlisi("caner bektürk", "8489897", "kflng@fkgn", "ceng", "doçent", "8855");
		og.cikis();
		memur.getAdsoyad();
		calisan.getEposta();

	}

}
