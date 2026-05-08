package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class dhh {
    public static final Object a = new Object();
    public static boolean b;
    public static String c;
    public static int d;

    public static void a(Context context) {
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    Bundle bundle = a5h.a(context).a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, context.getPackageName()).metaData;
                    if (bundle == null) {
                        return;
                    }
                    c = bundle.getString("com.google.app.id");
                    d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
