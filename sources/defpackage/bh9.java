package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh9 implements k.c, x.e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bh9(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        qyc qycVarN = e47.n((ij9) this.b);
        boolean z = this.a;
        return sVar.t(dVar, qycVarN, z ? -1 : sVar.t.v0(), z ? -9223372036854775807L : sVar.t.K0());
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.b;
        gVar.v(kVar.c, i, this.a);
    }
}
