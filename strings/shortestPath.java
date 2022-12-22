public class shortestPath {

    public static float getShortestPath(String str) {
        int x = 0, y = 0; // start from origin
        for (int i = 0; i < str.length(); i++) {
            // north
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
