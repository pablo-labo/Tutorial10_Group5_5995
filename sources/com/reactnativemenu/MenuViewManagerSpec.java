package com.reactnativemenu;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.so9;
import defpackage.sqg;
import defpackage.to9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/reactnativemenu/MenuViewManagerSpec;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lto9;", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "mDelegate", "Lsqg;", "react-native-menu_menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MenuViewManagerSpec<T extends View> extends SimpleViewManager<T> implements to9<T> {
    private final sqg<T> mDelegate = new so9(this, 0);

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<T> getDelegate() {
        return this.mDelegate;
    }

    @Override // defpackage.to9
    public abstract /* synthetic */ void setActions(View view, ReadableArray readableArray);

    @Override // defpackage.to9
    public abstract /* synthetic */ void setActionsHash(View view, String str);

    @Override // defpackage.to9
    public abstract /* synthetic */ void setHitSlop(View view, ReadableMap readableMap);

    @Override // defpackage.to9
    public abstract /* synthetic */ void setShouldOpenOnLongPress(View view, boolean z);

    @Override // defpackage.to9
    public abstract /* synthetic */ void setThemeVariant(View view, String str);

    @Override // defpackage.to9
    public abstract /* synthetic */ void setTitle(View view, String str);
}
