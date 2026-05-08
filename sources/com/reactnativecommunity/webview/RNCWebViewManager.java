package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.g;
import com.reactnativecommunity.webview.RNCWebViewModule;
import defpackage.a32;
import defpackage.b0;
import defpackage.bcc;
import defpackage.cwg;
import defpackage.dcc;
import defpackage.gb9;
import defpackage.icc;
import defpackage.l5;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.r6;
import defpackage.rbc;
import defpackage.sg0;
import defpackage.snc;
import defpackage.sqg;
import defpackage.ug0;
import defpackage.vbc;
import defpackage.wbc;
import defpackage.wl7;
import defpackage.wuf;
import defpackage.wve;
import defpackage.xwg;
import defpackage.ybc;
import defpackage.z3;
import defpackage.zbc;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNCWebView")
public class RNCWebViewManager extends ViewGroupManager<icc> implements dcc<icc> {
    private final sqg<icc> mDelegate = new zbc(this, 0);
    private final bcc mRNCWebViewManagerImpl = new bcc();

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf mkfVar, icc iccVar) {
        wbc webView = iccVar.getWebView();
        ybc ybcVar = new ybc();
        ybcVar.a = false;
        ybcVar.b = null;
        ybcVar.c = null;
        ybcVar.d = null;
        webView.setWebViewClient(ybcVar);
    }

    @Override // defpackage.dcc
    public void clearCache(icc iccVar, boolean z) {
        iccVar.getWebView().clearCache(z);
    }

    @Override // defpackage.dcc
    public void clearFormData(icc iccVar) {
        iccVar.getWebView().clearFormData();
    }

    @Override // defpackage.dcc
    public void clearHistory(icc iccVar) {
        iccVar.getWebView().clearHistory();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public icc createViewInstance(mkf mkfVar) {
        final bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        mkfVar.getClass();
        final wbc wbcVar = new wbc(mkfVar);
        wbcVar.d = null;
        wbcVar.e = false;
        wbcVar.a0 = false;
        wbcVar.c0 = false;
        wbcVar.d0 = false;
        wbcVar.h0 = null;
        wbcVar.V = (RNCWebViewMessagingModule) ((mkf) wbcVar.getContext()).a.getJSModule(RNCWebViewMessagingModule.class);
        wbc.c cVar = new wbc.c();
        cVar.a = false;
        wbcVar.e0 = cVar;
        bccVar.c(wbcVar);
        mkfVar.a.addLifecycleEventListener(wbcVar);
        WebSettings settings = wbcVar.getSettings();
        settings.getClass();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        wbcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wbcVar.setDownloadListener(new DownloadListener() { // from class: acc
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                String strSubstring;
                int iLastIndexOf;
                Matcher matcher;
                String strDecode;
                int iLastIndexOf2;
                bcc bccVar2 = bccVar;
                wbc wbcVar2 = wbcVar;
                wbcVar2.setIgnoreErrFailedForThisURL(str);
                RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) wbcVar2.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
                if (rNCWebViewModule == null) {
                    return;
                }
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    Pattern pattern = t4g.a;
                    String strSubstring2 = null;
                    if (str3 != null) {
                        try {
                            matcher = t4g.a.matcher(str3);
                        } catch (IllegalStateException unused) {
                        }
                        if (!matcher.find()) {
                            strSubstring = null;
                        } else if (matcher.group(3) == null || matcher.group(4) == null) {
                            strSubstring = matcher.group(2);
                        } else {
                            try {
                                strSubstring = URLDecoder.decode(matcher.group(4), matcher.group(3).isEmpty() ? "UTF-8" : matcher.group(3));
                            } catch (UnsupportedEncodingException unused2) {
                                strSubstring = matcher.group(2);
                            }
                        }
                        if (strSubstring != null && (iLastIndexOf = strSubstring.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strSubstring.substring(iLastIndexOf);
                        }
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring == null && (strDecode = Uri.decode(str)) != null) {
                        int iIndexOf = strDecode.indexOf(63);
                        if (iIndexOf > 0) {
                            strDecode = strDecode.substring(0, iIndexOf);
                        }
                        if (!strDecode.endsWith("/") && (iLastIndexOf2 = strDecode.lastIndexOf(47) + 1) > 0) {
                            strSubstring = strDecode.substring(iLastIndexOf2);
                        }
                    }
                    if (strSubstring == null) {
                        strSubstring = "downloadfile";
                    }
                    int iIndexOf2 = strSubstring.indexOf(46);
                    if (iIndexOf2 < 0) {
                        if (str4 != null && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                            strSubstring2 = ".".concat(strSubstring2);
                        }
                        if (strSubstring2 == null) {
                            strSubstring2 = (str4 == null || !str4.toLowerCase(Locale.ROOT).startsWith("text/")) ? ".bin" : str4.equalsIgnoreCase("text/html") ? ".html" : ".txt";
                        }
                    } else {
                        if (str4 != null) {
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring.substring(strSubstring.lastIndexOf(46) + 1));
                            if (mimeTypeFromExtension != null && !mimeTypeFromExtension.equalsIgnoreCase(str4) && (strSubstring2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str4)) != null) {
                                strSubstring2 = ".".concat(strSubstring2);
                            }
                        }
                        if (strSubstring2 == null) {
                            strSubstring2 = strSubstring.substring(iIndexOf2);
                        }
                        strSubstring = strSubstring.substring(0, iIndexOf2);
                    }
                    String strE = ccc.a.e(strSubstring.concat(strSubstring2), "_");
                    String strConcat = "Downloading ".concat(strE);
                    try {
                        URL url = new URL(str);
                        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                    } catch (MalformedURLException e) {
                        bccVar2.getClass();
                        Log.w("RNCWebViewManagerImpl", "Error getting cookie for DownloadManager", e);
                    }
                    request.addRequestHeader(DataOkHttpUploader.HEADER_USER_AGENT, str2);
                    request.setTitle(strE);
                    request.setDescription(strConcat);
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strE);
                    rNCWebViewModule.setDownloadRequest(request);
                    String str5 = bccVar2.c;
                    if (str5 == null) {
                        str5 = "Downloading";
                    }
                    String str6 = bccVar2.d;
                    if (str6 == null) {
                        str6 = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
                    }
                    if (rNCWebViewModule.grantFileDownloaderPermissions(str5, str6)) {
                        String str7 = bccVar2.c;
                        rNCWebViewModule.downloadFile(str7 != null ? str7 : "Downloading");
                    }
                } catch (IllegalArgumentException e2) {
                    bccVar2.getClass();
                    Log.w("RNCWebViewManagerImpl", "Unsupported URI, aborting download", e2);
                }
            }
        });
        return new icc(mkfVar, wbcVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        this.mRNCWebViewManagerImpl.getClass();
        gb9.a aVar = new gb9.a();
        aVar.a("goBack", 1);
        aVar.a("goForward", 2);
        aVar.a("reload", 3);
        aVar.a("stopLoading", 4);
        aVar.a("postMessage", 5);
        aVar.a("injectJavaScript", 6);
        aVar.a("loadUrl", 7);
        aVar.a("requestFocus", 8);
        aVar.a("clearFormData", 1000);
        aVar.a("clearCache", 1001);
        aVar.a("clearHistory", 1002);
        if (aVar.b) {
            aVar.b = false;
            return aVar.a;
        }
        r6.g("Underlying map has already been built");
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<icc> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", gb9.a("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", gb9.a("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", gb9.a("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", gb9.a("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", gb9.a("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", gb9.a("registrationName", "onShouldStartLoadWithRequest"));
        g.a.getClass();
        exportedCustomDirectEventTypeConstants.put(g.a.a(g.d), gb9.a("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", gb9.a("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", gb9.a("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", gb9.a("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", gb9.a("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // defpackage.dcc
    public void goBack(icc iccVar) {
        iccVar.getWebView().goBack();
    }

    @Override // defpackage.dcc
    public void goForward(icc iccVar) {
        iccVar.getWebView().goForward();
    }

    @Override // defpackage.dcc
    public void injectJavaScript(icc iccVar, String str) {
        iccVar.getWebView().evaluateJavascript(str, null);
    }

    @Override // defpackage.dcc
    public void loadUrl(icc iccVar, String str) {
        iccVar.getWebView().loadUrl(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(icc iccVar) {
        byte[] bytes;
        super.onAfterUpdateTransaction(iccVar);
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        ReadableMap readableMap = bccVar.f;
        if (readableMap != null) {
            wbc webView = iccVar.getWebView();
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                string.getClass();
                webView.loadDataWithBaseURL(string2, string, "text/html", "UTF-8", null);
            } else if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string3)) {
                    if (readableMap.hasKey("method") && wve.E(readableMap.getString("method"), "POST", true)) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                string4.getClass();
                                Charset charsetForName = Charset.forName("UTF-8");
                                charsetForName.getClass();
                                bytes = string4.getBytes(charsetForName);
                                bytes.getClass();
                            } catch (UnsupportedEncodingException unused) {
                                string4.getClass();
                                bytes = string4.getBytes(a32.b);
                                bytes.getClass();
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        string3.getClass();
                        webView.postUrl(string3, bytes);
                    } else {
                        HashMap map = new HashMap();
                        if (readableMap.hasKey("headers")) {
                            ReadableArray array = readableMap.getArray("headers");
                            array.getClass();
                            Iterator<Object> it = array.toArrayList().iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                HashMap map2 = (HashMap) next;
                                String str = (String) map2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) map2.get("value");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale locale = Locale.ENGLISH;
                                locale.getClass();
                                String lowerCase = str.toLowerCase(locale);
                                lowerCase.getClass();
                                if ("user-agent".equals(lowerCase)) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    map.put(str, str2);
                                }
                            }
                        }
                        string3.getClass();
                        webView.loadUrl(string3, map);
                    }
                }
            } else {
                webView.loadUrl("about:blank");
            }
        }
        bccVar.f = null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(icc iccVar) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        mkf themedReactContext = webView.getThemedReactContext();
        themedReactContext.getClass();
        themedReactContext.a.removeLifecycleEventListener(webView);
        webView.setWebViewClient(null);
        webView.destroy();
        webView.g0 = null;
        super.onDropViewInstance(iccVar);
    }

    @Override // defpackage.dcc
    public void postMessage(icc iccVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            iccVar.getWebView().evaluateJavascript("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();", null);
        } catch (JSONException e) {
            l5.r(e);
        }
    }

    @Override // defpackage.dcc
    public void reload(icc iccVar) {
        iccVar.getWebView().reload();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.dcc
    @snc(name = "allowFileAccess")
    public void setAllowFileAccess(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setAllowFileAccess(z);
    }

    @Override // defpackage.dcc
    @snc(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @Override // defpackage.dcc
    @snc(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @Override // defpackage.dcc
    @snc(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(icc iccVar, boolean z) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        bccVar.a = z;
        bccVar.c(webView);
    }

    @Override // defpackage.dcc
    @snc(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(icc iccVar, boolean z) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        bccVar.b = z;
        WebChromeClient webChromeClient = webView.getWebChromeClient();
        if (webChromeClient == null || !(webChromeClient instanceof vbc)) {
            return;
        }
        ((vbc) webChromeClient).Z = z;
    }

    @Override // defpackage.dcc
    @snc(name = "androidLayerType")
    public void setAndroidLayerType(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setLayerType(wl7.b(str, "hardware") ? 2 : wl7.b(str, "software") ? 1 : 0, null);
    }

    @Override // defpackage.dcc
    @snc(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(icc iccVar, String str) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        if (str != null) {
            bccVar.h = z3.m(WebSettings.getDefaultUserAgent(iccVar.getWebView().getContext()), " ", str);
        } else {
            bccVar.h = null;
        }
        bccVar.b(iccVar);
    }

    @Override // defpackage.dcc
    @snc(name = "basicAuthCredential")
    public void setBasicAuthCredential(icc iccVar, ReadableMap readableMap) {
        rbc rbcVar;
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        if (readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) {
            String string = readableMap.getString("username");
            String string2 = readableMap.getString("password");
            rbcVar = new rbc();
            rbcVar.a = string;
            rbcVar.b = string2;
        } else {
            rbcVar = null;
        }
        iccVar.getWebView().setBasicAuthCredential(rbcVar);
    }

    @Override // defpackage.dcc
    @snc(name = "cacheEnabled")
    public void setCacheEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setCacheMode(z ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.dcc
    @snc(name = "cacheMode")
    public void setCacheMode(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        WebSettings settings = iccVar.getWebView().getSettings();
        int i = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i = 2;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i = 1;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i = 3;
                    }
                    break;
            }
        }
        settings.setCacheMode(i);
    }

    @Override // defpackage.dcc
    @snc(name = "domStorageEnabled")
    public void setDomStorageEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setDomStorageEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "forceDarkOn")
    public void setForceDarkOn(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (wuf.g("FORCE_DARK")) {
                int i = z ? 2 : 0;
                WebSettings settings = webView.getSettings();
                sg0.h hVar = xwg.c;
                if (hVar.c()) {
                    ug0.a(settings, i);
                } else {
                    if (!hVar.d()) {
                        b0.u("This method is not supported by the current version of the framework and the current WebView APK");
                        return;
                    }
                    cwg.a(settings).h(i);
                }
            }
            if (z && wuf.g("FORCE_DARK_STRATEGY")) {
                WebSettings settings2 = webView.getSettings();
                if (xwg.d.d()) {
                    cwg.a(settings2).i();
                } else {
                    b0.u("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    @Override // defpackage.dcc
    @snc(name = "geolocationEnabled")
    public void setGeolocationEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setGeolocationEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(icc iccVar, boolean z) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        bccVar.e = z;
        bccVar.c(webView);
    }

    @Override // defpackage.dcc
    @snc(name = "hasOnScroll")
    public void setHasOnScroll(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setHasScrollEvent(z);
    }

    @Override // defpackage.dcc
    @snc(name = "incognito")
    public void setIncognito(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        if (z) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @Override // defpackage.dcc
    @snc(name = "injectedJavaScript")
    public void setInjectedJavaScript(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().a = str;
    }

    @Override // defpackage.dcc
    @snc(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().b = str;
    }

    @Override // defpackage.dcc
    @snc(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getClass();
    }

    @Override // defpackage.dcc
    @snc(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getClass();
    }

    @Override // defpackage.dcc
    @snc(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setInjectedJavaScriptObject(str);
    }

    @Override // defpackage.dcc
    @snc(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @Override // defpackage.dcc
    @snc(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setJavaScriptEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @Override // defpackage.dcc
    @snc(name = "menuItems")
    public void setMenuItems(icc iccVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        arrayList.getClass();
        webView.setMenuCustomItems(arrayList);
    }

    @Override // defpackage.dcc
    @snc(name = "messagingEnabled")
    public void setMessagingEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setMessagingEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "messagingModuleName")
    public void setMessagingModuleName(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().f = str;
    }

    @Override // defpackage.dcc
    @snc(name = "minimumFontSize")
    public void setMinimumFontSize(icc iccVar, int i) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setMinimumFontSize(i);
    }

    @Override // defpackage.dcc
    @snc(name = "mixedContentMode")
    public void setMixedContentMode(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        if (str == null || "never".equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if ("always".equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @Override // defpackage.dcc
    @snc(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().d0 = z;
    }

    @Override // defpackage.dcc
    @snc(name = "newSource")
    public void setNewSource(icc iccVar, ReadableMap readableMap) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        bccVar.f = readableMap;
    }

    @Override // defpackage.dcc
    @snc(name = "overScrollMode")
    public void setOverScrollMode(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        int i = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1414557169) {
                str.equals("always");
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals("content")) {
                    i = 1;
                }
            } else if (str.equals("never")) {
                i = 2;
            }
        }
        webView.setOverScrollMode(i);
    }

    @Override // defpackage.dcc
    @snc(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        bcc.a(iccVar, z);
    }

    @Override // defpackage.dcc
    @snc(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setSaveFormData(!z);
    }

    @Override // defpackage.dcc
    @snc(name = "scalesPageToFit")
    public void setScalesPageToFit(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        wbc webView = iccVar.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @Override // defpackage.dcc
    @snc(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setBuiltInZoomControls(z);
    }

    @Override // defpackage.dcc
    @snc(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setDisplayZoomControls(z);
    }

    @Override // defpackage.dcc
    @snc(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setSupportMultipleWindows(z);
    }

    @Override // defpackage.dcc
    @snc(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setHorizontalScrollBarEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().setVerticalScrollBarEnabled(z);
    }

    @Override // defpackage.dcc
    @snc(name = "textZoom")
    public void setTextZoom(icc iccVar, int i) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        iccVar.getWebView().getSettings().setTextZoom(i);
    }

    @Override // defpackage.dcc
    @snc(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        CookieManager.getInstance().setAcceptThirdPartyCookies(iccVar.getWebView(), z);
    }

    @Override // defpackage.dcc
    @snc(name = "userAgent")
    public void setUserAgent(icc iccVar, String str) {
        bcc bccVar = this.mRNCWebViewManagerImpl;
        bccVar.getClass();
        iccVar.getClass();
        bccVar.g = str;
        bccVar.b(iccVar);
    }

    @Override // defpackage.dcc
    @snc(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(icc iccVar, boolean z) {
        this.mRNCWebViewManagerImpl.getClass();
        iccVar.getClass();
        WebView.setWebContentsDebuggingEnabled(z);
    }

    @Override // defpackage.dcc
    public void stopLoading(icc iccVar) {
        iccVar.getWebView().stopLoading();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(icc iccVar, String str, ReadableArray readableArray) {
        super.receiveCommand(iccVar, str, readableArray);
    }

    @Override // defpackage.dcc
    public void requestFocus(icc iccVar) {
        iccVar.requestFocus();
    }

    @Override // defpackage.dcc
    public void setAllowingReadAccessToURL(icc iccVar, String str) {
    }

    @Override // defpackage.dcc
    public void setAllowsAirPlayForMediaPlayback(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAllowsBackForwardNavigationGestures(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAllowsInlineMediaPlayback(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAllowsLinkPreview(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAllowsPictureInPictureMediaPlayback(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAutoManageStatusBarEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setAutomaticallyAdjustContentInsets(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setBounces(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setContentInset(icc iccVar, ReadableMap readableMap) {
    }

    @Override // defpackage.dcc
    public void setContentInsetAdjustmentBehavior(icc iccVar, String str) {
    }

    @Override // defpackage.dcc
    public void setContentMode(icc iccVar, String str) {
    }

    @Override // defpackage.dcc
    public void setDataDetectorTypes(icc iccVar, ReadableArray readableArray) {
    }

    @Override // defpackage.dcc
    public void setDecelerationRate(icc iccVar, double d) {
    }

    @Override // defpackage.dcc
    public void setDirectionalLockEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    @snc(name = "downloadingMessage")
    public void setDownloadingMessage(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.c = str;
    }

    @Override // defpackage.dcc
    public void setEnableApplePay(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setFraudulentWebsiteWarningEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setHasOnFileDownload(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setHideKeyboardAccessoryView(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setIndicatorStyle(icc iccVar, String str) {
    }

    @Override // defpackage.dcc
    public void setKeyboardDisplayRequiresUserAction(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    @snc(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(icc iccVar, String str) {
        this.mRNCWebViewManagerImpl.d = str;
    }

    @Override // defpackage.dcc
    public void setLimitsNavigationsToAppBoundDomains(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setMediaCapturePermissionGrantType(icc iccVar, String str) {
    }

    @Override // defpackage.dcc
    public void setPagingEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setPullToRefreshEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setRefreshControlLightMode(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setScrollEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setSharedCookiesEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    @snc(name = "suppressMenuItems")
    public void setSuppressMenuItems(icc iccVar, ReadableArray readableArray) {
    }

    @Override // defpackage.dcc
    public void setTextInteractionEnabled(icc iccVar, boolean z) {
    }

    @Override // defpackage.dcc
    public void setUseSharedProcessPool(icc iccVar, boolean z) {
    }
}
