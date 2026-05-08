package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb2 implements khf {
    public final long a;

    public bb2(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        be7.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.khf
    public final float a() {
        return da2.d(this.a);
    }

    @Override // defpackage.khf
    public final long c() {
        return this.a;
    }

    @Override // defpackage.khf
    public final sn1 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb2) && da2.c(this.a, ((bb2) obj).a);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) da2.i(this.a)) + ')';
    }
}
