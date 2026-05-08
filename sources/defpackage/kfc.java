package defpackage;

import android.view.View;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.lfc;

/* JADX INFO: loaded from: classes2.dex */
public final class kfc<T extends View, U extends BaseViewManager<T, ? extends xm8> & lfc<T>> extends o81 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 0;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b = 1;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b = 2;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b = 3;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 4;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 5;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 6;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 7;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 8;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 9;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 10;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 11;
                }
                break;
        }
        switch (b) {
            case 0:
                baseViewManager.setOpacity(t, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 1:
                ((lfc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 2:
                ((lfc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 3:
                ((lfc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 4:
                ((lfc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((lfc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((lfc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((lfc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 8:
                ((lfc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((lfc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 10:
                ((lfc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((lfc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
