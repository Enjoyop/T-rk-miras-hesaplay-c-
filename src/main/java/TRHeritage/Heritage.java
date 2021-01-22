package TRheritage;

public class Heritage {

    private float _heritage;

    private float _shareOfSpouse;
    private float _shareOfToplineage;
    private float _shareOfSublineage;
    private float _shareOfTreasure;

    public void calculate(float miras, byte es, short altSoySayisi, short ustSoySayisi)
    {

        if (miras > 0)
        {
            this._heritage = miras;
            float kalanMiras = 0;

            if (es == 1) {

                if (altSoySayisi > 0) {
                    this._shareOfToplineage = 0;
                    this._shareOfSpouse = _heritage / 4;
                    kalanMiras = _heritage - this._shareOfSpouse;
                    this._shareOfSublineage = kalanMiras / altSoySayisi;
                }

                else if (altSoySayisi == 0) {
                    this._shareOfSublineage = 0;

                    if (ustSoySayisi > 0) {
                        this._shareOfSpouse = _heritage / 2;
                        kalanMiras = miras = this._shareOfSpouse;
                        this._shareOfToplineage = kalanMiras / ustSoySayisi;
                    }

                    else {
                        this._shareOfSpouse = _heritage;
                        kalanMiras = 0;
                    }
                }

                else if (altSoySayisi < 0) {
                    System.out.println("Alt Soy sayısı 0 dan küçük olamaz.");
                }
            }

            else if (es == 0) {

                if (altSoySayisi > 0) {
                    this._shareOfToplineage = 0;
                    this._shareOfSpouse = 0;
                    this._shareOfSublineage = this._heritage / altSoySayisi;
                }

                else if (altSoySayisi == 0 && ustSoySayisi > 0) {
                    this._shareOfSublineage = 0;
                    this._shareOfSpouse = _heritage / 2;
                    kalanMiras = this._heritage - this._shareOfSpouse;
                    this._shareOfToplineage = kalanMiras / ustSoySayisi;
                }

                else {
                    this._heritage = this._shareOfTreasure;
                }
            }
        }

        else {
            System.out.println("Varislere kalan mirası ya yanlış girdiniz (miras 0 dan küçük) yada Varislere miras değil borç kaldı :-)");
        }
    }

    public float getMiras() {
        return this._heritage;
    }

    public float getEsHakki() {
        return this._shareOfSpouse;
    }

    public float getUstSoyHakki() {
        return this._shareOfToplineage;
    }

    public float getAltSoyKakki() {
        return this._shareOfSublineage;
    }

    public float getHazineyeDevredilen() {
        return this._shareOfTreasure;
    }
}
