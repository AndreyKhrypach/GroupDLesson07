import java.util.Arrays;
import java.util.Random;

public class Lesson07Program {

    public static final double PI = 3.14;
    public final double PI2 = 3.14;
    public double pi = 3.14;

    static int abc;
    public static void main(String[] args) {

        int a = 0;
        String str = "Hello world";
        Integer a1 = a;
//        System.out.println(a1);
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        System.out.println(a1);

        byte b = 0;
        Byte b1 = b;
        short s = 0;
        Short s1 = s;
        long l = 0;
        Long l1 = l;
        boolean bool = true;
        Boolean bool1 = bool;
        char c = 'A';
        Character c1 = c;
        Character c2 = new Character(c);

        Integer test = null;
        if(test == null){
            test = 0;
        }
        int temp = test;
        System.out.println(temp);

//        int a = 24;
//        System.out.println(a);
//        System.out.println(abc);

//        Person person = new Person();
//        String person1Info = person.personInfo("Andrey", "Khrypach", "Lviv", 1234567);
//
//        Lesson07Program program = new Lesson07Program();
//        double pi = 3.14;
//        double radius1 = 12 / (2 * PI);
//        double radius2 = 12 / (2 * program.PI2);
//        double radius3 = program.calculateRadius(12);
//        double radius4 = 12 / (2 * pi);
//
//
//        System.out.println(radius1);
//        System.out.println(radius2);
//        System.out.println(radius3);
//        System.out.println(radius4);


//        Random random = new Random();
//        int[] array1 = new int[8];
//        int[] array2 = new int[12];
//
//        initializeArray(array1);
//        initializeArray(array2);
//        int[] array3 = initializeArray(15);
//
//        for (int index = 0; index < array1.length; index++) {
//            array1[index] = random.nextInt();
//        }
//
//        for (int index = 0; index < array2.length; index++) {
//            array2[index] = random.nextInt();
//        }

//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
    }

    public static void initializeArray(int[] array) {
        Random random = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }
    }

    public static int[] initializeArray(int arrayLength) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }

        return array;
    }

    public static int[] initializeArray(short arrayLength) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }

        return array;
    }

    public static int[] initializeArray(short arrayLength, boolean check) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }

        return array;
    }

    public double calculateRadius(int lengthCircle) {
        return lengthCircle / (2 * PI2);
    }
}
