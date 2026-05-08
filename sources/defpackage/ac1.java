package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH$¢\u0006\u0004\b\u000b\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lac1;", "Landroid/webkit/WebView;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getCountryForHeader", "()Ljava/lang/String;", "getLanguageForHeader", "getUrl", "", "getShouldNotifyWebviewWillAppear", "()Z", "shouldNotifyWebviewWillAppear", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ac1 extends WebView {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public abstract void a(String str);

    public abstract String b(String str);

    public final void c() {
        WebSettings settings = getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        String userAgentString = settings.getUserAgentString();
        userAgentString.getClass();
        settings.setUserAgentString(b(userAgentString));
        settings.setMediaPlaybackRequiresUserGesture(false);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
    }

    public abstract String getCountryForHeader();

    public abstract String getLanguageForHeader();

    /* JADX INFO: renamed from: getShouldNotifyWebviewWillAppear, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    @Override // android.webkit.WebView
    public String getUrl() {
        return super.getUrl();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        str.getClass();
        if (!wve.K(str, "javascript:", false)) {
            a(str);
        }
        super.loadUrl(str);
    }
}
