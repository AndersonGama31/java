package com.api.helprback;

import com.api.helprback.domain.Chamado;
import com.api.helprback.domain.Cliente;
import com.api.helprback.domain.Tecnico;
import com.api.helprback.domain.enums.Perfil;
import com.api.helprback.domain.enums.Prioridade;
import com.api.helprback.domain.enums.Status;
import com.api.helprback.repositories.ChamadoRepository;
import com.api.helprback.repositories.ClienteRepository;
import com.api.helprback.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelprbackApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;


	public static void main(String[] args) {
		SpringApplication.run(HelprbackApplication.class, args);
		System.out.println("API do Web App Helpr rodando!");
	}
	@Override
	public void run(String... args) throws Exception{
		Tecnico tec1 = new Tecnico(
				null, "Anderson", "44603733860", "andersongama31@gmail.com", "123"
		);
		tec1.addPerfis(Perfil.ADMIN);
		tec1.addPerfis(Perfil.TECNICO);

			Cliente cli1 = new Cliente(
					null, "Ronald McDonald", "42510366284", "mcDonald@gmail.com", "bkemelhor123"
			);

		Chamado cha1 = new Chamado(
				null, Prioridade.MEDIA, Status.ANDAMENTO,"Computador Queimado","Caiu na piscina", tec1, cli1
		);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));
	}
}
