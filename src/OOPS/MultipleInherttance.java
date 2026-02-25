package OOPS;
// Multiple inheritance through Interfaces

    interface Father {
        void fatherFeature();
    }

    interface Mother {
        void motherFeature();
    }

    class Child implements Father, Mother {
        public void fatherFeature() {
            System.out.println("Father's feature");
        }
        public void motherFeature() {
            System.out.println("Mother's feature");
        }
    }
      public class MultipleInherttance {
        public static void main(String[] args) {
            Child c = new Child();
            c.fatherFeature();
            c.motherFeature();
        }
    }


