package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sab {
    public final long a;
    public final long b;
    public final int c;

    public sab(long j, int i, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        ckf[] ckfVarArr = bkf.b;
        if ((j & 1095216660480L) == 0) {
            be7.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            be7.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sab)) {
            return false;
        }
        sab sabVar = (sab) obj;
        return bkf.a(this.a, sabVar.a) && bkf.a(this.b, sabVar.b) && this.c == sabVar.c;
    }

    public final int hashCode() {
        ckf[] ckfVarArr = bkf.b;
        return Integer.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) bkf.d(this.a)) + ", height=" + ((Object) bkf.d(this.b)) + ", placeholderVerticalAlign=" + ((Object) wab.D(this.c)) + ')';
    }
}
