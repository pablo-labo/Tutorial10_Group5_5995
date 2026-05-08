package defpackage;

import android.net.Uri;
import defpackage.lx5;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a23 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a23(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                Locale locale = b23.c;
                String country = locale != null ? locale.getCountry() : null;
                if (country == null) {
                    country = "";
                }
                y3bVar.b("initial_country", country);
                String language = locale != null ? locale.getLanguage() : null;
                if (language == null) {
                    language = "";
                }
                y3bVar.b("initial_language", language);
                String country2 = Locale.getDefault().getCountry();
                country2.getClass();
                y3bVar.b("app_country", country2);
                String language2 = Locale.getDefault().getLanguage();
                language2.getClass();
                y3bVar.b("app_language", language2);
                y3bVar.b("current_country", d93.a());
                y3bVar.b("current_language", d93.e());
                bu8 bu8Var = bu8.a;
                y3bVar.a(bu8Var.e() != null ? 1L : 0L, "is_country_forced");
                y3bVar.a(bu8Var.f() != null ? 1L : 0L, "is_language_forced");
                y3bVar.a(d93.b != null ? 1L : 0L, "is_based_on_ip_country");
                String host = Uri.parse(str).getHost();
                y3bVar.b("page_finished_host", host != null ? host : "");
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "Interview", "interviewId", str);
                bVar.a("myjobsPageTk", ie7.Z);
                break;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                if (str != null && str.length() != 0) {
                    o5e.a(s5eVar, str);
                }
                break;
            case 3:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                break;
            default:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.f(s5eVar3, str);
                break;
        }
        return j6g.a;
    }
}
