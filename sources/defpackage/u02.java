package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.webkit.CookieManager;
import defpackage.c87;
import defpackage.eo2;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class u02 implements xh8 {
    public static final u02 a;
    public static final Lazy b;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u02 u02Var) {
            super(0);
            this.$this_inject = u02Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    static {
        u02 u02Var = new u02();
        a = u02Var;
        b = boa.E(qt8.a, new a(u02Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, String str2) {
        str.getClass();
        if (str.length() != 2) {
            ArrayList arrayList = lz2.a;
            lz2.b("ChangeCountryLanguageHelper", "Invalid countryCode code: ".concat(str), false, new IllegalArgumentException("countryCode"));
        }
        if (str2 != null && str2.length() != 2 && str2.length() != 3) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("ChangeCountryLanguageHelper", "Invalid language code: ".concat(str2), false, new IllegalArgumentException("languageCode"));
        }
        ArrayList arrayList3 = lz2.a;
        lz2.d("ChangeCountryLanguageHelper", t40.l("Saving preference countryCode: ", str, ", languageCode: ", str2), false, null);
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        rj0 rj0Var = bu8.b0;
        qf8<Object>[] qf8VarArr = bu8.b;
        rj0Var.f(qf8VarArr[11], bu8Var, str);
        bu8.c0.f(qf8VarArr[12], bu8Var, str2);
        dd4 dd4Var = dd4.a;
        if (dd4.c()) {
            d2f d2fVar = c87.a;
            c87.a.d(ez2.Y, "1");
        } else {
            pxc pxcVar = b87.a;
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            b87.g(cookieManager, d93.g(), "appSignIn", "1");
        }
        synchronized (eo2.a) {
            eo2.b = new eo2.a(eo2.b.a + 1);
        }
        Lazy lazy = b;
        Intent launchIntentForPackage = ((Context) lazy.getValue()).getPackageManager().getLaunchIntentForPackage(((Context) lazy.getValue()).getPackageName());
        if (launchIntentForPackage == null) {
            r6.g("No launch intent was found");
            return;
        }
        Object systemService = ((Context) lazy.getValue()).getSystemService("activity");
        systemService.getClass();
        Iterator<ActivityManager.AppTask> it = ((ActivityManager) systemService).getAppTasks().iterator();
        while (it.hasNext()) {
            it.next().finishAndRemoveTask();
        }
        ((Context) b.getValue()).startActivity(launchIntentForPackage.addFlags(67108864));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
