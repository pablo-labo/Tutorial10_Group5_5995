package com.facebook.react.views.modal;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.modal.ReactModalHostView;
import defpackage.mkf;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends GuardedRunnable {
    public final /* synthetic */ ReactModalHostView.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactModalHostView.b bVar, mkf mkfVar) {
        super(mkfVar);
        this.a = bVar;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        ReactModalHostView.b bVar = this.a;
        UIManagerModule uIManagerModule = (UIManagerModule) bVar.getReactContext().a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(bVar.getId(), bVar.c, bVar.d);
        }
    }
}
