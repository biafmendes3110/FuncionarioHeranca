package HerancaFuncionario;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("Beatriz", "5609", 7000, "998334348", "indalecio Alves", "31/10");
		System.out.println("nome: "+funcionario.getNome());
		System.out.println("matricula: " +funcionario.getMatricula());
		System.out.println("salario: "+funcionario.getSalario());
		System.out.println("telefone: "+funcionario.getTelefone());
		System.out.println("endereco: "+funcionario.getEndereco());
		System.out.println("data nascimento: "+funcionario.getDataNascimento());
		
		Administrador administrador = new Administrador(1237485);
		System.out.println("cra: "+administrador.getCra());
		
		Engenheiro engenheiro = new Engenheiro(1237485);
		System.out.println("número do crea: "+engenheiro.getNumCrea());
		
		Medico medico = new Medico(1237485);
		System.out.println("número do crea: "+medico.getCrm());
		
	}

}
