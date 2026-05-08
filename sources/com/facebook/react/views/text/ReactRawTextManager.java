package com.facebook.react.views.text;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.uimanager.ViewManager;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.opc;
import defpackage.unc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactRawTextManager.REACT_CLASS)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/text/ReactRawTextManager;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lunc;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lopc;", "createViewInstance", "(Lmkf;)Lopc;", "reactContext", "view", "prepareToRecycleView", "(Lmkf;Landroid/view/View;)Landroid/view/View;", "", "extraData", "Lj6g;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "createShadowNodeInstance", "()Lunc;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactRawTextManager extends ViewManager<View, unc> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager
    public unc createShadowNodeInstance() {
        return new unc();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public opc createViewInstance(mkf context) {
        context.getClass();
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<unc> getShadowNodeClass() {
        return unc.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View prepareToRecycleView(mkf reactContext, View view) {
        reactContext.getClass();
        view.getClass();
        throw new IllegalStateException("Attempt to recycle a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object extraData) {
        view.getClass();
        extraData.getClass();
    }
}
