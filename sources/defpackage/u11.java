package defpackage;

import defpackage.t72;

/* JADX INFO: loaded from: classes2.dex */
public final class u11 extends t72 {
    public final t72.a a = t72.a.ANDROID_FIREBASE;
    public final q11 b;

    public u11(q11 q11Var) {
        this.b = q11Var;
    }

    @Override // defpackage.t72
    public final b50 a() {
        return this.b;
    }

    @Override // defpackage.t72
    public final t72.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t72)) {
            return false;
        }
        t72 t72Var = (t72) obj;
        t72.a aVar = this.a;
        if (aVar == null) {
            if (t72Var.b() != null) {
                return false;
            }
        } else if (!aVar.equals(t72Var.b())) {
            return false;
        }
        q11 q11Var = this.b;
        return q11Var == null ? t72Var.a() == null : q11Var.equals(t72Var.a());
    }

    public final int hashCode() {
        t72.a aVar = this.a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        q11 q11Var = this.b;
        return iHashCode ^ (q11Var != null ? q11Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
