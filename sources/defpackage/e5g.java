package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e5g {
    public final long a;
    public final int b;
    public final int c;

    public e5g(int i, int i2, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
        if (0 > j || j >= 8796093022208L) {
            h5.k(r6.c(j, "invalid timestamp (max=8796093022207): "));
            throw null;
        }
        if (i < 0 || i >= 33554432) {
            h5.k(p6.c(i, "invalid sourceId (max=33554431): "));
            throw null;
        }
        if (i2 < 0 || i2 >= 1024) {
            h5.k(p6.c(i2, "invalid random number (max=1023): "));
            throw null;
        }
    }

    public final String toString() {
        long j = 26388279066624L | this.a;
        ypd.s(32);
        String string = Long.toString(j, 32);
        string.getClass();
        long j2 = (((long) this.b) << 10) | 34359738368L | ((long) this.c);
        ypd.s(32);
        String string2 = Long.toString(j2, 32);
        string2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append((CharSequence) string2, 1, 8);
        return sb.toString();
    }
}
