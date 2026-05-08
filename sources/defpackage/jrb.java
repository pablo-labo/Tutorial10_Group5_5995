package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jrb {
    public final boolean a;
    public final int b;
    public final int c;

    public jrb(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrb)) {
            return false;
        }
        jrb jrbVar = (jrb) obj;
        return this.a == jrbVar.a && this.b == jrbVar.b && this.c == jrbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w40.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileHomeTopNavState(isOpaqueOnScroll=");
        sb.append(this.a);
        sb.append(", distanceFromTopPx=");
        sb.append(this.b);
        sb.append(", topNavHeightPx=");
        return w20.k(sb, this.c, ")");
    }
}
