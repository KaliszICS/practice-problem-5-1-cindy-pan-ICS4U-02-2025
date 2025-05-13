/**
 * this class stores the name and age of a person
 * it has getters and setters for each variable
 * @author Cindy Pan
 * @version 17.0.1
 */
class Person{
    private int age;
    private String name;

    /**
     * this is the construtor for the instance variable
     * @param age1 the age of the person
     * @param name1 the name of the person
     */
    public Person(String name1, int age1){
        this.age = age1;
        this.name = name1;
    }

    /**
     * a getter for the age variable
     * @return the age of the person
     */
    public int getAge(){
        return this.age;
    }

    /**
     * a getter for the name variable
     * @return the name of the person
     */
    public String getName(){
        return this.name;
    }

    /**
     * setter for the age variable
     * @param age2 a new int value to replace the current age variable
     */
    public void setAge(int age2){
        this.age = age2;
    }

    /**
     * setter for the name variable
     * @param name2 a new String value to replace the current name variable
     */
    public void setName(String name2){
        this.name = name2;
    }

}