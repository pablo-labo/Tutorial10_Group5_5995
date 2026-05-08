package defpackage;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import defpackage.oh1;

/* JADX INFO: loaded from: classes.dex */
public final class v2b {
    public static final /* synthetic */ int a = 0;

    public static class a {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static void a(ij8 ij8Var, mh1 mh1Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(ij8Var, mh1Var != null ? oh1.a.a(mh1Var) : null);
        } else if (mh1Var == null) {
            ij8Var.setXfermode(null);
        } else {
            PorterDuff.Mode modeA = oh1.a(mh1Var);
            ij8Var.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        }
    }
}
