public class Card {
	
    String soortkaart;
    String name;
    int waarde;
    
    public Card (String soortkaart, String name, int waarde) {
        this.name = name;
        this.soortkaart = soortkaart;
        this.waarde = waarde;   
    }
    
    @Override
    public String toString(){
        return name + " " + soortkaart;
    }

    public String getSoortkaart() {
        return soortkaart;
    }

    public int getWaarde() {
        return waarde;
    }

}
