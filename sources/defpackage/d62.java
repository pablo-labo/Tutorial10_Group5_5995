package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d62 {
    public final a62 a;
    public final int b;

    public d62(a62 a62Var, int i) {
        this.a = a62Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d62)) {
            return false;
        }
        d62 d62Var = (d62) obj;
        return this.a.equals(d62Var.a) && this.b == d62Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
