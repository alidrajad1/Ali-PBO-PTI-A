package src;
public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // Mengecek apakah suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // Menyederhanakan bilangan rasional
    public void sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        // while (B != 0) {
        //     temp = A % B;
        //     A = B;
        //     B = temp;
        // }
        for (int i = 0; B != 0; ++i) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    // Operator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    public boolean lessOrSameThan(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    public boolean moreOrSameThan(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    
    // Operator Unary Minus ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    // Operator Unary Plus += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryMinus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryMultiply(Rasional A) {
        pembilang *=A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryDivision(Rasional A) {
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
