package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ix1 extends mge implements px1 {
    public final wxf b;
    public final lx1 c;
    public final boolean d;
    public final gwf e;

    public ix1(wxf wxfVar, lx1 lx1Var, boolean z, gwf gwfVar) {
        wxfVar.getClass();
        lx1Var.getClass();
        gwfVar.getClass();
        this.b = wxfVar;
        this.c = lx1Var;
        this.d = z;
        this.e = gwfVar;
    }

    @Override // defpackage.ui8
    public final List<wxf> K0() {
        return zr4.a;
    }

    @Override // defpackage.ui8
    public final gwf L0() {
        return this.e;
    }

    @Override // defpackage.ui8
    public final kwf M0() {
        return this.c;
    }

    @Override // defpackage.ui8
    public final boolean N0() {
        return this.d;
    }

    @Override // defpackage.ui8
    public final ui8 O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new ix1(this.b.a(bj8Var), this.c, this.d, this.e);
    }

    @Override // defpackage.mge, defpackage.p7g
    public final p7g Q0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new ix1(this.b, this.c, z, this.e);
    }

    @Override // defpackage.p7g
    /* JADX INFO: renamed from: R0 */
    public final p7g O0(bj8 bj8Var) {
        bj8Var.getClass();
        return new ix1(this.b.a(bj8Var), this.c, this.d, this.e);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: T0 */
    public final mge Q0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new ix1(this.b, this.c, z, this.e);
    }

    @Override // defpackage.mge
    /* JADX INFO: renamed from: U0 */
    public final mge S0(gwf gwfVar) {
        gwfVar.getClass();
        return new ix1(this.b, this.c, this.d, gwfVar);
    }

    @Override // defpackage.ui8
    public final in9 n() {
        return lx4.a(xw4.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // defpackage.mge
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.b);
        sb.append(')');
        sb.append(this.d ? CoreFeature.DEFAULT_APP_VERSION : "");
        return sb.toString();
    }
}
