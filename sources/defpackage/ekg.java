package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ekg {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ekg c;
    public final w74 a;

    public ekg(w74 w74Var) {
        this.a = w74Var;
    }

    public final boolean a(k31 k31Var) {
        if (TextUtils.isEmpty(k31Var.d)) {
            return true;
        }
        long j = k31Var.f + k31Var.g;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
