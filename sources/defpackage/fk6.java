package defpackage;

import androidx.compose.ui.e;
import defpackage.bpf;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class fk6 extends e.c implements jtf, dfb, nm2 {
    public n94 d0;
    public ueb e0;
    public boolean f0;

    public static final class a extends mj8 implements Function1<fk6, itf> {
        final /* synthetic */ huc $hasIconRightsOverDescendants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(huc hucVar) {
            super(1);
            this.$hasIconRightsOverDescendants = hucVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final itf invoke(fk6 fk6Var) {
            if (!fk6Var.f0) {
                return itf.a;
            }
            this.$hasIconRightsOverDescendants.element = false;
            return itf.c;
        }
    }

    public fk6(ueb uebVar, n94 n94Var) {
        this.d0 = n94Var;
        this.e0 = uebVar;
    }

    @Override // defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        if (pebVar == peb.b) {
            List<yeb> list = nebVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (f2(list.get(i).i)) {
                    int i2 = nebVar.e;
                    if (i2 == 4) {
                        this.f0 = true;
                        e2();
                        return;
                    } else {
                        if (i2 == 5) {
                            g2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.dfb
    public final long R0() {
        if (this.d0 == null) {
            return bpf.a;
        }
        iy3 iy3Var = us3.f(this).m0;
        int i = bpf.b;
        return bpf.a.b(iy3Var.x0(10.0f), iy3Var.x0(40.0f), iy3Var.x0(10.0f), iy3Var.x0(40.0f));
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        g2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c2() {
        ueb uebVar;
        luc lucVar = new luc();
        pg8.X(this, new gk6(lucVar));
        fk6 fk6Var = (fk6) lucVar.element;
        if (fk6Var == null || (uebVar = fk6Var.e0) == null) {
            uebVar = this.e0;
        }
        d2(uebVar);
    }

    public abstract void d2(ueb uebVar);

    public final void e2() {
        huc hucVar = new huc();
        hucVar.element = true;
        pg8.Y(this, new a(hucVar));
        if (hucVar.element) {
            c2();
        }
    }

    @Override // defpackage.dfb
    public final void f1() {
        g2();
    }

    public abstract boolean f2(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void g2() {
        if (this.f0) {
            this.f0 = false;
            if (this.c0) {
                luc lucVar = new luc();
                pg8.X(this, new ek6(lucVar));
                fk6 fk6Var = (fk6) lucVar.element;
                if (fk6Var != null) {
                    fk6Var.c2();
                } else {
                    d2(null);
                }
            }
        }
    }
}
