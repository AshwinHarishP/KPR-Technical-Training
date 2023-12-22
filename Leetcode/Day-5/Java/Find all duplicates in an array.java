class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: nums){
            if (hmap.containsKey(i)){
                list.add(i);
            }
            else{
                hmap.put(i, 0);
            }
        }
        return list;
        
    }
}
