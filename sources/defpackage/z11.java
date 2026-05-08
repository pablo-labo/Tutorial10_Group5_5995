package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class z11 extends v33.c {
    public final String a;
    public final String b;

    public z11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // v33.c
    public final String a() {
        return this.a;
    }

    @Override // v33.c
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.c)) {
            return false;
        }
        v33.c cVar = (v33.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return l6.i(sb, this.b, "}");
    }
}
