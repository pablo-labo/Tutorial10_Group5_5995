package com.swmansion.rnscreens;

import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.jrd;
import defpackage.l5;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.sqd;
import defpackage.sqg;
import defpackage.xec;
import defpackage.xm8;
import defpackage.yqg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/b;", "", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "", "getName", "()Ljava/lang/String;", "Lmkf;", "reactContext", "createViewInstance", "(Lmkf;)Lcom/swmansion/rnscreens/b;", "parent", "Landroid/view/View;", "child", "", "index", "Lj6g;", "addView", "(Lcom/swmansion/rnscreens/b;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/b;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/b;)V", "getChildCount", "(Lcom/swmansion/rnscreens/b;)I", "getChildAt", "(Lcom/swmansion/rnscreens/b;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lxm8;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lxm8;", "", "needsCustomLayoutForChildren", "()Z", "delegate", "Lsqg;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenContainerViewManager extends ViewGroupManager<b> implements yqg {
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final sqg<b> delegate;

    public ScreenContainerViewManager() {
        super(null, 1, null);
        this.delegate = new xec(this, 0);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(b parent, View child, int index) {
        parent.getClass();
        child.getClass();
        if (!(child instanceof a)) {
            l5.q("Attempt attach child that is not of type RNScreens");
            return;
        }
        a aVar = (a) child;
        sqd sqdVarA = parent.a(aVar);
        aVar.setFragmentWrapper(sqdVarA);
        parent.a.add(index, sqdVarA);
        aVar.setContainer(parent);
        parent.e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance(ReactApplicationContext context) {
        context.getClass();
        jrd jrdVar = new jrd();
        jrdVar.o0 = context;
        return jrdVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new b(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(b parent, int index) {
        parent.getClass();
        return parent.a.get(index).l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(b parent) {
        parent.getClass();
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<b> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public void removeAllViews(b parent) {
        parent.getClass();
        parent.h();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(b parent, int index) {
        parent.getClass();
        parent.i(index);
    }
}
