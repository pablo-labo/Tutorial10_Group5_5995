package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mwf extends nwf {
    public final /* synthetic */ Map<kwf, wxf> c;

    public mwf(Map map) {
        this.c = map;
    }

    @Override // defpackage.byf
    public final boolean a() {
        return false;
    }

    @Override // defpackage.byf
    public final boolean e() {
        return this.c.isEmpty();
    }

    @Override // defpackage.nwf
    public final wxf g(kwf kwfVar) {
        kwfVar.getClass();
        return this.c.get(kwfVar);
    }
}
