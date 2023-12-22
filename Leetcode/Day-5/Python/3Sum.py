def bruteforce(nums):

    res = set()
    for i in range(len(nums)):
        hmap = set()
        for j in range(i+1, len(nums)):
            k = -(nums[i] + nums[j])

            if k in hmap:
                temp = tuple(sorted([nums[i], nums[j], k]))
                res.add(temp)

            hmap.add(nums[j])

    res = list(res)
    result = [list(i) for i in res]
    return result
