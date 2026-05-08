package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o81 implements tc0, sqg {
    public final /* synthetic */ int b;
    public Object c;

    public o81() {
        this.b = 1;
        char[] cArr = xjg.a;
        this.c = new ArrayDeque(20);
    }

    public abstract void D(tu8 tu8Var, String str);

    public boolean E(tu8 tu8Var) {
        return ((tu8) this.c).compareTo(tu8Var) <= 0;
    }

    public abstract Collection F(Collection collection, lt1 lt1Var);

    public abstract Set G(Collection collection, lt1 lt1Var);

    public void H(yfb yfbVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(yfbVar);
        }
    }

    @Override // defpackage.tc0
    public boolean b() {
        List list = (List) this.c;
        return list.isEmpty() || (list.size() == 1 && ((lh8) list.get(0)).c());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sqg
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(View view, String str, Object obj) {
        BaseViewManager baseViewManager = (BaseViewManager) this.c;
        view.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -2018402664:
                if (str.equals("mixBlendMode")) {
                    baseViewManager.setMixBlendMode(view, (String) obj);
                    break;
                }
                break;
            case -1898517556:
                if (str.equals("onPointerEnterCapture")) {
                    Boolean bool = (Boolean) obj;
                    baseViewManager.setPointerEnterCapture(view, bool != null ? bool.booleanValue() : false);
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    Double d = (Double) obj;
                    baseViewManager.setTranslateX(view, d != null ? (float) d.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    Double d2 = (Double) obj;
                    baseViewManager.setTranslateY(view, d2 != null ? (float) d2.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    Context context = view.getContext();
                    context.getClass();
                    baseViewManager.setShadowColor(view, ColorPropConverter.getColor(obj, context, 0));
                    break;
                }
                break;
            case -1489432511:
                if (str.equals("outlineColor")) {
                    baseViewManager.setOutlineColor(view, (Integer) obj);
                    break;
                }
                break;
            case -1474494833:
                if (str.equals("outlineStyle")) {
                    baseViewManager.setOutlineStyle(view, (String) obj);
                    break;
                }
                break;
            case -1471148380:
                if (str.equals("outlineWidth")) {
                    Double d3 = (Double) obj;
                    baseViewManager.setOutlineWidth(view, d3 != null ? (float) d3.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case -1351902487:
                if (str.equals("onClick")) {
                    Boolean bool2 = (Boolean) obj;
                    baseViewManager.setClick(view, bool2 != null ? bool2.booleanValue() : false);
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    baseViewManager.setFilter(view, (ReadableArray) obj);
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    Double d4 = (Double) obj;
                    baseViewManager.setOpacity(view, d4 != null ? (float) d4.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -1247970794:
                if (str.equals("onPointerOutCapture")) {
                    Boolean bool3 = (Boolean) obj;
                    baseViewManager.setPointerOutCapture(view, bool3 != null ? bool3.booleanValue() : false);
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    Double d5 = (Double) obj;
                    baseViewManager.setBorderTopLeftRadius(view, d5 != null ? (float) d5.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case -1219666915:
                if (str.equals("onClickCapture")) {
                    Boolean bool4 = (Boolean) obj;
                    baseViewManager.setClickCapture(view, bool4 != null ? bool4.booleanValue() : false);
                    break;
                }
                break;
            case -1036769289:
                if (str.equals("onPointerMoveCapture")) {
                    Boolean bool5 = (Boolean) obj;
                    baseViewManager.setPointerMoveCapture(view, bool5 != null ? bool5.booleanValue() : false);
                    break;
                }
                break;
            case -994557277:
                if (str.equals("screenReaderFocusable")) {
                    Boolean bool6 = (Boolean) obj;
                    baseViewManager.setScreenReaderFocusable(view, bool6 != null ? bool6.booleanValue() : false);
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    Double d6 = (Double) obj;
                    baseViewManager.setScaleX(view, d6 != null ? (float) d6.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    Double d7 = (Double) obj;
                    baseViewManager.setScaleY(view, d7 != null ? (float) d7.doubleValue() : 1.0f);
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    baseViewManager.setTestId(view, (String) obj);
                    break;
                }
                break;
            case -781597262:
                if (str.equals("transformOrigin")) {
                    baseViewManager.setTransformOrigin(view, (ReadableArray) obj);
                    break;
                }
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    Double d8 = (Double) obj;
                    baseViewManager.setZIndex(view, d8 != null ? (float) d8.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -112141555:
                if (str.equals("onPointerLeaveCapture")) {
                    Boolean bool7 = (Boolean) obj;
                    baseViewManager.setPointerLeaveCapture(view, bool7 != null ? bool7.booleanValue() : false);
                    break;
                }
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    baseViewManager.setAccessibilityHint(view, (String) obj);
                    break;
                }
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    baseViewManager.setAccessibilityRole(view, (String) obj);
                    break;
                }
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    Boolean bool8 = (Boolean) obj;
                    baseViewManager.setRenderToHardwareTexture(view, bool8 != null ? bool8.booleanValue() : false);
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    Double d9 = (Double) obj;
                    baseViewManager.setRotation(view, d9 != null ? (float) d9.doubleValue() : 0.0f);
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    Double d10 = (Double) obj;
                    baseViewManager.setElevation(view, d10 != null ? (float) d10.doubleValue() : 0.0f);
                    break;
                }
                break;
            case 3506294:
                if (str.equals("role")) {
                    baseViewManager.setRole(view, (String) obj);
                    break;
                }
                break;
            case 17941018:
                if (str.equals("onPointerEnter")) {
                    Boolean bool9 = (Boolean) obj;
                    baseViewManager.setPointerEnter(view, bool9 != null ? bool9.booleanValue() : false);
                    break;
                }
                break;
            case 24119801:
                if (str.equals("onPointerLeave")) {
                    Boolean bool10 = (Boolean) obj;
                    baseViewManager.setPointerLeave(view, bool10 != null ? bool10.booleanValue() : false);
                    break;
                }
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    baseViewManager.setAccessibilityLiveRegion(view, (String) obj);
                    break;
                }
                break;
            case 132353428:
                if (str.equals("onPointerOverCapture")) {
                    Boolean bool11 = (Boolean) obj;
                    baseViewManager.setPointerOverCapture(view, bool11 != null ? bool11.booleanValue() : false);
                    break;
                }
                break;
            case 317346576:
                if (str.equals("onPointerOut")) {
                    Boolean bool12 = (Boolean) obj;
                    baseViewManager.setPointerOut(view, bool12 != null ? bool12.booleanValue() : false);
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    Double d11 = (Double) obj;
                    baseViewManager.setBorderTopRightRadius(view, d11 != null ? (float) d11.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    Double d12 = (Double) obj;
                    baseViewManager.setBorderBottomLeftRadius(view, d12 != null ? (float) d12.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    Double d13 = (Double) obj;
                    baseViewManager.setBorderBottomRightRadius(view, d13 != null ? (float) d13.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 743055051:
                if (str.equals("boxShadow")) {
                    baseViewManager.setBoxShadow(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    baseViewManager.setImportantForAccessibility(view, (String) obj);
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    baseViewManager.setTransform(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    baseViewManager.setAccessibilityLabel(view, (String) obj);
                    break;
                }
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    baseViewManager.setViewState(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1156088003:
                if (str.equals("accessibilityValue")) {
                    baseViewManager.setAccessibilityValue(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1247744079:
                if (str.equals("onPointerMove")) {
                    Boolean bool13 = (Boolean) obj;
                    baseViewManager.setPointerMove(view, bool13 != null ? bool13.booleanValue() : false);
                    break;
                }
                break;
            case 1247809874:
                if (str.equals("onPointerOver")) {
                    Boolean bool14 = (Boolean) obj;
                    baseViewManager.setPointerOver(view, bool14 != null ? bool14.booleanValue() : false);
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    Context context2 = view.getContext();
                    context2.getClass();
                    baseViewManager.setBackgroundColor(view, ColorPropConverter.getColor(obj, context2, 0));
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    Double d14 = (Double) obj;
                    baseViewManager.setBorderRadius(view, d14 != null ? (float) d14.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 1407295349:
                if (str.equals("outlineOffset")) {
                    Double d15 = (Double) obj;
                    baseViewManager.setOutlineOffset(view, d15 != null ? (float) d15.doubleValue() : Float.NaN);
                    break;
                }
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    baseViewManager.setAccessibilityActions(view, (ReadableArray) obj);
                    break;
                }
                break;
            case 1761903244:
                if (str.equals("accessibilityCollection")) {
                    baseViewManager.setAccessibilityCollection(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 1865277756:
                if (str.equals("accessibilityLabelledBy")) {
                    baseViewManager.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                    break;
                }
                break;
            case 1993034687:
                if (str.equals("accessibilityCollectionItem")) {
                    baseViewManager.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                    break;
                }
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    baseViewManager.setNativeId(view, (String) obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sqg
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void f(View view, String str, ReadableArray readableArray) {
        view.getClass();
        str.getClass();
        readableArray.getClass();
    }

    public String toString() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.c;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tc0
    public List x() {
        return (List) this.c;
    }

    public /* synthetic */ o81(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ o81(int i) {
        this.b = i;
    }

    public o81(BaseViewManager baseViewManager) {
        this.b = 2;
        baseViewManager.getClass();
        this.c = baseViewManager;
    }
}
