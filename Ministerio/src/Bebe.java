import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Bebe implements Identificavel{

	@Id
	@GeneratedValue(generator="bebe_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="bebe_seq", sequenceName="bebe_seq")
	
	private int id;
	private String nome;
	private Date dataDeNascimento;
	private double peso;
	private double altura;
	private Mae mae;
	private Medicos medico;
	
	@ManyToOne
	@JoinColumn(name = "id_mae")
	Mae ma;
	
	@ManyToMany
	@JoinTable(name = "Medicos_bebe", joinColumns = @JoinColumn(name = "bebe_id"), inverseJoinColumns = @JoinColumn(name = "medicos_id")

	)
	Set<Medicos> medicos;
	
	@ManyToOne
	@JoinColumn(name = "id_hospital")
	Hospital h;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Mae getMae() {
		return mae;
	}
	public void setMae(Mae mae) {
		this.mae = mae;
	}
	public Medicos getMedico() {
		return medico;
	}
	public void setMedico(Medicos medico) {
		this.medico = medico;
	}
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
