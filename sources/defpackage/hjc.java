package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hjc {
    public final boolean a;
    public final boolean b;
    public final String c;

    public hjc(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public static hjc a(hjc hjcVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = hjcVar.a;
        }
        if ((i & 2) != 0) {
            z2 = hjcVar.b;
        }
        String str = hjcVar.c;
        hjcVar.getClass();
        return new hjc(str, z, z2);
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjc)) {
            return false;
        }
        hjc hjcVar = (hjc) obj;
        return this.a == hjcVar.a && this.b == hjcVar.b && wl7.b(this.c, hjcVar.c);
    }

    public final int hashCode() {
        int iF = ia.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RdiState(showAlert=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", error=");
        return l6.i(sb, this.c, ")");
    }

    public /* synthetic */ hjc(int i) {
        this(null, false, false);
    }

    public hjc() {
        this(0);
    }
}
