import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Hospital implements Identificavel{
	
	@Id
	@GeneratedValue(generator="hospital_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="hospital_seq", sequenceName="hospital_seq")
	
	private int id;
	private String nome;
	private String municipio;
	private String estado;
	private String endereco;
	
	
	@ManyToOne
	@JoinColumn(name = "id_medico")
	Medicos m;
	
	@OneToMany(mappedBy = "h")
	private Set<Bebe> bebe;
	
	
	public Integer getId1() {
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
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
