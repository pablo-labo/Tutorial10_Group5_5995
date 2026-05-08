package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes3.dex */
public final class jrd extends xm8 {
    public ReactApplicationContext o0;

    @Override // defpackage.loc, defpackage.koc
    public final void I(iaa iaaVar) {
        iaaVar.getClass();
        UIManagerModule uIManagerModule = (UIManagerModule) this.o0.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new i73(this, 10));
        }
    }
}
