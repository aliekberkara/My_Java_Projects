package Ornekler;

public class Smart_Phone {
	private String marka;
	private String model;
	private String renk;
	private int hafiza;
	private double hiz;
	
	public Smart_Phone(String marka, String model, String renk, int hafiza, double hiz) {
		super();
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.hafiza = hafiza; 
		this.hiz = hiz;
	}
	public  Smart_Phone() {
		this.marka = "Tanimlanmadi";
		this.model = "Tanimlanmadi";
		this.renk = "Lacivert";
		this.hafiza = 0;
		this.hiz = 0.0;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}
	public double getHiz() {
		return hiz;
	}
	public void setHiz(double hiz) {
		this.hiz = hiz;
	}
	public void Bilgileri_Yazdir() {
		System.out.println("Marka: "+ marka);
		System.out.println("Model: "+ model);
		System.out.println("Renk: "+ renk);
		System.out.println("Hafiza: "+ hafiza);
		System.out.println("Hiz: "+ hiz);
	}
	public void Hafizayi_Degerlendir(double tel_hafiza) {
		if (tel_hafiza >= 32) {
			System.out.println("Telefon Hafizasi Yeterlidir.");
		}
		else {
			System.out.println("Telefon Hafizasi Yetersizdir.");
		}
	}
}
