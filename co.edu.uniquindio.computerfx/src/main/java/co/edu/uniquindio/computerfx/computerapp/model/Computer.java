package co.edu.uniquindio.computerfx.computerapp.model;
public class Computer {
    private String processor;
    private int memoryRAM;
    private int powerSource;
    private int ssd;
    private String graphicCard;
    private String motherBoard;
    private double velocityMemoryRam;
    private String generationProssesor;
    private String modelMotherboard;

    public Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public int getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(int powerSource) {
        this.powerSource = powerSource;
    }

    public int getSsd() {
        return ssd;
    }

    public double getVelocityMemoryRam() {
        return velocityMemoryRam;
    }

    public void setVelocityMemoryRam(double velocityMemoryRam) {
        this.velocityMemoryRam = velocityMemoryRam;
    }

    public String getGenerationProssesor() {
        return generationProssesor;
    }

    public void setGenerationProssesor(String generationProssesor) {
        this.generationProssesor = generationProssesor;
    }

    public String getModelMotherboard() {
        return modelMotherboard;
    }

    public void setModelMotherboard(String modelMotherboard) {
        this.modelMotherboard = modelMotherboard;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memoryRAM=" + memoryRAM +
                ", powerSource=" + powerSource +
                ", ssd=" + ssd +
                ", graphicCard='" + graphicCard + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", velocityMemoryRam=" + velocityMemoryRam +
                ", generationProssesor='" + generationProssesor + '\'' +
                ", modelMotherboard='" + modelMotherboard + '\'' +
                '}';
    }
}
