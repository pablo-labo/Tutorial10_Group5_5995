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
import defpackage.hgc;

/* JADX INFO: loaded from: classes2.dex */
public final class ggc<T extends View, U extends BaseViewManager<T, ? extends xm8> & hgc<T>> extends o81 {
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
            case -729118945:
                if (str.equals("fillRule")) {
                    b = 7;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b = 8;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b = 9;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b = 10;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b = 11;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    b = 12;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    b = 13;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    b = 14;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
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
            case 94842723:
                if (str.equals("color")) {
                    b = 20;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b = 21;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b = 22;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b = 23;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b = 24;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b = 25;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b = 26;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b = 27;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b = 28;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b = 29;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b = 30;
                }
                break;
        }
        switch (b) {
            case 0:
                ((hgc) baseViewManager).setFilter(t, obj != null ? (String) obj : null);
                break;
            case 1:
                baseViewManager.setOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((hgc) baseViewManager).setMatrix(t, (ReadableArray) obj);
                break;
            case 3:
                ((hgc) baseViewManager).setPropList(t, (ReadableArray) obj);
                break;
            case 4:
                ((hgc) baseViewManager).setMarkerEnd(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((hgc) baseViewManager).setMarkerMid(t, obj != null ? (String) obj : null);
                break;
            case 6:
                ((hgc) baseViewManager).setStroke(t, new DynamicFromObject(obj));
                break;
            case 7:
                ((hgc) baseViewManager).setFillRule(t, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 8:
                ((hgc) baseViewManager).setStrokeOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((hgc) baseViewManager).setPointerEvents(t, obj != null ? (String) obj : null);
                break;
            case 10:
                ((hgc) baseViewManager).setFillOpacity(t, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((hgc) baseViewManager).setStrokeDashoffset(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 12:
                ((hgc) baseViewManager).setX1(t, new DynamicFromObject(obj));
                break;
            case 13:
                ((hgc) baseViewManager).setX2(t, new DynamicFromObject(obj));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((hgc) baseViewManager).setY1(t, new DynamicFromObject(obj));
                break;
            case 15:
                ((hgc) baseViewManager).setY2(t, new DynamicFromObject(obj));
                break;
            case 16:
                ((hgc) baseViewManager).setFill(t, new DynamicFromObject(obj));
                break;
            case 17:
                ((hgc) baseViewManager).setMask(t, obj != null ? (String) obj : null);
                break;
            case 18:
                ((hgc) baseViewManager).setName(t, obj != null ? (String) obj : null);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                ((hgc) baseViewManager).setStrokeMiterlimit(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((hgc) baseViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 21:
                ((hgc) baseViewManager).setVectorEffect(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 22:
                ((hgc) baseViewManager).setMarkerStart(t, obj != null ? (String) obj : null);
                break;
            case 23:
                ((hgc) baseViewManager).setStrokeDasharray(t, new DynamicFromObject(obj));
                break;
            case 24:
                ((hgc) baseViewManager).setClipPath(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((hgc) baseViewManager).setClipRule(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 26:
                ((hgc) baseViewManager).setStrokeLinecap(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((hgc) baseViewManager).setDisplay(t, obj != null ? (String) obj : null);
                break;
            case 28:
                ((hgc) baseViewManager).setStrokeLinejoin(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((hgc) baseViewManager).setResponsible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case RendererMetrics.SAMPLES /* 30 */:
                ((hgc) baseViewManager).setStrokeWidth(t, new DynamicFromObject(obj));
                break;
            default:
                super.a(t, str, obj);
                break;
        }
    }
}
