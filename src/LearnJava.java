public class LearnJava {

    public static void main(String[] args){
//        int a = 5;
        char b = 'i';
        long c = 400;
        double d = 3.2;
        String name = "Susan"; //String is an object as it is not highlighted. Not a primitive data type
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

//        addExclamationPoint("hot dogs");
        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);

        Animal a = new Animal();
        String dog=a.IamDog();
        System.out.println(dog);
    }

    public static String addExclamationPoint(String s){
//        System.out.println(s + "!");
        return s + "!";
    }
}
