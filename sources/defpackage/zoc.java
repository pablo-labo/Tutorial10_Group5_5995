package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class zoc implements ht2 {
    public final ikc a;
    public final EventDispatcher b;
    public final int c;
    public int d;
    public int e;

    public zoc(ikc ikcVar) {
        this.a = ikcVar;
        ReactContext reactContextF = dmc.f(ikcVar);
        this.b = dmc.e(reactContextF, ikcVar.getId());
        this.c = dmc.g(reactContextF);
    }

    @Override // defpackage.ht2
    public final void a() {
        ikc ikcVar = this.a;
        int width = ikcVar.getWidth();
        int height = ikcVar.getHeight();
        if (ikcVar.getLayout() != null) {
            width = ikcVar.getCompoundPaddingRight() + ikcVar.getLayout().getWidth() + ikcVar.getCompoundPaddingLeft();
            height = ikcVar.getCompoundPaddingBottom() + ikcVar.getLayout().getHeight() + ikcVar.getCompoundPaddingTop();
        }
        if (width == this.d && height == this.e) {
            return;
        }
        this.e = height;
        this.d = width;
        EventDispatcher eventDispatcher = this.b;
        if (eventDispatcher != null) {
            eventDispatcher.a(new akc(nn2.C(width), nn2.C(height), this.c, ikcVar.getId()));
        }
    }
}
