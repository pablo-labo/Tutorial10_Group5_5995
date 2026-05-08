package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.a2;
import defpackage.ft5;
import defpackage.gt5;
import defpackage.mkf;
import defpackage.nmc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB3\b\u0007\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\u0016\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Landroid/view/View;", "Lgt5;", "La2;", "Lcom/facebook/imagepipeline/request/a;", "draweeControllerBuilder", "", "callerContext", "<init>", "(La2;Ljava/lang/Object;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Landroid/view/View;", "createShadowNodeInstance", "()Lgt5;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "extraData", "Lj6g;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "La2;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, gt5> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object callerContext;
    private final a2<?, a, ?, ?> draweeControllerBuilder;

    public /* synthetic */ FrescoBasedReactTextInlineImageViewManager(a2 a2Var, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : a2Var, (i & 2) != 0 ? null : obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public gt5 createShadowNodeInstance() {
        a2 a2Var = this.draweeControllerBuilder;
        if (a2Var == null) {
            a2Var = ft5.a.get();
        }
        return new gt5(a2Var, this.callerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(mkf context) {
        context.getClass();
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<gt5> getShadowNodeClass() {
        return gt5.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View root, Object extraData) {
        root.getClass();
        extraData.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrescoBasedReactTextInlineImageViewManager(a2<?, a, ?, ?> a2Var) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(a2Var, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public FrescoBasedReactTextInlineImageViewManager(a2<?, a, ?, ?> a2Var, Object obj) {
        this.draweeControllerBuilder = a2Var;
        this.callerContext = obj;
    }
}
