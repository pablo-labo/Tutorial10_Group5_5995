package defpackage;

import android.view.View;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.lgc;

/* JADX INFO: loaded from: classes2.dex */
public final class kgc<T extends View, U extends BaseViewManager<T, ? extends xm8> & lgc<T>> extends o81 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(T t, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b = 0;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b = 3;
                }
                break;
            case -1008621499:
                if (str.equals("orient")) {
                    b = 4;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b = 5;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b = 6;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b = 7;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b = 8;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = 9;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b = 10;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b = 11;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 12;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b = 13;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b = 14;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b = 15;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 17;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b = 18;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b = 19;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 20;
                }
                break;
            case 3496485:
                if (str.equals("refX")) {
                    b = 21;
                }
                break;
            case 3496486:
                if (str.equals("refY")) {
                    b = 22;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b = 23;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b = 24;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b = 25;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b = 26;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 27;
                }
                break;
            case 218785621:
                if (str.equals("markerUnits")) {
                    b = 28;
                }
                break;
            case 220478892:
                if (str.equals("markerWidth")) {
                    b = 29;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b = 30;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b = 31;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b = 32;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 33;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 34;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b = 35;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 36;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b = 37;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 38;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b = 39;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b = 40;
                }
                break;
            case 2106883585:
                if (str.equals("markerHeight")) {
                    b = 41;
                }
                break;
        }
        switch (b) {
            case 0:
                ((lgc) baseViewManager).setVbHeight(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 1:
                ((lgc) baseViewManager).setFilter(t, obj != null ? (String) obj : null);
                break;
            case 2:
                baseViewManager.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((lgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 4:
                ((lgc) baseViewManager).setOrient(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((lgc) baseViewManager).setPropList(t, (ReadableArray) obj);
                break;
            case 6:
                ((lgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((lgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 8:
                ((lgc) baseViewManager).setStroke(t, new DynamicFromObject(obj));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((lgc) baseViewManager).setFontWeight(t, new DynamicFromObject(obj));
                break;
            case 10:
                ((lgc) baseViewManager).setFillRule(t, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 11:
                ((lgc) baseViewManager).setStrokeOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((lgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 13:
                ((lgc) baseViewManager).setFillOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((lgc) baseViewManager).setStrokeDashoffset(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 15:
                ((lgc) baseViewManager).setFill(t, new DynamicFromObject(obj));
                break;
            case 16:
                ((lgc) baseViewManager).setFont(t, new DynamicFromObject(obj));
                break;
            case 17:
                ((lgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 18:
                ((lgc) baseViewManager).setMinX(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((lgc) baseViewManager).setMinY(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((lgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case 21:
                ((lgc) baseViewManager).setRefX(t, new DynamicFromObject(obj));
                break;
            case 22:
                ((lgc) baseViewManager).setRefY(t, new DynamicFromObject(obj));
                break;
            case 23:
                ((lgc) baseViewManager).setStrokeMiterlimit(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((lgc) baseViewManager).setAlign(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((lgc) baseViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 26:
                ((lgc) baseViewManager).setVectorEffect(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((lgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 28:
                ((lgc) baseViewManager).setMarkerUnits(t, obj != null ? (String) obj : null);
                break;
            case 29:
                ((lgc) baseViewManager).setMarkerWidth(t, new DynamicFromObject(obj));
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                ((lgc) baseViewManager).setVbWidth(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 31:
                ((lgc) baseViewManager).setFontSize(t, new DynamicFromObject(obj));
                break;
            case 32:
                ((lgc) baseViewManager).setStrokeDasharray(t, new DynamicFromObject(obj));
                break;
            case 33:
                ((lgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 34:
                ((lgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((lgc) baseViewManager).setStrokeLinecap(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 36:
                ((lgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 37:
                ((lgc) baseViewManager).setStrokeLinejoin(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 38:
                ((lgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 39:
                ((lgc) baseViewManager).setMeetOrSlice(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((lgc) baseViewManager).setStrokeWidth(t, new DynamicFromObject(obj));
                break;
            case 41:
                ((lgc) baseViewManager).setMarkerHeight(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
