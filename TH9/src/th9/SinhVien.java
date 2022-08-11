package th9;

public abstract class SinhVien {
    protected String ma, ht;
    protected boolean gt;

    public SinhVien() {
    }

    public SinhVien(String ma, String ht, boolean gt) {
        this.ma = ma;
        this.ht = ht;
        
        this.gt = gt;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }
    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }
    
    public abstract double diemtrungbinh();
    
    public String hocluc()
    {
        double dtb=diemtrungbinh();
        if(dtb>=9) return "xuat sac";
        if(dtb>=8) return "gioi";
        if(dtb>=6.5) return "kha";
        if(dtb>=5) return "truung binh";
        if(dtb>=3) return "yeu";
        return "kem";
    }
    @Override
    public String toString() {
         return this.getClass().getName()+ ma + " " + ht + " " + " " + (gt ? "Nam" : "Nu" ) + " " + diemtrungbinh()+" " +hocluc();
    }
    
}

