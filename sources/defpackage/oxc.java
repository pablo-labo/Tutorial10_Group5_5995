package defpackage;

import android.net.Uri;
import defpackage.cd4;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class oxc {
    public static String a(String str, String str2) {
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.b) != cd4.e3.a.getValue()) {
            nn0 nn0Var = nn0.a;
            return nn0.c(str, str2);
        }
        Lazy lazy = d93.a;
        String string = Uri.parse("https://onboarding.indeed.com/").buildUpon().appendPath("onboarding").appendQueryParameter("hl", "ja").appendQueryParameter("co", "JP").toString();
        string.getClass();
        String string2 = Uri.parse(string).buildUpon().appendQueryParameter("continue", d93.g()).toString();
        string2.getClass();
        return string2;
    }
}
