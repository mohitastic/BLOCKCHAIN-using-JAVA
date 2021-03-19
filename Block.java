package BLOCKCHAIN;

import java.util.Arrays;

public class Block {

	private int previousHash;
	String[] transactions;
	
	private int currblockHash;
	public Block(int previousHash, String[] transactions) {
		this.previousHash=previousHash;
		this.transactions=transactions;
		
		Object[] contents = {Arrays.hashCode(transactions),previousHash};
		this.currblockHash = Arrays.hashCode(contents);
	}
	
	public int getPrevHash() {
		return previousHash;
	}
	
	public String[] getTransaction() {
		return transactions;
	}

	public int getBlockHash() {
		return currblockHash;
		
		
	}

	@Override
	public String toString() {
		return transactions[0];
	}
	
	
}
