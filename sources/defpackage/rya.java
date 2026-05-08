package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import defpackage.z39;

/* JADX INFO: loaded from: classes.dex */
public final class rya {
    public static final String a = z39.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        String str = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            z39 z39VarD = z39.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            z39VarD.a(str, sb.toString());
        } catch (Exception e) {
            z39 z39VarD2 = z39.d();
            StringBuilder sb2 = new StringBuilder();
            u40.k(cls, sb2, "could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String string = sb2.toString();
            if (((z39.a) z39VarD2).c <= 3) {
                Log.d(str, string, e);
            }
        }
    }
}
