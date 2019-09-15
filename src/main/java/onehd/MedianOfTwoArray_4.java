package onehd;

public class MedianOfTwoArray_4 {
    /*
        Since it's a "sorted" array, we need to think of a way to use binary search.
        Couldn't figure it out until I saw the post about checking "contribution":
        https://medium.com/@hazemu/finding-the-median-of-2-sorted-arrays-in-logarithmic-time-1d3f2ecbeb46
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int expect = (nums1.length + nums2.length) / 2;
        boolean evenFlag = (nums1.length+nums2.length)/2==(nums1.length+nums2.length+1)/2;

        //use arrayA as the short array, arrayB as the longer
        if(nums1.length > nums2.length) {
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }

        //the minimum possible contribution number of array A
        //the max possible contribution number of array A
        int aMin=0,aMax= Math.min(expect, nums1.length);

        while(aMax >= aMin) {
            //check median to see if it's a valid contribution of array A and B
            int ac = (aMax + aMin) / 2;
            int bc = expect - ac;

            Integer x1 = null, y1 = null, x2 = null, y2 = null;

            if(ac>=1) {
                x1 = nums1[ac-1];
            }
            if(bc>=1) {
                y1 = nums2[bc-1];
            }
            if(ac<nums1.length) {
                //contributed whole arrayA
                x2 = nums1[ac];
            }
            if(bc<nums2.length) {
                y2 = nums2[bc];
            }
            if (null!=x1 && null!=y2 && x1>y2) {
                aMax = ac-1;
            } else if (null!=y1 && null!=x2 && y1>x2) {
                aMin = ac+1;
            } else {
                //calculate the median
                if(!evenFlag) {
                    if(null==x2) return y2;
                    else if(null==y2) return x2;
                    else return x2<y2?x2:y2;
                }
                int lMed = null==x1 ? y1 : null==y1 ? x1 : x1>y1?x1:y1;
                int rMed = null==x2 ? y2 : null==y2 ? x2 : x2<y2?x2:y2;
                return (lMed + rMed)/2.0;
            }

        }
        //will not be here
        return -1;
    }
}
