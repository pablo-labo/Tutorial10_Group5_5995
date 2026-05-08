package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xp8 implements zf8 {
    public final yd8<?> a;
    public final boolean b;
    public final gu5<zf8> c;
    public zf8 d;

    /* JADX WARN: Multi-variable type inference failed */
    public xp8(yd8<?> yd8Var, boolean z, gu5<? extends zf8> gu5Var) {
        yd8Var.getClass();
        gu5Var.getClass();
        this.a = yd8Var;
        this.b = z;
        this.c = gu5Var;
    }

    @Override // defpackage.zf8
    public final oe8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp8)) {
            return j().equals(obj);
        }
        xp8 xp8Var = (xp8) obj;
        return wl7.b(this.a, xp8Var.a) && this.b == xp8Var.b;
    }

    @Override // defpackage.zf8
    public final List<gg8> g() {
        return j().g();
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        return j().getAnnotations();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.zf8
    public final boolean i() {
        return this.b;
    }

    public final zf8 j() {
        if (this.d == null) {
            this.d = this.c.invoke();
        }
        zf8 zf8Var = this.d;
        zf8Var.getClass();
        return zf8Var;
    }

    public final String toString() {
        return j().toString();
    }

    public /* synthetic */ xp8(yd8 yd8Var, gu5 gu5Var) {
        this(yd8Var, false, gu5Var);
    }
}
