

class Solution {
    public boolean isAnagram(String s, String t) {

        

        int counter1 = 0;
        int kontrolle = 0;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        if (c1.length != c2.length) {
            return false;
        }

        HashSet<Character> Buchstarben = new HashSet<>();


        for (int i = 0; i < c1.length; i++) {

            if (Buchstarben.contains(c1[i])){
                continue;
            } else {
                Buchstarben.add(c1[i]);


                for (int j = 0; j < c1.length; j++) {
                    
                    if (c1[i] == c2[j]) {
                        counter1++;
                    }

                    if (c1[i] == c1[j]) {
                        kontrolle++;
                    }

            

                }

                if(counter1 != kontrolle) {
                        return false;
                    }
            }

        }
        
        return true;
    }
}
