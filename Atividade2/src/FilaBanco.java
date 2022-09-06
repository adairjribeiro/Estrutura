import java.io.IOException;
import java.util.*;

public class FilaBanco {  

    private Integer smsNum;

    public FilaBanco(int smsNum) {
        this.smsNum = smsNum;
    }

    public int getSmsNum() {
        return this.smsNum;
    }
  
  public static void main(String[] args) throws IOException {
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    int filaPessoas;
    ArrayList<Integer> filaAtual = new ArrayList<>();
    HashMap<Integer, Integer> numToIndexOriginal = new HashMap<>();
    int currentSmsNum;
    int numChave;

    for(int i = 0; i < N; i++) {
      
    	filaPessoas = scanner.nextInt();
    	numChave = 0;

        for(int j = 0; j < filaPessoas; j++) {
        
            currentSmsNum = scanner.nextInt();
            filaAtual.add(currentSmsNum);
            numToIndexOriginal.put(currentSmsNum, filaAtual.size() - 1);
      
        }

      
        SmsNumComparator comparator = new SmsNumComparator();
        Collections.sort(filaAtual, comparator);


      
        for(int j = 0; j < filaAtual.size(); j++) {
        
            int originalIndex = numToIndexOriginal.get(filaAtual.get(j));
        
        
            if(originalIndex != j) {
          
            	numChave++;
        
            }
      
        }

        System.out.println(filaPessoas - numChave);
        filaAtual = new ArrayList<>();
    
    }
    
    scanner.close();
  
}

static class SmsNumComparator implements Comparator<Integer> {

    public SmsNumComparator() {}

    @Override
    public int compare(Integer num0, Integer num1) {
      
        int res = num0.compareTo(num1);
        return -res;
    
    }
  
}
}