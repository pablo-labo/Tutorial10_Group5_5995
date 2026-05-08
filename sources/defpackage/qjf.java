package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qjf {
    public final long a;
    public final long b;

    public qjf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjf)) {
            return false;
        }
        qjf qjfVar = (qjf) obj;
        return da2.c(this.a, qjfVar.a) && da2.c(this.b, qjfVar.b);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        h5.j(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) da2.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
