package modelo;

public class ingresodatosgetset2 {
    
        private String EmSerEmId;
	private String EmSerSerCod;
	private String EmSerFH;

    public ingresodatosgetset2(String EmSerEmId, String EmSerSerCod, String EmSerFH) {
        this.EmSerEmId = EmSerEmId;
        this.EmSerSerCod = EmSerSerCod;
        this.EmSerFH = EmSerFH;
    }

      public ingresodatosgetset2(){
    
}
    
    public String getEmSerEmId() {
        return EmSerEmId;
    }

    public void setEmSerEmId(String EmSerEmId) {
        this.EmSerEmId = EmSerEmId;
    }

    public String getEmSerSerCod() {
        return EmSerSerCod;
    }

    public void setEmSerSerCod(String EmSerSerCod) {
        this.EmSerSerCod = EmSerSerCod;
    }

    public String getEmSerFH() {
        return EmSerFH;
    }

    public void setEmSerFH(String EmSerFH) {
        this.EmSerFH = EmSerFH;
    }
        
        
}
