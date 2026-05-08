package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class w23 {
    public static final u23 d = new u23();
    public static final v23 e = new v23(0);
    public final oa5 a;
    public String b = null;
    public String c = null;

    public w23(oa5 oa5Var) {
        this.a = oa5Var;
    }

    public static void a(oa5 oa5Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            oa5Var.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
