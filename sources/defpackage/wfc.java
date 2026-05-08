package defpackage;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.xfc;

/* JADX INFO: loaded from: classes2.dex */
public final class wfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & xfc<T>> extends o81 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        View.OnLayoutChangeListener onLayoutChangeListener = (BaseViewManager) this.c;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    b = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b = 1;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b = 3;
                }
                break;
            case 3220:
                if (str.equals("dx")) {
                    b = 4;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    b = 5;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b = 6;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 7;
                }
                break;
        }
        switch (b) {
            case 0:
                ((xfc) onLayoutChangeListener).setHeight(t, new DynamicFromObject(obj));
                break;
            case 1:
                ((xfc) onLayoutChangeListener).setResult(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((xfc) onLayoutChangeListener).setX(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((xfc) onLayoutChangeListener).setY(t, new DynamicFromObject(obj));
                break;
            case 4:
                ((xfc) onLayoutChangeListener).setDx(t, new DynamicFromObject(obj));
                break;
            case 5:
                ((xfc) onLayoutChangeListener).setDy(t, new DynamicFromObject(obj));
                break;
            case 6:
                ((xfc) onLayoutChangeListener).setIn1(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((xfc) onLayoutChangeListener).setWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
