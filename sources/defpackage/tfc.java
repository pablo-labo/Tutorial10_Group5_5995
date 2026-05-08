package defpackage;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.ufc;

/* JADX INFO: loaded from: classes2.dex */
public final class tfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & ufc<T>> extends o81 {
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
            case 104364:
                if (str.equals("in1")) {
                    b = 4;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 5;
                }
                break;
            case 1530721536:
                if (str.equals("edgeMode")) {
                    b = 6;
                }
                break;
            case 1837475450:
                if (str.equals("stdDeviationX")) {
                    b = 7;
                }
                break;
            case 1837475451:
                if (str.equals("stdDeviationY")) {
                    b = 8;
                }
                break;
        }
        switch (b) {
            case 0:
                ((ufc) onLayoutChangeListener).setHeight(t, new DynamicFromObject(obj));
                break;
            case 1:
                ((ufc) onLayoutChangeListener).setResult(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((ufc) onLayoutChangeListener).setX(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((ufc) onLayoutChangeListener).setY(t, new DynamicFromObject(obj));
                break;
            case 4:
                ((ufc) onLayoutChangeListener).setIn1(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((ufc) onLayoutChangeListener).setWidth(t, new DynamicFromObject(obj));
                break;
            case 6:
                ((ufc) onLayoutChangeListener).setEdgeMode(t, (String) obj);
                break;
            case 7:
                ((ufc) onLayoutChangeListener).setStdDeviationX(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((ufc) onLayoutChangeListener).setStdDeviationY(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
