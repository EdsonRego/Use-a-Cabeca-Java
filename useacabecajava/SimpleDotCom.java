public class SimpleDotCom{

	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCell(int[] locs){
		locationCells = locs;
	}

	public String checkYourSelf(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell : locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits ++;
				break;
			}
		}// fora do loop
		if(numOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}//fecha o método
}//fecha a classe