package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lhf {
    public static final lhf c = new lhf(1.0f, 0.0f);
    public final float a;
    public final float b;

    public lhf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhf)) {
            return false;
        }
        lhf lhfVar = (lhf) obj;
        return this.a == lhfVar.a && this.b == lhfVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return l6.h(sb, this.b, ')');
    }

    public lhf() {
        this(1.0f, 0.0f);
    }
}
