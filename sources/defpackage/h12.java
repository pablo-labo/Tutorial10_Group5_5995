package defpackage;

import androidx.compose.runtime.r;
import defpackage.xh8;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lh12;", "Lbrg;", "Lxh8;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h12 extends brg implements xh8 {
    public final y03 b;
    public final g4a c;

    public h12() {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.b = no3Var;
        this.c = r.f(new i12(0));
        List<n97> list = h().e;
        if (list.isEmpty()) {
            m97 m97Var = m97.a;
            list = (List) m97.b.getValue();
        }
        j(list);
        u63.Y(f13.a(no3Var), null, null, new f12(this, null), 3);
    }

    public final i12 g() {
        return (i12) ((gme) this.c).getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yba h() {
        return (yba) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(yba.class), null);
    }

    public final void i(String str) {
        str.getClass();
        k(i12.a(g(), str, null, null, null, null, null, null, false, 254));
        if (zve.U(str)) {
            k(i12.a(g(), null, null, null, null, null, g().e, null, false, 223));
            return;
        }
        String string = zve.s0(str).toString();
        List<n97> list = g().e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            n97 n97Var = (n97) obj;
            if (!zve.L(n97Var.b, string, true)) {
                nn0 nn0Var = nn0.a;
                String str2 = n97Var.b;
                str2.getClass();
                String strNormalize = Normalizer.normalize(str2, Normalizer.Form.NFD);
                strNormalize.getClass();
                if (!zve.L(new pxc("\\p{Mn}+").e(strNormalize, ""), string, true)) {
                    List<String> list2 = n97Var.e;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (String str3 : list2) {
                            if (!zve.L(str3, string, true)) {
                                nn0 nn0Var2 = nn0.a;
                                String strNormalize2 = Normalizer.normalize(str3, Normalizer.Form.NFD);
                                strNormalize2.getClass();
                                if (zve.L(new pxc("\\p{Mn}+").e(strNormalize2, ""), string, true)) {
                                }
                            }
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        k(i12.a(g(), null, null, null, null, null, arrayList, null, false, 223));
    }

    public final void j(List<n97> list) {
        k(i12.a(g(), null, null, null, null, list, list, list.isEmpty() ? n12.c : n12.a, false, 143));
    }

    public final void k(i12 i12Var) {
        ((gme) this.c).setValue(i12Var);
    }
}
