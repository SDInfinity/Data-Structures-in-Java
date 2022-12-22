public class trappingRainwater {
    public static boolean isSorted(int height[])
    {
        int l=height.length;
        if(l==1 || l==2)
        return false;
        for(int i = 1; i < l; i++){
            if(height[i] < height[i-1])
            return false;
        }
       return true;
    }
    public static int trappedRain(int height[],int width)
    {
        //corner-cases
        if(isSorted(height))
        {
            return 0;
        }
        int l=height.length;
        int leftMax[]=new int[l], rightMax[]=new int[l],waterlevel,trappedWater=0;
        //lef-maximum boundary auxillary array
        leftMax[0]=height[0];
        for(int i=1;i<l;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //right-maximum boundary auxillary array
        rightMax[l-1]=height[l-1];
        for(int i=l-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //calculating waterlevel and trapped water
        for(int i=0;i<l;i++){
            waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater=trappedWater+((waterlevel-height[i])*width);
        }
        return trappedWater;
    }
    public static void main(String [] args)
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println( "The amount of trapped water is: "+trappedRain(height,1)); 
    }
}
