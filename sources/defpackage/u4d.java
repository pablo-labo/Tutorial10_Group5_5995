package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u4d {
    public final gq6 a;

    public u4d(gq6 gq6Var) {
        this.a = gq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4d) && this.a == ((u4d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResetToInitialStateEvent(reason=" + this.a + ")";
    }
}
