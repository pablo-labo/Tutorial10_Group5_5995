package defpackage;

import defpackage.q8b;
import defpackage.r8b;

/* JADX INFO: loaded from: classes2.dex */
public final class k31 extends r8b {
    public final String b;
    public final q8b.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public static final class a extends r8b.a {
        public String a;
        public q8b.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public final k31 a() {
            String strConcat = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                strConcat = strConcat.concat(" expiresInSecs");
            }
            if (strConcat.isEmpty()) {
                return new k31(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public k31(String str, q8b.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // defpackage.r8b
    public final String a() {
        return this.d;
    }

    @Override // defpackage.r8b
    public final long b() {
        return this.f;
    }

    @Override // defpackage.r8b
    public final String c() {
        return this.b;
    }

    @Override // defpackage.r8b
    public final String d() {
        return this.h;
    }

    @Override // defpackage.r8b
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r8b)) {
            return false;
        }
        r8b r8bVar = (r8b) obj;
        String str = this.b;
        if (str == null) {
            if (r8bVar.c() != null) {
                return false;
            }
        } else if (!str.equals(r8bVar.c())) {
            return false;
        }
        if (!this.c.equals(r8bVar.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (r8bVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(r8bVar.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (r8bVar.e() != null) {
                return false;
            }
        } else if (!str3.equals(r8bVar.e())) {
            return false;
        }
        if (this.f != r8bVar.b() || this.g != r8bVar.g()) {
            return false;
        }
        String str4 = this.h;
        return str4 == null ? r8bVar.d() == null : str4.equals(r8bVar.d());
    }

    @Override // defpackage.r8b
    public final q8b.a f() {
        return this.c;
    }

    @Override // defpackage.r8b
    public final long g() {
        return this.g;
    }

    public final a h() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = Long.valueOf(this.f);
        aVar.f = Long.valueOf(this.g);
        aVar.g = this.h;
        return aVar;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return l6.i(sb, this.h, "}");
    }
}
