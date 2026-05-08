package expo.modules;

import android.content.Context;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.hermes.HermesInstance;
import defpackage.inc;
import defpackage.pnc;
import defpackage.r6;
import defpackage.wve;
import defpackage.xmc;
import defpackage.ymc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"expo/modules/ExpoReactHostFactory$ExpoReactHostDelegate", "Lcom/facebook/react/runtime/ReactHostDelegate;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "weakContext", "Lymc;", "reactNativeHostWrapper", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lpnc$a;", "turboModuleManagerDelegateBuilder", "<init>", "(Ljava/lang/ref/WeakReference;Lymc;Lcom/facebook/react/runtime/BindingsInstaller;Lpnc$a;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lj6g;", "handleInstanceException", "(Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "Lymc;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "Lpnc$a;", "getTurboModuleManagerDelegateBuilder", "()Lpnc$a;", "Lcom/facebook/react/bridge/JSBundleLoader;", "_jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "getJsMainModulePath", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "", "Linc;", "getReactPackages", "()Ljava/util/List;", "reactPackages", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ExpoReactHostFactory$ExpoReactHostDelegate implements ReactHostDelegate {
    private JSBundleLoader _jsBundleLoader;
    private final BindingsInstaller bindingsInstaller;
    private final ymc reactNativeHostWrapper;
    private final pnc.a turboModuleManagerDelegateBuilder;
    private final WeakReference<Context> weakContext;

    public ExpoReactHostFactory$ExpoReactHostDelegate(WeakReference<Context> weakReference, ymc ymcVar, BindingsInstaller bindingsInstaller, pnc.a aVar) {
        weakReference.getClass();
        ymcVar.getClass();
        aVar.getClass();
        this.weakContext = weakReference;
        this.reactNativeHostWrapper = ymcVar;
        this.bindingsInstaller = bindingsInstaller;
        this.turboModuleManagerDelegateBuilder = aVar;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSBundleLoader getJsBundleLoader() {
        JSBundleLoader jSBundleLoader = this._jsBundleLoader;
        if (jSBundleLoader != null) {
            return jSBundleLoader;
        }
        Context context = this.weakContext.get();
        if (context == null) {
            r6.g("Unable to get concrete Context");
            return null;
        }
        String jSBundleFile = this.reactNativeHostWrapper.getJSBundleFile();
        if (jSBundleFile != null) {
            return wve.K(jSBundleFile, "assets://", false) ? JSBundleLoader.INSTANCE.createAssetLoader(context, jSBundleFile, true) : JSBundleLoader.INSTANCE.createFileLoader(jSBundleFile);
        }
        String bundleAssetName = this.reactNativeHostWrapper.getBundleAssetName();
        return JSBundleLoader.INSTANCE.createAssetLoader(context, "assets://" + bundleAssetName, true);
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public String getJsMainModulePath() {
        return this.reactNativeHostWrapper.getJSMainModuleName();
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSRuntimeFactory getJsRuntimeFactory() {
        return new HermesInstance();
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public List<inc> getReactPackages() {
        return this.reactNativeHostWrapper.getPackages();
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public pnc.a getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public void handleInstanceException(Exception error) throws Exception {
        error.getClass();
        ArrayList arrayList = this.reactNativeHostWrapper.e;
        if (arrayList.isEmpty()) {
            throw error;
        }
        this.reactNativeHostWrapper.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xmc) it.next()).getClass();
        }
    }

    public /* synthetic */ ExpoReactHostFactory$ExpoReactHostDelegate(WeakReference weakReference, ymc ymcVar, BindingsInstaller bindingsInstaller, pnc.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, ymcVar, (i & 4) != 0 ? null : bindingsInstaller, (i & 8) != 0 ? new DefaultTurboModuleManagerDelegate.a() : aVar);
    }
}
