package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i74 {
    public final String a;
    public final Long b;
    public final String c;

    public i74(Long l, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i74)) {
            return false;
        }
        i74 i74Var = (i74) obj;
        return wl7.b(this.a, i74Var.a) && wl7.b(this.b, i74Var.b) && wl7.b(this.c, i74Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayStatus(state=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", source=");
        return l6.i(sb, this.c, ")");
    }
}
