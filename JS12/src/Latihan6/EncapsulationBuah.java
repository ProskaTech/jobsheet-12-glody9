//Created by 21343077_Glody Syah Rabbynawa
package Latihan6;

public class EncapsulationBuah {
    
    // Data member of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    // Declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah)
    {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    // Declaring Setter for all fields
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    
     // Declaring Getter for all fields
    public String getName()
    {
        return namaBuah;
    }
    public String getPrice()
    {
        return hargaBuah;
    }
    public String getColor()
    {
        return warnaBuah;
    }
}
