package defpackage;

import android.view.View;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.dgc;

/* JADX INFO: loaded from: classes2.dex */
public final class cgc<T extends View, U extends BaseViewManager<T, ? extends xm8> & dgc<T>> extends o81 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1274492040:
                if (str.equals("filter")) {
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
            case -993894751:
                if (str.equals("propList")) {
                    b = 3;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b = 4;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b = 5;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b = 6;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = 7;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b = 8;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b = 9;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 10;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b = 11;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b = 12;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b = 13;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b = 14;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 15;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 16;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b = 17;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b = 18;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b = 19;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 20;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b = 21;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b = 22;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 23;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 24;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b = 25;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 26;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b = 27;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 28;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b = 29;
                }
                break;
        }
        switch (b) {
            case 0:
                ((dgc) baseViewManager).setFilter(t, obj != null ? (String) obj : null);
                break;
            case 1:
                baseViewManager.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((dgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 3:
                ((dgc) baseViewManager).setPropList(t, (ReadableArray) obj);
                break;
            case 4:
                ((dgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((dgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((dgc) baseViewManager).setStroke(t, new DynamicFromObject(obj));
                break;
            case 7:
                ((dgc) baseViewManager).setFontWeight(t, new DynamicFromObject(obj));
                break;
            case 8:
                ((dgc) baseViewManager).setFillRule(t, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((dgc) baseViewManager).setStrokeOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 10:
                ((dgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((dgc) baseViewManager).setFillOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((dgc) baseViewManager).setStrokeDashoffset(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 13:
                ((dgc) baseViewManager).setFill(t, new DynamicFromObject(obj));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((dgc) baseViewManager).setFont(t, new DynamicFromObject(obj));
                break;
            case 15:
                ((dgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 16:
                ((dgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case 17:
                ((dgc) baseViewManager).setStrokeMiterlimit(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 18:
                ((dgc) baseViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((dgc) baseViewManager).setVectorEffect(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((dgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 21:
                ((dgc) baseViewManager).setFontSize(t, new DynamicFromObject(obj));
                break;
            case 22:
                ((dgc) baseViewManager).setStrokeDasharray(t, new DynamicFromObject(obj));
                break;
            case 23:
                ((dgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 24:
                ((dgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 25:
                ((dgc) baseViewManager).setStrokeLinecap(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 26:
                ((dgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 27:
                ((dgc) baseViewManager).setStrokeLinejoin(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((dgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 29:
                ((dgc) baseViewManager).setStrokeWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
