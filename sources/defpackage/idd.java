package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class idd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public idd(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idd)) {
            return false;
        }
        idd iddVar = (idd) obj;
        return this.a == iddVar.a && this.b == iddVar.b && this.c == iddVar.c && this.d == iddVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return l6.h(sb, this.d, ')');
    }
}
