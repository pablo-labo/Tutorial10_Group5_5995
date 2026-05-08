package defpackage;

import android.util.Log;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class fdh implements Runnable {
    public static final b49 c = new b49("RevokeAccessOperation", new String[0]);
    public final String a;
    public final ste b;

    public fdh(String str) {
        fib.f(str);
        this.a = str;
        this.b = new ste(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b49 b49Var = c;
        Status status = Status.V;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty(TracingInterceptor.HEADER_CT, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) b49Var.b, ((String) b49Var.c).concat("Unable to revoke access!"));
            }
            b49Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) b49Var.b, ((String) b49Var.c).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e((String) b49Var.b, ((String) b49Var.c).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.b.f(status);
    }
}
