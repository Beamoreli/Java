/*/Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list. */

package Collection;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLoja {
	public static void main(String[] args) {

		List<String> itens = new ArrayList<>();

		// adicionar elementos//
		
		itens.add("Shampoo");
		itens.add("Condicionador");
		itens.add("Mascara");
		itens.add("Leave In");
		itens.add("Reparador");
		System.out.println(itens);
		System.out.println();

		// inserir elementos//
		
		itens.set(3, "Oleo reparador");
		itens.set(1, "Pré shampoo");
		System.out.println(itens);
		System.out.println();

		// remover elementos//

		itens.remove(2);
		System.out.println(itens);
		System.out.println();
	}
}
