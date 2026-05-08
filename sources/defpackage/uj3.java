package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 {
    public final k07 a;
    public final boolean b;

    public uj3(k07 k07Var, boolean z) {
        this.a = k07Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        uj3 uj3Var = (uj3) obj;
        return this.a.equals(uj3Var.a) && this.b == uj3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        return m6.i(sb, this.b, ')');
    }
}
