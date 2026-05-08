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

/* JADX INFO: loaded from: classes2.dex */
public final class yec extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yec(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public void a(View view, String str, Object obj) {
        switch (this.d) {
            case 1:
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
                    case 3654:
                        if (str.equals("rx")) {
                            b = 15;
                        }
                        break;
                    case 3655:
                        if (str.equals("ry")) {
                            b = 16;
                        }
                        break;
                    case 3143043:
                        if (str.equals("fill")) {
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
                    case 1924065902:
                        if (str.equals("strokeWidth")) {
                            b = 32;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        ((sgc) baseViewManager).setFilter(view, obj != null ? (String) obj : null);
                        break;
                    case 1:
                        baseViewManager.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case 2:
                        ((sgc) baseViewManager).setHeight(view, new DynamicFromObject(obj));
                        break;
                    case 3:
                        ((sgc) baseViewManager).setMatrix(view, (ReadableArray) obj);
                        break;
                    case 4:
                        ((sgc) baseViewManager).setPropList(view, (ReadableArray) obj);
                        break;
                    case 5:
                        ((sgc) baseViewManager).setMarkerEnd(view, obj != null ? (String) obj : null);
                        break;
                    case 6:
                        ((sgc) baseViewManager).setMarkerMid(view, obj != null ? (String) obj : null);
                        break;
                    case 7:
                        ((sgc) baseViewManager).setStroke(view, new DynamicFromObject(obj));
                        break;
                    case 8:
                        ((sgc) baseViewManager).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((sgc) baseViewManager).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case 10:
                        ((sgc) baseViewManager).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case 11:
                        ((sgc) baseViewManager).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case 12:
                        ((sgc) baseViewManager).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 13:
                        ((sgc) baseViewManager).setX(view, new DynamicFromObject(obj));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((sgc) baseViewManager).setY(view, new DynamicFromObject(obj));
                        break;
                    case 15:
                        ((sgc) baseViewManager).setRx(view, new DynamicFromObject(obj));
                        break;
                    case 16:
                        ((sgc) baseViewManager).setRy(view, new DynamicFromObject(obj));
                        break;
                    case 17:
                        ((sgc) baseViewManager).setFill(view, new DynamicFromObject(obj));
                        break;
                    case 18:
                        ((sgc) baseViewManager).setMask(view, obj != null ? (String) obj : null);
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        ((sgc) baseViewManager).setName(view, obj != null ? (String) obj : null);
                        break;
                    case 20:
                        ((sgc) baseViewManager).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 21:
                        ((sgc) baseViewManager).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 22:
                        ((sgc) baseViewManager).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 23:
                        ((sgc) baseViewManager).setWidth(view, new DynamicFromObject(obj));
                        break;
                    case 24:
                        ((sgc) baseViewManager).setMarkerStart(view, obj != null ? (String) obj : null);
                        break;
                    case 25:
                        ((sgc) baseViewManager).setStrokeDasharray(view, new DynamicFromObject(obj));
                        break;
                    case 26:
                        ((sgc) baseViewManager).setClipPath(view, obj != null ? (String) obj : null);
                        break;
                    case 27:
                        ((sgc) baseViewManager).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 28:
                        ((sgc) baseViewManager).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 29:
                        ((sgc) baseViewManager).setDisplay(view, obj != null ? (String) obj : null);
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        ((sgc) baseViewManager).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 31:
                        ((sgc) baseViewManager).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 32:
                        ((sgc) baseViewManager).setStrokeWidth(view, new DynamicFromObject(obj));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
