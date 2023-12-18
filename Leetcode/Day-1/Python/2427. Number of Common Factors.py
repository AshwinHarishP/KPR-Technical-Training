class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        if a <= b:
            last = a
        else:
            last = b

        count = 0
        for i in range(1, last+1):
            if a % i == 0 and b % i == 0:
                count += 1
        
        return count
