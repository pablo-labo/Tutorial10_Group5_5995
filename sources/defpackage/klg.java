package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class klg {
    public final String a;
    public final Object b;

    public klg(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klg)) {
            return false;
        }
        klg klgVar = (klg) obj;
        return this.a.equals(klgVar.a) && wl7.b(this.b, klgVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ')';
    }
}
