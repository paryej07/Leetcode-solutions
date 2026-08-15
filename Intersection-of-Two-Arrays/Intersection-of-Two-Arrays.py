class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        nums3 = []
        for i in nums1:
            if i in nums2:
                nums3.append(i)
        nums3 = list(set(nums3))
        return nums3
