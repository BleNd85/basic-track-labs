package lab5;

public abstract class Appliance {
    protected String name;
    protected Boolean isOn;
    protected Integer power;
    protected Double electromagneticRadiation;

    public Appliance(String name, Integer power, Double electromagneticRadiation) {
        this.name = name;
        this.isOn = false;
        this.power = power;
        this.electromagneticRadiation = electromagneticRadiation;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOn() {
        return isOn;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Double getElectromagneticRadiation() {
        return electromagneticRadiation;
    }

    public void setElectromagneticRadiation(Double electromagneticRadiation) {
        this.electromagneticRadiation = electromagneticRadiation;
    }

    protected String isOnToString() {
        return isOn
                ? "Увімкнений"
                : "Вимкнений";
    }

    @Override
    public String toString() {
        return "Прилад: " + name +
                ", Тип: " + getType() +
                ", Стан: " + isOnToString() +
                ", Потужність: " + power + " Вт." +
                ", Електромагнітне випромінювання: " + electromagneticRadiation + " Ггц.";
    }

    public abstract String getType();
}
