package com.swmansion.rnscreens;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.rnscreens.g;
import defpackage.dfc;
import defpackage.l5;
import defpackage.m6;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.snc;
import defpackage.so9;
import defpackage.sqg;
import defpackage.vse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/g;", "Ldfc;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/g;", "view", "type", "Lj6g;", "setType", "(Lcom/swmansion/rnscreens/g;Ljava/lang/String;)V", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/g;Lnoc;Lvse;)Ljava/lang/Object;", "Lsqg;", "getDelegate", "()Lsqg;", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<g> implements dfc<g> {
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final sqg<g> delegate;

    public ScreenStackHeaderSubviewManager() {
        super(null, 1, null);
        this.delegate = new so9(this, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(mkf context) {
        context.getClass();
        g gVar = new g(context);
        gVar.a0 = g.a.c;
        return gVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<g> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.dfc
    @snc(name = "type")
    public void setType(g view, String type) {
        g.a aVar;
        view.getClass();
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals("center")) {
                        aVar = g.a.b;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals(WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME)) {
                        aVar = g.a.d;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals(GesturesListener.SCROLL_DIRECTION_LEFT)) {
                        aVar = g.a.a;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals(GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                        aVar = g.a.c;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        aVar = g.a.e;
                        view.setType(aVar);
                        return;
                    }
                    break;
            }
        }
        m6.m(l5.l("Unknown type ", type));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(g view, noc props, vse stateWrapper) {
        view.getClass();
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }
}
