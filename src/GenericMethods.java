public class GenericMethods {
    public static void main(String[] args) {

        GenericMethods g=new GenericMethods();
        System.out.println(g.checkEquality("yugesh","yugesh"));
    }

    /*
    Let's implement a generic method that checks 2 parameters share the same value or not!
     */
    public <T> boolean checkEquality(T t1,T t2){
        return t1.equals(t2);
    }
    /*
    In the previous lecture we have been talking about bounded type parameters. Let's construct a method that can add 2 arbitrary Numbers (whether it is an integer, a float or a double).
     */
    public <T extends Number> double add(T num1,T num2){
        return num1.doubleValue()+num2.doubleValue();
    }

    /*
    In this exercise, your task is to construct a generic method that takes a T[] one-dimensional array as the input with a T item and it counts that how many items are greater than this specified T item.
     */
    public <T extends Comparable<T>> int countGreaterItems(T[]items,T item){
        int count=0;
        for(T i:items){
            if(i.compareTo(item)>0){
                count++;
            }
        }
        return count;
    }

    public <T extends Comparable<T>> T minValue(T t1,T t2){
        if(t1.compareTo(t2)<0){
            return t1;
        }
        return t2;
    }
}
