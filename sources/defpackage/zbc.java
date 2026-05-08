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
public final class zbc extends o81 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbc(BaseViewManager baseViewManager, int i) {
        super(baseViewManager);
        this.d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: m */
    public void a(View view, String str, Object obj) {
        BaseViewManager baseViewManager;
        byte b;
        switch (this.d) {
            case 0:
                baseViewManager = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "allowFileAccessFromFileURLs":
                        ((dcc) baseViewManager).setAllowFileAccessFromFileURLs(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "sharedCookiesEnabled":
                        ((dcc) baseViewManager).setSharedCookiesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowsPictureInPictureMediaPlayback":
                        ((dcc) baseViewManager).setAllowsPictureInPictureMediaPlayback(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowsProtectedMedia":
                        ((dcc) baseViewManager).setAllowsProtectedMedia(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "saveFormDataDisabled":
                        ((dcc) baseViewManager).setSaveFormDataDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "textInteractionEnabled":
                        ((dcc) baseViewManager).setTextInteractionEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "paymentRequestEnabled":
                        ((dcc) baseViewManager).setPaymentRequestEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "injectedJavaScriptBeforeContentLoaded":
                        ((dcc) baseViewManager).setInjectedJavaScriptBeforeContentLoaded(view, obj != null ? (String) obj : null);
                        break;
                    case "directionalLockEnabled":
                        ((dcc) baseViewManager).setDirectionalLockEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "javaScriptEnabled":
                        ((dcc) baseViewManager).setJavaScriptEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "messagingEnabled":
                        ((dcc) baseViewManager).setMessagingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "indicatorStyle":
                        ((dcc) baseViewManager).setIndicatorStyle(view, (String) obj);
                        break;
                    case "dataDetectorTypes":
                        ((dcc) baseViewManager).setDataDetectorTypes(view, (ReadableArray) obj);
                        break;
                    case "menuItems":
                        ((dcc) baseViewManager).setMenuItems(view, (ReadableArray) obj);
                        break;
                    case "incognito":
                        ((dcc) baseViewManager).setIncognito(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowingReadAccessToURL":
                        ((dcc) baseViewManager).setAllowingReadAccessToURL(view, obj != null ? (String) obj : null);
                        break;
                    case "overScrollMode":
                        ((dcc) baseViewManager).setOverScrollMode(view, obj != null ? (String) obj : null);
                        break;
                    case "scrollEnabled":
                        ((dcc) baseViewManager).setScrollEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "keyboardDisplayRequiresUserAction":
                        ((dcc) baseViewManager).setKeyboardDisplayRequiresUserAction(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "domStorageEnabled":
                        ((dcc) baseViewManager).setDomStorageEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowsLinkPreview":
                        ((dcc) baseViewManager).setAllowsLinkPreview(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "useSharedProcessPool":
                        ((dcc) baseViewManager).setUseSharedProcessPool(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "textZoom":
                        ((dcc) baseViewManager).setTextZoom(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "showsVerticalScrollIndicator":
                        ((dcc) baseViewManager).setShowsVerticalScrollIndicator(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "forceDarkOn":
                        ((dcc) baseViewManager).setForceDarkOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "minimumFontSize":
                        ((dcc) baseViewManager).setMinimumFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case "hideKeyboardAccessoryView":
                        ((dcc) baseViewManager).setHideKeyboardAccessoryView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowUniversalAccessFromFileURLs":
                        ((dcc) baseViewManager).setAllowUniversalAccessFromFileURLs(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "mediaCapturePermissionGrantType":
                        ((dcc) baseViewManager).setMediaCapturePermissionGrantType(view, (String) obj);
                        break;
                    case "newSource":
                        ((dcc) baseViewManager).setNewSource(view, (ReadableMap) obj);
                        break;
                    case "hasOnFileDownload":
                        ((dcc) baseViewManager).setHasOnFileDownload(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "cacheMode":
                        ((dcc) baseViewManager).setCacheMode(view, (String) obj);
                        break;
                    case "pagingEnabled":
                        ((dcc) baseViewManager).setPagingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "contentMode":
                        ((dcc) baseViewManager).setContentMode(view, (String) obj);
                        break;
                    case "messagingModuleName":
                        ((dcc) baseViewManager).setMessagingModuleName(view, obj != null ? (String) obj : null);
                        break;
                    case "hasOnOpenWindowEvent":
                        ((dcc) baseViewManager).setHasOnOpenWindowEvent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "javaScriptCanOpenWindowsAutomatically":
                        ((dcc) baseViewManager).setJavaScriptCanOpenWindowsAutomatically(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "setDisplayZoomControls":
                        ((dcc) baseViewManager).setSetDisplayZoomControls(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowsFullscreenVideo":
                        ((dcc) baseViewManager).setAllowsFullscreenVideo(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "nestedScrollEnabled":
                        ((dcc) baseViewManager).setNestedScrollEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "injectedJavaScriptBeforeContentLoadedForMainFrameOnly":
                        ((dcc) baseViewManager).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "hasOnScroll":
                        ((dcc) baseViewManager).setHasOnScroll(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "bounces":
                        ((dcc) baseViewManager).setBounces(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "setSupportMultipleWindows":
                        ((dcc) baseViewManager).setSetSupportMultipleWindows(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "lackPermissionToDownloadMessage":
                        ((dcc) baseViewManager).setLackPermissionToDownloadMessage(view, obj != null ? (String) obj : null);
                        break;
                    case "injectedJavaScript":
                        ((dcc) baseViewManager).setInjectedJavaScript(view, obj != null ? (String) obj : null);
                        break;
                    case "automaticallyAdjustContentInsets":
                        ((dcc) baseViewManager).setAutomaticallyAdjustContentInsets(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "userAgent":
                        ((dcc) baseViewManager).setUserAgent(view, obj != null ? (String) obj : null);
                        break;
                    case "allowsInlineMediaPlayback":
                        ((dcc) baseViewManager).setAllowsInlineMediaPlayback(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "cacheEnabled":
                        ((dcc) baseViewManager).setCacheEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "injectedJavaScriptForMainFrameOnly":
                        ((dcc) baseViewManager).setInjectedJavaScriptForMainFrameOnly(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "webviewDebuggingEnabled":
                        ((dcc) baseViewManager).setWebviewDebuggingEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "injectedJavaScriptObject":
                        ((dcc) baseViewManager).setInjectedJavaScriptObject(view, obj != null ? (String) obj : null);
                        break;
                    case "applicationNameForUserAgent":
                        ((dcc) baseViewManager).setApplicationNameForUserAgent(view, obj != null ? (String) obj : null);
                        break;
                    case "mixedContentMode":
                        ((dcc) baseViewManager).setMixedContentMode(view, (String) obj);
                        break;
                    case "contentInset":
                        ((dcc) baseViewManager).setContentInset(view, (ReadableMap) obj);
                        break;
                    case "allowsBackForwardNavigationGestures":
                        ((dcc) baseViewManager).setAllowsBackForwardNavigationGestures(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowsAirPlayForMediaPlayback":
                        ((dcc) baseViewManager).setAllowsAirPlayForMediaPlayback(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "allowFileAccess":
                        ((dcc) baseViewManager).setAllowFileAccess(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "limitsNavigationsToAppBoundDomains":
                        ((dcc) baseViewManager).setLimitsNavigationsToAppBoundDomains(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "setBuiltInZoomControls":
                        ((dcc) baseViewManager).setSetBuiltInZoomControls(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "pullToRefreshEnabled":
                        ((dcc) baseViewManager).setPullToRefreshEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "refreshControlLightMode":
                        ((dcc) baseViewManager).setRefreshControlLightMode(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "fraudulentWebsiteWarningEnabled":
                        ((dcc) baseViewManager).setFraudulentWebsiteWarningEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "geolocationEnabled":
                        ((dcc) baseViewManager).setGeolocationEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "downloadingMessage":
                        ((dcc) baseViewManager).setDownloadingMessage(view, obj != null ? (String) obj : null);
                        break;
                    case "basicAuthCredential":
                        ((dcc) baseViewManager).setBasicAuthCredential(view, (ReadableMap) obj);
                        break;
                    case "enableApplePay":
                        ((dcc) baseViewManager).setEnableApplePay(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case "mediaPlaybackRequiresUserAction":
                        ((dcc) baseViewManager).setMediaPlaybackRequiresUserAction(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "thirdPartyCookiesEnabled":
                        ((dcc) baseViewManager).setThirdPartyCookiesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "autoManageStatusBarEnabled":
                        ((dcc) baseViewManager).setAutoManageStatusBarEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "androidLayerType":
                        ((dcc) baseViewManager).setAndroidLayerType(view, (String) obj);
                        break;
                    case "suppressMenuItems":
                        ((dcc) baseViewManager).setSuppressMenuItems(view, (ReadableArray) obj);
                        break;
                    case "showsHorizontalScrollIndicator":
                        ((dcc) baseViewManager).setShowsHorizontalScrollIndicator(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "scalesPageToFit":
                        ((dcc) baseViewManager).setScalesPageToFit(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                        break;
                    case "decelerationRate":
                        ((dcc) baseViewManager).setDecelerationRate(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                        break;
                    case "contentInsetAdjustmentBehavior":
                        ((dcc) baseViewManager).setContentInsetAdjustmentBehavior(view, (String) obj);
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            case 1:
            default:
                super.a(view, str, obj);
                break;
            case 2:
                BaseViewManager baseViewManager2 = (BaseViewManager) this.c;
                str.getClass();
                switch (str.hashCode()) {
                    case -1603134955:
                        b = !str.equals("lengthAdjust") ? (byte) -1 : (byte) 0;
                        break;
                    case -1274492040:
                        b = !str.equals("filter") ? (byte) -1 : (byte) 1;
                        break;
                    case -1267206133:
                        b = !str.equals("opacity") ? (byte) -1 : (byte) 2;
                        break;
                    case -1171891896:
                        b = !str.equals("alignmentBaseline") ? (byte) -1 : (byte) 3;
                        break;
                    case -1139902161:
                        b = !str.equals("verticalAlign") ? (byte) -1 : (byte) 4;
                        break;
                    case -1081239615:
                        b = !str.equals("matrix") ? (byte) -1 : (byte) 5;
                        break;
                    case -993894751:
                        b = !str.equals("propList") ? (byte) -1 : (byte) 6;
                        break;
                    case -933864895:
                        b = !str.equals("markerEnd") ? (byte) -1 : (byte) 7;
                        break;
                    case -933857362:
                        b = !str.equals("markerMid") ? (byte) -1 : (byte) 8;
                        break;
                    case -925180581:
                        b = !str.equals("rotate") ? (byte) -1 : (byte) 9;
                        break;
                    case -891980232:
                        b = !str.equals("stroke") ? (byte) -1 : (byte) 10;
                        break;
                    case -734428249:
                        b = !str.equals("fontWeight") ? (byte) -1 : (byte) 11;
                        break;
                    case -729118945:
                        b = !str.equals("fillRule") ? (byte) -1 : (byte) 12;
                        break;
                    case -416535885:
                        b = !str.equals("strokeOpacity") ? (byte) -1 : (byte) 13;
                        break;
                    case -293492298:
                        b = !str.equals("pointerEvents") ? (byte) -1 : (byte) 14;
                        break;
                    case -53677816:
                        b = !str.equals("fillOpacity") ? (byte) -1 : (byte) 15;
                        break;
                    case -44578051:
                        b = !str.equals("strokeDashoffset") ? (byte) -1 : (byte) 16;
                        break;
                    case 120:
                        b = !str.equals("x") ? (byte) -1 : (byte) 17;
                        break;
                    case 121:
                        b = !str.equals("y") ? (byte) -1 : (byte) 18;
                        break;
                    case 3220:
                        b = !str.equals("dx") ? (byte) -1 : (byte) 19;
                        break;
                    case 3221:
                        b = !str.equals("dy") ? (byte) -1 : (byte) 20;
                        break;
                    case 3143043:
                        b = !str.equals("fill") ? (byte) -1 : (byte) 21;
                        break;
                    case 3148879:
                        b = !str.equals("font") ? (byte) -1 : (byte) 22;
                        break;
                    case 3344108:
                        b = !str.equals("mask") ? (byte) -1 : (byte) 23;
                        break;
                    case 3373707:
                        b = !str.equals("name") ? (byte) -1 : (byte) 24;
                        break;
                    case 78845486:
                        b = !str.equals("strokeMiterlimit") ? (byte) -1 : (byte) 25;
                        break;
                    case 94842723:
                        b = !str.equals("color") ? (byte) -1 : (byte) 26;
                        break;
                    case 104482996:
                        b = !str.equals("vectorEffect") ? (byte) -1 : (byte) 27;
                        break;
                    case 217109576:
                        b = !str.equals("markerStart") ? (byte) -1 : (byte) 28;
                        break;
                    case 275888445:
                        b = !str.equals("baselineShift") ? (byte) -1 : (byte) 29;
                        break;
                    case 365601008:
                        b = !str.equals("fontSize") ? (byte) -1 : (byte) 30;
                        break;
                    case 401643183:
                        b = !str.equals("strokeDasharray") ? (byte) -1 : (byte) 31;
                        break;
                    case 778043962:
                        b = !str.equals("inlineSize") ? (byte) -1 : (byte) 32;
                        break;
                    case 917656469:
                        b = !str.equals("clipPath") ? (byte) -1 : (byte) 33;
                        break;
                    case 917735020:
                        b = !str.equals("clipRule") ? (byte) -1 : (byte) 34;
                        break;
                    case 1027575302:
                        b = !str.equals("strokeLinecap") ? (byte) -1 : (byte) 35;
                        break;
                    case 1637488243:
                        b = !str.equals("textLength") ? (byte) -1 : (byte) 36;
                        break;
                    case 1671764162:
                        b = !str.equals("display") ? (byte) -1 : (byte) 37;
                        break;
                    case 1790285174:
                        b = !str.equals("strokeLinejoin") ? (byte) -1 : (byte) 38;
                        break;
                    case 1847674614:
                        b = !str.equals("responsible") ? (byte) -1 : (byte) 39;
                        break;
                    case 1924065902:
                        b = !str.equals("strokeWidth") ? (byte) -1 : (byte) 40;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        ((wgc) baseViewManager2).setLengthAdjust(view, obj != null ? (String) obj : null);
                        break;
                    case 1:
                        ((wgc) baseViewManager2).setFilter(view, obj != null ? (String) obj : null);
                        break;
                    case 2:
                        baseViewManager2.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case 3:
                        ((wgc) baseViewManager2).setAlignmentBaseline(view, obj != null ? (String) obj : null);
                        break;
                    case 4:
                        ((wgc) baseViewManager2).setVerticalAlign(view, new DynamicFromObject(obj));
                        break;
                    case 5:
                        ((wgc) baseViewManager2).setMatrix(view, (ReadableArray) obj);
                        break;
                    case 6:
                        ((wgc) baseViewManager2).setPropList(view, (ReadableArray) obj);
                        break;
                    case 7:
                        ((wgc) baseViewManager2).setMarkerEnd(view, obj != null ? (String) obj : null);
                        break;
                    case 8:
                        ((wgc) baseViewManager2).setMarkerMid(view, obj != null ? (String) obj : null);
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        ((wgc) baseViewManager2).setRotate(view, new DynamicFromObject(obj));
                        break;
                    case 10:
                        ((wgc) baseViewManager2).setStroke(view, new DynamicFromObject(obj));
                        break;
                    case 11:
                        ((wgc) baseViewManager2).setFontWeight(view, new DynamicFromObject(obj));
                        break;
                    case 12:
                        ((wgc) baseViewManager2).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                        break;
                    case 13:
                        ((wgc) baseViewManager2).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        ((wgc) baseViewManager2).setPointerEvents(view, obj != null ? (String) obj : null);
                        break;
                    case 15:
                        ((wgc) baseViewManager2).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                        break;
                    case 16:
                        ((wgc) baseViewManager2).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 17:
                        ((wgc) baseViewManager2).setX(view, new DynamicFromObject(obj));
                        break;
                    case 18:
                        ((wgc) baseViewManager2).setY(view, new DynamicFromObject(obj));
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        ((wgc) baseViewManager2).setDx(view, new DynamicFromObject(obj));
                        break;
                    case 20:
                        ((wgc) baseViewManager2).setDy(view, new DynamicFromObject(obj));
                        break;
                    case 21:
                        ((wgc) baseViewManager2).setFill(view, new DynamicFromObject(obj));
                        break;
                    case 22:
                        ((wgc) baseViewManager2).setFont(view, new DynamicFromObject(obj));
                        break;
                    case 23:
                        ((wgc) baseViewManager2).setMask(view, obj != null ? (String) obj : null);
                        break;
                    case 24:
                        ((wgc) baseViewManager2).setName(view, obj != null ? (String) obj : null);
                        break;
                    case 25:
                        ((wgc) baseViewManager2).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                        break;
                    case 26:
                        ((wgc) baseViewManager2).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                        break;
                    case 27:
                        ((wgc) baseViewManager2).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 28:
                        ((wgc) baseViewManager2).setMarkerStart(view, obj != null ? (String) obj : null);
                        break;
                    case 29:
                        ((wgc) baseViewManager2).setBaselineShift(view, new DynamicFromObject(obj));
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        ((wgc) baseViewManager2).setFontSize(view, new DynamicFromObject(obj));
                        break;
                    case 31:
                        ((wgc) baseViewManager2).setStrokeDasharray(view, new DynamicFromObject(obj));
                        break;
                    case 32:
                        ((wgc) baseViewManager2).setInlineSize(view, new DynamicFromObject(obj));
                        break;
                    case 33:
                        ((wgc) baseViewManager2).setClipPath(view, obj != null ? (String) obj : null);
                        break;
                    case 34:
                        ((wgc) baseViewManager2).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 35:
                        ((wgc) baseViewManager2).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 36:
                        ((wgc) baseViewManager2).setTextLength(view, new DynamicFromObject(obj));
                        break;
                    case 37:
                        ((wgc) baseViewManager2).setDisplay(view, obj != null ? (String) obj : null);
                        break;
                    case 38:
                        ((wgc) baseViewManager2).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                        break;
                    case 39:
                        ((wgc) baseViewManager2).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                        break;
                    case 40:
                        ((wgc) baseViewManager2).setStrokeWidth(view, new DynamicFromObject(obj));
                        break;
                    default:
                        super.a(view, str, obj);
                        break;
                }
                break;
            case 3:
                str.getClass();
                if (!str.equals("name")) {
                    super.a(view, str, obj);
                } else {
                    ((f6g) ((BaseViewManager) this.c)).setName(view, obj == null ? "" : (String) obj);
                }
                break;
        }
    }

    @Override // defpackage.o81, defpackage.sqg
    /* JADX INFO: renamed from: s */
    public void f(View view, String str, ReadableArray readableArray) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        switch (this.d) {
            case 0:
                onLayoutChangeListener = (BaseViewManager) this.c;
                str.getClass();
                switch (str) {
                    case "goBack":
                        ((dcc) onLayoutChangeListener).goBack(view);
                        break;
                    case "stopLoading":
                        ((dcc) onLayoutChangeListener).stopLoading(view);
                        break;
                    case "reload":
                        ((dcc) onLayoutChangeListener).reload(view);
                        break;
                    case "clearCache":
                        ((dcc) onLayoutChangeListener).clearCache(view, readableArray.getBoolean(0));
                        break;
                    case "goForward":
                        ((dcc) onLayoutChangeListener).goForward(view);
                        break;
                    case "clearFormData":
                        ((dcc) onLayoutChangeListener).clearFormData(view);
                        break;
                    case "loadUrl":
                        ((dcc) onLayoutChangeListener).loadUrl(view, readableArray.getString(0));
                        break;
                    case "clearHistory":
                        ((dcc) onLayoutChangeListener).clearHistory(view);
                        break;
                    case "requestFocus":
                        ((dcc) onLayoutChangeListener).requestFocus(view);
                        break;
                    case "postMessage":
                        ((dcc) onLayoutChangeListener).postMessage(view, readableArray.getString(0));
                        break;
                    case "injectJavaScript":
                        ((dcc) onLayoutChangeListener).injectJavaScript(view, readableArray.getString(0));
                        break;
                }
                break;
            default:
                super.f(view, str, readableArray);
                break;
        }
    }
}
