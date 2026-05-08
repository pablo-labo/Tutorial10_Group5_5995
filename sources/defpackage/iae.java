package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iae {
    public final m1g a;
    public final String b;

    public iae(m1g m1gVar, String str) {
        m1gVar.getClass();
        this.a = m1gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iae)) {
            return false;
        }
        iae iaeVar = (iae) obj;
        return this.a == iaeVar.a && this.b.equals(iaeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetCookieArgs(cookie=" + this.a + ", value=" + this.b + ")";
    }
}
