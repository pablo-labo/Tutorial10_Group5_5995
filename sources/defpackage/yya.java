package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.indeed.android.jobsearch.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class yya {
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final LinkedHashMap d;

    public yya(Context context) {
        context.getClass();
        this.a = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.getClass();
        this.b = defaultSharedPreferences;
        String packageName = context.getPackageName();
        packageName.getClass();
        this.c = packageName;
        this.d = new LinkedHashMap();
    }

    public final String a() {
        String strD;
        String string = this.b.getString("debug_http_host", null);
        if (string != null && string.length() != 0) {
            return string;
        }
        x70 x70Var = x70.a;
        Context context = this.a;
        context.getClass();
        x70 x70Var2 = x70.a;
        x70Var2.getClass();
        int integer = context.getResources().getInteger(R.integer.react_native_dev_server_port);
        if (x70Var2.d().length() > 0) {
            strD = x70Var2.d();
        } else {
            String str = Build.FINGERPRINT;
            str.getClass();
            strD = zve.L(str, "vbox", false) ? "10.0.3.2" : (zve.L(str, "generic", false) || wve.K(str, "google/sdk_gphone", false)) ? "10.0.2.2" : "localhost";
        }
        String str2 = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{strD, Integer.valueOf(integer)}, 2));
        if (str2.equals("localhost")) {
            s55.n("yya", "You seem to be running on device. Run '" + x70.a(context) + "' to forward the debug server's port to the device.");
        }
        return str2;
    }

    public final void b(String str) {
        str.getClass();
        int length = str.length();
        SharedPreferences sharedPreferences = this.b;
        if (length == 0) {
            sharedPreferences.edit().remove("debug_http_host").apply();
        } else {
            sharedPreferences.edit().putString("debug_http_host", str).apply();
        }
    }
}
