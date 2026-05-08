package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt1 {
    public final int a;
    public final boolean b;

    public pt1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt1)) {
            return false;
        }
        pt1 pt1Var = (pt1) obj;
        return this.a == pt1Var.a && this.b == pt1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CacheKey(fontSize=" + this.a + ", isTitleEmpty=" + this.b + ")";
    }
}
