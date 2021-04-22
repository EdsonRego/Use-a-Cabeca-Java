public class GuessGame{
	Player p1;//variáveis de instância para os três objetos Player
	Player p2;
	Player p3;
	
	public void startGame(){
		p1 = new Player();//cria três objetos Player e atribui a eles as três variáveis de instância Player
		p2 = new Player();
		p3 = new Player();
		
		int guessp1;//declara três variáveis para armazenar os três palpites que os jogadores forneceram
		int guessp2;
		int guessp3;
		
		boolean p1isRight = false;//declara três variáveis para armazenar um valor verdadeiro ou falso baseado na resposta do jogador
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10 );//cria um número alvo que os jogadores terão que advinhar.
		System.out.println("Estou pensando em um número entre 0 e 9 ...");
		
		while(true){
			System.out.println("O número a advinhar é: " + targetNumber);
			
			p1.guess();//chama o métogo guess de cada jogador
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;// Obtem o palpite de cada jogador
			System.out.println("O jogador Um forneceu o palpite: " + guessp1);
			guessp2 = p2.number;
			System.out.println("O jogador Dois forneceu o palpite: "+ guessp2);
			guessp3 = p3.number;
			System.out.println("O jogador Três forneceu o palpite: " + guessp3);
			//verifica o palpite de cada jogador para ver se é igual ao número alvo, se um jogador acertar, sua variável será configurada como true, lembrar que deixamos false como padrão
			if(guessp1 == targetNumber){
				p1isRight = true;
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
			}
			//se o jogador Um ou o jogador Dois ou o jogador 3 acertar....
			if(p1isRight || p2isRight || p3isRight){
			
				System.out.println("Temos um vencedor!");
				System.out.println("O jogador Um acertou? " + p1isRight);
				System.out.println("O jogador Dois acertou? " + p2isRight);
				System.out.println("O jogador Três acertou? " + p3isRight);
				System.out.println("Fim do jogo");
				break;//fim do jogo, portando sai do loop
			}else{
			//devemos continuar porque ninguém acertou.
				System.out.println("Os jogadores vão tentar novamente.");
			}// fim de if/else
		}//fim do jogo
	}//fim do método
}//fim da classe