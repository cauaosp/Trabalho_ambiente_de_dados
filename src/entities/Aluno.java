package entities;

public class Aluno {

	private  Integer matricula;
	private String   name;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private Double media;  
	private String status;
	
	public Aluno(Integer matricula, String name, Double nota1, Double nota2, Double nota3, Double media,
			String status) {
		super();
		this.matricula = matricula;
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
		this.status = status;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", name=" + name + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", media=" + media + ", status=" + status + "]";
	}
	
	
	
	
	
}
