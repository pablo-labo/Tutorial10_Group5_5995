package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih9 implements k.c, x.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ih9(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // androidx.media3.session.x.b
    public void a(vdb vdbVar, r.d dVar) {
        vdbVar.m0(((x) this.b).k1(dVar, vdbVar, this.a));
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.b;
        gVar.r0(kVar.c, i, this.a);
    }
}
