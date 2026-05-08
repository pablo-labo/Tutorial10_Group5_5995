package com.swmansion.rnscreens;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import defpackage.b0;
import defpackage.crd;
import defpackage.dmc;
import defpackage.f84;
import defpackage.ia;
import defpackage.nmc;
import defpackage.ql5;
import defpackage.sqd;
import defpackage.wqd;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNSModule")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/swmansion/rnscreens/ScreensModule;", "Lcom/swmansion/rnscreens/NativeScreensModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "jsiPtr", "Lj6g;", "nativeInstall", "(J)V", "nativeUninstall", "()V", "", "reactTag", "", "startTransition", "(Ljava/lang/Integer;)[I", "", ReactProgressBarViewManager.PROP_PROGRESS, "updateTransition", "(D)V", "", "canceled", "finishTransition", "(Ljava/lang/Integer;Z)V", "invalidate", "initialize", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "topScreenId", "I", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isActiveTransition", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/swmansion/rnscreens/NativeProxy;", "proxy", "Lcom/swmansion/rnscreens/NativeProxy;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreensModule extends NativeScreensModuleSpec {
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition;
    private NativeProxy proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.getContext());
            } else {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.w("[RNScreens]", "Could not load RNScreens module.");
        }
    }

    @f84
    private final void finishTransition(Integer reactTag, boolean canceled) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || reactTag == null) {
            Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
            return;
        }
        UIManager uIManagerK = dmc.k(this.reactContext, reactTag.intValue());
        View viewResolveView = uIManagerK != null ? uIManagerK.resolveView(reactTag.intValue()) : null;
        if (viewResolveView instanceof d) {
            if (canceled) {
                d dVar = (d) viewResolveView;
                ArrayList<sqd> arrayList = dVar.a;
                if (arrayList.size() < 2) {
                    b0.o("[RNScreens] Unable to run transition for less than 2 screens.");
                    return;
                } else {
                    androidx.fragment.app.a aVarB = dVar.b();
                    aVarB.l(((sqd) ia.k(2, arrayList)).g());
                    aVarB.j();
                }
            } else {
                d dVar2 = (d) viewResolveView;
                a topScreen = dVar2.getTopScreen();
                topScreen.getClass();
                if (dVar2.getContext() instanceof ReactContext) {
                    int iG = dmc.g(dVar2.getContext());
                    Context context = dVar2.getContext();
                    context.getClass();
                    EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, topScreen.getId());
                    if (eventDispatcherE != null) {
                        eventDispatcherE.a(new ql5(iG, topScreen.getId(), 1));
                    }
                }
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long jsiPtr);

    private final native void nativeUninstall();

    @f84
    private final int[] startTransition(Integer reactTag) {
        d dVar;
        ArrayList<wqd> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || reactTag == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager uIManagerK = dmc.k(this.reactContext, reactTag.intValue());
        View viewResolveView = uIManagerK != null ? uIManagerK.resolveView(reactTag.intValue()) : null;
        if (!(viewResolveView instanceof d) || (size = (fragments = (dVar = (d) viewResolveView).getFragments()).size()) <= 1) {
            return iArr;
        }
        this.isActiveTransition.set(true);
        ArrayList<sqd> arrayList = dVar.a;
        if (arrayList.size() < 2) {
            b0.o("[RNScreens] Unable to run transition for less than 2 screens.");
            return null;
        }
        androidx.fragment.app.a aVarB = dVar.b();
        a topScreen = dVar.getTopScreen();
        topScreen.getClass();
        Fragment fragment = topScreen.getFragment();
        fragment.getClass();
        aVarB.l(fragment);
        aVarB.d(dVar.getId(), arrayList.get(arrayList.size() - 2).g(), null, 1);
        Fragment fragment2 = topScreen.getFragment();
        fragment2.getClass();
        aVarB.d(dVar.getId(), fragment2, null, 1);
        aVarB.j();
        int id = fragments.get(size - 1).l().getId();
        this.topScreenId = id;
        iArr[0] = id;
        iArr[1] = fragments.get(size - 2).l().getId();
        return iArr;
    }

    @f84
    private final void updateTransition(double progress) {
        UiThreadUtil.assertOnUiThread();
        int i = this.topScreenId;
        if (i == -1) {
            return;
        }
        float f = (float) progress;
        short s = (short) (f == 0.0f ? 1 : f == 1.0f ? 2 : 3);
        EventDispatcher eventDispatcherE = dmc.e(this.reactContext, i);
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new crd(dmc.g(this.reactContext), this.topScreenId, f, true, true, s));
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        UIManager uIManagerI = dmc.i(this.reactContext, 2);
        uIManagerI.getClass();
        NativeProxy nativeProxy = new NativeProxy();
        nativeProxy.nativeAddMutationsListener((FabricUIManager) uIManagerI);
        this.proxy = nativeProxy;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NativeProxy nativeProxy = this.proxy;
        if (nativeProxy != null) {
            nativeProxy.invalidateNative();
        }
        nativeUninstall();
    }
}
