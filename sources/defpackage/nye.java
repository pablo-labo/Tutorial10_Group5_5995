package defpackage;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;

/* JADX INFO: loaded from: classes.dex */
public final class nye extends d37 {
    public final Drawable a;
    public final v27 b;
    public final ze3 c;
    public final MemoryCache.Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public nye(Drawable drawable, v27 v27Var, ze3 ze3Var, MemoryCache.Key key, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = v27Var;
        this.c = ze3Var;
        this.d = key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.d37
    public final v27 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nye)) {
            return false;
        }
        nye nyeVar = (nye) obj;
        return wl7.b(this.a, nyeVar.a) && wl7.b(this.b, nyeVar.b) && this.c == nyeVar.c && wl7.b(this.d, nyeVar.d) && wl7.b(this.e, nyeVar.e) && this.f == nyeVar.f && this.g == nyeVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.d;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + ia.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
