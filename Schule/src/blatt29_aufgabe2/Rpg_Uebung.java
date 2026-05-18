package blatt29_aufgabe2;

public class Rpg_Uebung {
    private int staerke;
    private int konstitution;
    private int mStaerke;
    private int mVerteidigung;
    private int HP;
    private int MP;
    private int SP;
    private int geschwindigkeit;
    private int glueck;

    public int getStaerke() {
        return staerke;
    }

    public int getKonstitution() {
        return konstitution;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public void setKonstitution(int konstitution) {
        this.konstitution = konstitution;
    }

    public void setmStaerke(int mStaerke) {
        this.mStaerke = mStaerke;
    }

    public void setmVerteidigung(int mVerteidigung) {
        this.mVerteidigung = mVerteidigung;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void setGlueck(int glueck) {
        this.glueck = glueck;
    }

    public int getGlueck() {
        return glueck;
    }

    public int getmStaerke() {
        return mStaerke;
    }

    public int getmVerteidigung() {
        return mVerteidigung;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getSP() {
        return SP;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public Rpg_Uebung(int staerke, int konstitution, int mStaerke, int mVerteidigung, int HP, int MP, int SP, int geschwindigkeit, int glueck) {
        this.staerke = staerke;
        this.konstitution = konstitution;
        this.mStaerke = mStaerke;
        this.mVerteidigung = mVerteidigung;
        this.HP = HP;
        this.MP = MP;
        this.SP = SP;
        this.geschwindigkeit = geschwindigkeit;
        this.glueck = glueck;
    }

    public void angreifen(int gegnerHP) {
        int schaden = this.staerke * 4;
        schaden =- 2 * this.konstitution;
        gegnerHP =- schaden;
    }


}
