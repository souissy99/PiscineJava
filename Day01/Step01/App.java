public class App {

    public void printArgs(String[] args){

	for (int i = 0; i < args.length; i++) {
	    System.out.print(args[i] + "\n");
	}

    }	

    public String[] toUpperCase(String[] args){

	for (int i = 0; i < args.length; i++) {
	    args[i] = args[i].toUpperCase();
	}
	return args;
    }	
    
    public String[] removeChar(String[] args, char c){
 
	for (int i = 0; i < args.length; i++) {
	    args[i] = args[i].replace(String.valueOf(c), "");
	}
	return args;
    }
}
