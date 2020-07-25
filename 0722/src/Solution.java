class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; 
        int [] lcnt = new int[lost.length];
        int [] rcnt = new int[reserve.length];
        
        for(int i=0; i<lost.length; i++) { 
            lcnt[i] += 1;
        }
        
        for(int i=0; i<reserve.length; i++) {
            rcnt[i] += 1;
        }
        
        for(int i=0; i<reserve.length; i++) {
            for(int j=0; j<lost.length; j++) {
                if(lost[j] == reserve[i]) {
                    lcnt[j]--;
                    rcnt[i]--;
                    answer++;
                    break;
                }
            }
        }
        
        for(int i=0; i<reserve.length; i++) {
            for(int j=0; j<lost.length; j++) {
                if(lost[j]-1 == reserve[i] && lcnt[j]==1 && rcnt[i]==1 || 
                   lost[j]+1 == reserve[i] && lcnt[j]==1 && rcnt[i]==1) { 
                    lcnt[j]--;
                    rcnt[i]--;
                    answer++;
                    break;
                }
            }
            if(rcnt[reserve.length-1] == 0)
                break;
        }
        return answer;
    }
}