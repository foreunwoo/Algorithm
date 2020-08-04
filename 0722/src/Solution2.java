import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, String> map = new HashMap<String, String>();
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        String answer = "";        
        
        for(int i=0; i<completion.length; i++) {
            map.put(completion[i], completion[i]);
        }
        
        for(int j=0; j<participant.length; j++) {
            if(map.containsKey(participant[j])) {
                map.remove(participant[j]);
            }
        }
        
        while(it.hasNext()) {
            answer = it.next();
        }
        
        return answer;
    }
}