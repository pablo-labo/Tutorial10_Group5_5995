package defpackage;

import defpackage.yg5;
import defpackage.zxd;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public abstract class nue {
    public zpf b;
    public o55 c;
    public cpa d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final apa a = new apa();
    public a j = new a();

    public static class a {
        public androidx.media3.common.a a;
        public yg5.a b;
    }

    public static final class b implements cpa {
        @Override // defpackage.cpa
        public final long a(n55 n55Var) {
            return -1L;
        }

        @Override // defpackage.cpa
        public final zxd b() {
            return new zxd.b(-9223372036854775807L);
        }

        @Override // defpackage.cpa
        public final void c(long j) {
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(g4b g4bVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(g4b g4bVar, long j, a aVar);

    public void d(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
