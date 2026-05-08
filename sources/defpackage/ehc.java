package defpackage;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.indeed.android.rnserp.RNSerpModule;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class ehc implements inc {
    public final OkHttpClient a;
    public final lt b;

    public ehc(OkHttpClient okHttpClient, lt ltVar) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.b = ltVar;
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return new ArrayList(u63.Z(new RNSerpModule(reactApplicationContext, this.a, this.b)));
    }

    @Override // defpackage.inc
    public final List<ViewManager<View, koc<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
