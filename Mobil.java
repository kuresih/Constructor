public class Mobil extends Kendaraan{

	public String warna;
	public Mobil (String Merk, String warna){
		super(Merk);
		this.warna = warna;
	}

	public Mobil(String Merk){
		super(Merk);
	}

	public void showWarna(){
		System.out.println(warna);
	}
}