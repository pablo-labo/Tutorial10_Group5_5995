package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class an6 {
    public static boolean a(Context context) {
        context.getClass();
        return (context.getApplicationInfo().flags & 4194304) != 0 && (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || wve.E(System.getProperty("FORCE_RTL_FOR_TESTING", "false"), "true", true) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1));
    }
}
