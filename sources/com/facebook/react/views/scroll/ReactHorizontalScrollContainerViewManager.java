package com.facebook.react.views.scroll;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.views.view.ReactViewManager;
import defpackage.mkf;
import defpackage.msb;
import defpackage.nmc;
import defpackage.noc;
import defpackage.qkc;
import defpackage.r6;
import defpackage.tpc;
import defpackage.vse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "reactTag", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lnoc;", "initialProps", "Lvse;", "stateWrapper", "Ltpc;", "createViewInstance", "(ILmkf;Lnoc;Lvse;)Ltpc;", "(Lmkf;)Ltpc;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactHorizontalScrollContainerViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";
    private static Integer uiManagerType;

    @Override // com.facebook.react.uimanager.ViewManager
    public tpc createViewInstance(int reactTag, mkf context, noc initialProps, vse stateWrapper) {
        context.getClass();
        if (uiManagerType != null) {
            r6.g("Check failed.");
            return null;
        }
        uiManagerType = Integer.valueOf(msb.e(reactTag));
        View viewCreateViewInstance = super.createViewInstance(reactTag, context, initialProps, stateWrapper);
        viewCreateViewInstance.getClass();
        tpc tpcVar = (tpc) viewCreateViewInstance;
        uiManagerType = null;
        return tpcVar;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public tpc createViewInstance(mkf context) {
        context.getClass();
        Integer num = uiManagerType;
        if (num == null) {
            r6.g("Required value was null.");
            return null;
        }
        if (num.intValue() == 2) {
            return new tpc(context);
        }
        return new qkc(context);
    }
}
