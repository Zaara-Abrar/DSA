import math
arr1=[]; arr2=[]
# m=int(input("Enter lengh of list 1"))
# n=int(input("Enter lengh of list 2"))
med=0
nums3=[]
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        median=0; median1=0; median2=0
        nums3=nums1+nums2
        nums3.sort()
        length=len(nums3)
        if length%2!=0:
            median=(length-1)//2
            return float(nums3[median])
        else:
            median1=(length-1)//2
            # print("m1",nums3[median1])
            median2=((length-1)//2)+1
            # print("m2",nums3[median2])
            # print("nums",nums3)
            return (nums3[median1]+nums3[median2])/2.0

# obj=Solution()
# print("Enter elements of list 1")
# for i in range(0,m):
#     arr1.append(input())

# print("Enter elements of list 2")
# for i in range(0,n):
#     arr2.append(input())
# obj.findMedianSortedArrays(arr1,arr2)