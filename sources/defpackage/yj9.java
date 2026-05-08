package defpackage;

import androidx.media3.exoplayer.source.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yj9 {
    public final h.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public yj9(h.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        ka2.l(!z5 || z3);
        ka2.l(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        ka2.l(z6);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final yj9 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new yj9(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final yj9 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new yj9(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yj9.class == obj.getClass()) {
            yj9 yj9Var = (yj9) obj;
            if (this.b == yj9Var.b && this.c == yj9Var.c && this.d == yj9Var.d && this.e == yj9Var.e && this.f == yj9Var.f && this.g == yj9Var.g && this.h == yj9Var.h && this.i == yj9Var.i && this.j == yj9Var.j && Objects.equals(this.a, yj9Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
