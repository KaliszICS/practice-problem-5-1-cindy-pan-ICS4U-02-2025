/**
 * this method collects the data of a parent
 * name, age, spouses, children.
 * @author Cindy
 * @version 17.0.1
 */
class Parent extends Person {
    private Parent spouse;
    private Child[] children;

    /**
     * a constructor for the instance variables
     * @param name1 name of the parent
     * @param age1 age of the parent
     * @param spouse1 spouse of the parent
     */
    public Parent(String name1, int age1, Parent spouse1){
        super(name1, age1);
        this.spouse = spouse1;
        this.children = new Child[0];
    }

    /**
     * a different consturtor that takes in nothing for the spouse variable
     * @param name1
     * @param age1
     */
    public Parent(String name1, int age1){
        super(name1, age1);
        this.children = new Child[0];
        this.spouse = null;
    }

    /**
     * this sets the spouse data 
     * @param spouse1 the spouse of the parent
     */
    public void setSpouse(Parent spouse1){
        this.spouse = spouse1;
    }
    
    /**
     * getter for the spouse variable
     * @return the spouse of the parent
     */
    public Parent getSpouse(){
        return this.spouse;
    }

    /**
     * this sets the children variable
     * @param children1 an array, children of the parent
     */
    public void setChildren(Child[] children1){
        this.children = children1;
    }

    /**
     * returns the variable children
     * @return the children of the parent
     */
    public Child[] getChildren(){
        return this.children;
    }

    public void addChild(Child child){
        int length = this.children.length;
        Child[] temp = new Child[length+1];
        for(int i =0; i<length; i++){
            temp[i] = this.children[i];
        }
        temp[length] = child;
        this.children = temp;
    }
    
}
