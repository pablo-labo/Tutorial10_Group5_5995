package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import com.datadog.android.core.internal.CoreFeature;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public final class ah3 {
    public static String a(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return p6.c(i, CoreFeature.DEFAULT_APP_VERSION);
        }
    }
}
