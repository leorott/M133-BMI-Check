package ch.bbw;


public class BmiModel {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getValue()
    {// BMI = Körpergewicht : (Körpergrösse in m)
        if(height > 0 && weight > 0){
            return weight / Math.pow(height/ 100.0, 2);
        }
        else{
            return 0;
        }

    }

}


