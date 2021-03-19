package BLOCKCHAIN;

import java.util.ArrayList;

public class BlockClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Block> blockchain = new ArrayList<>();
		
		//GENESIS BLOCK
		String[] genesisTransaction = {"Aman --> Rahul: 9BTC"};
		Block genesisBlock = new Block(0,genesisTransaction);
		blockchain.add(genesisBlock);
		
		
		//BLOCK 2
		String[] block2Transaction = {"Rahul --> Aman: 4BTC"};
		Block block2 = new Block(genesisBlock.getBlockHash(),block2Transaction);
		blockchain.add(block2);
		
		System.out.println("Hash of genesis block: "+genesisBlock.getBlockHash());
		System.out.println("Hash of Block 2: "+block2.getBlockHash());
		
		System.out.println(blockchain);
	}

}
