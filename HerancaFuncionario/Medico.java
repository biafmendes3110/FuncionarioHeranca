package HerancaFuncionario;

public class Medico extends Funcionario{
	private int crm;

	public Medico(int crm) {
		super();
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
}
