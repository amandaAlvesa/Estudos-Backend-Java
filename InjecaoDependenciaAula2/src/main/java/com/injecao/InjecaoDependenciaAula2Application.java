package com.injecao;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class InjecaoDependenciaAula2Application {

	public static void main(String[] args) {

		SpringApplication.run(InjecaoDependenciaAula2Application.class, args);
	}
	
	@Bean
	ApplicationRunner runner(MigracaoUsuarios user) {
		return args -> {
			user.migrar();
		};
	}
}

@Component
class MigracaoUsuarios{

	public MigracaoUsuarios(Reader<User> reader, Writer<User> writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	Reader<User> reader;
	Writer<User> writer;
	
	void migrar() {
		//ler ususarios A
		List<User> users = reader.read();
		//escrever em B
		writer.write(users);
	}
}


record User(String email, String userName, String password){}

interface Reader<T>{
	List<T>read();
}

interface Writer<T>{
	void write(List<T> itens);
}

@Component
class FileReader implements Reader<User>{
	public List<User> read(){
		System.out.println("lendo user do arquivo...");
		return List.of(new User ("email", "userName", "password"));
	}
}


@Component
class BDWritter implements Writer<User>{
	public void write(List<User> user) {
		System.out.println("Escrevendo Users no Banco..");
		System.out.println(user);
	}
}