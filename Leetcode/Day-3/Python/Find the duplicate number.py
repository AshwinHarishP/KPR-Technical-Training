from collections import Counter
class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = Counter(nums)

        for key, value in count.items():
            if value >= 2:
                return key

        return -1
