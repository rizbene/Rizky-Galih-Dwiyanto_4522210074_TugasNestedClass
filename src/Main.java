public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(2, "SSD");
        CPU.VGACard myVGACard = myKomputer.new VGACard("NVIDIA RTX 4090", 16);
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("MSI MEG Z490 GODLIKE", "Intel Z490");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply(1000, "80 Plus Platinum");

        // memanggil method untuk menampilkan value harddisk, vga, motherboard, powersupply
        myHarddisk.getHarddiskInfo();
        myVGACard.getVGACardInfo();
        myMotherboard.getMotherboardInfo();
        myPowerSupply.getPowerSupplyInfo();
    }
}