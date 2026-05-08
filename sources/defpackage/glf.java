package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glf {
    public final a3a<a> a;
    public long b;
    public long c;
    public long d;
    public long e;

    public final class a {
        public long a;
    }

    public glf() {
        a3a a3aVar = kh7.a;
        this.a = new a3a<>();
        this.b = -1L;
        this.c = 0L;
        this.d = 0L;
    }

    public static void a(a aVar, long j, long j2, long j3) {
        long j4 = aVar.a;
        if (j3 - j4 >= 0 || j4 == Long.MIN_VALUE) {
            aVar.a = j3;
            throw null;
        }
    }
}
