package com.facebook.react.uimanager;

import defpackage.hh1;
import defpackage.w40;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: com.facebook.react.uimanager.a$a, reason: collision with other inner class name */
    public static class C0134a {
        public final double[] a = new double[4];
        public final double[] b = new double[3];
        public final double[] c = new double[3];
        public final double[] d = new double[3];
        public final double[] e = new double[3];

        /* JADX INFO: renamed from: com.facebook.react.uimanager.a$a$a, reason: collision with other inner class name */
        public static final class C0135a {
            public static final void a(double[] dArr) {
                int length = dArr.length;
                for (int i = 0; i < length; i++) {
                    dArr[i] = 0.0d;
                }
            }
        }
    }

    public static final void a(double[] dArr, C0134a c0134a) {
        char c;
        dArr.getClass();
        c0134a.getClass();
        hh1.l(dArr.length == 16);
        double[] dArr2 = c0134a.a;
        double[] dArr3 = c0134a.b;
        double[] dArr4 = c0134a.c;
        double[] dArr5 = c0134a.d;
        double[] dArr6 = c0134a.e;
        if (c(dArr[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i = 0; i < 4; i++) {
            dArr7[i] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = (i2 * 4) + i3;
                double d = dArr[i4] / dArr[15];
                dArr7[i2][i3] = d;
                if (i3 == 3) {
                    d = 0.0d;
                }
                dArr8[i4] = d;
            }
        }
        dArr8[15] = 1.0d;
        if (c(b(dArr8))) {
            return;
        }
        if (c(dArr7[0][3]) && c(dArr7[1][3]) && c(dArr7[2][3])) {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
            c = 2;
        } else {
            double[] dArr9 = {dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]};
            double dB = b(dArr8);
            if (c(dB)) {
                c = 2;
            } else {
                double d2 = dArr8[0];
                double d3 = dArr8[1];
                double d4 = dArr8[2];
                double d5 = dArr8[3];
                double d6 = dArr8[4];
                double d7 = dArr8[5];
                double d8 = dArr8[6];
                double d9 = dArr8[7];
                double d10 = dArr8[8];
                double d11 = dArr8[9];
                double d12 = dArr8[10];
                double d13 = dArr8[11];
                double d14 = dArr8[12];
                double d15 = dArr8[13];
                double d16 = dArr8[14];
                double d17 = dArr8[15];
                double d18 = d8 * d13;
                double d19 = d9 * d12;
                double d20 = d9 * d11;
                double d21 = d7 * d13;
                double d22 = d8 * d11;
                double d23 = d7 * d12;
                double d24 = ((d23 * d17) + ((((d20 * d16) + ((d18 * d15) - (d19 * d15))) - (d21 * d16)) - (d22 * d17))) / dB;
                double d25 = d5 * d12;
                double d26 = d4 * d13;
                double d27 = d5 * d11;
                double d28 = d3 * d13;
                double d29 = d4 * d11;
                double d30 = (d29 * d17) + (d28 * d16) + (((d25 * d15) - (d26 * d15)) - (d27 * d16));
                double d31 = d3 * d12;
                double d32 = d4 * d9;
                double d33 = d5 * d8;
                double d34 = d5 * d7;
                double d35 = d3 * d9;
                double d36 = d4 * d7;
                double d37 = d3 * d8;
                double d38 = ((d37 * d17) + ((((d34 * d16) + ((d32 * d15) - (d33 * d15))) - (d35 * d16)) - (d36 * d17))) / dB;
                double d39 = (((d36 * d13) + ((d35 * d12) + (((d33 * d11) - (d32 * d11)) - (d34 * d12)))) - (d37 * d13)) / dB;
                double d40 = (d19 * d14) - (d18 * d14);
                double d41 = d9 * d10;
                double d42 = d6 * d13;
                double d43 = (d42 * d16) + (d40 - (d41 * d16));
                double d44 = d8 * d10;
                double d45 = (d44 * d17) + d43;
                double d46 = d6 * d12;
                double d47 = (d26 * d14) - (d25 * d14);
                double d48 = d5 * d10;
                double d49 = (d48 * d16) + d47;
                double d50 = d2 * d13;
                double d51 = d4 * d10;
                double d52 = d2 * d12;
                double d53 = ((d52 * d17) + ((d49 - (d50 * d16)) - (d51 * d17))) / dB;
                double d54 = d5 * d6;
                double d55 = d9 * d2;
                double d56 = d4 * d6;
                double d57 = d8 * d2;
                double d58 = (((d56 * d17) + ((d55 * d16) + (((d33 * d14) - (d32 * d14)) - (d54 * d16)))) - (d57 * d17)) / dB;
                double d59 = ((d57 * d13) + ((((d54 * d12) + ((d32 * d10) - (d33 * d10))) - (d55 * d12)) - (d56 * d13))) / dB;
                double d60 = ((d41 * d15) + ((d21 * d14) - (d20 * d14))) - (d42 * d15);
                double d61 = d7 * d10;
                double d62 = d6 * d11;
                double d63 = ((d62 * d17) + (d60 - (d61 * d17))) / dB;
                double d64 = d3 * d10;
                double d65 = (d64 * d17) + (d50 * d15) + (((d27 * d14) - (d28 * d14)) - (d48 * d15));
                double d66 = d2 * d11;
                double d67 = d3 * d6;
                double d68 = d2 * d7;
                c = 2;
                dArr8 = new double[]{d24, (d30 - (d31 * d17)) / dB, d38, d39, (d45 - (d46 * d17)) / dB, d53, d58, d59, d63, (d65 - (d66 * d17)) / dB, ((d17 * d68) + ((((d54 * d15) + ((d35 * d14) - (d34 * d14))) - (d55 * d15)) - (d67 * d17))) / dB, (((d67 * d13) + ((d55 * d11) + (((d34 * d10) - (d35 * d10)) - (d54 * d11)))) - (d13 * d68)) / dB, (((d61 * d16) + ((d46 * d15) + (((d22 * d14) - (d23 * d14)) - (d44 * d15)))) - (d62 * d16)) / dB, ((d66 * d16) + ((((d51 * d15) + ((d31 * d14) - (d29 * d14))) - (d52 * d15)) - (d64 * d16))) / dB, (((d67 * d16) + ((d15 * d57) + (((d36 * d14) - (d14 * d37)) - (d56 * d15)))) - (d16 * d68)) / dB, ((d68 * d12) + ((((d56 * d11) + ((d37 * d10) - (d36 * d10))) - (d57 * d11)) - (d67 * d12))) / dB};
            }
            double d69 = dArr8[0];
            double d70 = dArr8[4];
            double d71 = dArr8[8];
            double d72 = dArr8[12];
            double d73 = dArr8[1];
            double d74 = dArr8[5];
            double d75 = dArr8[9];
            double d76 = dArr8[13];
            double d77 = dArr8[c];
            double d78 = dArr8[6];
            double d79 = dArr8[10];
            double d80 = dArr8[14];
            double d81 = dArr8[3];
            double d82 = dArr8[7];
            double d83 = dArr8[11];
            double d84 = dArr8[15];
            double[] dArr10 = new double[16];
            dArr10[0] = d69;
            dArr10[1] = d70;
            dArr10[c] = d71;
            dArr10[3] = d72;
            dArr10[4] = d73;
            dArr10[5] = d74;
            dArr10[6] = d75;
            dArr10[7] = d76;
            dArr10[8] = d77;
            dArr10[9] = d78;
            dArr10[10] = d79;
            dArr10[11] = d80;
            dArr10[12] = d81;
            dArr10[13] = d82;
            dArr10[14] = d83;
            dArr10[15] = d84;
            double d85 = dArr9[0];
            double d86 = dArr9[1];
            double d87 = dArr9[c];
            double d88 = dArr9[3];
            dArr2[0] = (dArr10[12] * d88) + (dArr10[8] * d87) + (dArr10[4] * d86) + (dArr10[0] * d85);
            dArr2[1] = (dArr10[13] * d88) + (dArr10[9] * d87) + (dArr10[5] * d86) + (dArr10[1] * d85);
            dArr2[c] = (dArr10[14] * d88) + (dArr10[10] * d87) + (dArr10[6] * d86) + (dArr10[c] * d85);
            dArr2[3] = (d88 * dArr10[15]) + (d87 * dArr10[11]) + (d86 * dArr10[7]) + (d85 * dArr10[3]);
        }
        for (int i5 = 0; i5 < 3; i5++) {
            dArr5[i5] = dArr7[3][i5];
        }
        double[][] dArr11 = new double[3][];
        for (int i6 = 0; i6 < 3; i6++) {
            dArr11[i6] = new double[3];
        }
        for (int i7 = 0; i7 < 3; i7++) {
            double[] dArr12 = dArr11[i7];
            double[] dArr13 = dArr7[i7];
            dArr12[0] = dArr13[0];
            dArr12[1] = dArr13[1];
            dArr12[c] = dArr13[c];
        }
        double dH = h(dArr11[0]);
        dArr3[0] = dH;
        double[] dArrI = i(dH, dArr11[0]);
        dArr11[0] = dArrI;
        double dG = g(dArrI, dArr11[1]);
        dArr4[0] = dG;
        double[] dArrF = f(dArr11[1], dArr11[0], -dG);
        dArr11[1] = dArrF;
        double dH2 = h(dArrF);
        dArr3[1] = dH2;
        dArr11[1] = i(dH2, dArr11[1]);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dG2 = g(dArr11[0], dArr11[c]);
        dArr4[1] = dG2;
        double[] dArrF2 = f(dArr11[c], dArr11[0], -dG2);
        dArr11[c] = dArrF2;
        double dG3 = g(dArr11[1], dArrF2);
        dArr4[c] = dG3;
        double[] dArrF3 = f(dArr11[c], dArr11[1], -dG3);
        dArr11[c] = dArrF3;
        double dH3 = h(dArrF3);
        dArr3[c] = dH3;
        double[] dArrI2 = i(dH3, dArr11[c]);
        dArr11[c] = dArrI2;
        double d89 = dArr4[1];
        double d90 = dArr3[c];
        dArr4[1] = d89 / d90;
        dArr4[c] = dArr4[c] / d90;
        double[] dArr14 = dArr11[1];
        dArr14.getClass();
        double d91 = dArr14[1];
        double d92 = dArrI2[c];
        double d93 = dArr14[c];
        double d94 = dArrI2[1];
        double d95 = dArrI2[0];
        double d96 = dArr14[0];
        double[] dArr15 = new double[3];
        dArr15[0] = (d91 * d92) - (d93 * d94);
        dArr15[1] = (d93 * d95) - (d92 * d96);
        dArr15[c] = (d96 * d94) - (d91 * d95);
        if (g(dArr11[0], dArr15) < 0.0d) {
            for (int i8 = 0; i8 < 3; i8++) {
                dArr3[i8] = dArr3[i8] * (-1.0d);
                double[] dArr16 = dArr11[i8];
                dArr16[0] = dArr16[0] * (-1.0d);
                dArr16[1] = dArr16[1] * (-1.0d);
                dArr16[c] = dArr16[c] * (-1.0d);
            }
        }
        double[] dArr17 = dArr11[c];
        dArr6[0] = Math.round((-Math.atan2(dArr17[1], dArr17[c])) * 57.29577951308232d * 1000.0d) * 0.001d;
        double[] dArr18 = dArr11[c];
        double d97 = -dArr18[0];
        double d98 = dArr18[1];
        double d99 = dArr18[c];
        dArr6[1] = Math.round((-Math.atan2(d97, Math.sqrt((d99 * d99) + (d98 * d98)))) * 57.29577951308232d * 1000.0d) * 0.001d;
        dArr6[c] = Math.round((-Math.atan2(dArr11[1][0], dArr11[0][0])) * 57.29577951308232d * 1000.0d) * 0.001d;
    }

    public static final double b(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double dB = w40.b(d20, d11, d13, (((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13));
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double dB2 = w40.b(d18, d9, d14, (w40.b(d21, d12, d13, dB) - ((d22 * d12) * d13)) - ((d17 * d9) * d14));
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return w40.b(d28, d11, d16, (w40.b(d25, d10, d16, w40.b(d22, d9, d16, (w40.b(d27, d12, d15, w40.b(d24, d10, d15, (w40.b(d19, d9, d15, w40.b(d26, d12, d14, (w40.b(d23, d11, d14, dB2) - ((d24 * d11) * d14)) - ((d25 * d12) * d14))) - ((d20 * d9) * d15)) - ((d23 * d10) * d15))) - ((d28 * d12) * d15)) - ((d21 * d9) * d16))) - ((d26 * d10) * d16)) - ((d27 * d11) * d16));
    }

    public static boolean c(double d) {
        return !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    public static final void d(double[] dArr, double[] dArr2, double[] dArr3) {
        dArr.getClass();
        dArr2.getClass();
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        double d5 = dArr2[4];
        double d6 = dArr2[5];
        double d7 = dArr2[6];
        double d8 = dArr2[7];
        double d9 = dArr2[8];
        double d10 = dArr2[9];
        double d11 = dArr2[10];
        double d12 = dArr2[11];
        double d13 = dArr2[12];
        double d14 = dArr2[13];
        double d15 = dArr2[14];
        double d16 = dArr2[15];
        double d17 = dArr3[0];
        double d18 = dArr3[1];
        double d19 = dArr3[2];
        double d20 = dArr3[3];
        dArr[0] = (d20 * d13) + (d19 * d9) + (d18 * d5) + (d17 * d);
        dArr[1] = (d20 * d14) + (d19 * d10) + (d18 * d6) + (d17 * d2);
        dArr[2] = (d20 * d15) + (d19 * d11) + (d18 * d7) + (d17 * d3);
        double d21 = d19 * d12;
        double d22 = d20 * d16;
        dArr[3] = d22 + d21 + (d18 * d8) + (d17 * d4);
        double d23 = dArr3[4];
        double d24 = dArr3[5];
        double d25 = dArr3[6];
        double d26 = dArr3[7];
        dArr[4] = (d26 * d13) + (d25 * d9) + (d24 * d5) + (d23 * d);
        dArr[5] = (d26 * d14) + (d25 * d10) + (d24 * d6) + (d23 * d2);
        dArr[6] = (d26 * d15) + (d25 * d11) + (d24 * d7) + (d23 * d3);
        double d27 = d25 * d12;
        double d28 = d26 * d16;
        dArr[7] = d28 + d27 + (d24 * d8) + (d23 * d4);
        double d29 = dArr3[8];
        double d30 = dArr3[9];
        double d31 = dArr3[10];
        double d32 = dArr3[11];
        dArr[8] = (d32 * d13) + (d31 * d9) + (d30 * d5) + (d29 * d);
        dArr[9] = (d32 * d14) + (d31 * d10) + (d30 * d6) + (d29 * d2);
        dArr[10] = (d32 * d15) + (d31 * d11) + (d30 * d7) + (d29 * d3);
        double d33 = d31 * d12;
        double d34 = d32 * d16;
        dArr[11] = d34 + d33 + (d30 * d8) + (d29 * d4);
        double d35 = dArr3[12];
        double d36 = dArr3[13];
        double d37 = dArr3[14];
        double d38 = dArr3[15];
        double d39 = d9 * d37;
        double d40 = d13 * d38;
        dArr[12] = d40 + d39 + (d5 * d36) + (d * d35);
        double d41 = d10 * d37;
        double d42 = d14 * d38;
        dArr[13] = d42 + d41 + (d6 * d36) + (d2 * d35);
        double d43 = d11 * d37;
        double d44 = d15 * d38;
        dArr[14] = d44 + d43 + (d7 * d36) + (d3 * d35);
        double d45 = d37 * d12;
        double d46 = d38 * d16;
        dArr[15] = d46 + d45 + (d36 * d8) + (d35 * d4);
    }

    public static final void e(double[] dArr) {
        dArr.getClass();
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    public static final double[] f(double[] dArr, double[] dArr2, double d) {
        dArr.getClass();
        dArr2.getClass();
        return new double[]{(dArr2[0] * d) + (dArr[0] * 1.0d), (dArr2[1] * d) + (dArr[1] * 1.0d), (d * dArr2[2]) + (1.0d * dArr[2])};
    }

    public static final double g(double[] dArr, double[] dArr2) {
        dArr.getClass();
        dArr2.getClass();
        return (dArr[2] * dArr2[2]) + (dArr[1] * dArr2[1]) + (dArr[0] * dArr2[0]);
    }

    public static final double h(double[] dArr) {
        dArr.getClass();
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = (d2 * d2) + (d * d);
        double d4 = dArr[2];
        return Math.sqrt((d4 * d4) + d3);
    }

    public static final double[] i(double d, double[] dArr) {
        dArr.getClass();
        if (c(d)) {
            d = h(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }
}
