package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface inc {
    @sy3
    default List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        return zr4.a;
    }

    List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext);
}
