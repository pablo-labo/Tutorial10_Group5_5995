package defpackage;

import android.view.View;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fgc;

/* JADX INFO: loaded from: classes2.dex */
public final class egc<T extends View, U extends BaseViewManager<T, ? extends xm8> & fgc<T>> extends o81 {
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
            case -1221029593:
                if (str.equals("height")) {
                    b = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b = 3;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b = 4;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b = 5;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b = 6;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
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
            case 120:
                if (str.equals("x")) {
                    b = 13;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b = 14;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    b = 15;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 17;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 18;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b = 19;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b = 20;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b = 21;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b = 22;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 23;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 24;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b = 25;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 26;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 27;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b = 28;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 29;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b = 30;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 31;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b = 32;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b = 33;
                }
                break;
        }
        switch (b) {
            case 0:
                ((fgc) baseViewManager).setFilter(t, obj != null ? (String) obj : null);
                break;
            case 1:
                baseViewManager.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((fgc) baseViewManager).setHeight(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((fgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 4:
                ((fgc) baseViewManager).setPropList(t, (ReadableArray) obj);
                break;
            case 5:
                ((fgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((fgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((fgc) baseViewManager).setStroke(t, new DynamicFromObject(obj));
                break;
            case 8:
                ((fgc) baseViewManager).setFillRule(t, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((fgc) baseViewManager).setStrokeOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 10:
                ((fgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((fgc) baseViewManager).setFillOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((fgc) baseViewManager).setStrokeDashoffset(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 13:
                ((fgc) baseViewManager).setX(t, new DynamicFromObject(obj));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((fgc) baseViewManager).setY(t, new DynamicFromObject(obj));
                break;
            case 15:
                ((fgc) baseViewManager).setSrc(t, (ReadableMap) obj);
                break;
            case 16:
                ((fgc) baseViewManager).setFill(t, new DynamicFromObject(obj));
                break;
            case 17:
                ((fgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 18:
                ((fgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((fgc) baseViewManager).setStrokeMiterlimit(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((fgc) baseViewManager).setAlign(t, obj != null ? (String) obj : null);
                break;
            case 21:
                ((fgc) baseViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 22:
                ((fgc) baseViewManager).setVectorEffect(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((fgc) baseViewManager).setWidth(t, new DynamicFromObject(obj));
                break;
            case 24:
                ((fgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((fgc) baseViewManager).setStrokeDasharray(t, new DynamicFromObject(obj));
                break;
            case 26:
                ((fgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 27:
                ((fgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((fgc) baseViewManager).setStrokeLinecap(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((fgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                ((fgc) baseViewManager).setStrokeLinejoin(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((fgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((fgc) baseViewManager).setMeetOrSlice(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((fgc) baseViewManager).setStrokeWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
