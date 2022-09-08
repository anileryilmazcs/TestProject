package database;
import resources.GerilimAkim;
import resources.Plt;
import resources.Pst;
import resources.Rms;

public class QueryManager {
	private static final String INSERT_INTO = "INSERT_INTO ";
	private static final String RETURNING = "RETURNING *;";
	
	
	public static void main(String[] args) {
		Plt temp = new Plt(1,1,1);
		QueryManager asd = new QueryManager();
		StringBuilder tempQuery = asd.GeneratePltQuery(temp, "taraf_cihaz_akim_araharmonik_ia_3sn");
		System.out.println(tempQuery);

	}

	public StringBuilder GenerateGerilimAkimQuery (GerilimAkim obj, String tableName) {

		StringBuilder query = new StringBuilder();
		query.append(INSERT_INTO + tableName);
		query.append(" VALUES (");
		query.append(obj.getNo() + "," + obj.getOlcumYeriNo() + "," +  obj.getThd() + "," +  obj.getH1() + ",");
		query.append(obj.getH2() + "," +  obj.getH3() + "," +  obj.getH4() + "," +  obj.getH5() + "," +  obj.getH6() + ",");
		query.append(obj.getH7() + "," +  obj.getH8() + "," +  obj.getH9() + "," +  obj.getH10() + "," +  obj.getH11() + ",");
		query.append(obj.getH12() + "," +  obj.getH13() + "," +  obj.getH14() + "," +  obj.getH15() + "," +  obj.getH16() + ",");
		query.append(obj.getH17() + "," +  obj.getH18() + "," +  obj.getH19() + "," +  obj.getH20() + "," +  obj.getH21() + ",");
		query.append(obj.getH22() + "," +  obj.getH23() + "," +  obj.getH24() + "," +  obj.getH25() + "," +  obj.getH26() + ",");
		query.append(obj.getH27() + "," +  obj.getH28() + "," +  obj.getH29() + "," +  obj.getH30() + "," +  obj.getH31() + ",");
		query.append(obj.getH32() + "," +  obj.getH33() + "," +  obj.getH34() + "," +  obj.getH35() + "," +  obj.getH36() + ",");
		query.append(obj.getH37() + "," +  obj.getH38() + "," +  obj.getH39() + "," +  obj.getH40() + "," +  obj.getH41() + ",");
		query.append(obj.getH42() + "," +  obj.getH43() + "," +  obj.getH44() + "," +  obj.getH45() + "," +  obj.getH46() + ",");
		query.append(obj.getH47() + "," +  obj.getH48() + "," +  obj.getH49() + "," +  obj.getH50() + "," +  obj.getIsaretli() + ",");
		query.append(obj.getZamanSnCozunurluk() + "," + obj.getZamanMikrosnCozunurluk() + ") ");
		query.append(RETURNING);
		return query;
	}
	
	public StringBuilder GeneratePltQuery(Plt obj, String tableName) {

		StringBuilder query = new StringBuilder();
		query.append(INSERT_INTO + tableName + "\n");
		query.append("VALUES (");
		query.append(obj.getNo() + "," + obj.getOlcumYeriNo() + "," + obj.getPltA() + "," + obj.getPltB() + "," + obj.getPltC() + ",");
		query.append(obj.getIsaretli() + "," + obj.getZamanSnCozunurluk() + "," + obj.getZamanMikrosnCozunurluk() + ")\n");
		query.append(RETURNING);
		return query;
	}
	
	public StringBuilder GeneratePstQuery (Pst obj, String tableName) {
		
		StringBuilder query = new StringBuilder();
		query.append(INSERT_INTO + tableName);
		query.append(" VALUES (");
		query.append(obj.getNo() + "," + obj.getOlcumYeriNo() + "," + obj.getPstA() + "," + obj.getPstB() + "," + obj.getPstC() + ",");
		query.append(obj.getIsaretli() + "," + obj.getZamanSnCozunurluk() + "," + obj.getZamanMikrosnCozunurluk() + ") ");
		query.append(RETURNING);
		return query;
	}
	
	public StringBuilder GenerateRmsQuery (Rms obj, String tableName) {

		StringBuilder query = new StringBuilder();
		query.append(INSERT_INTO + tableName);
		query.append(obj.getNo() + "," + obj.getOlcumYeriNo() + "," +  obj.getFrekans() + "," +  obj.getVa() + ",");
		query.append(obj.getVb() + "," +  obj.getVc() + "," +  obj.getIa() + "," +  obj.getIb() + "," +  obj.getIc() + ",");
		query.append(obj.getAktifA() + "," +  obj.getReaktifA() + "," +  obj.getGorunurA() + "," +  obj.getFaktorA() + "," +  obj.getAktifB() + ",");
		query.append(obj.getReaktifB() + "," +  obj.getGorunurB() + "," +  obj.getFaktorB() + "," +  obj.getAktifC() + "," +  obj.getReaktifC() + ",");
		query.append(obj.getGorunurC() + "," +  obj.getFaktorC() + "," +  obj.getAktifToplam() + "," +  obj.getReaktifToplam() + "," +  obj.getGorunurToplam() + ",");
		query.append(obj.getFaktorToplam() + "," +  obj.getDengesizlikV() + "," +  obj.getDengesizlikI() + "," +  obj.getAltVa() + "," +  obj.getAltVb() + ",");
		query.append(obj.getAltVc() + "," +  obj.getUstVa() + "," +  obj.getUstVb() + "," +  obj.getUstVc() + "," +  obj.getIsaretli() + ",");
		query.append(obj.getZamanSnCozunurluk() + "," +  obj.getZamanMikrosnCozunurluk() + ") ");
		query.append(RETURNING);
		return query;
	}

	
}
