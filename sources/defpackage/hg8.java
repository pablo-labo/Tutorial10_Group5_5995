package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hg8 implements zf8 {
    public final zf8 a;

    public hg8(zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
    }

    @Override // defpackage.zf8
    public final oe8 a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        hg8 hg8Var = obj instanceof hg8 ? (hg8) obj : null;
        zf8 zf8Var = hg8Var != null ? hg8Var.a : null;
        zf8 zf8Var2 = this.a;
        if (!wl7.b(zf8Var2, zf8Var)) {
            return false;
        }
        oe8 oe8VarA = zf8Var2.a();
        if (oe8VarA instanceof yd8) {
            zf8 zf8Var3 = obj instanceof zf8 ? (zf8) obj : null;
            oe8 oe8VarA2 = zf8Var3 != null ? zf8Var3.a() : null;
            if (oe8VarA2 != null && (oe8VarA2 instanceof yd8)) {
                return jh2.p((yd8) oe8VarA).equals(jh2.p((yd8) oe8VarA2));
            }
        }
        return false;
    }

    @Override // defpackage.zf8
    public final List<gg8> g() {
        return this.a.g();
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.zf8
    public final boolean i() {
        return this.a.i();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
