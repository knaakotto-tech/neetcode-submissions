class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> heufigkeiten = new HashMap<>();

        for (int n : nums) {

           heufigkeiten.put(n, heufigkeiten.getOrDefault(n, 0) +1);
        }

        int[] lösung = new int[k];

        int besteZahl = 0;
        int anzahl = 0;

        for (int i = 0; i < k; i++) {
            anzahl = 0;

            for(int zahl : heufigkeiten.keySet()) {
                if(heufigkeiten.get(zahl) > anzahl) {
                    anzahl = heufigkeiten.get(zahl);
                    besteZahl = zahl;
                }
            }
            
            lösung[i] = besteZahl; 
            heufigkeiten.remove(besteZahl);
        }

        return lösung;
   
        

    }
}
