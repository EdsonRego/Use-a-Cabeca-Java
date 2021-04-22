public class PhraseOMatic{
	public static void main(String[] args){
	//cite três conjuntos de palavras onde será feita a seleção. Adicione o que quiser!
		String[] wordListOne = {"24/7","Várias Camadas","30.000 pés","B-to-B","todos ganham","front-end","baseado na web","difundido","inteligente","seis signma","caminho crítico","dinâmico"};
	
		String[] wordListTwo = {"habilitado","adesivo","valor agregado","em rede","dedicado","alavancado","alinhado","destinado","compartilhado","cooperativo","acelerado"};
	
		String[] wordListThree = {"processo","ponto máximo","solução","mindshare","portal","espaço","visão","paradigma","missão"};
		
		//descubra quantas palavras existem em cada lista;
		int oneLength = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		// gere três números aleatórios.
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLenght);
		int rand3 = (int)(Math.random() * threeLenght);
		
		//agora construa uma frase.
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//exiba a frase
		System.out.println("Precisamos de " + phrase);
	
	}
}