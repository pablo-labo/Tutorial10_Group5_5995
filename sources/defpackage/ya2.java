package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya2 {
    public static final float[] a;
    public static final float[] b;
    public static final hrf c;
    public static final hrf d;
    public static final abd e;
    public static final abd f;
    public static final abd g;
    public static final abd h;
    public static final abd i;
    public static final abd j;
    public static final abd k;
    public static final abd l;
    public static final abd m;
    public static final abd n;
    public static final abd o;
    public static final abd p;
    public static final abd q;
    public static final abd r;
    public static final y5h s;
    public static final jj8 t;
    public static final abd u;
    public static final abd v;
    public static final abd w;
    public static final qpa x;
    public static final ta2[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        hrf hrfVar = new hrf(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        hrf hrfVar2 = new hrf(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        hrf hrfVar3 = new hrf(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = hrfVar3;
        hrf hrfVar4 = new hrf(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = hrfVar4;
        bzg bzgVar = boa.W;
        abd abdVar = new abd("sRGB IEC61966-2.1", fArr, bzgVar, hrfVar, 0);
        e = abdVar;
        abd abdVar2 = new abd("sRGB IEC61966-2.1 (Linear)", fArr, bzgVar, 1.0d, 0.0f, 1.0f, 1);
        f = abdVar2;
        int i2 = 4;
        abd abdVar3 = new abd("scRGB-nl IEC 61966-2-2:2003", fArr, bzgVar, null, new s40(), new k20(i2), -0.799f, 2.399f, hrfVar, 2);
        g = abdVar3;
        abd abdVar4 = new abd("scRGB IEC 61966-2-2:2003", fArr, bzgVar, 1.0d, -0.5f, 7.499f, 3);
        h = abdVar4;
        abd abdVar5 = new abd("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, bzgVar, new hrf(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = abdVar5;
        abd abdVar6 = new abd("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, bzgVar, new hrf(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = abdVar6;
        abd abdVar7 = new abd("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new bzg(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = abdVar7;
        abd abdVar8 = new abd("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, bzgVar, hrfVar, 7);
        l = abdVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        abd abdVar9 = new abd("NTSC (1953)", fArr2, boa.e, new hrf(d4, d5, d6, d2, d3), 8);
        m = abdVar9;
        abd abdVar10 = new abd("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, bzgVar, new hrf(d4, d5, d6, d2, d3), 9);
        n = abdVar10;
        abd abdVar11 = new abd("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, bzgVar, 2.2d, 0.0f, 1.0f, 10);
        o = abdVar11;
        abd abdVar12 = new abd("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, boa.f, new hrf(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = abdVar12;
        bzg bzgVar2 = boa.V;
        abd abdVar13 = new abd("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, bzgVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = abdVar13;
        abd abdVar14 = new abd("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, bzgVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = abdVar14;
        y5h y5hVar = new y5h("Generic XYZ", 12884901889L, 14);
        s = y5hVar;
        jj8 jj8Var = new jj8("Generic L*a*b*", 12884901890L, 15);
        t = jj8Var;
        abd abdVar15 = new abd("None", fArr, bzgVar, hrfVar2, 16);
        u = abdVar15;
        int i3 = 5;
        abd abdVar16 = new abd("Hybrid Log Gamma encoding", fArr3, bzgVar, null, new h5(i3), new l5(i2), 0.0f, 1.0f, hrfVar3, 17);
        v = abdVar16;
        abd abdVar17 = new abd("Perceptual Quantizer encoding", fArr3, bzgVar, null, new g7(i3), new t40(2), 0.0f, 1.0f, hrfVar4, 18);
        w = abdVar17;
        qpa qpaVar = new qpa("Oklab", 12884901890L, 19);
        x = qpaVar;
        y = new ta2[]{abdVar, abdVar2, abdVar3, abdVar4, abdVar5, abdVar6, abdVar7, abdVar8, abdVar9, abdVar10, abdVar11, abdVar12, abdVar13, abdVar14, y5hVar, jj8Var, abdVar15, abdVar16, abdVar17, qpaVar};
    }

    public static double a(hrf hrfVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = hrfVar.b;
        double d6 = hrfVar.c;
        double d7 = hrfVar.d;
        double d8 = hrfVar.e;
        double d9 = hrfVar.f;
        double d10 = d5 * d4;
        return (hrfVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(hrf hrfVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / hrfVar.b;
        double d5 = 1.0d / hrfVar.c;
        double d6 = 1.0d / hrfVar.d;
        double d7 = hrfVar.e;
        double d8 = hrfVar.f;
        double d9 = (d2 * d3) / (hrfVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(hrf hrfVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = hrfVar.b;
        double d6 = hrfVar.d;
        double dPow = (Math.pow(d4, d6) * hrfVar.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * hrfVar.f) + hrfVar.e), hrfVar.g) * d3;
    }

    public static double d(hrf hrfVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -hrfVar.b;
        double d6 = hrfVar.e;
        double d7 = 1.0d / hrfVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-hrfVar.f)) + hrfVar.c), 1.0d / hrfVar.d) * d3;
    }
}
