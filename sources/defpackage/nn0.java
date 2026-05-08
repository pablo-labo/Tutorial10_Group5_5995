package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import defpackage.ide;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class nn0 implements xh8 {
    public static final nn0 a;
    public static final Lazy b;

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nn0 nn0Var) {
            super(0);
            this.$this_inject = nn0Var;
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
        nn0 nn0Var = new nn0();
        a = nn0Var;
        b = boa.E(qt8.a, new a(nn0Var));
    }

    public static String a(String str, String str2, String str3) {
        if (str.length() == 0) {
            return str;
        }
        Uri uriBuild = Uri.parse(str);
        if (!uriBuild.getQueryParameterNames().contains(str2)) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter(str2, str3).build();
        }
        String string = uriBuild.toString();
        string.getClass();
        return string;
    }

    public static String c(String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("hl", d93.f().toString());
        builderBuildUpon.appendQueryParameter("co", d93.a());
        builderBuildUpon.appendQueryParameter("tmpl", "mobile");
        builderBuildUpon.appendQueryParameter("service", "mob");
        if (str2 != null) {
            builderBuildUpon.appendQueryParameter("continue", str2);
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public static boolean e() {
        Object systemService = ((Context) b.getValue()).getSystemService("connectivity");
        systemService.getClass();
        return ((ConnectivityManager) systemService).getActiveNetwork() != null;
    }

    public static void f(Context context, String str, String str2) {
        ide.a aVar = new ide.a(context);
        Intent intent = aVar.b;
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (CharSequence) str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        aVar.a();
    }

    public final String b(String str) {
        str.getClass();
        if (str.length() < 2 || !new pxc("^[A-Z]{2}$").d(str)) {
            ArrayList arrayList = lz2.a;
            lz2.b("AppUtils", "Invalid country code: ".concat(str), false, new Exception("Received invalid country code in getFlagEmojiByCountryCode: ".concat(str)));
            return "";
        }
        int iCodePointAt = Character.codePointAt(str, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(str, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        chars.getClass();
        String str2 = new String(chars);
        char[] chars2 = Character.toChars(iCodePointAt2);
        chars2.getClass();
        return str2.concat(new String(chars2));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
