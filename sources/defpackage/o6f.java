package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o6f {
    public final float a;
    public final float b;
    public final float c;

    public o6f(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6f)) {
            return false;
        }
        o6f o6fVar = (o6f) obj;
        return j94.c(this.a, o6fVar.a) && j94.c(this.b, o6fVar.b) && j94.c(this.c, o6fVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + k6.c(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) j94.e(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) j94.e(f + f2));
        sb.append(", width=");
        sb.append((Object) j94.e(f2));
        sb.append(", contentWidth=");
        sb.append((Object) j94.e(this.c));
        sb.append(')');
        return sb.toString();
    }
}
