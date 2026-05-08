package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class o0i {
    public static final fsh c = new fsh("AgeSignalsService");
    public final Context a;
    public final qji b;

    public o0i(Context context) {
        this.a = context;
        fsh fshVar = tki.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (tki.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.b = new qji(context, c, ofh.a);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    fshVar.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                fshVar.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            fshVar.b("Play Store package is not found.", new Object[0]);
        }
        this.b = null;
    }
}
