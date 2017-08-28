/**
 * @author Emerson Costa
 * Temos aqui um exemplo de visibilidade geral em Java.
 * 
 */
package p1;
import p2.*;

public class ExemploVisibilidadeP1 {
	/**
	 * @param exemploPublic Exemplo de método público.
	 * @param exemploPrivate Exemplo de método privado.
	 * @param exemploProctected Exemplo de método protegido.
	 * @param exemploDefaltu Exemplo de método padrão.
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
		//A visibilidade Default só é possível instanciar sendo da mesma classe.
		
		visibilidadeDefaultP1.exemploPublic();
		visibilidadePublicaP1.exemploPublic();
		visibilidadePublicaP2.exemploPublic();
		
		visibilidadeDefaultP1.exemploPrivate();
		// visibilidadePublicaP1.metodoPrivado();
		// visibilidadePublicaP2.metodoPrivado();
		// Métodos privados são apenas da mesma classe.
		
		visibilidadeDefaultP1.exemploProtected();
		visibilidadePublicaP1.exemploProtected();
		// visibilidadePublicaP2.metodoProtected();
		// Esse tipo de visibilidade só está disponível para classes filhas ou mesmo pacote.		
		

		visibilidadeDefaultP1.exemploDefault();
		visibilidadePublicaP1.exemploDefault();
		//visibilidadePublicaP2.exemploDefault
		// Não há visibilidade de um método e classe default para fora do pacote.
		
		
	}
	
	
	
	
}
