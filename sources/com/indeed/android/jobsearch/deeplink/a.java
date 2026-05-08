package com.indeed.android.jobsearch.deeplink;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.l5;
import defpackage.nn0;
import defpackage.vh8;
import defpackage.wl7;
import defpackage.xh8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements xh8 {
    public static final a a = new a();

    public static void a(b bVar, Function2 function2) {
        bVar.getClass();
        Uri uriD = bVar.d();
        Uri uriC = bVar.c();
        String strValueOf = String.valueOf(uriD);
        boolean z = false;
        if (uriC != null) {
            if (!"android-app".equals(uriC.getScheme())) {
                nn0 nn0Var = nn0.a;
                String string = uriC.toString();
                string.getClass();
                strValueOf = nn0.a(strValueOf, "referrer_url", string);
            } else {
                if (!"android-app".equals(uriC.getScheme())) {
                    l5.q("android-app scheme is required.");
                    return;
                }
                if (TextUtils.isEmpty(uriC.getAuthority())) {
                    l5.q("Package name is empty.");
                    return;
                }
                String authority = uriC.getAuthority();
                if (wl7.b(authority, "com.google.android.googlequicksearchbox")) {
                    nn0 nn0Var2 = nn0.a;
                    strValueOf = nn0.a(strValueOf, "from", "google_deeplink");
                } else if (wl7.b(authority, "com.google.appcrawler")) {
                    z = true;
                }
            }
        }
        nn0 nn0Var3 = nn0.a;
        function2.invoke(nn0.a(strValueOf, "deeplink", "1"), Boolean.valueOf(z));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
