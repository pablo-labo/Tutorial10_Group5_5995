package com.rivereactnative;

import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.rivereactnative.h;
import defpackage.l;
import defpackage.s6;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/rivereactnative/RiveReactNativeRendererModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "iosRenderer", "androidRenderer", "Lj6g;", "defaultRenderer", "(Ljava/lang/String;Ljava/lang/String;)V", "rive-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RiveReactNativeRendererModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveReactNativeRendererModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    @ReactMethod
    public final void defaultRenderer(String iosRenderer, String androidRenderer) throws Throwable {
        RendererType rendererType;
        iosRenderer.getClass();
        androidRenderer.getClass();
        h.a aVar = h.a;
        aVar.getClass();
        for (h hVar : h.values()) {
            if (wl7.b(hVar.rendererTypeName, androidRenderer)) {
                aVar.getClass();
                int iOrdinal = hVar.ordinal();
                if (iOrdinal == 0) {
                    rendererType = RendererType.Rive;
                } else {
                    if (iOrdinal != 1) {
                        l.g();
                        return;
                    }
                    rendererType = RendererType.Canvas;
                }
                Rive rive = Rive.INSTANCE;
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                reactApplicationContext.getClass();
                rive.init(reactApplicationContext, rendererType);
                return;
            }
        }
        s6.j("Array contains no element matching the predicate.");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RiveReactNativeRendererModule";
    }
}
