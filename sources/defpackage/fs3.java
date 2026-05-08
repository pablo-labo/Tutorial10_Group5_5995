package defpackage;

import defpackage.iwf;

/* JADX INFO: loaded from: classes3.dex */
public final class fs3 extends nt3 implements bc3, fdd {
    public final mge b;
    public final boolean c;

    public static final class a {
        public static fs3 a(p7g p7gVar, boolean z) {
            boolean zE;
            p7gVar.getClass();
            if (p7gVar instanceof fs3) {
                return (fs3) p7gVar;
            }
            if (!(p7gVar.M0() instanceof tha) && !(p7gVar.M0().d() instanceof rxf) && !(p7gVar instanceof jha) && !(p7gVar instanceof iwe)) {
                zE = false;
            } else if (p7gVar instanceof iwe) {
                zE = kyf.e(p7gVar);
            } else {
                v62 v62VarD = p7gVar.M0().d();
                sxf sxfVar = v62VarD instanceof sxf ? (sxf) v62VarD : null;
                zE = (sxfVar == null || sxfVar.a0) ? (z && (p7gVar.M0().d() instanceof rxf)) ? kyf.e(p7gVar) : !o3.a(ofe.a.r0(), w74.v(p7gVar), iwf.a.b.a) : true;
            }
            if (!zE) {
                return null;
            }
            if (p7gVar instanceof jh5) {
                jh5 jh5Var = (jh5) p7gVar;
                wl7.b(jh5Var.b.M0(), jh5Var.c.M0());
            }
            return new fs3(w74.v(p7gVar).Q0(false), z);
        }
    }

    public fs3(mge mgeVar, boolean z) {
        this.b = mgeVar;
        this.c = z;
    }

    @Override // defpackage.bc3
    public final boolean D0() {
        mge mgeVar = this.b;
        return (mgeVar.M0() instanceof tha) || (mgeVar.M0().d() instanceof rxf);
    }

    @Override // defpackage.nt3, defpackage.ui8
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        return z ? this.b.Q0(z) : this;
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return new fs3(this.b.S0(gwfVar), this.c);
    }

    @Override // defpackage.nt3
    public final mge V0() {
        return this.b;
    }

    @Override // defpackage.nt3
    public final nt3 X0(mge mgeVar) {
        return new fs3(mgeVar, this.c);
    }

    @Override // defpackage.bc3
    public final p7g t(ui8 ui8Var) {
        ui8Var.getClass();
        return uoe.a(ui8Var.P0(), this.c);
    }

    @Override // defpackage.mge
    public final String toString() {
        return this.b + " & Any";
    }
}
