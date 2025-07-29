class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();}
            Map<String,List<String>> stringuu=new HashMap<>();
            for(String str:strs){
                String frequencystr=getFrequencyString(str);
                if(stringuu.containsKey(frequencystr)){
                    stringuu.get(frequencystr).add(str);
                }
                else{
                    List<String> strslist=new ArrayList<>();
                    strslist.add(str);
                    stringuu.put(frequencystr,strslist);
                }
            }
            return new ArrayList<>(stringuu.values());
        }
        private String getFrequencyString(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                sb.append((char) ('a' + i)).append(freq[i]);
            }
        }

        return sb.toString();
    }
}
    
