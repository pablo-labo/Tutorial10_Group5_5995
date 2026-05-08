package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nva {
    public final Context a;
    public final iie b;
    public final umd c;
    public final dib d;
    public final String e;
    public final pa5 f;
    public final ut1 g;
    public final ut1 h;
    public final ut1 i;
    public final q55 j;

    public nva(Context context, iie iieVar, umd umdVar, dib dibVar, String str, pa5 pa5Var, ut1 ut1Var, ut1 ut1Var2, ut1 ut1Var3, q55 q55Var) {
        this.a = context;
        this.b = iieVar;
        this.c = umdVar;
        this.d = dibVar;
        this.e = str;
        this.f = pa5Var;
        this.g = ut1Var;
        this.h = ut1Var2;
        this.i = ut1Var3;
        this.j = q55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nva)) {
            return false;
        }
        nva nvaVar = (nva) obj;
        return wl7.b(this.a, nvaVar.a) && wl7.b(this.b, nvaVar.b) && this.c == nvaVar.c && this.d == nvaVar.d && wl7.b(this.e, nvaVar.e) && wl7.b(this.f, nvaVar.f) && this.g == nvaVar.g && this.h == nvaVar.h && this.i == nvaVar.i && wl7.b(this.j, nvaVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
