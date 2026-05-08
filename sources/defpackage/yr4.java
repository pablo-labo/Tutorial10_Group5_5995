package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yr4 implements zf8 {
    public final yd8<?> a;
    public final boolean b;

    public yr4(yd8<?> yd8Var, boolean z) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = z;
    }

    @Override // defpackage.zf8
    public final oe8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr4)) {
            return false;
        }
        yr4 yr4Var = (yr4) obj;
        return wl7.b(this.a, yr4Var.a) && this.b == yr4Var.b;
    }

    @Override // defpackage.zf8
    public final List<gg8> g() {
        return zr4.a;
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        return zr4.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.zf8
    public final boolean i() {
        return this.b;
    }
}
