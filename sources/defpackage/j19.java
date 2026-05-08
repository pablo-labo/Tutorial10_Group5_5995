package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import com.indeed.android.jobsearch.locationselector.a;
import defpackage.lx5;
import defpackage.s87;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j19 {
    public static final void a(gz4 gz4Var, final h19 h19Var, final String str, final boolean z, final String str2, final String str3) {
        final String strE;
        final String strF;
        gz4Var.getClass();
        if (str2 == null) {
            Lazy lazy = d93.a;
            strE = bu8.a.e();
        } else {
            strE = str2;
        }
        if (str3 == null) {
            Lazy lazy2 = d93.a;
            strF = bu8.a.f();
        } else {
            strF = str3;
        }
        Lazy<s87> lazy3 = s87.f;
        s87.a.a(gz4Var, new lx5("locale_resolution", "other", "localeResolution", 1, zr4.a, new Function1() { // from class: i19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strConcat;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a(h19.TRIGGER.a(), h19Var.a());
                bVar.a(h19.PLATFORM.a(), CoreFeature.DEFAULT_SOURCE_NAME);
                bVar.a(h19.APP_LOCALE.a(), Locale.getDefault().toString());
                String strA = h19.INDEED_LOCALE.a();
                String strA2 = str2;
                if (strA2 == null) {
                    strA2 = d93.a();
                }
                String strE2 = str3;
                if (strE2 == null) {
                    strE2 = d93.e();
                }
                a aVar = a.a;
                List listA = a.a(strA2);
                if (listA.isEmpty()) {
                    List listA2 = a.a("US");
                    if (!listA2.contains(strE2) && (strE2 = (String) z92.Q0(listA2)) == null) {
                        strE2 = "en";
                    }
                    strConcat = strE2.concat("_US");
                } else {
                    if (!listA.contains(strE2)) {
                        strE2 = (String) z92.O0(listA);
                    }
                    strConcat = z3.m(strE2, "_", strA2);
                }
                bVar.a(strA, strConcat);
                bVar.a(h19.IP_COUNTRY_OVERRIDE.a(), z ? "true" : "false");
                bVar.a(h19.USER_PREFERENCE_COUNTRY.a(), strE);
                bVar.a(h19.USER_PREFERENCE_LANGUAGE.a(), strF);
                bVar.a(h19.IP_COUNTRY.a(), str);
                return j6g.a;
            }
        }));
    }

    public static /* synthetic */ void b(gz4 gz4Var, h19 h19Var, String str, boolean z, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        a(gz4Var, h19Var, str, z, str2, str3);
    }
}
