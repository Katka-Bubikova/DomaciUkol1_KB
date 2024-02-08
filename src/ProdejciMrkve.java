import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdejciMrkve {
    String name = "Jan Novák";
    LocalDate birthday = LocalDate.of(1990,1,1);
    int numberOfContracts = 10;
    BigDecimal tonsOfCarrots = BigDecimal.valueOf(12.1);
    String cityOfSeller = "Popudinské Močidľany";
    String SPZ = "BT510CX";
    double gasPer100km = 6.32;
    String ip = "68.12.5.10";

    public ProdejciMrkve() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public BigDecimal getTonsOfCarrots() {
        return tonsOfCarrots;
    }

    public void setTonsOfCarrots(BigDecimal tonsOfCarrots) {
        this.tonsOfCarrots = tonsOfCarrots;
    }

    public ProdejciMrkve(BigDecimal tonsOfCarrots) {
        this.tonsOfCarrots = BigDecimal.valueOf(12.1);
    }
}
