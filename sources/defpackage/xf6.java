package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes.dex */
public final class xf6 {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
