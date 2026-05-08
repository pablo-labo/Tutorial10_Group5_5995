package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jie {
    public final int a;
    public final int b;

    public jie(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jie)) {
            return false;
        }
        jie jieVar = (jie) obj;
        return this.a == jieVar.a && this.b == jieVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.a);
        sb.append(", height=");
        return k6.h(sb, this.b, ')');
    }
}
