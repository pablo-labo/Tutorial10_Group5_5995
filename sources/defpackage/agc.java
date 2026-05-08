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
import defpackage.bgc;

/* JADX INFO: loaded from: classes2.dex */
public final class agc<T extends View, U extends BaseViewManager<T, ? extends xm8> & bgc<T>> extends o81 {
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
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = 8;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b = 9;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b = 10;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 11;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b = 12;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b = 13;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b = 14;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b = 15;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b = 16;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b = 17;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b = 18;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 19;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
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
            case 365601008:
                if (str.equals("fontSize")) {
                    b = 25;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b = 26;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 27;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 28;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b = 29;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 30;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b = 31;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
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
                ((bgc) baseViewManager).setFilter(t, obj != null ? (String) obj : null);
                break;
            case 1:
                baseViewManager.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((bgc) baseViewManager).setHeight(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((bgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 4:
                ((bgc) baseViewManager).setPropList(t, (ReadableArray) obj);
                break;
            case 5:
                ((bgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((bgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((bgc) baseViewManager).setStroke(t, new DynamicFromObject(obj));
                break;
            case 8:
                ((bgc) baseViewManager).setFontWeight(t, new DynamicFromObject(obj));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((bgc) baseViewManager).setFillRule(t, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 10:
                ((bgc) baseViewManager).setStrokeOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((bgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 12:
                ((bgc) baseViewManager).setFillOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 13:
                ((bgc) baseViewManager).setStrokeDashoffset(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((bgc) baseViewManager).setX(t, new DynamicFromObject(obj));
                break;
            case 15:
                ((bgc) baseViewManager).setY(t, new DynamicFromObject(obj));
                break;
            case 16:
                ((bgc) baseViewManager).setFill(t, new DynamicFromObject(obj));
                break;
            case 17:
                ((bgc) baseViewManager).setFont(t, new DynamicFromObject(obj));
                break;
            case 18:
                ((bgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((bgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case 20:
                ((bgc) baseViewManager).setStrokeMiterlimit(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 21:
                ((bgc) baseViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 22:
                ((bgc) baseViewManager).setVectorEffect(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((bgc) baseViewManager).setWidth(t, new DynamicFromObject(obj));
                break;
            case 24:
                ((bgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((bgc) baseViewManager).setFontSize(t, new DynamicFromObject(obj));
                break;
            case 26:
                ((bgc) baseViewManager).setStrokeDasharray(t, new DynamicFromObject(obj));
                break;
            case 27:
                ((bgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 28:
                ((bgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((bgc) baseViewManager).setStrokeLinecap(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                ((bgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 31:
                ((bgc) baseViewManager).setStrokeLinejoin(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 32:
                ((bgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((bgc) baseViewManager).setStrokeWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
