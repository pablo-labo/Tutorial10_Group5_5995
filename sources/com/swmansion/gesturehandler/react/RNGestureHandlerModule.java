package com.swmansion.gesturehandler.react;

import android.util.Log;
import android.view.ViewGroup;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.bdc;
import defpackage.bg;
import defpackage.bp4;
import defpackage.cdc;
import defpackage.j6g;
import defpackage.m6;
import defpackage.nmc;
import defpackage.qa0;
import defpackage.r6;
import defpackage.wcc;
import defpackage.wnc;
import defpackage.xcc;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020*H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010/J\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b:\u00109R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lj6g;", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcdc;", "findRootHelperForViewAncestor", "(I)Lcdc;", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "newState", "setGestureHandlerState", "(II)V", "install", "()Z", "invalidate", "root", "registerRootHelper", "(Lcdc;)V", "unregisterRootHelper", "Lbdc;", "registry", "Lbdc;", "getRegistry", "()Lbdc;", "Lwcc;", "eventDispatcher", "Lwcc;", "Lycc;", "interactionManager", "Lycc;", "", "roots", "Ljava/util/List;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec {
    public static final String NAME = "RNGestureHandlerModule";
    private final wcc eventDispatcher;
    private final ycc interactionManager;
    private final bdc registry;
    private final List<cdc> roots;

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.registry = new bdc();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        reactApplicationContext2.getClass();
        this.eventDispatcher = new wcc(reactApplicationContext2);
        this.interactionManager = new ycc();
        this.roots = new ArrayList();
    }

    private final <T extends GestureHandler> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        GestureHandler.a<?> aVar;
        if (this.registry.d(handlerTag) != null) {
            r6.g(bg.d(handlerTag, "Handler with tag ", " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors."));
            return;
        }
        handlerName.getClass();
        GestureHandler.a<?>[] aVarArr = xcc.a;
        int i = 0;
        while (true) {
            if (i >= 9) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i];
            if (aVar.c().equals(handlerName)) {
                break;
            } else {
                i++;
            }
        }
        if (aVar == null) {
            m6.m("Invalid handler name ".concat(handlerName));
            return;
        }
        GestureHandler gestureHandlerA = aVar.a(getReactApplicationContext());
        gestureHandlerA.d = handlerTag;
        gestureHandlerA.B = this.eventDispatcher;
        bdc bdcVar = this.registry;
        synchronized (bdcVar) {
            bdcVar.a.put(gestureHandlerA.d, gestureHandlerA);
        }
        this.interactionManager.a(gestureHandlerA, config);
        aVar.e(gestureHandlerA, config);
    }

    private final native void decorateRuntime(long jsiPtr);

    private final cdc findRootHelperForViewAncestor(int viewTag) {
        cdc cdcVar;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        NativeModule nativeModule = reactApplicationContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        nativeModule.getClass();
        int iResolveRootTagFromReactTag = ((UIManagerModule) nativeModule).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                Iterator<T> it = this.roots.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ViewGroup viewGroup = ((cdc) next).d;
                    if ((viewGroup instanceof wnc) && ((wnc) viewGroup).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = next;
                        break;
                    }
                }
                cdcVar = (cdc) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cdcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$1(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.l("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            javaScriptContextHolder.getClass();
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.getContext());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    private final <T extends GestureHandler> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        GestureHandler.a<?> aVar;
        GestureHandler gestureHandlerD = this.registry.d(handlerTag);
        if (gestureHandlerD == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= 9) {
                aVar = null;
                break;
            }
            aVar = xcc.a[i];
            if (aVar.d().equals(gestureHandlerD.getClass())) {
                break;
            } else {
                i++;
            }
        }
        if (aVar == null) {
            return;
        }
        ycc yccVar = this.interactionManager;
        yccVar.a.remove(handlerTag);
        yccVar.b.remove(handlerTag);
        this.interactionManager.a(gestureHandlerD, config);
        aVar.e(gestureHandlerD, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i = (int) handlerTagDouble;
        if (this.registry.a(i, (int) viewTagDouble, (int) actionTypeDouble)) {
            return;
        }
        m6.m(bg.d(i, "Handler with tag ", " does not exists"));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String handlerName, double handlerTagDouble, ReadableMap config) {
        handlerName.getClass();
        config.getClass();
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i = (int) handlerTagDouble;
        ycc yccVar = this.interactionManager;
        yccVar.a.remove(i);
        yccVar.b.remove(i);
        this.registry.c(i);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final bdc getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        cdc cdcVarFindRootHelperForViewAncestor = findRootHelperForViewAncestor((int) viewTagDouble);
        if (cdcVarFindRootHelperForViewAncestor == null || !blockNativeResponder) {
            return;
        }
        UiThreadUtil.runOnUiThread(new bp4(cdcVarFindRootHelperForViewAncestor, 1));
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new qa0(this, 5));
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        bdc bdcVar = this.registry;
        synchronized (bdcVar) {
            bdcVar.a.clear();
            bdcVar.b.clear();
            bdcVar.c.clear();
        }
        ycc yccVar = this.interactionManager;
        yccVar.a.clear();
        yccVar.b.clear();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    this.roots.size();
                    this.roots.get(0).b();
                    this.roots.size();
                } catch (Throwable th) {
                    throw th;
                }
            }
            j6g j6gVar = j6g.a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(cdc root) {
        root.getClass();
        synchronized (this.roots) {
            this.roots.contains(root);
            this.roots.add(root);
        }
    }

    public void setGestureHandlerState(int handlerTag, int newState) {
        GestureHandler gestureHandlerD = this.registry.d(handlerTag);
        if (gestureHandlerD != null) {
            if (newState == 1) {
                gestureHandlerD.l();
                return;
            }
            if (newState == 2) {
                gestureHandlerD.d();
                return;
            }
            if (newState == 3) {
                gestureHandlerD.e();
            } else if (newState == 4) {
                gestureHandlerD.a(true);
            } else {
                if (newState != 5) {
                    return;
                }
                gestureHandlerD.j();
            }
        }
    }

    public final void unregisterRootHelper(cdc root) {
        root.getClass();
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, ReadableMap config) {
        config.getClass();
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }
}
