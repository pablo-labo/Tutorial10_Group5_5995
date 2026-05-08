package com.facebook.react.views.safeareaview;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.aoc;
import defpackage.boc;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.sqg;
import defpackage.ui3;
import defpackage.vse;
import defpackage.xm8;
import defpackage.yqg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactSafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Laoc;", "", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Laoc;", "", "getName", "()Ljava/lang/String;", "Lxm8;", "createShadowNodeInstance", "()Lxm8;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "Lnoc;", "props", "Lvse;", "stateWrapper", "updateState", "(Laoc;Lnoc;Lvse;)Ljava/lang/Object;", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSafeAreaViewManager extends ViewGroupManager<aoc> implements yqg {
    public static final String REACT_CLASS = "RCTSafeAreaView";
    private final sqg<aoc> delegate;

    public ReactSafeAreaViewManager() {
        super(null, 1, 0 == true ? 1 : 0);
        this.delegate = new ui3(this, 2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance() {
        return new boc();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public aoc createViewInstance(mkf context) {
        context.getClass();
        return new aoc(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<aoc> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends xm8> getShadowNodeClass() {
        return boc.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(aoc view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        view.setStateWrapper$ReactAndroid_release(stateWrapper);
        return null;
    }
}
