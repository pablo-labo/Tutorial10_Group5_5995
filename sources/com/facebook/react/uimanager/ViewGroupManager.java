package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.u63;
import defpackage.vo6;
import defpackage.xm8;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001-B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "T", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lxm8;", "Lvo6;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "createShadowNodeInstance", "()Lxm8;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "Lj6g;", "updateExtraData", "(Landroid/view/ViewGroup;Ljava/lang/Object;)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "", "views", "addViews", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "view", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "", "needsCustomLayoutForChildren", "()Z", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, xm8> implements vo6<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final WeakHashMap<View, Integer> zIndexHash = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.ViewGroupManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public static Integer a(View view) {
            return (Integer) ViewGroupManager.zIndexHash.get(view);
        }
    }

    public /* synthetic */ ViewGroupManager(ReactApplicationContext reactApplicationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reactApplicationContext);
    }

    public static final Integer getViewZIndex(View view) {
        INSTANCE.getClass();
        return Companion.a(view);
    }

    public static final void setViewZIndex(View view, int i) {
        INSTANCE.getClass();
        view.getClass();
        zIndexHash.put(view, Integer.valueOf(i));
    }

    @Override // defpackage.vo6
    public void addView(T parent, View child, int index) {
        parent.getClass();
        child.getClass();
        parent.addView(child, index);
    }

    public final void addViews(T parent, List<? extends View> views) {
        parent.getClass();
        views.getClass();
        UiThreadUtil.assertOnUiThread();
        int i = 0;
        for (Object obj : views) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            addView((ViewGroup) parent, (View) obj, i);
            i = i2;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance() {
        return new xm8();
    }

    @Override // defpackage.vo6
    public View getChildAt(T parent, int index) {
        parent.getClass();
        return parent.getChildAt(index);
    }

    @Override // defpackage.vo6
    public int getChildCount(T parent) {
        parent.getClass();
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends xm8> getShadowNodeClass() {
        return xm8.class;
    }

    @Override // defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeView(T parent, View view) {
        parent.getClass();
        view.getClass();
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount((ViewGroup) parent);
        for (int i = 0; i < childCount; i++) {
            if (getChildAt((ViewGroup) parent, i) == view) {
                removeViewAt((ViewGroup) parent, i);
                return;
            }
        }
    }

    @Override // defpackage.vo6
    public void removeViewAt(T parent, int index) {
        parent.getClass();
        UiThreadUtil.assertOnUiThread();
        parent.removeViewAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T root, Object extraData) {
        root.getClass();
        extraData.getClass();
    }

    public ViewGroupManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
