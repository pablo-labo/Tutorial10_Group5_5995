package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw9 {
    public final yxd a;
    public final boolean b;

    public fw9(yxd yxdVar, boolean z) {
        this.a = yxdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fw9) {
            return this.a == ((fw9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
