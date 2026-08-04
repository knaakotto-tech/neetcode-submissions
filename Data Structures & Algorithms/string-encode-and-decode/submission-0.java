class Solution {

    public String encode(List<String> strs) {

        String encoded_string = "";

        for (String a : strs) {
            encoded_string = encoded_string + a.length() + "#" + a;
        } 

        return encoded_string;

    }

    public List<String> decode(String str) {

        ArrayList<String> result = new ArrayList<String>();

        char[] liste = str.toCharArray();

        int durchläufe = 0;

        while (durchläufe < liste.length) {
            
            int zahl = 0;

            while (liste[durchläufe] != '#') {
                
                zahl = (zahl * 10) + (liste[durchläufe] - '0');
                durchläufe++;
            }

            durchläufe++;

            String lösungsWort = str.substring(durchläufe, durchläufe + zahl);
        
            
            result.add(lösungsWort);
            durchläufe += zahl;

        }

        return result;


    }
}
