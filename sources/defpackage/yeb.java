package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yeb {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final List<oi6> k;
    public final long l;
    public boolean m;
    public boolean n;
    public yeb o;

    public yeb() {
        throw null;
    }

    public yeb(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = 0L;
        this.m = z3;
        this.n = z3;
    }

    public final void a() {
        yeb yebVar = this.o;
        if (yebVar == null) {
            this.m = true;
            this.n = true;
        } else if (yebVar != null) {
            yebVar.a();
        }
    }

    public final boolean b() {
        yeb yebVar = this.o;
        return yebVar != null ? yebVar.b() : this.m || this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) ooa.h(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) ooa.h(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? ViewUtilsKt.UNKNOWN_DESTINATION_URL : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = zr4.a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) ooa.h(this.j));
        sb.append(')');
        return sb.toString();
    }

    public yeb(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.k = list;
        this.l = j7;
    }
}
