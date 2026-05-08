package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class plg implements mzg {
    public final String a;
    public final g4a b;

    public plg(rf7 rf7Var, String str) {
        this.a = str;
        this.b = r.f(rf7Var);
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

    public final rf7 e() {
        return (rf7) ((gme) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plg) {
            return wl7.b(e(), ((plg) obj).e());
        }
        return false;
    }

    public final void f(rf7 rf7Var) {
        ((gme) this.b).setValue(rf7Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return k6.h(sb, e().d, ')');
    }
}
