public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        int [] score = new int[3];
        int idx = 0, intCnt = 0; // intCnt는 숫자의 수

        for (int i=0; i<dartResult.length(); i++) {
            char dartChar = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dartChar); // 숫자만 추출해냄

            if (dartInt >= 0 && dartInt <= 10) { // score
                if (dartInt == 1) {
                    if (Character.getNumericValue(dartResult.charAt(i+1)) == 0) {
                        dartInt = 10;
                        i++;
                    }
                }

                score[idx] = dartInt;
                intCnt++;
            } else { // Bonus, option

                if (dartChar == 'S') {
                    score[idx] = (int) Math.pow(score[idx], 1);
                    idx++;
                }
                if (dartChar == 'D') {
                    score[idx] = (int) Math.pow(score[idx], 2);
                    idx++;
                }
                if (dartChar == 'T') {
                    score[idx] = (int) Math.pow(score[idx], 3);
                    idx++;
                }
                if (dartChar == '*') {
                    idx = idx - 2 < 0 ? 0 : idx - 2;
                    while (idx < intCnt) {
                        score[idx] *= 2;
                        idx++;
                    }
                }
                if (dartChar == '#') {
                    score[idx-1] *= -1;
                }
            }
        }

        for (int s: score) {
            answer += s;
        }

        return answer;
    }
}
