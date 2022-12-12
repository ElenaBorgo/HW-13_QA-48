package ru.netology.Product;

public class Smartphone extends Product {

    private String companyName;

    public Smartphone(int id, String name, int price, String companyName) {
        super(id, name, price);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            if (getName().contains(search)) {
                return getName().contains(search);
            }
            return true;
        }
        if (getCompanyName().contains(search)) {
            return getCompanyName().contains(search);
        }
        return false;
    }
}
