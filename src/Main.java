import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
//import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java1");
		curso1.setDescricao("descrição curso java1");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso java2");
		curso2.setDescricao("descrição curso java2");
		curso2.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao da mentoria de java");
		mentoria.setData(LocalDate.now());

		// Conteudo conteudo = new Curso();

		// List<String> palavras = new ArrayList<>();

//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev edson = new Dev();
		edson.setNome("Edson");
		edson.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + edson.getConteudosInscritos());
		edson.progredir();
		System.out.println("Conteudos concluidos: " + edson.getConteudosConcluidos());

		Dev campolina = new Dev();
		campolina.setNome("Campolina");
		campolina.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + edson.getConteudosInscritos());
		campolina.progredir();
		System.out.println("Conteudos concluidos: " + edson.getConteudosConcluidos());

	}

}
