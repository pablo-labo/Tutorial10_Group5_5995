package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.github.douglasjunior.reactNativePdfRenderer.modules.PdfRendererViewManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i7b extends qa1 {
    @Override // defpackage.qa1, defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new PdfRendererViewManager(reactApplicationContext));
    }

    @Override // defpackage.qa1
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if ("RNPdfRendererView".equals(str)) {
            return new PdfRendererViewManager(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.qa1
    public final omc getReactModuleInfoProvider() {
        return new h7b();
    }
}
