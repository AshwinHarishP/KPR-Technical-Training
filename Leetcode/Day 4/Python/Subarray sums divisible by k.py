class Solution:
    def subarraysDivByK(self, nums, k):
        output = [0] * k

        prefix_mod = 0
        result = 0
        output[0] = 1

        for num in nums:
            prefix_mod = (prefix_mod + num % k + k) % k
            result += output[prefix_mod]
            output[prefix_mod] += 1

        return result
