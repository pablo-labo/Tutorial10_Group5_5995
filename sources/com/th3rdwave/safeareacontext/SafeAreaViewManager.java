package com.th3rdwave.safeareacontext;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.views.view.ReactViewManager;
import defpackage.bjd;
import defpackage.fjd;
import defpackage.gjd;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.snc;
import defpackage.tpc;
import defpackage.vse;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lbjd;", "createViewInstance", "(Lmkf;)Lbjd;", "Lgjd;", "createShadowNodeInstance", "()Lgjd;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "Lj6g;", "setMode", "(Lbjd;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lbjd;Lcom/facebook/react/bridge/ReadableMap;)V", "Ltpc;", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Ltpc;Lnoc;Lvse;)Ljava/lang/Object;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeAreaViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public gjd createShadowNodeInstance() {
        return new gjd();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public bjd createViewInstance(mkf context) {
        context.getClass();
        bjd bjdVar = new bjd(context);
        bjdVar.a = fjd.a;
        return bjdVar;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<gjd> getShadowNodeClass() {
        return gjd.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @defpackage.snc(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEdges(defpackage.bjd r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            r4 = this;
            r5.getClass()
            if (r6 == 0) goto L70
            java.lang.String r4 = "top"
            java.lang.String r4 = r6.getString(r4)
            cjd r0 = defpackage.cjd.a
            if (r4 == 0) goto L1e
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r1)
            r4.getClass()
            cjd r4 = defpackage.cjd.valueOf(r4)
            if (r4 != 0) goto L1f
        L1e:
            r4 = r0
        L1f:
            java.lang.String r1 = "right"
            java.lang.String r1 = r6.getString(r1)
            if (r1 == 0) goto L36
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            r1.getClass()
            cjd r1 = defpackage.cjd.valueOf(r1)
            if (r1 != 0) goto L37
        L36:
            r1 = r0
        L37:
            java.lang.String r2 = "bottom"
            java.lang.String r2 = r6.getString(r2)
            if (r2 == 0) goto L4e
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            r2.getClass()
            cjd r2 = defpackage.cjd.valueOf(r2)
            if (r2 != 0) goto L4f
        L4e:
            r2 = r0
        L4f:
            java.lang.String r3 = "left"
            java.lang.String r6 = r6.getString(r3)
            if (r6 == 0) goto L68
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toUpperCase(r3)
            r6.getClass()
            cjd r6 = defpackage.cjd.valueOf(r6)
            if (r6 != 0) goto L67
            goto L68
        L67:
            r0 = r6
        L68:
            djd r6 = new djd
            r6.<init>(r4, r1, r2, r0)
            r5.setEdges(r6)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(bjd, com.facebook.react.bridge.ReadableMap):void");
    }

    @snc(name = "mode")
    public final void setMode(bjd view, String mode) {
        view.getClass();
        if (wl7.b(mode, "padding")) {
            view.setMode(fjd.a);
        } else if (wl7.b(mode, "margin")) {
            view.setMode(fjd.b);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(tpc view, noc props, vse stateWrapper) {
        view.getClass();
        ((bjd) view).setStateWrapper(stateWrapper);
        return null;
    }
}
