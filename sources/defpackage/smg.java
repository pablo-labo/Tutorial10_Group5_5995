package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class smg<V extends ge0> {
    public final V a;
    public final af4 b;

    public smg() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public smg(ge0 ge0Var, af4 af4Var) {
        this.a = ge0Var;
        this.b = af4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smg)) {
            return false;
        }
        smg smgVar = (smg) obj;
        return wl7.b(this.a, smgVar.a) && wl7.b(this.b, smgVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
