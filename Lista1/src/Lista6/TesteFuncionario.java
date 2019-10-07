package Lista6;

public class TesteFuncionario {
	
	private String nome, departamento, data, rg;
	private double salario;
	
	public TesteFuncionario (String nome, String departamento, String data, String rg, double salario)
	{
		this.nome = nome;
		this.departamento = departamento;
		this.data = data;
		this.rg = rg;
		this.salario = salario;
	
	}

	public TesteFuncionario()
	{
		
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getDepartamento()
	{
		return departamento;
	}
	
	public void setDepartamento(String departamento)
	{
		this.departamento=departamento;
	}
	
	public String getData()
	{
		return data;
	}
	
	public void setData(String data)
	{
		this.data=data;
	}
	
	public String getRg()
	{
		return rg;
	}
	
	public void setRg(String rg)
	{
		this.rg=rg;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario=salario;
	}
	
	public void ImprimeDados()
	{
		System.out.println(this.nome+";"+this.data+";"+this.departamento+";"+this.rg+";"+this.salario);
	}
}
