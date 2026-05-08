package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.snc;
import defpackage.tpc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/view/ReactClippingViewManager;", "Ltpc;", "T", "Lcom/facebook/react/uimanager/ViewGroupManager;", "<init>", "()V", "view", "", "removeClippedSubviews", "Lj6g;", "setRemoveClippedSubviews", "(Ltpc;Z)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Ltpc;Landroid/view/View;I)V", "getChildCount", "(Ltpc;)I", "getChildAt", "(Ltpc;I)Landroid/view/View;", "removeViewAt", "(Ltpc;I)V", "removeAllViews", "(Ltpc;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactClippingViewManager<T extends tpc> extends ViewGroupManager<T> {
    public ReactClippingViewManager() {
        super(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(T parent, View child, int index) {
        parent.getClass();
        child.getClass();
        UiThreadUtil.assertOnUiThread();
        if (parent.get_removeClippedSubviews()) {
            parent.addViewWithSubviewClippingEnabled$ReactAndroid_release(child, index);
        } else {
            parent.addView(child, index);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(T parent, int index) {
        parent.getClass();
        return parent.get_removeClippedSubviews() ? parent.getChildAtWithSubviewClippingEnabled$ReactAndroid_release(index) : parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(T parent) {
        parent.getClass();
        return parent.get_removeClippedSubviews() ? parent.getAllChildrenCount() : parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void removeAllViews(T parent) {
        parent.getClass();
        UiThreadUtil.assertOnUiThread();
        if (parent.get_removeClippedSubviews()) {
            parent.removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release();
        } else {
            parent.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(T parent, int index) {
        parent.getClass();
        UiThreadUtil.assertOnUiThread();
        if (!parent.get_removeClippedSubviews()) {
            parent.removeViewAt(index);
            return;
        }
        View childAt = getChildAt((tpc) parent, index);
        if (childAt != null) {
            parent.removeViewWithSubviewClippingEnabled$ReactAndroid_release(childAt);
        }
    }

    @snc(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T view, boolean removeClippedSubviews) {
        view.getClass();
        UiThreadUtil.assertOnUiThread();
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }
}
