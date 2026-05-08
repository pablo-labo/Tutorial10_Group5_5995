package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j12 implements wu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o97 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j12(o97 o97Var, ude udeVar, Context context) {
        this.b = o97Var;
        this.c = udeVar;
        this.d = context;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zK = bVar.K(str);
                    Object objV = bVar.v();
                    if (zK || objV == c0020a) {
                        objV = new l12(str, 0);
                        bVar.p(objV);
                    }
                    sq6.a(gu5Var, f.a(b5e.b(e.a.b, false, (Function1) objV), "BackButton"), false, bh2.c(1248796014, new uv(o97Var, 2), bVar), bVar, 24576, 12);
                    fif.b(ak2.I(R.string.ccl_page_title, bVar), null, 0L, o97Var.e.f, o97Var.f.c, o97Var.d.a, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar, 0, 3120, 120726);
                } else {
                    bVar.D();
                }
                break;
            default:
                ude udeVar = (ude) obj5;
                Context context = (Context) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strI = ak2.I(R.string.not_seeing_an_interview, bVar2);
                    o97.g gVar = o97Var.i;
                    e eVarJ = androidx.compose.foundation.layout.f.j(e.a.b, 16.0f, 0.0f, 0.0f, 20.0f, 6);
                    boolean zX = bVar2.x(udeVar) | bVar2.x(context);
                    Object objV2 = bVar2.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new za(6, udeVar, context);
                        bVar2.p(objV2);
                    }
                    cif.b(strI, androidx.compose.foundation.b.d(eVarJ, false, null, null, (gu5) objV2, 15), eu6.c, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, bVar2, 0, 0, 65496);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ j12(String str, gu5 gu5Var, o97 o97Var) {
        this.c = str;
        this.d = gu5Var;
        this.b = o97Var;
    }
}
