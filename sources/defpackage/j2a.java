package defpackage;

import defpackage.pva;
import defpackage.vr1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j2a implements Closeable {
    public b V;
    public final pva W;
    public final to1 a;
    public final vr1 b;
    public final vr1 c;
    public int d;
    public boolean e;
    public boolean f;

    public static final class a implements Closeable {
        public final uqc a;

        public a(ArrayList arrayList, uqc uqcVar) {
            this.a = uqcVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.a.close();
        }
    }

    public final class b implements pne {
        public b() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            j2a j2aVar = j2a.this;
            if (wl7.b(j2aVar.V, this)) {
                j2aVar.V = null;
            }
        }

        @Override // defpackage.pne
        public final long f1(zn1 zn1Var, long j) {
            zn1Var.getClass();
            if (j < 0) {
                h5.k(r6.c(j, "byteCount < 0: "));
                return 0L;
            }
            j2a j2aVar = j2a.this;
            if (!wl7.b(j2aVar.V, this)) {
                r6.g("closed");
                return 0L;
            }
            long jA = j2aVar.a(j);
            if (jA == 0) {
                return -1L;
            }
            return j2aVar.a.f1(zn1Var, jA);
        }

        @Override // defpackage.pne
        public final kmf g() {
            return j2a.this.a.g();
        }
    }

    public j2a(to1 to1Var, String str) {
        this.a = to1Var;
        zn1 zn1Var = new zn1();
        zn1Var.Q0("--");
        zn1Var.Q0(str);
        this.b = zn1Var.J0(zn1Var.b);
        zn1 zn1Var2 = new zn1();
        zn1Var2.Q0("\r\n--");
        zn1Var2.Q0(str);
        this.c = zn1Var2.J0(zn1Var2.b);
        vr1 vr1Var = vr1.c;
        this.W = pva.a.b(vr1.a.c("\r\n--" + str + "--"), vr1.a.c("\r\n"), vr1.a.c("--"), vr1.a.c(" "), vr1.a.c("\t"));
    }

    public final long a(long j) {
        vr1 vr1Var = this.c;
        long jH = vr1Var.h();
        to1 to1Var = this.a;
        to1Var.x0(jH);
        zn1 zn1VarF = to1Var.f();
        zn1VarF.getClass();
        long jW = zn1VarF.W(0L, vr1Var);
        return jW == -1 ? Math.min(j, (to1Var.f().b - ((long) vr1Var.h())) + 1) : Math.min(j, jW);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        this.V = null;
        this.a.close();
    }
}
