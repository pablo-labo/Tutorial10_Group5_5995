package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements mzg {
    public final int a;
    public final String b;
    public final g4a c = r.f(kf7.e);
    public final g4a d = r.f(Boolean.TRUE);

    public ub0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.mzg
    public final int a(iy3 iy3Var) {
        return e().b;
    }

    @Override // defpackage.mzg
    public final int b(iy3 iy3Var, vl8 vl8Var) {
        return e().c;
    }

    @Override // defpackage.mzg
    public final int c(iy3 iy3Var) {
        return e().d;
    }

    @Override // defpackage.mzg
    public final int d(iy3 iy3Var, vl8 vl8Var) {
        return e().a;
    }

    public final kf7 e() {
        return (kf7) ((gme) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ub0) {
            return this.a == ((ub0) obj).a;
        }
        return false;
    }

    public final void f(rzg rzgVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            ((gme) this.c).setValue(rzgVar.a.g(i2));
            ((gme) this.d).setValue(Boolean.valueOf(rzgVar.a.q(i2)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return k6.h(sb, e().d, ')');
    }
}
