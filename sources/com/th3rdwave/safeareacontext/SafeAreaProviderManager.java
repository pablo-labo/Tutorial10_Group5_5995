package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.dmc;
import defpackage.gf4;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.lf7;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.ptc;
import defpackage.qv5;
import defpackage.ubc;
import defpackage.wu5;
import defpackage.xid;
import defpackage.yid;
import defpackage.yqg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = SafeAreaProviderManager.REACT_CLASS)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lxid;", "", "<init>", "()V", "Lubc;", "kotlin.jvm.PlatformType", "getDelegate", "()Lubc;", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lxid;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "view", "Lj6g;", "addEventEmitters", "(Lmkf;Lxid;)V", "mDelegate", "Lubc;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaProviderManager extends ViewGroupManager<xid> implements yqg {
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final ubc<xid, SafeAreaProviderManager> mDelegate;

    public /* synthetic */ class b extends qv5 implements wu5<xid, gf4, ptc, j6g> {
        public static final b a = new b(3, yid.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);

        @Override // defpackage.wu5
        public final j6g q(xid xidVar, gf4 gf4Var, ptc ptcVar) {
            xid xidVar2 = xidVar;
            gf4 gf4Var2 = gf4Var;
            ptc ptcVar2 = ptcVar;
            xidVar2.getClass();
            gf4Var2.getClass();
            ptcVar2.getClass();
            Context context = xidVar2.getContext();
            context.getClass();
            ReactContext reactContext = (ReactContext) context;
            int id = xidVar2.getId();
            EventDispatcher eventDispatcherE = dmc.e(reactContext, id);
            if (eventDispatcherE != null) {
                eventDispatcherE.a(new lf7(dmc.g(reactContext), id, gf4Var2, ptcVar2));
            }
            return j6g.a;
        }
    }

    public SafeAreaProviderManager() {
        super(null, 1, null);
        this.mDelegate = new ubc<>(this);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, xid view) {
        reactContext.getClass();
        view.getClass();
        super.addEventEmitters(reactContext, view);
        view.setOnInsetsChangeHandler(b.a);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xid createViewInstance(mkf context) {
        context.getClass();
        return new xid(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return lc9.b0(new Pair("topInsetsChange", lc9.b0(new Pair("registrationName", "onInsetsChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ubc<xid, SafeAreaProviderManager> getDelegate() {
        return this.mDelegate;
    }
}
