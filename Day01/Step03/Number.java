import java.util.Arrays;

public class Number {

    public int getModulus(int i1, int i2){

	if(i1 > 0 || i2 >=0)
	    return -1;
	return i1 % i2;

    }
	
    public int[] sort(int[] tab){

	Arrays.sort(tab);
	return tab;
    }
    
    public int getSum(int[] i){

	int k = 0;

	for (int j = 0; j < i.length; j++){

	    k = k + i[j];
	}
	return k;
    }	
    
    public int getMax(int[] i){

	int k = 0;
	
	for (int j = 0; j < i.length; j++) {

	    if(i[j] > k)
		k = i[j];
	}
	return k;
	
    }

    public int getMin(int[] i){

	int k = i[0];
	
	for (int j = 0; j < i.length; j++) {

	    if(i[j] < k)
		k = i[j];
	}
	return k;

    }
    
}
 
