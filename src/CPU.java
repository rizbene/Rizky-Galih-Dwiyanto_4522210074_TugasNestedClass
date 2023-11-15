import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    public class Harddisk {
        int capacity;
        String type;

        Harddisk(int capacity, String type) {
            this.capacity = capacity;
            this.type = type;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas Harddisk: " + this.capacity + " TB");
            System.out.println("Tipe: " + this.type);
        }
    }

    public class Motherboard {
        String model;
        String chipset;

        Motherboard(String model, String chipset) {
            this.model = model;
            this.chipset = chipset;
        }

        public void getMotherboardInfo() {
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Chipset: " + this.chipset);
        }
    }

    public class PowerSupply {
        int wattage;
        String certification;

        PowerSupply(int wattage, String certification) {
            this.wattage = wattage;
            this.certification = certification;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya Listrik: " + this.wattage + " Watt");
            System.out.println("Sertifikasi: " + this.certification);
        }
    }

    public class VGACard {
        String model;
        int memorySize;

        VGACard(String model, int memorySize) {
            this.model = model;
            this.memorySize = memorySize;
        }

        public void getVGACardInfo() {
            System.out.println("Model VGACard: " + this.model);
            System.out.println("Ukuran Memori: " + this.memorySize + " GB");
        }
    }
}
