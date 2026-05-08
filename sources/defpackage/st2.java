package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public st2(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof st2)) {
            return false;
        }
        st2 st2Var = (st2) obj;
        return da2.c(this.a, st2Var.a) && da2.c(this.b, st2Var.b) && da2.c(this.c, st2Var.c) && da2.c(this.d, st2Var.d) && da2.c(this.e, st2Var.e);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.e) + ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        h5.j(this.a, ", textColor=", sb);
        h5.j(this.b, ", iconColor=", sb);
        h5.j(this.c, ", disabledTextColor=", sb);
        h5.j(this.d, ", disabledIconColor=", sb);
        sb.append((Object) da2.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
