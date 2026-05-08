package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tw5 {
    public final int a;
    public final qsg b;

    public tw5(int i, qsg qsgVar) {
        qsgVar.getClass();
        this.a = i;
        this.b = qsgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw5)) {
            return false;
        }
        tw5 tw5Var = (tw5) obj;
        return this.a == tw5Var.a && wl7.b(this.b, tw5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
