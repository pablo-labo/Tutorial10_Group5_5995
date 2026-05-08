package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jqd {
    public final int a;
    public final int b;

    public jqd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqd)) {
            return false;
        }
        jqd jqdVar = (jqd) obj;
        return this.a == jqdVar.a && this.b == jqdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return w40.e("ScreenDimensions(width=", this.a, ", height=", this.b, ")");
    }
}
