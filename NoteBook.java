public class NoteBook{
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private String brand;
    private String model;

    public NoteBook(String model,String brand){
        this.model = model;
        this.brand = brand;
    }
    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Integer getHDD(){
        return this.HDD;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }

    public void Color(String color){
        this.color =color;
    }
    public void RAM(Integer RAM){
        this.RAM = RAM;
    }
    public void OS(String OS){
        this.OS = OS;
    }
    public void HDD(Integer HDD){
        this.HDD = HDD;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Ноутбук: " + this.brand + " " + this.model + ", color: " + this.color + ", OS: " + this.OS + ", HDD "+this.HDD + ", RAM " + this.RAM);
    
        return(sb.toString());
    }
}