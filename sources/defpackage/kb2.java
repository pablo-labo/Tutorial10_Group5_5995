package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class kb2 {
    public final g4a a;
    public final g4a b;
    public final g4a c;
    public final g4a d;
    public final g4a e;
    public final g4a f;
    public final g4a g;
    public final g4a h;
    public final g4a i;
    public final g4a j;
    public final g4a k;
    public final g4a l;
    public final g4a m;

    public kb2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        da2 da2Var = new da2(j);
        wab wabVar = wab.a0;
        this.a = r.e(da2Var, wabVar);
        this.b = r.e(new da2(j2), wabVar);
        this.c = r.e(new da2(j3), wabVar);
        this.d = r.e(new da2(j4), wabVar);
        this.e = r.e(new da2(j5), wabVar);
        this.f = r.e(new da2(j6), wabVar);
        this.g = r.e(new da2(j7), wabVar);
        this.h = r.e(new da2(j8), wabVar);
        this.i = r.e(new da2(j9), wabVar);
        this.j = r.e(new da2(j10), wabVar);
        this.k = r.e(new da2(j11), wabVar);
        this.l = r.e(new da2(j12), wabVar);
        this.m = r.e(Boolean.valueOf(z), wabVar);
    }

    public final long a() {
        return ((da2) ((gme) this.e).getValue()).a;
    }

    public final long b() {
        return ((da2) ((gme) this.g).getValue()).a;
    }

    public final long c() {
        return ((da2) ((gme) this.k).getValue()).a;
    }

    public final long d() {
        return ((da2) ((gme) this.a).getValue()).a;
    }

    public final long e() {
        return ((da2) ((gme) this.c).getValue()).a;
    }

    public final long f() {
        return ((da2) ((gme) this.f).getValue()).a;
    }

    public final boolean g() {
        return ((Boolean) ((gme) this.m).getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) da2.i(d()));
        sb.append(", primaryVariant=");
        sb.append((Object) da2.i(((da2) ((gme) this.b).getValue()).a));
        sb.append(", secondary=");
        sb.append((Object) da2.i(e()));
        sb.append(", secondaryVariant=");
        sb.append((Object) da2.i(((da2) ((gme) this.d).getValue()).a));
        sb.append(", background=");
        sb.append((Object) da2.i(a()));
        sb.append(", surface=");
        sb.append((Object) da2.i(f()));
        sb.append(", error=");
        sb.append((Object) da2.i(b()));
        sb.append(", onPrimary=");
        h5.j(((da2) ((gme) this.h).getValue()).a, ", onSecondary=", sb);
        h5.j(((da2) ((gme) this.i).getValue()).a, ", onBackground=", sb);
        sb.append((Object) da2.i(((da2) ((gme) this.j).getValue()).a));
        sb.append(", onSurface=");
        sb.append((Object) da2.i(c()));
        sb.append(", onError=");
        sb.append((Object) da2.i(((da2) ((gme) this.l).getValue()).a));
        sb.append(", isLight=");
        sb.append(g());
        sb.append(')');
        return sb.toString();
    }
}
