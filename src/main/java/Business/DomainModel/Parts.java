/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainModel;

/**
 *
 * @author felesiah
 */
public class Parts {
    private int itemId;
    private String name; 
    private int length;
    private int ammount;

    public Parts(int itemId, String name, int length, int ammount) {
        this.itemId = itemId;
        this.name = name;
        this.length = length;
        this.ammount = ammount;
    }
 
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Parts{" + "itemId=" + itemId + ", name=" + name + ", length=" + length + ", ammount=" + ammount + '}';
    }
    
    
}
 

