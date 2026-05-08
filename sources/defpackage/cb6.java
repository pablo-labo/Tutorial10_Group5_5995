package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class cb6 {
    public static final Object d = new Object();
    public static cb6 e;
    public final String a;
    public final Status b;
    public final boolean c;

    public cb6(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.c = resources.getInteger(identifier) == 0;
        } else {
            this.c = false;
        }
        dhh.a(context);
        String string = dhh.c;
        if (string == null) {
            Resources resources2 = context.getResources();
            int identifier2 = resources2.getIdentifier("google_app_id", "string", resources2.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
            string = identifier2 == 0 ? null : resources2.getString(identifier2);
        }
        if (TextUtils.isEmpty(string)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.", null, null);
            this.a = null;
        } else {
            this.a = string;
            this.b = Status.e;
        }
    }

    public static cb6 a(String str) {
        cb6 cb6Var;
        synchronized (d) {
            try {
                cb6Var = e;
                if (cb6Var == null) {
                    StringBuilder sb = new StringBuilder(str.length() + 34);
                    sb.append("Initialize must be called before ");
                    sb.append(str);
                    sb.append(".");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cb6Var;
    }
}
