package defpackage;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import com.indeed.android.rnprofile.RNProfileModalNativeModule;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import com.indeed.android.rnprofile.bridge.NativeTabContentManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gec implements inc {
    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return new ArrayList(u63.a0(new RNProfileFormsModule(reactApplicationContext), new RNProfileModalNativeModule(reactApplicationContext), new RNProfileScreenModule(reactApplicationContext)));
    }

    @Override // defpackage.inc
    public final List<ViewManager<View, koc<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return u63.d0(new NativeTabContentManager());
    }
}
