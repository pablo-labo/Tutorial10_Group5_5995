package org.reactnative.maskedview;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.mkf;
import defpackage.sbc;
import defpackage.snc;

/* JADX INFO: loaded from: classes3.dex */
public class RNCMaskedViewManager extends ViewGroupManager<sbc> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override // com.facebook.react.uimanager.ViewManager
    public sbc createViewInstance(mkf mkfVar) {
        sbc sbcVar = new sbc(mkfVar);
        sbcVar.a = null;
        sbcVar.b = false;
        sbcVar.e = 2;
        sbcVar.c = new Paint(1);
        sbcVar.d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        return sbcVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @snc(name = "androidRenderingMode")
    public void setAndroidRenderingMode(sbc sbcVar, String str) {
        if (str != null) {
            sbcVar.setRenderingMode(str);
        }
    }
}
