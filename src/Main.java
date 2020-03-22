public class Main {
    public static void main(String[] args){
        Plane.planeBuilder planeBuilder = new Plane.planeBuilder();
        Plane p = Plane.planeBuilder().setCheslo(23).setNumber(31).setBackNumber(13).setName("Petya").setSurname("Jaja").build();
    }
}
