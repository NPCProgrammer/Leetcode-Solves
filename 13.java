class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int total = 0;
        int pregame = 0;
        for (int i = s.length(); i>0; i--) {
               switch(s.charAt(i-1)) { 
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
                default: System.out.println("error");
               }
               if (value < pregame){
                   total -= value;
                   }
            else{
                total += value;
                }
        pregame = value;
        }
        
        return total;
        }
}
