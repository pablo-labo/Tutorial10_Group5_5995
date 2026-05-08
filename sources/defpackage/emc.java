package defpackage;

import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.fmc;
import defpackage.uzg;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class emc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ emc(fmc.a aVar, boolean z) {
        this.c = aVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fmc.a aVar = (fmc.a) this.c;
                boolean z = this.b;
                fmc fmcVar = aVar.a;
                w24 w24Var = fmcVar.h;
                if (z) {
                    w24Var.w();
                } else if (w24Var.z() && !fmcVar.y) {
                    s55.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
                    JSBundleLoader jSBundleLoaderCreateCachedBundleFromNetworkLoader = JSBundleLoader.createCachedBundleFromNetworkLoader(w24Var.m(), w24Var.c());
                    JavaScriptExecutorFactory javaScriptExecutorFactory = fmcVar.e;
                    s55.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
                    UiThreadUtil.assertOnUiThread();
                    fmc.c cVar = new fmc.c(javaScriptExecutorFactory, jSBundleLoaderCreateCachedBundleFromNetworkLoader);
                    if (fmcVar.d != null) {
                        fmcVar.c = cVar;
                    } else {
                        fmcVar.m(cVar);
                    }
                } else {
                    fmcVar.k();
                }
                break;
            default:
                boolean z2 = this.b;
                uzg.g gVar = ((uzg) this.c).a;
                if (!z2) {
                    gVar.f(1);
                } else {
                    gVar.a(1);
                }
                break;
        }
    }

    public /* synthetic */ emc(boolean z, uzg uzgVar) {
        this.b = z;
        this.c = uzgVar;
    }
}
