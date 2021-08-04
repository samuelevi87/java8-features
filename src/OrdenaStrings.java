import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Samuel");
		palavras.add("Levi Ara�jo");
		palavras.add("Alves");
		palavras.add("Daniela");
		palavras.add("Pereira");
		palavras.add("Paulo Levi");
		/**
		 * M�todo antigo de ordena��o de listas, utilizando um comparador criado em
		 * classe separada.
		 */
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		palavras.forEach(System.out::println);
		
		/**
		 * Default Method sort, na interface List.
		 */
		palavras.sort(comparador);
		palavras.forEach(System.out::println);
	}
}

/**
 * Classe de compara��o que implementa a interface Comparator, tem apenas 1
 * m�todo.
 * 
 * @author samuel.levi
 *
 */
class ComparadorPorTamanho implements Comparator<String> {
	/**
	 * Compara baseado no tamanho (length) da String.
	 */
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
}
