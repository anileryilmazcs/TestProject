package resources;

public class Cihaz {

	private int no;
	private int olcumYeriNo;
	private int isaretli;
	private int zamanSnCozunurluk;
	private int zamanMikrosnCozunurluk;
	
	public Cihaz() {
		super();
	}
	
	public Cihaz(int no, int olcumYeriNo, int isaretli, int zamanSnCozunurluk, int zamanMikrosnCozunurluk) {
		super();
		this.no = no;
		this.olcumYeriNo = olcumYeriNo;
		this.isaretli = isaretli;
		this.zamanSnCozunurluk = zamanSnCozunurluk;
		this.zamanMikrosnCozunurluk = zamanMikrosnCozunurluk;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getOlcumYeriNo() {
		return olcumYeriNo;
	}

	public void setOlcumYeriNo(int olcumYeriNo) {
		this.olcumYeriNo = olcumYeriNo;
	}

	public int getIsaretli() {
		return isaretli;
	}

	public void setIsaretli(int isaretli) {
		this.isaretli = isaretli;
	}

	public int getZamanSnCozunurluk() {
		return zamanSnCozunurluk;
	}

	public void setZamanSnCozunurluk(int zamanSnCozunurluk) {
		this.zamanSnCozunurluk = zamanSnCozunurluk;
	}

	public int getZamanMikrosnCozunurluk() {
		return zamanMikrosnCozunurluk;
	}

	public void setZamanMikrosnCozunurluk(int zamanMikrosnCozunurluk) {
		this.zamanMikrosnCozunurluk = zamanMikrosnCozunurluk;
	}

	
	
}
