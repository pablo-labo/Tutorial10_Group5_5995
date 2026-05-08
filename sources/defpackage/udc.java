package defpackage;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.rnjobcard.RNJobCardModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class udc implements inc {
    public final mz a;

    public udc(mz mzVar) {
        this.a = mzVar;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return new ArrayList(u63.Z(new RNJobCardModule(reactApplicationContext, this.a)));
    }

    @Override // defpackage.inc
    public final List<ViewManager<View, koc<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
