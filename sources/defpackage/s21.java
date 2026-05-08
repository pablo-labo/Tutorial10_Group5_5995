package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class s21 extends v33.e.d.AbstractC0448e.a {
    public final String a;
    public final String b;

    public s21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // v33.e.d.AbstractC0448e.a
    public final String a() {
        return this.a;
    }

    @Override // v33.e.d.AbstractC0448e.a
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.AbstractC0448e.a)) {
            return false;
        }
        v33.e.d.AbstractC0448e.a aVar = (v33.e.d.AbstractC0448e.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return l6.i(sb, this.b, "}");
    }
}
