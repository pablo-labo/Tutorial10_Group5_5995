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

/* JADX INFO: loaded from: classes2.dex */
public final class zec extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zec(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public final void a(View view, String str, Object obj) {
        byte b = 18;
        switch (this.d) {
            case 0:
                BaseViewManager baseViewManager = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -1937389126:
                        b = !str.equals("homeIndicatorHidden") ? (byte) -1 : (byte) 0;
                        break;
                    case -1853558344:
                        b = !str.equals("gestureEnabled") ? (byte) -1 : (byte) 1;
                        break;
                    case -1734097646:
                        b = !str.equals("hideKeyboardOnSwipe") ? (byte) -1 : (byte) 2;
                        break;
                    case -1349152186:
                        b = !str.equals("sheetCornerRadius") ? (byte) -1 : (byte) 3;
                        break;
                    case -1322084375:
                        b = !str.equals("navigationBarHidden") ? (byte) -1 : (byte) 4;
                        break;
                    case -1156137512:
                        b = !str.equals("statusBarTranslucent") ? (byte) -1 : (byte) 5;
                        break;
                    case -1150711358:
                        b = !str.equals("stackPresentation") ? (byte) -1 : (byte) 6;
                        break;
                    case -1047235902:
                        b = !str.equals("activityState") ? (byte) -1 : (byte) 7;
                        break;
                    case -973702878:
                        b = !str.equals("statusBarColor") ? (byte) -1 : (byte) 8;
                        break;
                    case -958765200:
                        b = !str.equals("statusBarStyle") ? (byte) -1 : (byte) 9;
                        break;
                    case -952227806:
                        b = !str.equals("fullScreenSwipeShadowEnabled") ? (byte) -1 : (byte) 10;
                        break;
                    case -577711652:
                        b = !str.equals("stackAnimation") ? (byte) -1 : (byte) 11;
                        break;
                    case -462720700:
                        b = !str.equals("navigationBarColor") ? (byte) -1 : (byte) 12;
                        break;
                    case -411607385:
                        b = !str.equals("screenId") ? (byte) -1 : (byte) 13;
                        break;
                    case -381571779:
                        b = !str.equals("sheetInitialDetent") ? (byte) -1 : (byte) 14;
                        break;
                    case -274098190:
                        b = !str.equals("sheetAllowedDetents") ? (byte) -1 : (byte) 15;
                        break;
                    case -257141968:
                        b = !str.equals("replaceAnimation") ? (byte) -1 : (byte) 16;
                        break;
                    case -166356101:
                        b = !str.equals("preventNativeDismiss") ? (byte) -1 : (byte) 17;
                        break;
                    case 17337291:
                        if (!str.equals("statusBarHidden")) {
                            b = -1;
                        }
                        break;
                    case 129956386:
                        b = !str.equals("fullScreenSwipeEnabled") ? (byte) -1 : (byte) 19;
                        break;
                    case 187703999:
                        b = !str.equals("gestureResponseDistance") ? (byte) -1 : (byte) 20;
                        break;
                    case 227582404:
                        b = !str.equals("screenOrientation") ? (byte) -1 : (byte) 21;
                        break;
                    case 241896530:
                        b = !str.equals("sheetLargestUndimmedDetent") ? (byte) -1 : (byte) 22;
                        break;
                    case 425064969:
                        b = !str.equals("transitionDuration") ? (byte) -1 : (byte) 23;
                        break;
                    case 1082157413:
                        b = !str.equals("swipeDirection") ? (byte) -1 : (byte) 24;
                        break;
                    case 1110843912:
                        b = !str.equals("customAnimationOnSwipe") ? (byte) -1 : (byte) 25;
                        break;
                    case 1116050554:
                        b = !str.equals("navigationBarTranslucent") ? (byte) -1 : (byte) 26;
                        break;
                    case 1269009342:
                        b = !str.equals("sheetElevation") ? (byte) -1 : (byte) 27;
                        break;
                    case 1357942638:
                        b = !str.equals("sheetGrabberVisible") ? (byte) -1 : (byte) 28;
                        break;
                    case 1387359683:
                        b = !str.equals("statusBarAnimation") ? (byte) -1 : (byte) 29;
                        break;
                    case 1729091548:
                        b = !str.equals("nativeBackButtonDismissalEnabled") ? (byte) -1 : (byte) 30;
                        break;
                    case 2097450072:
                        b = !str.equals("sheetExpandsWhenScrolledToEdge") ? (byte) -1 : (byte) 31;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        ((afc) baseViewManager).setHomeIndicatorHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 1:
                        ((afc) baseViewManager).setGestureEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case 2:
                        ((afc) baseViewManager).setHideKeyboardOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 3:
                        ((afc) baseViewManager).setSheetCornerRadius(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                        break;
                    case 4:
                        ((afc) baseViewManager).setNavigationBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 5:
                        ((afc) baseViewManager).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 6:
                        ((afc) baseViewManager).setStackPresentation(view, (String) obj);
                        break;
                    case 7:
                        ((afc) baseViewManager).setActivityState(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                        break;
                    case 8:
                        ((afc) baseViewManager).setStatusBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((afc) baseViewManager).setStatusBarStyle(view, obj != null ? (String) obj : null);
                        break;
                    case 10:
                        ((afc) baseViewManager).setFullScreenSwipeShadowEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case 11:
                        ((afc) baseViewManager).setStackAnimation(view, (String) obj);
                        break;
                    case 12:
                        ((afc) baseViewManager).setNavigationBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 13:
                        ((afc) baseViewManager).setScreenId(view, obj == null ? "" : (String) obj);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((afc) baseViewManager).setSheetInitialDetent(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 15:
                        ((afc) baseViewManager).setSheetAllowedDetents(view, (ReadableArray) obj);
                        break;
                    case 16:
                        ((afc) baseViewManager).setReplaceAnimation(view, (String) obj);
                        break;
                    case 17:
                        ((afc) baseViewManager).setPreventNativeDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 18:
                        ((afc) baseViewManager).setStatusBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        ((afc) baseViewManager).setFullScreenSwipeEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 20:
                        ((afc) baseViewManager).setGestureResponseDistance(view, (ReadableMap) obj);
                        break;
                    case 21:
                        ((afc) baseViewManager).setScreenOrientation(view, obj != null ? (String) obj : null);
                        break;
                    case 22:
                        ((afc) baseViewManager).setSheetLargestUndimmedDetent(view, obj != null ? ((Double) obj).intValue() : -1);
                        break;
                    case 23:
                        ((afc) baseViewManager).setTransitionDuration(view, obj == null ? 500 : ((Double) obj).intValue());
                        break;
                    case 24:
                        ((afc) baseViewManager).setSwipeDirection(view, (String) obj);
                        break;
                    case 25:
                        ((afc) baseViewManager).setCustomAnimationOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 26:
                        ((afc) baseViewManager).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 27:
                        ((afc) baseViewManager).setSheetElevation(view, obj != null ? ((Double) obj).intValue() : 24);
                        break;
                    case 28:
                        ((afc) baseViewManager).setSheetGrabberVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 29:
                        ((afc) baseViewManager).setStatusBarAnimation(view, obj != null ? (String) obj : null);
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        ((afc) baseViewManager).setNativeBackButtonDismissalEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 31:
                        ((afc) baseViewManager).setSheetExpandsWhenScrolledToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            default:
                BaseViewManager baseViewManager2 = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -2064426617:
                        b = !str.equals("bbHeight") ? (byte) -1 : (byte) 0;
                        break;
                    case -1989576717:
                        b = !str.equals("borderRightColor") ? (byte) -1 : (byte) 1;
                        break;
                    case -1697814026:
                        b = !str.equals("backfaceVisibility") ? (byte) -1 : (byte) 2;
                        break;
                    case -1567958285:
                        b = !str.equals("vbHeight") ? (byte) -1 : (byte) 3;
                        break;
                    case -1470826662:
                        b = !str.equals("borderTopColor") ? (byte) -1 : (byte) 4;
                        break;
                    case -1308858324:
                        b = !str.equals("borderBottomColor") ? (byte) -1 : (byte) 5;
                        break;
                    case -1228066334:
                        b = !str.equals("borderTopLeftRadius") ? (byte) -1 : (byte) 6;
                        break;
                    case -1141400650:
                        b = !str.equals("accessible") ? (byte) -1 : (byte) 7;
                        break;
                    case -1122140597:
                        b = !str.equals("borderTopStartRadius") ? (byte) -1 : (byte) 8;
                        break;
                    case -867333731:
                        b = !str.equals("borderBottomStartRadius") ? (byte) -1 : (byte) 9;
                        break;
                    case -679581037:
                        b = !str.equals("hasTVPreferredFocus") ? (byte) -1 : (byte) 10;
                        break;
                    case -631506969:
                        b = !str.equals("nextFocusDown") ? (byte) -1 : (byte) 11;
                        break;
                    case -631278772:
                        b = !str.equals("nextFocusLeft") ? (byte) -1 : (byte) 12;
                        break;
                    case -483490364:
                        b = !str.equals("borderTopEndRadius") ? (byte) -1 : (byte) 13;
                        break;
                    case -329721498:
                        b = !str.equals("bbWidth") ? (byte) -1 : (byte) 14;
                        break;
                    case -293492298:
                        b = !str.equals("pointerEvents") ? (byte) -1 : (byte) 15;
                        break;
                    case -252105751:
                        b = !str.equals("removeClippedSubviews") ? (byte) -1 : (byte) 16;
                        break;
                    case -242276144:
                        b = !str.equals("borderLeftColor") ? (byte) -1 : (byte) 17;
                        break;
                    case -223134121:
                        if (!str.equals("borderStartEndRadius")) {
                            b = -1;
                        }
                        break;
                    case -148030058:
                        b = !str.equals("borderBottomEndRadius") ? (byte) -1 : (byte) 19;
                        break;
                    case -109689771:
                        b = !str.equals("nativeForegroundAndroid") ? (byte) -1 : (byte) 20;
                        break;
                    case -27894242:
                        b = !str.equals("borderStartStartRadius") ? (byte) -1 : (byte) 21;
                        break;
                    case 3351622:
                        b = !str.equals("minX") ? (byte) -1 : (byte) 22;
                        break;
                    case 3351623:
                        b = !str.equals("minY") ? (byte) -1 : (byte) 23;
                        break;
                    case 92903173:
                        b = !str.equals("align") ? (byte) -1 : (byte) 24;
                        break;
                    case 94842723:
                        b = !str.equals("color") ? (byte) -1 : (byte) 25;
                        break;
                    case 240482938:
                        b = !str.equals("vbWidth") ? (byte) -1 : (byte) 26;
                        break;
                    case 306963138:
                        b = !str.equals("borderBlockStartColor") ? (byte) -1 : (byte) 27;
                        break;
                    case 333432965:
                        b = !str.equals("borderTopRightRadius") ? (byte) -1 : (byte) 28;
                        break;
                    case 503397728:
                        b = !str.equals("nextFocusForward") ? (byte) -1 : (byte) 29;
                        break;
                    case 581268560:
                        b = !str.equals("borderBottomLeftRadius") ? (byte) -1 : (byte) 30;
                        break;
                    case 588239831:
                        b = !str.equals("borderBottomRightRadius") ? (byte) -1 : (byte) 31;
                        break;
                    case 660795168:
                        b = !str.equals("nextFocusUp") ? (byte) -1 : (byte) 32;
                        break;
                    case 684610594:
                        b = !str.equals("borderBlockColor") ? (byte) -1 : (byte) 33;
                        break;
                    case 722830999:
                        b = !str.equals("borderColor") ? (byte) -1 : (byte) 34;
                        break;
                    case 737768677:
                        b = !str.equals("borderStyle") ? (byte) -1 : (byte) 35;
                        break;
                    case 762983977:
                        b = !str.equals("borderBlockEndColor") ? (byte) -1 : (byte) 36;
                        break;
                    case 910681861:
                        b = !str.equals("borderEndStartRadius") ? (byte) -1 : (byte) 37;
                        break;
                    case 926871597:
                        b = !str.equals("hitSlop") ? (byte) -1 : (byte) 38;
                        break;
                    case 1220735892:
                        b = !str.equals("borderEndColor") ? (byte) -1 : (byte) 39;
                        break;
                    case 1349188574:
                        b = !str.equals("borderRadius") ? (byte) -1 : (byte) 40;
                        break;
                    case 1629011506:
                        b = !str.equals("focusable") ? (byte) -1 : (byte) 41;
                        break;
                    case 1667773924:
                        b = !str.equals("needsOffscreenAlphaCompositing") ? (byte) -1 : (byte) 42;
                        break;
                    case 1735382270:
                        b = !str.equals("borderEndEndRadius") ? (byte) -1 : (byte) 43;
                        break;
                    case 1747724810:
                        b = !str.equals("nativeBackgroundAndroid") ? (byte) -1 : (byte) 44;
                        break;
                    case 1908075304:
                        b = !str.equals("meetOrSlice") ? (byte) -1 : (byte) 45;
                        break;
                    case 1910855543:
                        b = !str.equals("nextFocusRight") ? (byte) -1 : (byte) 46;
                        break;
                    case 2119889261:
                        b = !str.equals("borderStartColor") ? (byte) -1 : (byte) 47;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        ((tgc) baseViewManager2).setBbHeight(view, new DynamicFromObject(obj));
                        break;
                    case 1:
                        ((tgc) baseViewManager2).setBorderRightColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 2:
                        ((tgc) baseViewManager2).setBackfaceVisibility(view, obj != null ? (String) obj : null);
                        break;
                    case 3:
                        ((tgc) baseViewManager2).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 4:
                        ((tgc) baseViewManager2).setBorderTopColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 5:
                        ((tgc) baseViewManager2).setBorderBottomColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 6:
                        ((tgc) baseViewManager2).setBorderTopLeftRadius(view, new DynamicFromObject(obj));
                        break;
                    case 7:
                        ((tgc) baseViewManager2).setAccessible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 8:
                        ((tgc) baseViewManager2).setBorderTopStartRadius(view, new DynamicFromObject(obj));
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((tgc) baseViewManager2).setBorderBottomStartRadius(view, new DynamicFromObject(obj));
                        break;
                    case 10:
                        ((tgc) baseViewManager2).setHasTVPreferredFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 11:
                        ((tgc) baseViewManager2).setNextFocusDown(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 12:
                        ((tgc) baseViewManager2).setNextFocusLeft(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 13:
                        ((tgc) baseViewManager2).setBorderTopEndRadius(view, new DynamicFromObject(obj));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((tgc) baseViewManager2).setBbWidth(view, new DynamicFromObject(obj));
                        break;
                    case 15:
                        ((tgc) baseViewManager2).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case 16:
                        ((tgc) baseViewManager2).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 17:
                        ((tgc) baseViewManager2).setBorderLeftColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 18:
                        ((tgc) baseViewManager2).setBorderStartEndRadius(view, new DynamicFromObject(obj));
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        ((tgc) baseViewManager2).setBorderBottomEndRadius(view, new DynamicFromObject(obj));
                        break;
                    case 20:
                        ((tgc) baseViewManager2).setNativeForegroundAndroid(view, (ReadableMap) obj);
                        break;
                    case 21:
                        ((tgc) baseViewManager2).setBorderStartStartRadius(view, new DynamicFromObject(obj));
                        break;
                    case 22:
                        ((tgc) baseViewManager2).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 23:
                        ((tgc) baseViewManager2).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 24:
                        ((tgc) baseViewManager2).setAlign(view, obj != null ? (String) obj : null);
                        break;
                    case 25:
                        ((tgc) baseViewManager2).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 26:
                        ((tgc) baseViewManager2).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 27:
                        ((tgc) baseViewManager2).setBorderBlockStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 28:
                        ((tgc) baseViewManager2).setBorderTopRightRadius(view, new DynamicFromObject(obj));
                        break;
                    case 29:
                        ((tgc) baseViewManager2).setNextFocusForward(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        ((tgc) baseViewManager2).setBorderBottomLeftRadius(view, new DynamicFromObject(obj));
                        break;
                    case 31:
                        ((tgc) baseViewManager2).setBorderBottomRightRadius(view, new DynamicFromObject(obj));
                        break;
                    case 32:
                        ((tgc) baseViewManager2).setNextFocusUp(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 33:
                        ((tgc) baseViewManager2).setBorderBlockColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 34:
                        ((tgc) baseViewManager2).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 35:
                        ((tgc) baseViewManager2).setBorderStyle(view, obj != null ? (String) obj : null);
                        break;
                    case 36:
                        ((tgc) baseViewManager2).setBorderBlockEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 37:
                        ((tgc) baseViewManager2).setBorderEndStartRadius(view, new DynamicFromObject(obj));
                        break;
                    case 38:
                        ((tgc) baseViewManager2).setHitSlop(view, new DynamicFromObject(obj));
                        break;
                    case 39:
                        ((tgc) baseViewManager2).setBorderEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 40:
                        ((tgc) baseViewManager2).setBorderRadius(view, new DynamicFromObject(obj));
                        break;
                    case 41:
                        ((tgc) baseViewManager2).setFocusable(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 42:
                        ((tgc) baseViewManager2).setNeedsOffscreenAlphaCompositing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 43:
                        ((tgc) baseViewManager2).setBorderEndEndRadius(view, new DynamicFromObject(obj));
                        break;
                    case 44:
                        ((tgc) baseViewManager2).setNativeBackgroundAndroid(view, (ReadableMap) obj);
                        break;
                    case 45:
                        ((tgc) baseViewManager2).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 46:
                        ((tgc) baseViewManager2).setNextFocusRight(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 47:
                        ((tgc) baseViewManager2).setBorderStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
        }
    }
}
