import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;

//import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");	
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso java");	
		curso2.setDescricao("descrição curso java");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao da mentoria de java");
		mentoria.setData(LocalDate.now());
		
		//Conteudo conteudo = new Curso();
		
		//List<String> palavras = new ArrayList<>();
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
	}

}
