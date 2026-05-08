package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t12 {
    public final af1 a;
    public final Function1<th7, th7> b;
    public final vpe c;

    public t12(af1 af1Var, vpe vpeVar, Function1 function1) {
        this.a = af1Var;
        this.b = function1;
        this.c = vpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t12)) {
            return false;
        }
        t12 t12Var = (t12) obj;
        return this.a.equals(t12Var.a) && wl7.b(this.b, t12Var.b) && this.c.equals(t12Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
