package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l31 extends sed {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public l31(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            ja.k("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            ja.k("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            ja.k("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.sed
    public final String b() {
        return this.c;
    }

    @Override // defpackage.sed
    public final String c() {
        return this.d;
    }

    @Override // defpackage.sed
    public final String d() {
        return this.b;
    }

    @Override // defpackage.sed
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sed)) {
            return false;
        }
        sed sedVar = (sed) obj;
        return this.b.equals(sedVar.d()) && this.c.equals(sedVar.b()) && this.d.equals(sedVar.c()) && this.e.equals(sedVar.f()) && this.f == sedVar.e();
    }

    @Override // defpackage.sed
    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return r6.d(this.f, "}", sb);
    }
}
