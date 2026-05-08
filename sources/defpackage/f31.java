package defpackage;

import defpackage.a39;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f31 extends a39 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final sfa g;

    public static final class a extends a39.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public i31 g;
    }

    public f31(long j, Integer num, long j2, byte[] bArr, String str, long j3, sfa sfaVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = sfaVar;
    }

    @Override // defpackage.a39
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.a39
    public final long b() {
        return this.a;
    }

    @Override // defpackage.a39
    public final long c() {
        return this.c;
    }

    @Override // defpackage.a39
    public final sfa d() {
        return this.g;
    }

    @Override // defpackage.a39
    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a39)) {
            return false;
        }
        a39 a39Var = (a39) obj;
        if (this.a != a39Var.b()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (a39Var.a() != null) {
                return false;
            }
        } else if (!num.equals(a39Var.a())) {
            return false;
        }
        if (this.c != a39Var.c()) {
            return false;
        }
        if (!Arrays.equals(this.d, a39Var instanceof f31 ? ((f31) a39Var).d : a39Var.e())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (a39Var.f() != null) {
                return false;
            }
        } else if (!str.equals(a39Var.f())) {
            return false;
        }
        if (this.f != a39Var.g()) {
            return false;
        }
        sfa sfaVar = this.g;
        return sfaVar == null ? a39Var.d() == null : sfaVar.equals(a39Var.d());
    }

    @Override // defpackage.a39
    public final String f() {
        return this.e;
    }

    @Override // defpackage.a39
    public final long g() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        sfa sfaVar = this.g;
        return i2 ^ (sfaVar != null ? sfaVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
