package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class r21 extends v33.e.d.AbstractC0448e {
    public final v33.e.d.AbstractC0448e.a a;
    public final String b;
    public final String c;
    public final long d;

    public r21(s21 s21Var, String str, String str2, long j) {
        this.a = s21Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // v33.e.d.AbstractC0448e
    public final String a() {
        return this.b;
    }

    @Override // v33.e.d.AbstractC0448e
    public final String b() {
        return this.c;
    }

    @Override // v33.e.d.AbstractC0448e
    public final v33.e.d.AbstractC0448e.a c() {
        return this.a;
    }

    @Override // v33.e.d.AbstractC0448e
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.AbstractC0448e)) {
            return false;
        }
        v33.e.d.AbstractC0448e abstractC0448e = (v33.e.d.AbstractC0448e) obj;
        return this.a.equals(abstractC0448e.c()) && this.b.equals(abstractC0448e.a()) && this.c.equals(abstractC0448e.b()) && this.d == abstractC0448e.d();
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return r6.d(this.d, "}", sb);
    }
}
