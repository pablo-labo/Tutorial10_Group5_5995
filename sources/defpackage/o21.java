package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class o21 extends v33.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public o21(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // v33.e.d.a.c
    public final int a() {
        return this.c;
    }

    @Override // v33.e.d.a.c
    public final int b() {
        return this.b;
    }

    @Override // v33.e.d.a.c
    public final String c() {
        return this.a;
    }

    @Override // v33.e.d.a.c
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.c)) {
            return false;
        }
        v33.e.d.a.c cVar = (v33.e.d.a.c) obj;
        return this.a.equals(cVar.c()) && this.b == cVar.b() && this.c == cVar.a() && this.d == cVar.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return z3.o(sb, this.d, "}");
    }
}
