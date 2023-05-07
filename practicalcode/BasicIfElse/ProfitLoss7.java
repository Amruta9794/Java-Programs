class ProfitLoss7{
	public static void main(String[] args){
		int sellingP=1200;
		int costP=1000;
		
		int Profit=sellingP-costP;
		int Loss=costP-sellingP;

		if(sellingP>costP){
			System.out.println("Profit Of "+Profit);
		}else if(sellingP<costP){
			System.out.println("Loss Of "+Loss);
		}
		else {
			System.out.println("No Profit No Loss");
		}
	}
}

