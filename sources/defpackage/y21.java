package defpackage;

import defpackage.iy4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y21 extends iy4 {
    public final String a;
    public final Integer b;
    public final xs4 c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    public static final class a extends iy4.a {
        public String a;
        public Integer b;
        public xs4 c;
        public Long d;
        public Long e;
        public HashMap f;

        public final y21 b() {
            String strConcat = this.a == null ? " transportName" : "";
            if (this.c == null) {
                strConcat = strConcat.concat(" encodedPayload");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" eventMillis");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" uptimeMillis");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" autoMetadata");
            }
            if (strConcat.isEmpty()) {
                return new y21(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public y21(String str, Integer num, xs4 xs4Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = xs4Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    @Override // defpackage.iy4
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // defpackage.iy4
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.iy4
    public final xs4 d() {
        return this.c;
    }

    @Override // defpackage.iy4
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iy4)) {
            return false;
        }
        iy4 iy4Var = (iy4) obj;
        if (!this.a.equals(iy4Var.g())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (iy4Var.c() != null) {
                return false;
            }
        } else if (!num.equals(iy4Var.c())) {
            return false;
        }
        return this.c.equals(iy4Var.d()) && this.d == iy4Var.e() && this.e == iy4Var.h() && this.f.equals(iy4Var.b());
    }

    @Override // defpackage.iy4
    public final String g() {
        return this.a;
    }

    @Override // defpackage.iy4
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        return b0.k(sb, this.f, "}");
    }
}
