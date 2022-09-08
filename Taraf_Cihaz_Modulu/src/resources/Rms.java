package resources;

public class Rms extends Cihaz {
	
	private int frekans;
	private int va;
	private int vb;
	private int vc;
	private int ia;
	private int ib;
	private int ic;
	private int aktifA;
	private int reaktifA;
	private int gorunurA;
	private int faktorA;
	private int aktifB;
	private int reaktifB;
	private int gorunurB;
	private int faktorB;
	private int aktifC;
	private int reaktifC;
	private int gorunurC;
	private int faktorC;
	private int aktifToplam;
	private int reaktifToplam;
	private int gorunurToplam;
	private int faktorToplam;
	private int dengesizlikV;
	private int dengesizlikI;
	private int altVa;
	private int altVb;
	private int altVc;
	private int ustVa;
	private int ustVb;
	private int ustVc;

	public Rms() {
		super();
	}

	public Rms(int frekans, int va, int vb, int vc, int ia, int ib, int ic, int aktifA, int reaktifA, int gorunurA,
			int faktorA, int aktifB, int reaktifB, int gorunurB, int faktorB, int aktifC, int reaktifC,
			int gorunurC, int faktorC, int aktifToplam, int reaktifToplam, int gorunurToplam, int faktorToplam,
			int dengesizlikV, int dengesizlikI, int altVa, int altVb, int altVc, int ustVa, int ustVb,
			int ustVc) {
		super();
		this.frekans = frekans;
		this.va = va;
		this.vb = vb;
		this.vc = vc;
		this.ia = ia;
		this.ib = ib;
		this.ic = ic;
		this.aktifA = aktifA;
		this.reaktifA = reaktifA;
		this.gorunurA = gorunurA;
		this.faktorA = faktorA;
		this.aktifB = aktifB;
		this.reaktifB = reaktifB;
		this.gorunurB = gorunurB;
		this.faktorB = faktorB;
		this.aktifC = aktifC;
		this.reaktifC = reaktifC;
		this.gorunurC = gorunurC;
		this.faktorC = faktorC;
		this.aktifToplam = aktifToplam;
		this.reaktifToplam = reaktifToplam;
		this.gorunurToplam = gorunurToplam;
		this.faktorToplam = faktorToplam;
		this.dengesizlikV = dengesizlikV;
		this.dengesizlikI = dengesizlikI;
		this.altVa = altVa;
		this.altVb = altVb;
		this.altVc = altVc;
		this.ustVa = ustVa;
		this.ustVb = ustVb;
		this.ustVc = ustVc;
	}

	public int getFrekans() {
		return frekans;
	}

	public void setFrekans(int frekans) {
		this.frekans = frekans;
	}

	public int getVa() {
		return va;
	}

	public void setVa(int va) {
		this.va = va;
	}

	public int getVb() {
		return vb;
	}

	public void setVb(int vb) {
		this.vb = vb;
	}

	public int getVc() {
		return vc;
	}

	public void setVc(int vc) {
		this.vc = vc;
	}

	public int getIa() {
		return ia;
	}

	public void setIa(int ia) {
		this.ia = ia;
	}

	public int getIb() {
		return ib;
	}

	public void setIb(int ib) {
		this.ib = ib;
	}

	public int getIc() {
		return ic;
	}

	public void setIc(int ic) {
		this.ic = ic;
	}

	public int getAktifA() {
		return aktifA;
	}

	public void setAktifA(int aktifA) {
		this.aktifA = aktifA;
	}

	public int getReaktifA() {
		return reaktifA;
	}

	public void setReaktifA(int reaktifA) {
		this.reaktifA = reaktifA;
	}

	public int getGorunurA() {
		return gorunurA;
	}

	public void setGorunurA(int gorunurA) {
		this.gorunurA = gorunurA;
	}

	public int getFaktorA() {
		return faktorA;
	}

	public void setFaktorA(int faktorA) {
		this.faktorA = faktorA;
	}

	public int getAktifB() {
		return aktifB;
	}

	public void setAktifB(int aktifB) {
		this.aktifB = aktifB;
	}

	public int getReaktifB() {
		return reaktifB;
	}

	public void setReaktifB(int reaktifB) {
		this.reaktifB = reaktifB;
	}

	public int getGorunurB() {
		return gorunurB;
	}

	public void setGorunurB(int gorunurB) {
		this.gorunurB = gorunurB;
	}

	public int getFaktorB() {
		return faktorB;
	}

	public void setFaktorB(int faktorB) {
		this.faktorB = faktorB;
	}

	public int getAktifC() {
		return aktifC;
	}

	public void setAktifC(int aktifC) {
		this.aktifC = aktifC;
	}

	public int getReaktifC() {
		return reaktifC;
	}

	public void setReaktifC(int reaktifC) {
		this.reaktifC = reaktifC;
	}

	public int getGorunurC() {
		return gorunurC;
	}

	public void setGorunurC(int gorunurC) {
		this.gorunurC = gorunurC;
	}

	public int getFaktorC() {
		return faktorC;
	}

	public void setFaktorC(int faktorC) {
		this.faktorC = faktorC;
	}

	public int getAktifToplam() {
		return aktifToplam;
	}

	public void setAktifToplam(int aktifToplam) {
		this.aktifToplam = aktifToplam;
	}

	public int getReaktifToplam() {
		return reaktifToplam;
	}

	public void setReaktifToplam(int reaktifToplam) {
		this.reaktifToplam = reaktifToplam;
	}

	public int getGorunurToplam() {
		return gorunurToplam;
	}

	public void setGorunurToplam(int gorunurToplam) {
		this.gorunurToplam = gorunurToplam;
	}

	public int getFaktorToplam() {
		return faktorToplam;
	}

	public void setFaktorToplam(int faktorToplam) {
		this.faktorToplam = faktorToplam;
	}

	public int getDengesizlikV() {
		return dengesizlikV;
	}

	public void setDengesizlikV(int dengesizlikV) {
		this.dengesizlikV = dengesizlikV;
	}

	public int getDengesizlikI() {
		return dengesizlikI;
	}

	public void setDengesizlikI(int dengesizlikI) {
		this.dengesizlikI = dengesizlikI;
	}

	public int getAltVa() {
		return altVa;
	}

	public void setAltVa(int altVa) {
		this.altVa = altVa;
	}

	public int getAltVb() {
		return altVb;
	}

	public void setAltVb(int altVb) {
		this.altVb = altVb;
	}

	public int getAltVc() {
		return altVc;
	}

	public void setAltVc(int altVc) {
		this.altVc = altVc;
	}

	public int getUstVa() {
		return ustVa;
	}

	public void setUstVa(int ustVa) {
		this.ustVa = ustVa;
	}

	public int getUstVb() {
		return ustVb;
	}

	public void setUstVb(int ustVb) {
		this.ustVb = ustVb;
	}

	public int getUstVc() {
		return ustVc;
	}

	public void setUstVc(int ustVc) {
		this.ustVc = ustVc;
	}

	
	

}
