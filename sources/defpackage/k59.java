package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k59 extends n3b {
    public final String a;
    public final long b;

    public k59(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k59)) {
            return false;
        }
        k59 k59Var = (k59) obj;
        return wl7.b(this.a, k59Var.a) && this.b == k59Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
