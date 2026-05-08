package defpackage;

import defpackage.qn9;

/* JADX INFO: loaded from: classes.dex */
public final class mye implements c37 {
    public final k07 a;
    public final w27 b;
    public final we3 c;
    public final qn9.b d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public mye(k07 k07Var, w27 w27Var, we3 we3Var, qn9.b bVar, String str, boolean z, boolean z2) {
        this.a = k07Var;
        this.b = w27Var;
        this.c = we3Var;
        this.d = bVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.c37
    public final w27 a() {
        return this.b;
    }

    @Override // defpackage.c37
    public final k07 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mye)) {
            return false;
        }
        mye myeVar = (mye) obj;
        return wl7.b(this.a, myeVar.a) && wl7.b(this.b, myeVar.b) && this.c == myeVar.c && wl7.b(this.d, myeVar.d) && wl7.b(this.e, myeVar.e) && this.f == myeVar.f && this.g == myeVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        qn9.b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + ia.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return m6.i(sb, this.g, ')');
    }
}
