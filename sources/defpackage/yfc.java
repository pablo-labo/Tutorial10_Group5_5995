package defpackage;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.zfc;

/* JADX INFO: loaded from: classes2.dex */
public final class yfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & zfc<T>> extends o81 {
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        onLayoutChangeListener = (BaseViewManager) this.c;
        str.getClass();
        switch (str) {
            case "primitiveUnits":
                ((zfc) onLayoutChangeListener).setPrimitiveUnits(t, (String) obj);
                break;
            case "height":
                ((zfc) onLayoutChangeListener).setHeight(t, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((zfc) onLayoutChangeListener).setFilterUnits(t, (String) obj);
                break;
            case "x":
                ((zfc) onLayoutChangeListener).setX(t, new DynamicFromObject(obj));
                break;
            case "y":
                ((zfc) onLayoutChangeListener).setY(t, new DynamicFromObject(obj));
                break;
            case "name":
                ((zfc) onLayoutChangeListener).setName(t, obj == null ? null : (String) obj);
                break;
            case "width":
                ((zfc) onLayoutChangeListener).setWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
