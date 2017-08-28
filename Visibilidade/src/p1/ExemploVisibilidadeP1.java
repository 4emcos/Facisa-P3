/**
 * @author Emerson Costa
 * Temos aqui um exemplo de visibilidade geral em Java.
 * 
 */
package p1;
import p2.*;

public class ExemploVisibilidadeP1 {
	/**
	 * @param exemploPublic Exemplo de m�todo p�blico.
	 * @param exemploPrivate Exemplo de m�todo privado.
	 * @param exemploProctected Exemplo de m�todo protegido.
	 * @param exemploDefaltu Exemplo de m�todo padr�o.
	 * 
	 */
	public void exemploPublic() {}
	
	private void exemploPrivate () {}
	
	protected void exemploProtected () {}
	
	void exemploDefault () {}
	
	
	public ExemploVisibilidadeP1 ()
	{
		ExemploVisibilidadeP1 visibilidadePublicaP1 = new ExemploVisibilidadeP1();
		ExemploVisibilidadeP1 visibilidadeDefaultP1 = new ExemploVisibilidadeP1();
		
		ExemploVisibilidadeP2 visibilidadePublicaP2 = new ExemploVisibilidadeP2();
		//ExemploVisibilidadeP2 visibilidadeDefaultP2 = new ExemploVisibilidadeP2();
		//A visibilidade Default s� � poss�vel instanciar sendo da mesma classe.
		
		visibilidadeDefaultP1.exemploPublic();
		visibilidadePublicaP1.exemploPublic();
		visibilidadePublicaP2.exemploPublic();
		
		visibilidadeDefaultP1.exemploPrivate();
		// visibilidadePublicaP1.metodoPrivado();
		// visibilidadePublicaP2.metodoPrivado();
		// M�todos privados s�o apenas da mesma classe.
		
		visibilidadeDefaultP1.exemploProtected();
		visibilidadePublicaP1.exemploProtected();
		// visibilidadePublicaP2.metodoProtected();
		// Esse tipo de visibilidade s� est� dispon�vel para classes filhas ou mesmo pacote.		
		

		visibilidadeDefaultP1.exemploDefault();
		visibilidadePublicaP1.exemploDefault();
		//visibilidadePublicaP2.exemploDefault
		// N�o h� visibilidade de um m�todo e classe default para fora do pacote.
		
		
	}
	
	
	
	
}
