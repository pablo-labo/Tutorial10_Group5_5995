package defpackage;

import com.datadog.android.log.LogAttributes;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j88;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m88 implements ga<j88.b> {
    public static final m88 a = new m88();
    public static final List<String> b = u63.a0("affiliateKey", LogAttributes.HOST, "keywords", "newCookieValue", "refTime", "refType", "referrer", "reqAffiliateKey", "reqKeywords", "reqRefType");

    @Override // defpackage.ga
    public final j88.b a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        String strA7 = null;
        String strA8 = null;
        String strA9 = null;
        String strA10 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 1:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 2:
                    strA3 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 3:
                    strA4 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    strA5 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    strA6 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 6:
                    strA7 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 7:
                    strA8 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 8:
                    strA9 = ha.i.a(mb8Var, lb3Var);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strA10 = ha.i.a(mb8Var, lb3Var);
                    break;
                default:
                    return new j88.b(strA, strA2, strA3, strA4, strA5, strA6, strA7, strA8, strA9, strA10);
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.b bVar) {
        j88.b bVar2 = bVar;
        hc8Var.getClass();
        lb3Var.getClass();
        bVar2.getClass();
        hc8Var.u0("affiliateKey");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, bVar2.a);
        hc8Var.u0(LogAttributes.HOST);
        nmaVar.b(hc8Var, lb3Var, bVar2.b);
        hc8Var.u0("keywords");
        nmaVar.b(hc8Var, lb3Var, bVar2.c);
        hc8Var.u0("newCookieValue");
        nmaVar.b(hc8Var, lb3Var, bVar2.d);
        hc8Var.u0("refTime");
        nmaVar.b(hc8Var, lb3Var, bVar2.e);
        hc8Var.u0("refType");
        nmaVar.b(hc8Var, lb3Var, bVar2.f);
        hc8Var.u0("referrer");
        nmaVar.b(hc8Var, lb3Var, bVar2.g);
        hc8Var.u0("reqAffiliateKey");
        nmaVar.b(hc8Var, lb3Var, bVar2.h);
        hc8Var.u0("reqKeywords");
        nmaVar.b(hc8Var, lb3Var, bVar2.i);
        hc8Var.u0("reqRefType");
        nmaVar.b(hc8Var, lb3Var, bVar2.j);
    }
}
