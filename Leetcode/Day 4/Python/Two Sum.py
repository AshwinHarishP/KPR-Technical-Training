class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        hashmap = {}
        res = []
        for i in range(len(nums)):
            value = target - nums[i]

            if value in hashmap:
                res += [nums.index(value), i]

            else:
                hashmap[nums[i]] = value

        return res
