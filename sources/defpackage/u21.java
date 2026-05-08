package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class u21 extends v33.e.AbstractC0449e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public u21(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // v33.e.AbstractC0449e
    public final String a() {
        return this.c;
    }

    @Override // v33.e.AbstractC0449e
    public final int b() {
        return this.a;
    }

    @Override // v33.e.AbstractC0449e
    public final String c() {
        return this.b;
    }

    @Override // v33.e.AbstractC0449e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.AbstractC0449e)) {
            return false;
        }
        v33.e.AbstractC0449e abstractC0449e = (v33.e.AbstractC0449e) obj;
        return this.a == abstractC0449e.b() && this.b.equals(abstractC0449e.c()) && this.c.equals(abstractC0449e.a()) && this.d == abstractC0449e.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return z3.o(sb, this.d, "}");
    }
}
