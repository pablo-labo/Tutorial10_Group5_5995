package defpackage;

import android.view.View;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.qfc;

/* JADX INFO: loaded from: classes2.dex */
public final class pfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & qfc<T>> extends o81 {
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
            case 3366:
                if (str.equals("k1")) {
                    b = 4;
                }
                break;
            case 3367:
                if (str.equals("k2")) {
                    b = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b = 9;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b = 11;
                }
                break;
        }
        switch (b) {
            case 0:
                ((qfc) onLayoutChangeListener).setHeight(t, new DynamicFromObject(obj));
                break;
            case 1:
                ((qfc) onLayoutChangeListener).setResult(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((qfc) onLayoutChangeListener).setX(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((qfc) onLayoutChangeListener).setY(t, new DynamicFromObject(obj));
                break;
            case 4:
                ((qfc) onLayoutChangeListener).setK1(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((qfc) onLayoutChangeListener).setK2(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((qfc) onLayoutChangeListener).setK3(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((qfc) onLayoutChangeListener).setK4(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((qfc) onLayoutChangeListener).setIn1(t, obj != null ? (String) obj : null);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((qfc) onLayoutChangeListener).setIn2(t, obj != null ? (String) obj : null);
                break;
            case 10:
                ((qfc) onLayoutChangeListener).setWidth(t, new DynamicFromObject(obj));
                break;
            case 11:
                ((qfc) onLayoutChangeListener).setOperator1(t, (String) obj);
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
