package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public interface tqg {
    ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str);

    Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext);
}
