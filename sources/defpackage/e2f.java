package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e2f {
    public final int a;
    public final int b;
    public final String c;

    public e2f(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2f)) {
            return false;
        }
        e2f e2fVar = (e2f) obj;
        return this.a == e2fVar.a && this.b == e2fVar.b && wl7.b(this.c, e2fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w40.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return l6.i(uz.f("SynchronousEvent(surfaceId=", this.a, ", viewTag=", this.b, ", eventName="), this.c, ")");
    }
}
