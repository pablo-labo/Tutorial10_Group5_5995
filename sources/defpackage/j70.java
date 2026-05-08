package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j70 implements oxa {
    public final Context a;
    public final iy3 b;
    public final long c;
    public final gza d;

    public j70(Context context, iy3 iy3Var, long j, gza gzaVar) {
        this.a = context;
        this.b = iy3Var;
        this.c = j;
        this.d = gzaVar;
    }

    @Override // defpackage.oxa
    public final i70 a() {
        return new i70(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j70.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j70 j70Var = (j70) obj;
        return wl7.b(this.a, j70Var.a) && wl7.b(this.b, j70Var.b) && da2.c(this.c, j70Var.c) && wl7.b(this.d, j70Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = da2.j;
        return this.d.hashCode() + ia.d(iHashCode, 31, this.c);
    }
}
