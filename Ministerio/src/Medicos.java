import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Medicos implements Identificavel{

	@Id
	@GeneratedValue(generator="medicos_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="medicos_seq", sequenceName="medicos_seq")
	
	private int id;
	private int CRM;
	private String nome;
	private long telefone;
	private String Especialidade;
	
	
	@OneToMany(mappedBy = "m")
	private Set<Hospital> hospital;
	
	@ManyToMany
	@JoinTable(name = "Medico_bebe", joinColumns = @JoinColumn(name = "medicos_id"), inverseJoinColumns = @JoinColumn(name = "bebe_id")

	)
	Set<Bebe> bebe;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
