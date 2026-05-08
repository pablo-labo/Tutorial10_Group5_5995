package defpackage;

import androidx.media3.datasource.a;
import androidx.media3.exoplayer.source.o;

/* JADX INFO: loaded from: classes.dex */
public final class js2 extends ea1 {
    public final int o;
    public final long p;
    public final l42 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public js2(a aVar, gf3 gf3Var, androidx.media3.common.a aVar2, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, l42 l42Var) {
        super(aVar, gf3Var, aVar2, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = l42Var;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        ga1 ga1Var = this.m;
        ka2.r(ga1Var);
        if (this.r == 0) {
            long j = this.p;
            for (o oVar : ga1Var.b) {
                if (oVar.F != j) {
                    oVar.F = j;
                    oVar.z = true;
                }
            }
            l42 l42Var = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            l42Var.a(ga1Var, j3, j4 != -9223372036854775807L ? j4 - this.p : -9223372036854775807L);
        }
        try {
            gf3 gf3VarC = this.b.c(this.r);
            ote oteVar = this.i;
            hn3 hn3Var = new hn3(oteVar, gf3VarC.f, oteVar.b(gf3VarC));
            while (!this.s && this.q.d(hn3Var)) {
                try {
                } finally {
                    this.r = hn3Var.d - this.b.f;
                }
            }
            androidx.media3.common.a aVar = this.d;
            String str = aVar.m;
            int i = aVar.M;
            int i2 = aVar.N;
            if (st9.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                zpf zpfVarA = ga1Var.a(4);
                int i3 = i * i2;
                long j5 = (this.h - this.g) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    zpfVarA.f(0, new g4b());
                    zpfVarA.a(((long) i4) * j5, 0, 0, 0, null);
                }
            }
            nn2.i(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            nn2.i(this.i);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
        this.s = true;
    }

    @Override // defpackage.lg9
    public final long c() {
        return this.j + ((long) this.o);
    }

    @Override // defpackage.lg9
    public final boolean d() {
        return this.t;
    }
}
