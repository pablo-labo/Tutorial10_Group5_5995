package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class kjf {
    public static final long b = cr8.c(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ kjf(long j) {
        this.a = j;
    }

    public static boolean a(Object obj, long j) {
        return (obj instanceof kjf) && j == ((kjf) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return k6.h(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(obj, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
