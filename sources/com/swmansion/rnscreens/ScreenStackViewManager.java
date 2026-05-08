package com.swmansion.rnscreens;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.jrd;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.sqd;
import defpackage.sqg;
import defpackage.xm8;
import defpackage.yqg;
import defpackage.zbc;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = ScreenStackViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/d;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/a;", "screen", "Lj6g;", "prepareOutTransition", "(Lcom/swmansion/rnscreens/a;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/d;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/d;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/d;I)V", "invalidate", "getChildCount", "(Lcom/swmansion/rnscreens/d;)I", "getChildAt", "(Lcom/swmansion/rnscreens/d;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lxm8;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lxm8;", "", "needsCustomLayoutForChildren", "()Z", "Lsqg;", "getDelegate", "()Lsqg;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackViewManager extends ViewGroupManager<d> implements yqg {
    public static final String REACT_CLASS = "RNSScreenStack";
    private final sqg<d> delegate;

    public ScreenStackViewManager() {
        super(null, 1, null);
        this.delegate = new zbc(this, 1);
    }

    private final void prepareOutTransition(a screen) {
        if (screen == null || screen.h0) {
            return;
        }
        screen.h0 = true;
        screen.e(screen);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (!(child instanceof a)) {
            l5.q("Attempt attach child that is not of type Screen");
            return;
        }
        ConcurrentHashMap<Integer, WeakReference<a>> concurrentHashMap = NativeProxy.a;
        a aVar = (a) child;
        NativeProxy.a.put(Integer.valueOf(aVar.getId()), new WeakReference<>(aVar));
        sqd sqdVarA = parent.a(aVar);
        aVar.setFragmentWrapper(sqdVarA);
        parent.a.add(index, sqdVarA);
        aVar.setContainer(parent);
        parent.e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance(ReactApplicationContext context) {
        context.getClass();
        jrd jrdVar = new jrd();
        jrdVar.o0 = context;
        return jrdVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new d(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(d parent, int index) {
        parent.getClass();
        return parent.a.get(index).l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(d parent) {
        parent.getClass();
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<d> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("topFinishTransitioning", lc9.b0(new Pair("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ConcurrentHashMap<Integer, WeakReference<a>> concurrentHashMap = NativeProxy.a;
        NativeProxy.a.clear();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d parent, int index) {
        parent.getClass();
        a aVarL = parent.a.get(index).l();
        prepareOutTransition(aVarL);
        parent.i(index);
        ConcurrentHashMap<Integer, WeakReference<a>> concurrentHashMap = NativeProxy.a;
        NativeProxy.a.remove(Integer.valueOf(aVarL.getId()));
    }
}
