package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class eh7 {
    public final long a;

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eh7) {
            return this.a == ((eh7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return k6.h(sb, (int) (j & 4294967295L), ')');
    }
}
