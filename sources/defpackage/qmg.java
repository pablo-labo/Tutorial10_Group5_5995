package defpackage;

import defpackage.ge0;
import defpackage.oh5;

/* JADX INFO: loaded from: classes.dex */
public final class qmg<V extends ge0> {
    public final npe a;
    public V b;
    public V c;
    public V d;
    public final float e = 0.0f;

    public qmg(npe npeVar) {
        this.a = npeVar;
    }

    public final float a() {
        return this.e;
    }

    public final V b(V v, V v2) {
        qmg<V> qmgVar = this;
        if (qmgVar.d == null) {
            qmgVar.d = (V) v.c();
        }
        V v3 = qmgVar.d;
        if (v3 == null) {
            wl7.g("targetVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = qmgVar.d;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                wl7.g("targetVector");
                throw null;
            }
            if (v4 == null) {
                wl7.g("targetVector");
                throw null;
            }
            float fA = v.a(i);
            float fA2 = v2.a(i);
            oh5 oh5Var = qmgVar.a.a;
            double dB = oh5Var.b(fA2);
            double d = ph5.a;
            float f = oh5Var.a * oh5Var.c;
            v4.e((Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) f)))) + fA, i);
            i++;
            qmgVar = this;
            iB = iB;
        }
    }

    public final V c(long j, V v, V v2) {
        if (this.c == null) {
            this.c = (V) v.c();
        }
        V v3 = this.c;
        if (v3 == null) {
            wl7.g("velocityVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = this.c;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                wl7.g("velocityVector");
                throw null;
            }
            if (v4 == null) {
                wl7.g("velocityVector");
                throw null;
            }
            v.getClass();
            long j2 = j / 1000000;
            oh5.a aVarA = this.a.a.a(v2.a(i));
            long j3 = aVarA.c;
            v4.e((((Math.signum(aVarA.a) * l70.a(j3 > 0 ? j2 / j3 : 1.0f).b) * aVarA.b) / j3) * 1000.0f, i);
            i++;
        }
    }
}
