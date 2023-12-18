class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int last;
        if (a <= b) last = a;

        else last = b;
        
        for (int i = 1; i <= last; i++){
            if (a % i == 0 && b % i == 0){
                count += 1;
            }
        }
        return count;
    }
}
