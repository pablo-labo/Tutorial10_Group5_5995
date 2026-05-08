package defpackage;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.sfc;

/* JADX INFO: loaded from: classes2.dex */
public final class rfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & sfc<T>> extends o81 {
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        onLayoutChangeListener = (BaseViewManager) this.c;
        str.getClass();
        switch (str) {
            case "floodColor":
                ((sfc) onLayoutChangeListener).setFloodColor(t, new DynamicFromObject(obj));
                break;
            case "height":
                ((sfc) onLayoutChangeListener).setHeight(t, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((sfc) onLayoutChangeListener).setFloodOpacity(t, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((sfc) onLayoutChangeListener).setResult(t, obj == null ? null : (String) obj);
                break;
            case "x":
                ((sfc) onLayoutChangeListener).setX(t, new DynamicFromObject(obj));
                break;
            case "y":
                ((sfc) onLayoutChangeListener).setY(t, new DynamicFromObject(obj));
                break;
            case "width":
                ((sfc) onLayoutChangeListener).setWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
