public class GMultipleDatatype <X, Z>{
    X valueOne;
    Z valueTwo;

    public GMultipleDatatype(X v1, Z v2){
        this.valueOne = v1;
        this.valueTwo = v2;

    }

    public X getValueOne() {
        return valueOne;
    }

    public void setValueOne(X valueOne) {
        this.valueOne = valueOne;
    }

    public Z getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Z valueTwo) {
        this.valueTwo = valueTwo;
    }
}
