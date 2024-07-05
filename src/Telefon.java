class Telefon {
    private String marka;
    private String model;
    private String numerTelefonu;
    private double przekatnaEkranu;
    public Telefon(String marka, String model, String numerTelefonu,double przekatnaEkranu) {
        this.marka = marka;
        this.model = model;
        this.numerTelefonu = numerTelefonu;
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public double getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }
}





