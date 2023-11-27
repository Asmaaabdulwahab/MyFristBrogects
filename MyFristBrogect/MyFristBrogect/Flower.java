public class Flower {
        private String type;
        private int quantity;
        private double price;


    public Flower(String type, int quantity, double price) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public static void main(String[] args) {
            Flower rose=new Flower("Rose",10,2.3);
            System.out.println(" Type : " +rose.getType() );
            System.out.println(" Quantity : " +rose.getQuantity() );
            System.out.println(" Price : " +rose.getPrice() );
            rose.setType("gory");
            rose.setQuantity(6);
            rose.setPrice(2.7);
            System.out.println("Update Type : " + rose.getType());
            System.out.println("Update Quantity : " + rose.getQuantity());
            System.out.println("Update Price : " + rose.getPrice());



        }
    }



