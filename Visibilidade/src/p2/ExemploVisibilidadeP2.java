/**
 * @author Emerson Costa
 * Temos aqui um exemplo de visibilidade geral em Java.
 * 
 */
package p2;
import p1.*;

public class ExemploVisibilidadeP2 {
	
	/**
	 * @param exemploPublic Exemplo de m�todo p�blico.
	 * @param emploPrivate Exemplo de m�todo privado.
	 * @param exemploProctected Exemplo de m�todo protegido.
	 * @param exemploDefaltu Exemplo de m�todo padr�o.
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
		//A visibilidade Default s� � poss�vel instanciar sendo da mesma classe.
		
		ExemploVisibilidadeP2 visibilidadePublicaP2 = new ExemploVisibilidadeP2();
		ExemploVisibilidadeP2 visibilidadeDefaultP2 = new ExemploVisibilidadeP2();
		
		visibilidadePublicaP2.exemploPublic();
		visibilidadeDefaultP2.exemploPublic();
		visibilidadePublicaP1.exemploPublic();
		
		visibilidadePublicaP2.exemploPrivate();
		// visibilidadeDefaultP2.exemploPrivate();
		// visibilidadePublicaP1.exemploPrivate();
		// M�todos privados s�o apenas da mesma classe.
		
		visibilidadePublicaP2.exemploProtected();
		visibilidadeDefaultP2.exemploProtected();
		// visibilidadePublicaP1.exemploProtected();;
		// Esse tipo de visibilidade s� est� dispon�vel para classes filhas ou mesmo pacote.	
	
		visibilidadePublicaP2.exemploDefault();
		visibilidadeDefaultP2.exemploDefault();
		// visibilidadePublicaP1.exemploDefault();
		// N�o h� visibilidade de um m�todo e classe default para fora do pacote.
		
	}
	
}
