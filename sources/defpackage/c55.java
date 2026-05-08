package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.viewjob.a;
import defpackage.jra;
import defpackage.pgd;
import java.io.EOFException;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class c55 implements jra {
    public final LaunchActivity a;
    public final i30 b;

    public c55(LaunchActivity launchActivity, i30 i30Var) {
        launchActivity.getClass();
        this.a = launchActivity;
        this.b = i30Var;
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) throws EOFException {
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        pgd pgdVarB = yhg.a.b(url, string);
        if (!(pgdVarB instanceof pgd.n)) {
            return jra.a.b.a;
        }
        pgd.n nVar = (pgd.n) pgdVarB;
        String str = nVar.b;
        String str2 = nVar.c;
        String str3 = nVar.d;
        HttpUrl.Companion companion = HttpUrl.k;
        String strG = d93.g();
        companion.getClass();
        HttpUrl httpUrlH = HttpUrl.Companion.c(strG).h(str);
        if (httpUrlH == null) {
            ArrayList arrayList = lz2.a;
            lz2.a("ExternalApplyComponent", "Unable to parse externalUrl", string);
            return jra.a.b.a;
        }
        jde jdeVar = ((a) this.b.b).w0;
        this.a.K(httpUrlH.i, str2, str3, jdeVar != null ? jdeVar.a : null, jdeVar != null ? jdeVar.b : null, jdeVar != null ? jdeVar.c : null);
        return new jra.a.C0281a();
    }
}
