package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lx7 {
    public final String a;
    public final hx7 b;

    public lx7(String str) {
        str.getClass();
        this.a = str;
        this.b = hx7.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx7)) {
            return false;
        }
        lx7 lx7Var = (lx7) obj;
        return wl7.b(this.a, lx7Var.a) && this.b == lx7Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "JobCardJobAttribute(text=" + this.a + ", matchType=" + this.b + ", additionalText=null)";
    }
}
