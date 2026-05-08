package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class lpc implements r4e {
    public final ikc a;
    public final EventDispatcher b;
    public final int c;
    public int d;
    public int e;

    public lpc(ikc ikcVar) {
        this.a = ikcVar;
        ReactContext reactContextF = dmc.f(ikcVar);
        this.b = dmc.e(reactContextF, ikcVar.getId());
        this.c = dmc.g(reactContextF);
    }

    @Override // defpackage.r4e
    public final void a(int i, int i2) {
        double d = i;
        double d2 = i2;
        int iMin = (int) Math.min(d, d2);
        int iMax = (int) Math.max(d, d2);
        if (this.d == iMin && this.e == iMax) {
            return;
        }
        EventDispatcher eventDispatcher = this.b;
        if (eventDispatcher != null) {
            eventDispatcher.a(new fpc(this.c, this.a.getId(), iMin, iMax));
        }
        this.d = iMin;
        this.e = iMax;
    }
}
