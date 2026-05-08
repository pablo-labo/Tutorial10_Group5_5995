package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl6 {
    public final String a;
    public final String b;

    public nl6(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl6)) {
            return false;
        }
        nl6 nl6Var = (nl6) obj;
        return wl7.b(this.a, nl6Var.a) && wl7.b(this.b, nl6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader(name=");
        sb.append(this.a);
        sb.append(", value=");
        return w40.f(sb, this.b, ')');
    }
}
