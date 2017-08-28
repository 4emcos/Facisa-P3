
/** 
 * @author Emerson Costa
 * Temos aqui um exemplo de uso do Singleton. A ideia � que tal objeto seja alocado na mem�ria
 * apenas uma vez, tornando acess�vel e vis�vel para o projeto.
 * 
 */

public class Conexao {

	/**
	 * @param instance Declarando instancia que ir� ser alocada na mem�ria.
	 *
	 */
	
	private static final Conexao INSTANCE = new Conexao();
	
	// Construtor privado, pois n�o est� sendo usado ainda.
	private Conexao () 
	{
		// Op��es de inicializa��o da classe.
	}
	
	public static Conexao getInstance() 
	{
		return INSTANCE;
	}
	
	/**
	 * @return instance retorna instancia chamada a cada nova conex�o.
	 */
	
	public static void Player1() 
	{
		System.out.println("Conectado player 1");
	}
	
	/**
	 * @return Se for chamado a instancia 'Player1' ir� aparecer uma mensagem informando. 
	 */
	public static void Player2() 
	{
		System.out.println("Conectado player 2");
	}
	
	/**
	 * @return Se for chamado a instancia 'Player1' ir� aparecer uma mensagem informando. 
	 */
}
