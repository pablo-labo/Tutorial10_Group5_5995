package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.source.o;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class she extends ea1 {
    public final int o;
    public final a p;
    public long q;
    public boolean r;

    public she(androidx.media3.datasource.a aVar, gf3 gf3Var, a aVar2, int i, Object obj, long j, long j2, long j3, int i2, a aVar3) {
        super(aVar, gf3Var, aVar2, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = aVar3;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        ote oteVar = this.i;
        ga1 ga1Var = this.m;
        ka2.r(ga1Var);
        int iC = 0;
        for (o oVar : ga1Var.b) {
            if (oVar.F != 0) {
                oVar.F = 0L;
                oVar.z = true;
            }
        }
        zpf zpfVarA = ga1Var.a(this.o);
        zpfVarA.d(this.p);
        try {
            long jB = oteVar.b(this.b.c(this.q));
            if (jB != -1) {
                jB += this.q;
            }
            hn3 hn3Var = new hn3(this.i, this.q, jB);
            while (true) {
                long j = this.q;
                if (iC == -1) {
                    zpfVarA.a(this.g, 1, (int) j, 0, null);
                    nn2.i(oteVar);
                    this.r = true;
                    return;
                }
                this.q = j + ((long) iC);
                iC = zpfVarA.c(hn3Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            nn2.i(oteVar);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
    }

    @Override // defpackage.lg9
    public final boolean d() {
        return this.r;
    }
}
