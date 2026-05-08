package defpackage;

import android.view.View;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class xec extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xec(BaseViewManager baseViewManager, int i) {
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
                    case 3189:
                        if (str.equals("cx")) {
                            b = 6;
                        }
                        break;
                    case 3190:
                        if (str.equals("cy")) {
                            b = 7;
                        }
                        break;
                    case 3282:
                        if (str.equals("fx")) {
                            b = 8;
                        }
                        break;
                    case 3283:
                        if (str.equals("fy")) {
                            b = 9;
                        }
                        break;
                    case 3654:
                        if (str.equals("rx")) {
                            b = 10;
                        }
                        break;
                    case 3655:
                        if (str.equals("ry")) {
                            b = 11;
                        }
                        break;
                    case 3344108:
                        if (str.equals("mask")) {
                            b = 12;
                        }
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            b = 13;
                        }
                        break;
                    case 89650992:
                        if (str.equals("gradient")) {
                            b = 14;
                        }
                        break;
                    case 217109576:
                        if (str.equals("markerStart")) {
                            b = 15;
                        }
                        break;
                    case 917656469:
                        if (str.equals("clipPath")) {
                            b = 16;
                        }
                        break;
                    case 917735020:
                        if (str.equals("clipRule")) {
                            b = 17;
                        }
                        break;
                    case 1671764162:
                        if (str.equals("display")) {
                            b = 18;
                        }
                        break;
                    case 1822665244:
                        if (str.equals("gradientTransform")) {
                            b = 19;
                        }
                        break;
                    case 1847674614:
                        if (str.equals("responsible")) {
                            b = 20;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        ((rgc) baseViewManager).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 1:
                        baseViewManager.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                        break;
                    case 2:
                        ((rgc) baseViewManager).setMatrix(view, (ReadableArray) obj);
                        break;
                    case 3:
                        ((rgc) baseViewManager).setMarkerEnd(view, obj != null ? (String) obj : null);
                        break;
                    case 4:
                        ((rgc) baseViewManager).setMarkerMid(view, obj != null ? (String) obj : null);
                        break;
                    case 5:
                        ((rgc) baseViewManager).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case 6:
                        ((rgc) baseViewManager).setCx(view, new DynamicFromObject(obj));
                        break;
                    case 7:
                        ((rgc) baseViewManager).setCy(view, new DynamicFromObject(obj));
                        break;
                    case 8:
                        ((rgc) baseViewManager).setFx(view, new DynamicFromObject(obj));
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((rgc) baseViewManager).setFy(view, new DynamicFromObject(obj));
                        break;
                    case 10:
                        ((rgc) baseViewManager).setRx(view, new DynamicFromObject(obj));
                        break;
                    case 11:
                        ((rgc) baseViewManager).setRy(view, new DynamicFromObject(obj));
                        break;
                    case 12:
                        ((rgc) baseViewManager).setMask(view, obj != null ? (String) obj : null);
                        break;
                    case 13:
                        ((rgc) baseViewManager).setName(view, obj != null ? (String) obj : null);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((rgc) baseViewManager).setGradient(view, (ReadableArray) obj);
                        break;
                    case 15:
                        ((rgc) baseViewManager).setMarkerStart(view, obj != null ? (String) obj : null);
                        break;
                    case 16:
                        ((rgc) baseViewManager).setClipPath(view, obj != null ? (String) obj : null);
                        break;
                    case 17:
                        ((rgc) baseViewManager).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 18:
                        ((rgc) baseViewManager).setDisplay(view, obj != null ? (String) obj : null);
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        ((rgc) baseViewManager).setGradientTransform(view, (ReadableArray) obj);
                        break;
                    case 20:
                        ((rgc) baseViewManager).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
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
