package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import defpackage.aga;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class km6 extends ka6 {
    public final int d;
    public final ExecutorService e;
    public final RealtimeSinceBootClock f;

    public static class a extends n85 {
        public long f;
        public long g;
        public long h;

        public a() {
            throw null;
        }
    }

    public km6(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.e = Executors.newFixedThreadPool(3);
        this.f = realtimeSinceBootClock;
        this.d = i;
    }

    public final HttpURLConnection J1(int i, Uri uri) throws IOException {
        URL url;
        String str;
        Uri uri2 = rhg.a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                l5.r(e);
                return null;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.d);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !wna.a(uri3.getScheme(), scheme)) {
            return J1(i - 1, uri3);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        r40.h(str);
        return null;
    }

    @Override // defpackage.ka6
    public final void K0(n85 n85Var) {
        ((a) n85Var).h = this.f.now();
    }

    @Override // defpackage.ka6
    public final n85 T(xq2 xq2Var, ppb ppbVar) {
        return new a(xq2Var, ppbVar);
    }

    @Override // defpackage.ka6
    public final void e0(n85 n85Var, aga.a aVar) {
        a aVar2 = (a) n85Var;
        aVar2.f = this.f.now();
        aVar2.b.v(new jm6(this.e.submit(new im6(this, aVar2, aVar)), aVar));
    }

    @Override // defpackage.ka6
    public final Map m0(n85 n85Var, int i) {
        a aVar = (a) n85Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(aVar.g - aVar.f));
        map.put("fetch_time", Long.toString(aVar.h - aVar.g));
        map.put("total_time", Long.toString(aVar.h - aVar.f));
        map.put("image_size", Integer.toString(i));
        return map;
    }
}
