package defpackage;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.vsg;

/* JADX INFO: loaded from: classes2.dex */
public final class usg<T extends View, U extends BaseViewManager<T, ? extends xm8> & vsg<T>> extends o81 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        str.getClass();
        if (str.equals("renderState")) {
            ((vsg) baseViewManager).setRenderState(t, obj != null ? ((Double) obj).intValue() : 0);
        } else if (str.equals("initialHidden")) {
            ((vsg) baseViewManager).setInitialHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
        } else {
            super.a(t, str, obj);
        }
    }
}
