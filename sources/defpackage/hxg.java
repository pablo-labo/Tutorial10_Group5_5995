package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hxg implements ValueCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ hxg(WebView webView, String str) {
        this.a = str;
        this.b = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = this.a;
        WebView webView = this.b;
        String str2 = (String) obj;
        str2.getClass();
        String strI = wve.I(zve.e0(str2), "\\\"", "\"");
        if (strI.equals("Sent")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strI);
            if (jSONObject.has("error")) {
                String str3 = "Error occurred posting window eventName: " + str + " to JS from bridge: " + jSONObject.getString("error") + " [" + webView.getUrl() + "]";
                ArrayList arrayList = lz2.a;
                lz2.c("WebViewUtils", str3, false, null, 12);
            }
        } catch (JSONException e) {
            String strI2 = l6.i(u40.f("Error parsing JSON result for window eventName: ", str, " from bridge call: ", e.getMessage(), " ["), webView.getUrl(), "]");
            ArrayList arrayList2 = lz2.a;
            lz2.b("WebViewUtils", strI2, false, e);
        }
    }
}
