package defpackage;

import defpackage.lnf;

/* JADX INFO: loaded from: classes2.dex */
public final class u31 extends lnf {
    public final String a;
    public final long b;
    public final lnf.b c;

    public static final class a extends lnf.a {
        public String a;
        public Long b;
        public lnf.b c;

        public final u31 a() {
            if ("".isEmpty()) {
                return new u31(this.a, this.b.longValue(), this.c);
            }
            r6.g("Missing required properties:".concat(""));
            return null;
        }
    }

    public u31(String str, long j, lnf.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }

    @Override // defpackage.lnf
    public final lnf.b b() {
        return this.c;
    }

    @Override // defpackage.lnf
    public final String c() {
        return this.a;
    }

    @Override // defpackage.lnf
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lnf)) {
            return false;
        }
        lnf lnfVar = (lnf) obj;
        String str = this.a;
        if (str == null) {
            if (lnfVar.c() != null) {
                return false;
            }
        } else if (!str.equals(lnfVar.c())) {
            return false;
        }
        if (this.b != lnfVar.d()) {
            return false;
        }
        lnf.b bVar = this.c;
        return bVar == null ? lnfVar.b() == null : bVar.equals(lnfVar.b());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        lnf.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
