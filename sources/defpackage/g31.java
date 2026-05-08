package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g31 extends l39 {
    public final long a;
    public final long b;
    public final u11 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final x8c g;

    public g31() {
        throw null;
    }

    public g31(long j, long j2, u11 u11Var, Integer num, String str, ArrayList arrayList) {
        x8c x8cVar = x8c.DEFAULT;
        this.a = j;
        this.b = j2;
        this.c = u11Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = x8cVar;
    }

    @Override // defpackage.l39
    public final t72 a() {
        return this.c;
    }

    @Override // defpackage.l39
    public final List<a39> b() {
        return this.f;
    }

    @Override // defpackage.l39
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.l39
    public final String d() {
        return this.e;
    }

    @Override // defpackage.l39
    public final x8c e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l39)) {
            return false;
        }
        l39 l39Var = (l39) obj;
        if (this.a != l39Var.f() || this.b != l39Var.g()) {
            return false;
        }
        u11 u11Var = this.c;
        if (u11Var == null) {
            if (l39Var.a() != null) {
                return false;
            }
        } else if (!u11Var.equals(l39Var.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (l39Var.c() != null) {
                return false;
            }
        } else if (!num.equals(l39Var.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (l39Var.d() != null) {
                return false;
            }
        } else if (!str.equals(l39Var.d())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (l39Var.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(l39Var.b())) {
            return false;
        }
        x8c x8cVar = this.g;
        return x8cVar == null ? l39Var.e() == null : x8cVar.equals(l39Var.e());
    }

    @Override // defpackage.l39
    public final long f() {
        return this.a;
    }

    @Override // defpackage.l39
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        u11 u11Var = this.c;
        int iHashCode = (i ^ (u11Var == null ? 0 : u11Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        x8c x8cVar = this.g;
        return iHashCode4 ^ (x8cVar != null ? x8cVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
