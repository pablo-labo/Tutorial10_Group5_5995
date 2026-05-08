package defpackage;

import defpackage.dzh;
import defpackage.lxh;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pxh extends qxh<dzh.e> {
    @Override // defpackage.qxh
    public final int a(Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.qxh
    public final uxh<dzh.e> b(Object obj) {
        return ((dzh.b) obj).zzc;
    }

    @Override // defpackage.qxh
    public final dzh.d c(lxh lxhVar, l3i l3iVar, int i) {
        return lxhVar.a.get(new lxh.a(i, l3iVar));
    }

    @Override // defpackage.qxh
    public final void d(Map.Entry entry) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.qxh
    public final boolean e(l3i l3iVar) {
        return l3iVar instanceof dzh.b;
    }

    @Override // defpackage.qxh
    public final uxh<dzh.e> f(Object obj) {
        return ((dzh.b) obj).r();
    }

    @Override // defpackage.qxh
    public final void g(Object obj) {
        uxh<dzh.e> uxhVar = ((dzh.b) obj).zzc;
        if (uxhVar.b) {
            return;
        }
        uxhVar.a.d();
        uxhVar.b = true;
    }
}
