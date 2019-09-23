package ProveToMyBrother;

public class Person implements Comparable<Person> {

    private int varsta;
    private String nume;

    Person(int varsta){
        this.varsta=varsta;
    }

    public int getAge(){
        return varsta;
    }

    public int compareTo(Person o){
        return this.varsta - o.varsta;
    }


}
