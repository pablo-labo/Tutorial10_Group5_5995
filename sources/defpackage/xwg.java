package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import defpackage.sg0;
import defpackage.yre;
import defpackage.ywg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class xwg {
    public static final sg0.d a;
    public static final sg0.d b;
    public static final sg0.h c;
    public static final sg0.d d;
    public static final sg0.d e;
    public static final sg0.d f;

    public class a extends sg0.i {
        public final Pattern d;

        public a() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // defpackage.sg0
        public final boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            int i = uwg.a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(currentWebViewPackage.versionName);
            return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends sg0.d {
        @Override // defpackage.sg0
        public final boolean d() {
            if (super.d() && wuf.g("MULTI_PROCESS")) {
                int i = uwg.a;
                if (xwg.b.d()) {
                    return ywg.b.a.getStatics().isMultiProcessEnabled();
                }
                b0.u("This method is not supported by the current version of the framework and the current WebView APK");
            }
            return false;
        }
    }

    public class c extends sg0.d {
        @Override // defpackage.sg0
        public final boolean d() {
            if (wuf.g("MULTI_PROFILE")) {
                return super.d();
            }
            return false;
        }
    }

    static {
        new sg0.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new sg0.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new sg0.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new sg0.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new sg0.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new sg0.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new sg0.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new sg0.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new sg0.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new sg0.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new sg0.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new sg0.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new sg0.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new sg0.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new sg0.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new sg0.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new sg0.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new sg0.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new sg0.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new sg0.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new sg0.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new sg0.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new sg0.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new sg0.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new sg0.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new sg0.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        new sg0.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new sg0.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        a = new sg0.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        new sg0.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new sg0.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        new sg0.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new sg0.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new sg0.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new sg0.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new sg0.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new sg0.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new sg0.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new yre.b();
        new yre.a();
        new yre.a();
        new sg0.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new a();
        new sg0.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        b = new sg0.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        c = new sg0.h("FORCE_DARK", "FORCE_DARK");
        d = new sg0.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        e = new sg0.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new sg0.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new sg0.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new sg0.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new sg0.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new sg0.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new sg0.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new sg0.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new b("MULTI_PROFILE", "MULTI_PROFILE");
        new sg0.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new sg0.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new sg0.d("MUTE_AUDIO", "MUTE_AUDIO");
        f = new sg0.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new sg0.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new sg0.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new sg0.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new c("PREFETCH_URL_V3", "PREFETCH_URL_V3");
        new sg0.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new sg0.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new sg0.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        new sg0.d("SPECULATIVE_LOADING_CONFIG", "SPECULATIVE_LOADING_CONFIG_V2");
    }
}
