package defpackage;

import defpackage.x1f;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d5d extends zkg {
    public ka6 f;

    public final x1f K1(x1f x1fVar, x1f x1fVar2) {
        if (x1fVar2 instanceof x1f.f) {
            if (x1fVar == x1f.h0) {
                return x1fVar2;
            }
            return null;
        }
        if (x1fVar2 instanceof x1f.l) {
            x1f.l lVar = (x1f.l) x1fVar2;
            x1f x1fVar3 = lVar.l0;
            if (x1fVar3 == x1fVar) {
                return lVar.k0;
            }
            r40.l(t40.l("Found ", String.valueOf(x1fVar3), " while looking for ", String.valueOf(x1fVar)));
            return null;
        }
        boolean z = x1fVar2 instanceof x1f.n;
        zje zjeVar = this.d;
        if (z) {
            x1f x1fVar4 = ((x1f.n) x1fVar2).k0;
            int i = zjeVar.c;
            zjeVar.e(x1fVar4);
            zjeVar.f(i);
            return null;
        }
        if (x1fVar2 instanceof x1f.q) {
            x1f.b bVar = (x1f.b) zjeVar.b();
            zjeVar.e(bVar.j0[this.e.U0()]);
            return null;
        }
        if (x1fVar2 instanceof x1f.e) {
            r40.l(((x1f.e) x1fVar2).k0);
            return null;
        }
        if (x1fVar2 instanceof x1f.c) {
            this.f = this.e;
            this.e = bk3.a(((x1f.c) x1fVar2).k0);
            return null;
        }
        if (x1fVar2 == x1f.i0) {
            this.e = this.f;
            return null;
        }
        r40.l("Unknown action: ".concat(String.valueOf(x1fVar2)));
        return null;
    }

    public final g.f[] L1() {
        x1f.f fVar = (x1f.f) this.d.a(x1f.h0);
        if (fVar.k0) {
            return null;
        }
        return fVar.l0;
    }

    @Override // defpackage.ka6
    public final ByteBuffer P0(ByteBuffer byteBuffer) {
        x1f x1fVarA = this.d.a(x1f.Y);
        x1f.o oVar = x1f.X;
        ka6 ka6Var = this.e;
        if (x1fVarA != oVar) {
            return ka6Var.P0(byteBuffer);
        }
        rjg rjgVarZ0 = ka6Var.Z0(null);
        return ByteBuffer.wrap(rjgVarZ0.e(), 0, rjgVarZ0.c());
    }

    @Override // defpackage.ka6
    public final double Q0() {
        x1f x1fVarA = this.d.a(x1f.W);
        if (x1fVarA == x1f.e) {
            return this.e.V0();
        }
        if (x1fVarA == x1f.f) {
            return this.e.W0();
        }
        return x1fVarA == x1f.V ? r2.T0() : this.e.Q0();
    }

    @Override // defpackage.ka6
    public final int R0() {
        x1f.o oVar = x1f.a0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        x1f.d dVar = (x1f.d) zjeVar.b();
        int iR0 = this.e.R0();
        if (dVar.k0) {
            return iR0;
        }
        Object obj = dVar.l0[iR0];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        r40.l((String) obj);
        return 0;
    }

    @Override // defpackage.ka6
    public final float T0() {
        x1f x1fVarA = this.d.a(x1f.V);
        if (x1fVarA == x1f.e) {
            return this.e.V0();
        }
        return x1fVarA == x1f.f ? r2.W0() : this.e.T0();
    }

    @Override // defpackage.ka6
    public final int U0() {
        int iU0;
        x1f x1fVar;
        x1f.o oVar = x1f.b0;
        zje zjeVar = this.d;
        zjeVar.a(oVar);
        x1f x1fVarB = zjeVar.b();
        if (x1fVarB instanceof x1f.p) {
            x1f.p pVar = (x1f.p) x1fVarB;
            iU0 = pVar.k0;
            x1fVar = pVar.l0;
        } else {
            iU0 = this.e.U0();
            x1fVar = ((x1f.b) x1fVarB).j0[iU0];
        }
        zjeVar.e(x1fVar);
        return iU0;
    }

    @Override // defpackage.ka6
    public final long W0() {
        x1f x1fVarA = this.d.a(x1f.f);
        if (x1fVarA == x1f.e) {
            return this.e.V0();
        }
        x1f.o oVar = x1f.W;
        ka6 ka6Var = this.e;
        return x1fVarA == oVar ? (long) ka6Var.Q0() : ka6Var.W0();
    }

    @Override // defpackage.ka6
    public final rjg Z0(rjg rjgVar) {
        x1f x1fVarA = this.d.a(x1f.X);
        x1f.o oVar = x1f.Y;
        ka6 ka6Var = this.e;
        return x1fVarA == oVar ? new rjg(ka6Var.P0(null).array()) : ka6Var.Z0(rjgVar);
    }

    @Override // defpackage.ka6
    public final String a1() {
        x1f x1fVarA = this.d.a(x1f.X);
        x1f.o oVar = x1f.Y;
        ka6 ka6Var = this.e;
        return x1fVarA == oVar ? new String(ka6Var.P0(null).array(), StandardCharsets.UTF_8) : ka6Var.a1();
    }

    @Override // defpackage.ka6
    public final void f1() {
        x1f x1fVarA = this.d.a(x1f.Y);
        x1f.o oVar = x1f.X;
        ka6 ka6Var = this.e;
        if (x1fVarA == oVar) {
            ka6Var.i1();
        } else {
            ka6Var.f1();
        }
    }

    @Override // defpackage.ka6
    public final void i1() {
        x1f x1fVarA = this.d.a(x1f.X);
        x1f.o oVar = x1f.Y;
        ka6 ka6Var = this.e;
        if (x1fVarA == oVar) {
            ka6Var.f1();
        } else {
            ka6Var.i1();
        }
    }
}
