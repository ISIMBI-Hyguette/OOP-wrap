public class Shipment extends BoxWeight{
    private int Cost;

    public Shipment(int width,int height,int depth,int weight,int Cost){
        super(width,height,depth,weight);
        this.Cost=Cost;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

}
