package defpackage;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class pfa implements do2 {
    private String _customPostPath;
    private String _endpoint;
    private rl6 _method = rl6.b;
    private rfa _networkConnection;
    private OkHttpClient _okHttpClient;
    private CookieJar _okHttpCookieJar;
    private f6c _protocol;
    private Map<String, String> _requestHeaders;
    private Integer _timeout;
    private pfa sourceConfig;

    public pfa(int i) {
        String scheme = Uri.parse("https://com-indeed-prod1.collector.snplow.net").getScheme();
        f6c f6cVar = f6c.b;
        if (scheme == null) {
            this._protocol = f6cVar;
            this._endpoint = "https://".concat("https://com-indeed-prod1.collector.snplow.net");
        } else if (scheme.equals("https")) {
            this._protocol = f6cVar;
            this._endpoint = "https://com-indeed-prod1.collector.snplow.net";
        } else if (scheme.equals("http")) {
            this._protocol = f6c.a;
            this._endpoint = "https://com-indeed-prod1.collector.snplow.net";
        } else {
            this._protocol = f6cVar;
            this._endpoint = "https://".concat("https://com-indeed-prod1.collector.snplow.net");
        }
    }

    public final String a() {
        String str = this._customPostPath;
        if (str != null) {
            return str;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.a();
        }
        return null;
    }

    public final String b() {
        String str = this._endpoint;
        if (str != null) {
            return str;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.b();
        }
        return null;
    }

    public final rl6 c() {
        rl6 rl6Var = this._method;
        if (rl6Var != null) {
            return rl6Var;
        }
        pfa pfaVar = this.sourceConfig;
        rl6 rl6VarC = pfaVar != null ? pfaVar.c() : null;
        if (rl6VarC != null) {
            return rl6VarC;
        }
        EnumSet<o5f> enumSet = kq4.a;
        return rl6.b;
    }

    public final rfa d() {
        rfa rfaVar = this._networkConnection;
        if (rfaVar != null) {
            return rfaVar;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.d();
        }
        return null;
    }

    public final OkHttpClient e() {
        OkHttpClient okHttpClient = this._okHttpClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.e();
        }
        return null;
    }

    public final CookieJar f() {
        CookieJar cookieJar = this._okHttpCookieJar;
        if (cookieJar != null) {
            return cookieJar;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.f();
        }
        return null;
    }

    public final f6c g() {
        f6c f6cVar = this._protocol;
        if (f6cVar != null) {
            return f6cVar;
        }
        pfa pfaVar = this.sourceConfig;
        f6c f6cVarG = pfaVar != null ? pfaVar.g() : null;
        if (f6cVarG != null) {
            return f6cVarG;
        }
        EnumSet<o5f> enumSet = kq4.a;
        return f6c.b;
    }

    public final Map<String, String> h() {
        Map<String, String> map = this._requestHeaders;
        if (map != null) {
            return map;
        }
        pfa pfaVar = this.sourceConfig;
        if (pfaVar != null) {
            return pfaVar.h();
        }
        return null;
    }

    public final Integer i() {
        Integer num = this._timeout;
        if (num != null) {
            return num;
        }
        pfa pfaVar = this.sourceConfig;
        Integer numI = pfaVar != null ? pfaVar.i() : null;
        if (numI != null) {
            return numI;
        }
        EnumSet<o5f> enumSet = kq4.a;
        return Integer.valueOf(kq4.g);
    }

    public final void j(pfa pfaVar) {
        this.sourceConfig = pfaVar;
    }
}
