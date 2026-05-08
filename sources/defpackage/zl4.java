package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zl4 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ gu5 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zl4(o97 o97Var, String str, String str2, String str3, Function1 function1, gu5 gu5Var) {
        this.e = o97Var;
        this.b = str;
        this.f = str2;
        this.V = str3;
        this.c = function1;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.V;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cm4.a(this.b, (svb) obj5, this.c, this.d, (Function1) obj4, (b5g) obj3, (b) obj, ka2.L(1));
                break;
            default:
                o97 o97Var = (o97) obj5;
                o97.d dVar = o97Var.d;
                String str = (String) obj4;
                String str2 = (String) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    String strI = ak2.I(R.string.tos_update_banner_text, bVar);
                    o97.e eVar = o97Var.g;
                    o97.b bVar2 = o97Var.e;
                    o97.c cVar = o97Var.f;
                    cif.b(strI, null, 0L, bVar2.f, null, cVar.a, dVar.a, 0L, null, null, eVar.c, 0, false, 0, 0, null, null, bVar, 0, 0, 129942);
                    cif.b(ak2.I(R.string.tos_update_banner_cta, bVar), null, 0L, bVar2.f, null, cVar.c, dVar.a, 0L, null, null, eVar.c, 0, false, 0, 0, null, null, bVar, 0, 0, 129942);
                    m81.a(ak2.I(R.string.tos_update_banner_text, bVar), u63.a0(new Pair(ak2.I(R.string.tos_update_banner_terms, bVar), this.b), new Pair(ak2.I(R.string.tos_update_banner_privacy, bVar), str), new Pair(ak2.I(R.string.tos_update_banner_cookies, bVar), str2)), this.c, ak2.I(R.string.tos_update_banner_cta, bVar), this.d, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ zl4(String str, svb svbVar, Function1 function1, gu5 gu5Var, Function1 function12, b5g b5gVar, int i) {
        this.b = str;
        this.e = svbVar;
        this.c = function1;
        this.d = gu5Var;
        this.f = function12;
        this.V = b5gVar;
    }
}
