package MODEL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gestione {

	/* Codice carte:
	 * 
	 * CUORI: 
	 * 10 = asso di cuori
	 * 11 = 2 di cuori
	 * 12 = 3 di cuori
	 * 13 = 4 di cuori
	 * 14 = 5 di cuori
	 * 15 = 6 di cuori
	 * 16 = 7 di cuori
	 * 17 = 8 di cuori
	 * 18 = 9 di cuori
	 * 19 = 10 di cuori
	 * 20 = fante di cuori
	 * 21 = re di cuori
	 * 22 = regina di cuori
	 * 
	 * ROMBI:
	 * 30 = asso di rombi
	 * 31 = 2 di rombi
	 * 32 = 3 di rombi
	 * 33 = 4 di rombi
	 * 34 = 5 di rombi
	 * 35 = 6 di rombi
	 * 36 = 7 di rombi
	 * 37 = 8 di rombi
	 * 38 = 9 di rombi
	 * 39 = 10 di rombi
	 * 40 = fante di rombi
	 * 41 = re di rombi
	 * 42 = regina di rombi
	 * 
	 * FIORI:
	 * 50 = asso di fiori
	 * 51 = 2 di fiori
	 * 52 = 3 di fiori
	 * 53 = 4 di fiori
	 * 54 = 5 di fiori
	 * 55 = 6 di fiori
	 * 56 = 7 di fiori
	 * 57 = 8 di fiori
	 * 58 = 9 di fiori
	 * 59 = 10 di fiori
	 * 60 = fante di fiori
	 * 61 = re di fiori
	 * 62 = regina di fiori
	 * 
	 * PICCHE:
	 * 70 = asso di picche
	 * 71 = 2 di picche
	 * 72 = 3 di picche
	 * 73 = 4 di picche
	 * 74 = 5 di picche
	 * 75 = 6 di picche
	 * 76 = 7 di picche
	 * 77 = 8 di picche
	 * 78 = 9 di picche
	 * 79 = 10 di picche
	 * 80 = fante di picche
	 * 81 = re di picche
	 * 82 = regina di picche
	 */
	
	
	ArrayList<Integer> mazzo=new ArrayList<Integer>();
	int puntatore=0;

	
	public Gestione(){
		puntatore=0;
		for (int i = 9; i < 83; i++){
			if(i>9 && i<23 || i>29 && i<43 || i>49 && i<63 || i>69 && i<83){
				mazzo.add(i);
				mazzo.add(i);
			}
	     
	    }
		Collections.shuffle(mazzo);
		for (int i = 0; i < mazzo.size(); i++)
	    {
	      System.out.print(mazzo.get(i)+" ");
	    }
	  }
	
	
	
	public int Distribuzione(){
		int carta=mazzo.get(puntatore);
		puntatore++;
		return carta;
	}
	
	
	
	

	
}
	
	
	

