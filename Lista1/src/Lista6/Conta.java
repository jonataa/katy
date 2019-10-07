package Lista6;

public class Conta {
	
	protected String nome;
	protected int num;
	protected double saldo;
	
	
	public Conta(int num) {
		if(num < 0){
			System.out.println("Infelizmente o numero eh negativo!");
		}else{
			this.num = num;
		}
	}
	
	public Conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	
	public Conta(String nome, double saldo, int num){
		this.nome = nome;
		this.saldo = saldo;
		this.num = num;
	}
	
	public void setNome(String nome) 
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	
	public void setNum(int num) 
	{
		this.num=num;
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	public void setSaldo(double saldo) 
	{
		this.saldo=saldo;
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void sacar(int quantia)
	{
		double novosaldo = this.saldo - quantia;
		this.saldo = novosaldo;
	}
	
	public void depositar(int valor)
	{
		double novosaldo = this.saldo + valor;
		this.saldo = novosaldo;
	}
	

}
