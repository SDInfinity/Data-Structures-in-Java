public class bitOperations {
    public static void getBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            System.out.println(i + "th bit is 0");
        } else {
            System.out.println(i + "th bit is 1");
        }
    }

    public static int setBit(int n, int i) {
        int newNumber = n | (1 << i);
        return newNumber;
    }

    public static int clearBit(int n, int i) {
        int newNumber = n & (~(1 << i));
        return newNumber;
    }

    public static int updateBit(int n, int i, int value) {
        if (value == 0) {
            return clearBit(n, i);
        } else {
            return setBit(n, i);
        }
    }

    public static int clearIBits(int n, int i) {
        return n & (-1 << i);
    }

    public static int clearRangeOfBits(int n, int j, int i) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        getBit(15, 1);
        System.out.println("After setting the bit number is: " + setBit(10, 2));
        System.out.println("After setting the bit number is: " + clearBit(10, 1));
        System.out.println("The value after updation is: " + updateBit(10, 1, 0));
        System.out.println("After clearing i bits we get: " + clearIBits(15, 2));
        System.out.println("After clearing the range of bits we get: " + clearRangeOfBits(15, 2, 1));
    }

}
