package pro_buddy;

public class Smallest_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        	for(int j=1;j<400000000;j++) {
        		if((j%1)==0 && (j%2)==0 && (j%3)==0 && (j%4)==0 && (j%5)==0 && (j%6)==0 && (j%7)==0 && (j%8)==0 && (j%9)==0 && (j%10)==0 
        			&& (j%11)==0 && (j%12)==0 && (j%13)==0 && (j%14)==0 && (j%15)==0 && (j%16)==0 && (j%17)==0	&& (j%18)==0 && (j%19)==0
    				&& (j%20)==0){
        			System.out.println("Number divisible from 1 to 20 without remainder are: "+j);
        		}
        	}        
	}
	
}