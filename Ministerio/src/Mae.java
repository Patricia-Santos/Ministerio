import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class Mae implements Identificavel {
	
	@Id
	@GeneratedValue(generator="mae_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="mae_seq", sequenceName="mae_seq")
	
	private int id;
	private String nome;
	private Date dataDeNascimento;
	private long telefone;
	private String endereco;
	
	
	@OneToMany(mappedBy = "ma")
	private Set<Bebe> bebe;
	
	
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
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
