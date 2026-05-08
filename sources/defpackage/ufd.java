package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ufd {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public ufd(float f, float f2, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ufd)) {
            return false;
        }
        ufd ufdVar = (ufd) obj;
        return ufdVar.a == this.a && ufdVar.b == this.b && ufdVar.c == this.c && ufdVar.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ia.d(k6.c(Float.hashCode(this.a) * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return k6.h(sb, this.d, ')');
    }
}
