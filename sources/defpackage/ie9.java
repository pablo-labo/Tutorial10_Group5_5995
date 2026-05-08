package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ie9 {
    public final String a;
    public final oh7 b;

    public ie9(String str, oh7 oh7Var) {
        this.a = str;
        this.b = oh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie9)) {
            return false;
        }
        ie9 ie9Var = (ie9) obj;
        return this.a.equals(ie9Var.a) && this.b.equals(ie9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
