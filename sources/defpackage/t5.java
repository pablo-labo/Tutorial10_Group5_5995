package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.languageselector.LanguageSelectorFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.linecorp.linesdk.LineApiError;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.s87;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v5.a((w5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ((du) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                y91 y91Var = (y91) obj3;
                String str = (String) obj;
                LineApiError lineApiError = (LineApiError) obj2;
                str.getClass();
                lineApiError.getClass();
                String string = y91Var.getString(R.string.indeed_passport_line_auth_endpoint);
                string.getClass();
                Uri uriBuild = Uri.parse(string).buildUpon().appendQueryParameter("state", str).appendQueryParameter("error", String.valueOf(lineApiError.a)).appendQueryParameter("error_description", String.valueOf(lineApiError.b)).build();
                mq6 mq6VarG = y91Var.G();
                String string2 = uriBuild.toString();
                string2.getClass();
                mq6VarG.h(string2, true, false);
                return j6g.a;
            case 3:
                LanguageSelectorFragment languageSelectorFragment = (LanguageSelectorFragment) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = LanguageSelectorFragment.d;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(1980446507, new ey(languageSelectorFragment, 4), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                String str2 = (String) obj;
                LineApiError lineApiError2 = (LineApiError) obj2;
                int i2 = LaunchActivity.e1;
                str2.getClass();
                lineApiError2.getClass();
                String string3 = launchActivity.getString(R.string.indeed_passport_line_auth_endpoint);
                string3.getClass();
                Uri.parse(string3).buildUpon().appendQueryParameter("state", str2).appendQueryParameter("error", String.valueOf(lineApiError2.a)).appendQueryParameter("error_description", String.valueOf(lineApiError2.b)).build();
                launchActivity.E();
                throw null;
            case 5:
                o97 o97Var = (o97) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, bVar2, 48);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e.a aVar = e.a.b;
                    e eVarC = c.c(bVar2, aVar);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar2);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    fif.b(ak2.I(R.string.recommended_upgrade_title, bVar2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 0, 0, 65534);
                    jh2.f(bVar2, g.h(aVar, 8.0f));
                    fif.b(ak2.I(R.string.recommended_upgrade_body, bVar2), null, 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var.j.g, bVar2, 0, 0, 65022);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 6:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj3;
                String str3 = (String) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                str3.getClass();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.b), "recent-search-item", zr4.a, m93.c));
                searchOverlayFragment.I().q(iIntValue3, str3);
                return j6g.a;
            case 7:
                ((Integer) obj2).getClass();
                ile.d((ah2) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 8:
                ((zk6) ((i3g) obj3).b.getValue()).getClass();
                zk6.b((ApiError) obj, (Request) obj2);
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ((igg) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ t5(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
