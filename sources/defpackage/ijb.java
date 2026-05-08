package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ijb {
    public final String a;
    public final Long b;

    public ijb(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb)) {
            return false;
        }
        ijb ijbVar = (ijb) obj;
        return this.a.equals(ijbVar.a) && this.b.equals(ijbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
