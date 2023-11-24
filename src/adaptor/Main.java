package adaptor;

class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        LaptopAdaptor laptopAdaptor = new LaptopAdaptor(laptop);

        laptopAdaptor.showContent();
    }
}