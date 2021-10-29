package expressaoregular;

import java.util.Objects;

public class UniProduto {

	private String codigoProduto;
	
	private String descricao;

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniProduto other = (UniProduto) obj;
		return Objects.equals(codigoProduto, other.codigoProduto);
	}

	@Override
	public String toString() {
		return "UniProduto [codigoProduto=" + codigoProduto + ", descricao=" + descricao + "]";
	}
	
	
}
