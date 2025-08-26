class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!map.containsKey(i+j)){
                    map.put(i+j,new ArrayList<>());
                }
                map.get(i+j).add(mat[i][j]);
            }
        }
        List<Integer> result=new ArrayList<>();
        boolean flip=true;
        for(int k=0;k<=m+n-2;k++){
            List<Integer> diagonal=map.get(k);
            if(flip){
                Collections.reverse(diagonal);
            }
            result.addAll(diagonal);
            flip=!flip;
        }
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
    }
}
