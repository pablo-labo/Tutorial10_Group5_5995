package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public final class gfc extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfc(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(View view, String str, Object obj) {
        BaseViewManager baseViewManager;
        BaseViewManager baseViewManager2;
        switch (this.d) {
            case 0:
                baseViewManager = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "filter":
                        ((hfc) baseViewManager).setFilter(view, obj != null ? (String) obj : null);
                        break;
                    case "opacity":
                        baseViewManager.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "matrix":
                        ((hfc) baseViewManager).setMatrix(view, (ReadableArray) obj);
                        break;
                    case "propList":
                        ((hfc) baseViewManager).setPropList(view, (ReadableArray) obj);
                        break;
                    case "markerEnd":
                        ((hfc) baseViewManager).setMarkerEnd(view, obj != null ? (String) obj : null);
                        break;
                    case "markerMid":
                        ((hfc) baseViewManager).setMarkerMid(view, obj != null ? (String) obj : null);
                        break;
                    case "stroke":
                        ((hfc) baseViewManager).setStroke(view, new DynamicFromObject(obj));
                        break;
                    case "fillRule":
                        ((hfc) baseViewManager).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                        break;
                    case "strokeOpacity":
                        ((hfc) baseViewManager).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "pointerEvents":
                        ((hfc) baseViewManager).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case "fillOpacity":
                        ((hfc) baseViewManager).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "strokeDashoffset":
                        ((hfc) baseViewManager).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case "r":
                        ((hfc) baseViewManager).setR(view, new DynamicFromObject(obj));
                        break;
                    case "cx":
                        ((hfc) baseViewManager).setCx(view, new DynamicFromObject(obj));
                        break;
                    case "cy":
                        ((hfc) baseViewManager).setCy(view, new DynamicFromObject(obj));
                        break;
                    case "fill":
                        ((hfc) baseViewManager).setFill(view, new DynamicFromObject(obj));
                        break;
                    case "mask":
                        ((hfc) baseViewManager).setMask(view, obj != null ? (String) obj : null);
                        break;
                    case "name":
                        ((hfc) baseViewManager).setName(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeMiterlimit":
                        ((hfc) baseViewManager).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case "color":
                        ((hfc) baseViewManager).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "vectorEffect":
                        ((hfc) baseViewManager).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "markerStart":
                        ((hfc) baseViewManager).setMarkerStart(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeDasharray":
                        ((hfc) baseViewManager).setStrokeDasharray(view, new DynamicFromObject(obj));
                        break;
                    case "clipPath":
                        ((hfc) baseViewManager).setClipPath(view, obj != null ? (String) obj : null);
                        break;
                    case "clipRule":
                        ((hfc) baseViewManager).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "strokeLinecap":
                        ((hfc) baseViewManager).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "display":
                        ((hfc) baseViewManager).setDisplay(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeLinejoin":
                        ((hfc) baseViewManager).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "responsible":
                        ((hfc) baseViewManager).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "strokeWidth":
                        ((hfc) baseViewManager).setStrokeWidth(view, new DynamicFromObject(obj));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                baseViewManager2 = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "filter":
                        ((ygc) baseViewManager2).setFilter(view, obj != null ? (String) obj : null);
                        break;
                    case "opacity":
                        baseViewManager2.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "height":
                        ((ygc) baseViewManager2).setHeight(view, new DynamicFromObject(obj));
                        break;
                    case "matrix":
                        ((ygc) baseViewManager2).setMatrix(view, (ReadableArray) obj);
                        break;
                    case "propList":
                        ((ygc) baseViewManager2).setPropList(view, (ReadableArray) obj);
                        break;
                    case "markerEnd":
                        ((ygc) baseViewManager2).setMarkerEnd(view, obj != null ? (String) obj : null);
                        break;
                    case "markerMid":
                        ((ygc) baseViewManager2).setMarkerMid(view, obj != null ? (String) obj : null);
                        break;
                    case "stroke":
                        ((ygc) baseViewManager2).setStroke(view, new DynamicFromObject(obj));
                        break;
                    case "fillRule":
                        ((ygc) baseViewManager2).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                        break;
                    case "strokeOpacity":
                        ((ygc) baseViewManager2).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "pointerEvents":
                        ((ygc) baseViewManager2).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case "fillOpacity":
                        ((ygc) baseViewManager2).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case "strokeDashoffset":
                        ((ygc) baseViewManager2).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case "x":
                        ((ygc) baseViewManager2).setX(view, new DynamicFromObject(obj));
                        break;
                    case "y":
                        ((ygc) baseViewManager2).setY(view, new DynamicFromObject(obj));
                        break;
                    case "fill":
                        ((ygc) baseViewManager2).setFill(view, new DynamicFromObject(obj));
                        break;
                    case "href":
                        ((ygc) baseViewManager2).setHref(view, obj != null ? (String) obj : null);
                        break;
                    case "mask":
                        ((ygc) baseViewManager2).setMask(view, obj != null ? (String) obj : null);
                        break;
                    case "name":
                        ((ygc) baseViewManager2).setName(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeMiterlimit":
                        ((ygc) baseViewManager2).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case "color":
                        ((ygc) baseViewManager2).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case "vectorEffect":
                        ((ygc) baseViewManager2).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "width":
                        ((ygc) baseViewManager2).setWidth(view, new DynamicFromObject(obj));
                        break;
                    case "markerStart":
                        ((ygc) baseViewManager2).setMarkerStart(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeDasharray":
                        ((ygc) baseViewManager2).setStrokeDasharray(view, new DynamicFromObject(obj));
                        break;
                    case "clipPath":
                        ((ygc) baseViewManager2).setClipPath(view, obj != null ? (String) obj : null);
                        break;
                    case "clipRule":
                        ((ygc) baseViewManager2).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "strokeLinecap":
                        ((ygc) baseViewManager2).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "display":
                        ((ygc) baseViewManager2).setDisplay(view, obj != null ? (String) obj : null);
                        break;
                    case "strokeLinejoin":
                        ((ygc) baseViewManager2).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "responsible":
                        ((ygc) baseViewManager2).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "strokeWidth":
                        ((ygc) baseViewManager2).setStrokeWidth(view, new DynamicFromObject(obj));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
        }
    }
}
