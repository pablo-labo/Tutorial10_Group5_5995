package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class byd {
    public static final byd c = new byd(0, 0);
    public final long a;
    public final long b;

    public byd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && byd.class == obj.getClass()) {
            byd bydVar = (byd) obj;
            if (this.a == bydVar.a && this.b == bydVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return r6.d(this.b, "]", sb);
    }
}
