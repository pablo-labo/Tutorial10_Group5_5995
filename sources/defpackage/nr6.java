package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nr6 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final c00 a;
    public final Context b;
    public final String c;
    public final vf5 d;
    public final ce3 e;
    public b31 f;

    public nr6(Context context, String str, vf5 vf5Var, ce3 ce3Var) {
        if (context == null) {
            l5.q("appContext must not be null");
            throw null;
        }
        if (str == null) {
            l5.q("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = vf5Var;
        this.e = ce3Var;
        this.a = new c00();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized b31 b() {
        String str;
        b31 b31Var = this.f;
        if (b31Var != null && (b31Var.b != null || !this.e.a())) {
            return this.f;
        }
        cr8 cr8Var = cr8.c;
        cr8Var.J("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cr8Var.J("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) dkg.a(this.d.getId());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            cr8Var.J("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f = new b31(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f = new b31(a(sharedPreferences, str), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new b31(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null);
        } else {
            this.f = new b31(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        cr8Var.J("Install IDs: " + this.f);
        return this.f;
    }

    public final String c() {
        String str;
        c00 c00Var = this.a;
        Context context = this.b;
        synchronized (c00Var) {
            try {
                if (((String) c00Var.a) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c00Var.a = installerPackageName;
                }
                str = "".equals((String) c00Var.a) ? null : (String) c00Var.a;
            } finally {
            }
        }
        return str;
    }
}
