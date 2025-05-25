package entities;

import java.io.Serializable;
import java.util.Date;

public class Alunos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private  String Matricula; 
    private Date  dataNascimento;
    
    
    public Alunos(){}
    
    public Alunos(String nome, String matricula, Date dataNascimento) {
		super();
		this.nome = nome;
		Matricula = matricula;
		this.dataNascimento = dataNascimento;
	}
    
	

	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
