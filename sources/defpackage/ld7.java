package defpackage;

import androidx.media3.datasource.a;
import defpackage.l42;

/* JADX INFO: loaded from: classes.dex */
public final class ld7 extends k42 {
    public final l42 j;
    public l42.a k;
    public long l;
    public volatile boolean m;

    public ld7(a aVar, gf3 gf3Var, androidx.media3.common.a aVar2, int i, Object obj, l42 l42Var) {
        super(aVar, gf3Var, 2, aVar2, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = l42Var;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        if (this.l == 0) {
            this.j.a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            gf3 gf3VarC = this.b.c(this.l);
            ote oteVar = this.i;
            hn3 hn3Var = new hn3(oteVar, gf3VarC.f, oteVar.b(gf3VarC));
            while (!this.m && this.j.d(hn3Var)) {
                try {
                } finally {
                    this.l = hn3Var.d - this.b.f;
                    this.j.c();
                }
            }
        } finally {
            nn2.i(this.i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
        this.m = true;
    }
}
