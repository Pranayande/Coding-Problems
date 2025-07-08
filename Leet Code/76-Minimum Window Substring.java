class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))==true){
                int value=map.get(t.charAt(i));
                value++;
                map.put(t.charAt(i),value);
            }
            else{
                map.put(t.charAt(i),1);
            }
        }
        int i=0;
        int j=0;
        int start=0;
        int end=0;
        int count=map.size();
        int min=Integer.MAX_VALUE;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))==true){
                int value=map.get(s.charAt(j));
                value--;
                map.put(s.charAt(j),value);
                if(value==0){
                    count--;
                }
            }
            while(count==0 && i<=j ){
                    if(j-i+1<min){
                    min=j-i+1;
                    start=i;
                    end=j;
                    }
                    if(map.containsKey(s.charAt(i))==true){
                        int value=map.get(s.charAt(i));
                        value++;
                        map.put(s.charAt(i),value);
                        if(value>0){
                            count++;
                        }
                    }
                    i++;
                }
            j++;
        }
        System.out.println(min);
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,end+1);
    }
    }
    
