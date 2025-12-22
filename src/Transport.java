public class Transport {
    private int speed;
    private int weight;
    private String color;
    private int[] coordinate;

    public Transport(int speed, int weight, String color, int[] coordinate){
        //можно подключться к базе данных
        System.out.println("obj created");
        setValue(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int speed, int[] coordinate){
        this.speed=speed;
        this.coordinate=coordinate;
        System.out.println(getValues());
    }

    public void setValue(int speed, int weight, String color, int[] coordinate){
        this.speed=speed;
        this.weight=weight;
        this.color=color;
        this.coordinate=coordinate;
    }

    public String getValues(){
        String info="object speed: "+speed + ". Weight: "+weight+". Color: "+color+"\n";
        String coordinates="Cordinates: "+"\n";
        for(int i=0; i< coordinate.length; i++){
            coordinates=coordinates+coordinate[i];
        }
        return info+coordinates;
    }
}
