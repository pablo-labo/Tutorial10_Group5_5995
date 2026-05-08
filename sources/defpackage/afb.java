package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class afb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public afb() {
        throw null;
    }

    public afb(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afb)) {
            return false;
        }
        afb afbVar = (afb) obj;
        return web.m(this.a, afbVar.a) && this.b == afbVar.b && ooa.c(this.c, afbVar.c) && ooa.c(this.d, afbVar.d) && this.e == afbVar.e && Float.compare(this.f, afbVar.f) == 0 && this.g == afbVar.g && this.h == afbVar.h && wl7.b(this.i, afbVar.i) && ooa.c(this.j, afbVar.j) && ooa.c(this.k, afbVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + ia.d(z3.d(this.i, ia.f(w40.c(this.g, k6.c(ia.f(ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), 31), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) ooa.h(this.c));
        sb.append(", position=");
        sb.append((Object) ooa.h(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) ooa.h(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) ooa.h(this.k));
        sb.append(')');
        return sb.toString();
    }
}
