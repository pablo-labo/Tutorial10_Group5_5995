package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b31 {
    public final String a;
    public final String b;

    public b31(String str, String str2) {
        if (str == null) {
            ja.k("Null crashlyticsInstallId");
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        if (!this.a.equals(b31Var.a)) {
            return false;
        }
        String str = this.b;
        return str == null ? b31Var.a() == null : str.equals(b31Var.a());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        return l6.i(sb, this.b, "}");
    }
}
