public class largest {
    public static void main(String[] args) // O(x*N)
    {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("The largest is : " + largest);
    }

}
