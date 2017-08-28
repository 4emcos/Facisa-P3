
/** 
 * @author Emerson Costa
 * Temos aqui um exemplo de uso do Singleton. A ideia é que tal objeto seja alocado na memória
 * apenas uma vez, tornando acessível e visível para o projeto.
 * 
 */

public class Conexao {

	/**
	 * @param instance Declarando instancia que irá ser alocada na memória.
	 *
	 */
	
	private static final Conexao INSTANCE = new Conexao();
	
	// Construtor privado, pois não está sendo usado ainda.
	private Conexao () 
	{
		// Opções de inicialização da classe.
	}
	
	public static Conexao getInstance() 
	{
		return INSTANCE;
	}
	
	/**
	 * @return instance retorna instancia chamada a cada nova conexão.
	 */
	
	public static void Player1() 
	{
		System.out.println("Conectado player 1");
	}
	
	/**
	 * @return Se for chamado a instancia 'Player1' irá aparecer uma mensagem informando. 
	 */
	public static void Player2() 
	{
		System.out.println("Conectado player 2");
	}
	
	/**
	 * @return Se for chamado a instancia 'Player1' irá aparecer uma mensagem informando. 
	 */
}
