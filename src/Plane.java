public class Plane {
    int number;
    int cheslo;
    int backNumber;
    String name;
    String surname;

    private Plane(int number, int cheslo, int backNumber, String name, String surname) {
        this.number = number;
        this.cheslo = cheslo;
        this.backNumber = backNumber;
        this.name = name;
        this.surname = surname;
    }

    public Plane() {

    }

    public int getNumber() {
        return number;
    }

    public int getCheslo() {
        return cheslo;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static planeBuilder planeBuilder() {
        return new Plane().new planeBuilder();
    }

    public class planeBuilder{
        public planeBuilder setNumber(int number){
            Plane.this.number = number;

            return this;
        }
        public planeBuilder setCheslo(int cheslo){
            Plane.this.cheslo = cheslo;

            return this;
        }
        public planeBuilder setBackNumber(int backNumber){
            Plane.this.backNumber = backNumber;

            return this;
        }
        public planeBuilder setName(String name){
            Plane.this.name = name;

            return this;
        }
        public planeBuilder setSurname(String surname){
            Plane.this.surname = surname;

            return this;
        }
        public Plane build() {
            return Plane.this;
        }
    }
}
