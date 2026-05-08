package defpackage;

import defpackage.x1f;

/* JADX INFO: loaded from: classes3.dex */
public class zkg extends q4b {
    public ka6 e;

    @Override // defpackage.ka6
    public final long F0() {
        zje zjeVar = this.d;
        zjeVar.c();
        long jF0 = this.e.F0();
        if (jF0 == 0) {
            zjeVar.a(x1f.f0);
        }
        return jF0;
    }

    public final void J1(int i) {
        x1f.o oVar = x1f.Z;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        int i2 = ((x1f.i) zjeVar.b()).j0;
        if (i == i2) {
            return;
        }
        r40.l(w40.e("Incorrect length for fixed binary: expected ", i2, " but received ", i, " bytes."));
    }

    @Override // defpackage.ka6
    public final long N0() {
        x1f.o oVar = x1f.c0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        long jN0 = this.e.N0();
        if (jN0 == 0) {
            zjeVar.a(x1f.d0);
        }
        return jN0;
    }

    @Override // defpackage.ka6
    public final boolean O0() {
        this.d.a(x1f.d);
        return this.e.O0();
    }

    @Override // defpackage.ka6
    public final long S() {
        zje zjeVar = this.d;
        zjeVar.c();
        long jS = this.e.S();
        if (jS == 0) {
            zjeVar.a(x1f.d0);
        }
        return jS;
    }

    @Override // defpackage.ka6
    public final void S0(int i, byte[] bArr) {
        J1(i);
        this.e.S0(i, bArr);
    }

    @Override // defpackage.ka6
    public final int V0() {
        this.d.a(x1f.e);
        return this.e.V0();
    }

    @Override // defpackage.ka6
    public final long X0() {
        x1f.o oVar = x1f.e0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        long jX0 = this.e.X0();
        if (jX0 == 0) {
            zjeVar.a(x1f.f0);
        }
        return jX0;
    }

    @Override // defpackage.ka6
    public final void Y0() {
        this.d.a(x1f.c);
        this.e.Y0();
    }

    @Override // defpackage.ka6
    public final long e1() {
        x1f.o oVar = x1f.c0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        while (true) {
            long jE1 = this.e.e1();
            if (jE1 == 0) {
                zjeVar.a(x1f.d0);
                return 0L;
            }
            while (true) {
                long j = jE1 - 1;
                if (jE1 > 0) {
                    int i = zjeVar.c;
                    x1f[] x1fVarArr = zjeVar.b;
                    int i2 = i - 1;
                    zjeVar.c = i2;
                    zjeVar.d(x1fVarArr[i2]);
                    zjeVar.f(i);
                    jE1 = j;
                }
            }
        }
    }

    @Override // defpackage.ka6
    public final void g1(int i) {
        J1(i);
        this.e.g1(i);
    }

    @Override // defpackage.ka6
    public final long h1() {
        x1f.o oVar = x1f.e0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        while (true) {
            long jH1 = this.e.h1();
            if (jH1 == 0) {
                zjeVar.a(x1f.f0);
                return 0L;
            }
            while (true) {
                long j = jH1 - 1;
                if (jH1 > 0) {
                    int i = zjeVar.c;
                    x1f[] x1fVarArr = zjeVar.b;
                    int i2 = i - 1;
                    zjeVar.c = i2;
                    zjeVar.d(x1fVarArr[i2]);
                    zjeVar.f(i);
                    jH1 = j;
                }
            }
        }
    }
}
