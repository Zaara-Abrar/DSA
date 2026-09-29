class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign= False
        if x<0:
            sign=True
        else:
            sign= False
        x=abs(x)
        rev=0
        while  x!=0:
            rev= rev*10+(x%10)
            x=x//10
            
        rng=2**31
        if rev<(-rng) or rev>rng:
            return 0
        else:
            if sign==False:
                return rev
            else:
                return -rev
        