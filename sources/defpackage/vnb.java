package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vnb {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public vnb(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnb)) {
            return false;
        }
        vnb vnbVar = (vnb) obj;
        return this.a.equals(vnbVar.a) && this.b == vnbVar.b && this.c == vnbVar.c && this.d == vnbVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        int iC = w40.c(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iC + r3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return m6.i(sb, this.d, ')');
    }
}
