package br.com.cadastroit.services.web.dto;
import br.com.cadastroit.services.api.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {
	
	private Long id;

	private int codigoPais;

	private int codigoCidade;

	private String numero;

	private int ramal;
	
	private String observacao;
	
	private TipoTelefone tipo;
	
	private EmailDTO email;

	private Long pessoaId;
	
	private String numeroFormatado;
	

}
