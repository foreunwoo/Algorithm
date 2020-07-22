
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int x=0; x<answer.length; x++) { 
            for(int y=0; y<answer.length; y++) {
                
                int i = commands[x][0];
                int j = commands[x][1];
                int k = commands[x][2];
        
                int[] arr = Arrays.copyOfRange(array, i-1, j);
                Arrays.sort(arr);
        
                answer[x] = arr[k-1];
            }
        }
    
        	       
        return answer;
    }
	
}
