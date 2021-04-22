class Exercise1b{
	public static void main(String[] args){
		int x = 1;
		while(x < 10){
			if(x > 3){
				System.out.println("big x");
			}
			else{
				System.out.println("Numero menor que 10 e não maior que 3");
				break;
			}
		}
	}
}