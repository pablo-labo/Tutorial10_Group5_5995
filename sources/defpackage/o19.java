package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import defpackage.lx5;
import defpackage.s87;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o19 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o19(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj4;
                final String str = (String) obj;
                final String str2 = (String) obj2;
                final String str3 = (String) obj3;
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                q6.m(str, str2, str3);
                Lazy<s87> lazy = s87.f;
                Lazy lazy2 = locationSelectorFragment.d;
                s87.a.a((gz4) lazy2.getValue(), tx5.k(locationSelectorFragment.e, "country-selector", "country-cell", new Function1() { // from class: p19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        lx5.b bVar = (lx5.b) obj5;
                        qf8<Object>[] qf8VarArr2 = LocationSelectorFragment.f;
                        bVar.getClass();
                        bVar.a("changeFromLocale", d93.f().toString());
                        StringBuilder sb = new StringBuilder();
                        String str4 = str2;
                        sb.append(str4);
                        sb.append("_");
                        String str5 = str;
                        sb.append(str5);
                        bVar.a("changeToLocale", sb.toString());
                        LocationSelectorFragment locationSelectorFragment2 = locationSelectorFragment;
                        bVar.a("stayCountry", locationSelectorFragment2.E().a);
                        bVar.a("proposedCountry", locationSelectorFragment2.E().b);
                        bVar.a("selectedCountry", str5);
                        bVar.a("selectedLanguage", str4);
                        bVar.a("selectedCategory", str3);
                        bVar.a("deviceLocale", String.valueOf(b23.c));
                        return j6g.a;
                    }
                }, 4));
                j19.a((gz4) lazy2.getValue(), h19.IP_COUNTRY_OPT_IN, locationSelectorFragment.E().b, true, str, str2);
                u02.a.a(str, str2);
                break;
            default:
                o97 o97Var = (o97) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    cif.b(ak2.I(R.string.webview_modal_cancel, bVar), null, o97Var.c.b.f.a, hh2.t(16), null, to5.d0, hz6.a, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 199680, 0, 130962);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
