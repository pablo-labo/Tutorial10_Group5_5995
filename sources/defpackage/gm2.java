package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements fm2 {
    public final cm2 a;

    public gm2(cm2 cm2Var) {
        this.a = cm2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gm2) {
            return this.a.equals(((gm2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
