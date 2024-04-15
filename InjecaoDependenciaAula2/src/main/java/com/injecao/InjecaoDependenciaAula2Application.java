package com.injecao;

import java.util.List;

public class InjecaoDependenciaAula2Application {

	public static void main(String[] args) {

		new MigracaoUsuarios(
				new FileReader(), new BDWritter()
				).migrar();
	}
}

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

class FileReader implements Reader<User>{
	public List<User> read(){
		System.out.println("lendo user do arquivo...");
		return List.of(new User ("email", "userName", "password"));
	}
}

class BDWritter implements Writer<User>{
	public void write(List<User> user) {
		System.out.println("Escrevendo Users no Banco..");
		System.out.println(user);
	}
}