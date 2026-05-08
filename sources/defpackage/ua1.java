package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ua1 implements x3d {
    public final ex7 a;

    public /* synthetic */ ua1(ex7 ex7Var) {
        this.a = ex7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ua1) {
            return this.a.equals(((ua1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ')';
    }
}
