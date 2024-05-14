class Solution { 
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'V':
                                answer += 4;
                                i++;
                                break;
                            case 'X':
                                answer += 9;
                                i++;
                                break;
                            default:
                                answer += 1;
                        }
                    } else {
                        answer += 1;
                    }
                    break;
                case 'V':
                    answer += 5;
                    break;
                case 'X':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'L':
                                answer += 40;
                                i++;
                                break;
                            case 'C':
                                answer += 90;
                                i++;
                                break;
                            default:
                                answer += 10;
                        }
                    } else {
                        answer += 10;
                    }
                    break;
                case 'L':
                    answer += 50;
                    break;
                case 'C':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'D':
                                answer += 400;
                                i++;
                                break;
                            case 'M':
                                answer += 900;
                                i++;
                                break;
                            default:
                                answer += 100;
                        }
                    } else {
                        answer += 100;
                    }
                    break;
                case 'D':
                    answer += 500;
                    break;
                case 'M':
                    answer += 1000;
            }
        }
        return answer;
    }
}