package Percobaan;

import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private double wagePerItem; // upah per barang
    private int itemsProduced; // banyaknya barang yang diproduksi

    public ProductionEmployee(String name, String noKTP, double wagePerItem, int itemsProduced, LocalDate birthdate) {
        super(name, noKTP, birthdate);
        this.wagePerItem = wagePerItem;
        this.itemsProduced = itemsProduced;
    }

    public double getWagePerItem() {
        return wagePerItem;
    }

    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    public int getItemsProduced() {
        return itemsProduced;
    }

    public void setItemsProduced(int itemsProduced) {
        this.itemsProduced = itemsProduced;
    }

    @Override
    public double earnings() {
        return wagePerItem * itemsProduced; // menghitung gaji berdasarkan produksi barang
    }
}