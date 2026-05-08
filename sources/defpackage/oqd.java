package defpackage;

import defpackage.nzg;
import defpackage.rzg;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oqd extends nzg.b {
    public final /* synthetic */ pqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqd(pqd pqdVar) {
        super(0);
        this.c = pqdVar;
    }

    @Override // nzg.b
    public final void a(nzg nzgVar) {
        this.c.c = false;
    }

    @Override // nzg.b
    public final rzg d(rzg rzgVar, List<nzg> list) {
        rzgVar.getClass();
        list.getClass();
        rzg.j jVar = rzgVar.a;
        int i = jVar.g(8).d - jVar.g(2).d;
        pqd pqdVar = this.c;
        pqdVar.e = i;
        pqdVar.i(pqdVar.b, pqdVar.getReactHeight(), pqd.h(pqdVar, pqdVar.d), pqdVar.e);
        return rzgVar;
    }

    @Override // nzg.b
    public final nzg.a e(nzg nzgVar, nzg.a aVar) {
        this.c.c = true;
        return aVar;
    }
}
