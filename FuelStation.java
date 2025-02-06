public class FuelStation {
    private String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;
    
    public FuelStation() {
        fuelType = "gasoline";
        fuelVolume = 75000.0;
        fuelRate = 2.0;
        fuelSales = 0.00;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public double getFuelVolume() {
        return fuelVolume;
    }
    
    public double getFuelRate() {
        return fuelRate;
    }
    
    public double getFuelSales() {
        return fuelSales;
    }
    
    public String toString() {
        return String.format("FUEL: %s VOL: %.1f PRICE PER L: $%.2f SALES: $%.2f", getFuelType(), getFuelVolume(), getFuelRate(), getFuelSales());  
    }
    
    private boolean sellFuel(double volume) {
        if (fuelVolume >= volume) {
            fuelVolume = fuelVolume - volume;
            fuelSales = fuelSales + (volume * fuelRate);
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean canDispenseFuelType(String fuelType) {
        return this.fuelType.equals(fuelType);
    }
    
    public boolean dispense(String fuelType, double volume) {
        return canDispenseFuelType(fuelType) && sellFuel(volume);
    }
}