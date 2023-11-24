package adaptor;

public class LaptopAdaptor implements Device {
    Laptop laptop;

    public LaptopAdaptor(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void showContent() {
        this.laptop.showEducationContent();
    }
}
