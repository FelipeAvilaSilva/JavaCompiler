//Classe principal
//Felipe Avila Silva

class Compilador{

	public static void main(String[]args)
	{	
		ArvoreSintatica arv=null;
	
		try{

			AnaliseLexica al = new AnaliseLexica(args[0]);
			Parser as = new Parser(al);
		
			arv = as.parseProg();						

		
			//Escolher qual executar
			
			CodeGen backend = new CodeGen();						//Retorna a analise
			String codigo = backend.geraCodigo(arv);
			System.out.println(codigo);
// 
			// Interpretador interpretador = new Interpretador();		//Retorna o resultado
			// int resultado = interpretador.Interpreta(arv);
			// System.out.println(resultado);

		}catch(Exception e)
		{			
			System.out.println("Erro de compilação:\n" + e);
		}



	}
}
