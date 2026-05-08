package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nhf {
    public static final nhf c = new nhf(hh2.t(0), hh2.t(0));
    public final long a;
    public final long b;

    public nhf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf)) {
            return false;
        }
        nhf nhfVar = (nhf) obj;
        return bkf.a(this.a, nhfVar.a) && bkf.a(this.b, nhfVar.b);
    }

    public final int hashCode() {
        ckf[] ckfVarArr = bkf.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) bkf.d(this.a)) + ", restLine=" + ((Object) bkf.d(this.b)) + ')';
    }
}
