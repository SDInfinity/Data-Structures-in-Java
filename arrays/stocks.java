public class stocks {
    public static int profit(int prices[]){
        int maxProfit=0,buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i]){           //condition for profit
               int profit=prices[i]-buyPrice; //current day profit.
               maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];           //set the buyPrice to current price i.e the lesser price
            }
        }
        return maxProfit;
    }
    public static void main(String [] args)
    {
        int prices[]={7,1,5,3,6,4};
        System.out.println("The maximum profit is: "+profit(prices));
    }
}
