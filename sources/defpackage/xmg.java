package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xmg {
    public final boolean a;
    public final a b;
    public final int c;
    public final se3[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("Lsq2", 0);
            a = aVar;
            a aVar2 = new a("Impulse", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public xmg(boolean z, a aVar) {
        int i;
        this.a = z;
        this.b = aVar;
        if (z && aVar.equals(a.a)) {
            r6.g("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                l.g();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new se3[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        se3[] se3VarArr = this.d;
        se3 se3Var = se3VarArr[i];
        if (se3Var != null) {
            se3Var.a = j;
            se3Var.b = f;
        } else {
            se3 se3Var2 = new se3();
            se3Var2.a = j;
            se3Var2.b = f;
            se3VarArr[i] = se3Var2;
        }
    }

    public final float b(float f) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            ae7.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        se3[] se3VarArr = this.d;
        se3 se3Var = se3VarArr[i2];
        if (se3Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            se3 se3Var2 = se3Var;
            while (true) {
                se3 se3Var3 = se3VarArr[i2];
                boolean z2 = this.a;
                aVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (se3Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = se3Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = se3Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - se3Var2.a);
                se3Var2 = (aVar == a.a || z) ? se3Var3 : se3Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = se3Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        beb.l(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        l.g();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ xmg() {
        this(false, a.a);
    }

    public xmg(int i) {
        this(true, a.b);
    }
}
