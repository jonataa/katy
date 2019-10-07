package Lista7;

public class CamaroteInferior extends VIP {
	
	private String LocIngresso;
	
	public CamaroteInferior (String LocIngresso, double valor, double valorAdicional)
	{
		super(valor, valorAdicional);
		this.LocIngresso = LocIngresso;
	}
	
	public void setLocIngresso(String LocIngresso)
	{
		this.LocIngresso = LocIngresso;
	}
	
	public String getLocIngresso()
	{
		return LocIngresso;
	}
	
	public void imprimeLoc()
	{
		System.out.println(this.LocIngresso);
	}

}
