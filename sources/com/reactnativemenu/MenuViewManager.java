package com.reactnativemenu;

import defpackage.mkf;
import defpackage.ro9;
import defpackage.tpc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/reactnativemenu/MenuViewManager;", "Lcom/reactnativemenu/MenuViewManagerBase;", "<init>", "()V", "Lmkf;", "reactContext", "Lro9;", "createViewInstance", "(Lmkf;)Lro9;", "Ltpc;", "view", "", "index", "color", "Lj6g;", "setBorderColor", "(Ltpc;ILjava/lang/Integer;)V", "react-native-menu_menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MenuViewManager extends MenuViewManagerBase {
    @Override // com.facebook.react.uimanager.ViewManager
    public ro9 createViewInstance(mkf reactContext) {
        reactContext.getClass();
        return new ro9(reactContext);
    }

    @Override // com.reactnativemenu.MenuViewManagerBase
    public void setBorderColor(tpc view, int index, Integer color) {
        view.getClass();
        view.setBorderColor(index, color);
    }
}
