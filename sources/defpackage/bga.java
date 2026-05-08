package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bga extends qv5 implements Function1<Context, cp2> {
    public static final bga a = new bga(1, ep2.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final cp2 invoke(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && ot2.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new dp2(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return cp2.a;
    }
}
