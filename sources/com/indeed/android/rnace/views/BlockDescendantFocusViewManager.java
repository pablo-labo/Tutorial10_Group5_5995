package com.indeed.android.rnace.views;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.mkf;
import defpackage.qh1;
import defpackage.snc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/indeed/android/rnace/views/BlockDescendantFocusViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lqh1;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lqh1;", "view", "", "block", "Lj6g;", "setBlockDescendantFocus", "(Lqh1;Z)V", "rnace_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockDescendantFocusViewManager extends ViewGroupManager<qh1> {
    public static final int $stable = 8;

    public BlockDescendantFocusViewManager() {
        super(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public qh1 createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new qh1(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlockDescendantFocusView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @snc(name = "blockDescendantFocus")
    public final void setBlockDescendantFocus(qh1 view, boolean block) {
        view.getClass();
        view.setBlockDescendantFocus(block);
    }
}
