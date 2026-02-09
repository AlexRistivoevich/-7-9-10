package lessons.lesson7;

public class Plane {
   static class Weight {
        private double weight;

       public Weight(double weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }
}
