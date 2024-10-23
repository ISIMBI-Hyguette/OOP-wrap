public class DemoShipment {
    public static void main(String[] args){
        Shipment ship=new Shipment(10,10,10,20,30);
       System.out.println("the volume is:" + ship.volume());
        System.out.println("the weight of shipment is:" + ship.getWeight());
        System.out.println("the cost of the shipment is:"+ ship.getCost());
    }

}
