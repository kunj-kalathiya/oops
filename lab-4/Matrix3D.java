public class Matrix3D{
  
    static final int X = 2;
    static final int Y = 3;
    static final int Z = 4;
    
    static void set(int value, int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        arr[index] = value;
    }

    static int get(int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        return arr[index];
    }

    public static void main(String[] args) {
        int[] array = new int[X * Y * Z];
        
        set(10, 1, 2, 3, array);
        System.out.println("Value: " + get(1, 2, 3, array));
    }
}
