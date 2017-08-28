/**
 * @author Emerson Costa
 * Temos aqui um exemplo de visibilidade geral em Java.
 * 
 */
package p2;
import p1.*;

public class ExemploVisibilidadeP2 {
	
	/**
	 * @param exemploPublic Exemplo de método público.
	 * @param emploPrivate Exemplo de método privado.
	 * @param exemploProctected Exemplo de método protegido.
	 * @param exemploDefaltu Exemplo de método padrão.
	 * 
	 */
	public void exemploPublic() {}
	
	private void exemploPrivate () {}
	
	protected void exemploProtected () {}
	
	void exemploDefault () {}
	
	public ExemploVisibilidadeP2 ()
	
	{
		ExemploVisibilidadeP1 visibilidadePublicaP1 = new ExemploVisibilidadeP1();
		// ExemploVisibilidadeP1 visibilidadeDefaultP1 = new ExemploVisibilidadeP1();
		//A visibilidade Default só é possível instanciar sendo da mesma classe.
		
		ExemploVisibilidadeP2 visibilidadePublicaP2 = new ExemploVisibilidadeP2();
		ExemploVisibilidadeP2 visibilidadeDefaultP2 = new ExemploVisibilidadeP2();
		
		visibilidadePublicaP2.exemploPublic();
		visibilidadeDefaultP2.exemploPublic();
		visibilidadePublicaP1.exemploPublic();
		
		visibilidadePublicaP2.exemploPrivate();
		// visibilidadeDefaultP2.exemploPrivate();
		// visibilidadePublicaP1.exemploPrivate();
		// Métodos privados são apenas da mesma classe.
		
		visibilidadePublicaP2.exemploProtected();
		visibilidadeDefaultP2.exemploProtected();
		// visibilidadePublicaP1.exemploProtected();;
		// Esse tipo de visibilidade só está disponível para classes filhas ou mesmo pacote.	
	
		visibilidadePublicaP2.exemploDefault();
		visibilidadeDefaultP2.exemploDefault();
		// visibilidadePublicaP1.exemploDefault();
		// Não há visibilidade de um método e classe default para fora do pacote.
		
	}
	
}
