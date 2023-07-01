public class Animal {
    protected String name;
    protected Boolean legs;
    protected boolean flipper;
    protected boolean wings;

    protected Animal(String name, boolean legs, boolean flipper, boolean wings){
        this.name = name;
        this.legs = legs;
        this.flipper = flipper;
        this.wings = wings;
    }

    public void toWalk(){
        if(this.legs){
            System.out.printf("{%s} can walks!\n", this.name);
        }
        else System.out.printf("{%s} can`t walks!\n", this.name);
    }

    public void toSwim(){
        if (this.flipper) {
            System.out.printf("{%s} can swim!\n", this.name);
        }
        else System.out.printf("{%s} can`t swim!\n", this.name);
    }

    public void toFly(){
        if (this.wings) {
            System.out.printf("{%s} can fly!\n", this.name);
        }
        else System.out.printf("{%s} can`t fly!\n", this.name);
    }
}