package defpackage;

import android.view.View;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.jgc;

/* JADX INFO: loaded from: classes2.dex */
public final class igc<T extends View, U extends BaseViewManager<T, ? extends xm8> & jgc<T>> extends o81 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    b = 0;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 1;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b = 2;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b = 3;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b = 4;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 5;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    b = 6;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    b = 7;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    b = 8;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
                    b = 9;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 10;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 11;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b = 12;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 13;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 14;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 15;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 16;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b = 17;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 18;
                }
                break;
        }
        switch (b) {
            case 0:
                ((jgc) baseViewManager).setGradientUnits(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                baseViewManager.setOpacity(t, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((jgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 3:
                ((jgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 4:
                ((jgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((jgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((jgc) baseViewManager).setX1(t, new DynamicFromObject(obj));
                break;
            case 7:
                ((jgc) baseViewManager).setX2(t, new DynamicFromObject(obj));
                break;
            case 8:
                ((jgc) baseViewManager).setY1(t, new DynamicFromObject(obj));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((jgc) baseViewManager).setY2(t, new DynamicFromObject(obj));
                break;
            case 10:
                ((jgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((jgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case 12:
                ((jgc) baseViewManager).setGradient(t, (ReadableArray) obj);
                break;
            case 13:
                ((jgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((jgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 15:
                ((jgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((jgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 17:
                ((jgc) baseViewManager).setGradientTransform(t, (ReadableArray) obj);
                break;
            case 18:
                ((jgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
