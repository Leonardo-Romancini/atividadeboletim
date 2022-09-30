//feito por Leonardo R. R. V.
package atividademedia;

public class boletim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aluno aluno1 = new aluno(); 
		aluno1.nome = "Diogo Defante";
		aluno1.n1 = 4.5f;
		aluno1.n2 = 7.8f;
		aluno1.n3 = 9.3f;
		aluno1.n4 = 10f;
		
		professor professor1 = new professor();
		professor1.disciplina =	"matemática";
		professor1.nome = "djörksinsffürgen";
		professor1.medias = aluno1.n1+aluno1.n2+aluno1.n3+aluno1.n4;
		
		professor1.notaaluno(0);
		
		System.out.print("A média da disciplina de " + professor1.disciplina + " do aluno " + aluno1.nome + " é: " + professor1.notaaluno(0) );
	}

}