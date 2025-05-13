/**
 * a class that contains the data of a child
 * @author Cindy Pan
 * @version 17.0.1
 */
class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    /**
     * this constructor takes in data and sets them to the instance variable
     * @param name1 name of the child
     * @param age1 age of the child
     * @param parent1 one of the parents of the child
     * @param parent2 the other parent of the child
     */
    public Child(String name1, int age1, Parent parent1, Parent parent2){
        super(name1, age1);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }

    /**
     * gets the value in the parent variable
     * @return the parent of the child
     */
    public Parent getParent1(){
        return this.parent1;
    }

    /**
     * this gets the value in the parent2 variable
     * @return the parent of the child
     */
    public Parent getParent2(){
        return this.parent2;
    }

    /**
     * this sets the siblings variable to a new value
     * @param siblings1 the siblings of the child
     */
    public void setSiblings(Child[] siblings1){
        this.siblings= siblings1;
    }


    /**
     * this gets the value in the siblings variable
     * @return the siblings of the child
     */
    public Child[] getSiblings(){
        return this.siblings;
    }

    public void addSibling(Child child){
        int length = this.siblings.length;
        Child[] temp = new Child[length+1];
        for(int i =0; i<length; i++){
            temp[i] = this.siblings[i];
        }
        temp[length] = child;
        this.siblings = temp;
    }

}
