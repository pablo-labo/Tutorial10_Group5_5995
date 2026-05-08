package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.scroll.g;

/* JADX INFO: loaded from: classes2.dex */
public final class kpc implements dsd {
    public final ikc a;
    public final EventDispatcher b;
    public final int c;
    public int d;
    public int e;

    public kpc(ikc ikcVar) {
        this.a = ikcVar;
        ReactContext reactContextF = dmc.f(ikcVar);
        this.b = dmc.e(reactContextF, ikcVar.getId());
        this.c = dmc.g(reactContextF);
    }

    @Override // defpackage.dsd
    public final void a(int i, int i2) {
        if (this.d == i && this.e == i2) {
            return;
        }
        pgb<f> pgbVar = f.k;
        ikc ikcVar = this.a;
        f fVarA = f.a.a(this.c, ikcVar.getId(), g.d, i, i2, 0.0f, 0.0f, 0, 0, ikcVar.getWidth(), ikcVar.getHeight());
        EventDispatcher eventDispatcher = this.b;
        if (eventDispatcher != null) {
            eventDispatcher.a(fVarA);
        }
        this.d = i;
        this.e = i2;
    }
}
