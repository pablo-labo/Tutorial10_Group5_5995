package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class y11 extends v33.a.AbstractC0440a {
    public final String a;
    public final String b;
    public final String c;

    public y11(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // v33.a.AbstractC0440a
    public final String a() {
        return this.a;
    }

    @Override // v33.a.AbstractC0440a
    public final String b() {
        return this.c;
    }

    @Override // v33.a.AbstractC0440a
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.a.AbstractC0440a)) {
            return false;
        }
        v33.a.AbstractC0440a abstractC0440a = (v33.a.AbstractC0440a) obj;
        return this.a.equals(abstractC0440a.a()) && this.b.equals(abstractC0440a.c()) && this.c.equals(abstractC0440a.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return l6.i(sb, this.c, "}");
    }
}
