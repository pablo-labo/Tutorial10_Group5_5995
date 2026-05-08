package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class es2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b5g b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ es2(gu5 gu5Var, b5g b5gVar, Function1 function1, gu5 gu5Var2) {
        this.c = gu5Var;
        this.b = b5gVar;
        this.d = function1;
        this.e = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        e.a aVar = e.a.b;
        Object obj3 = this.e;
        Function1 function1 = this.d;
        gu5 gu5Var = this.c;
        b5g b5gVar = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var2 = (gu5) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strI = ak2.I(R.string.contact_information_done_button_text, bVar);
                    boolean z = !((Boolean) gu5Var.invoke()).booleanValue();
                    e eVarA = f.a(g.f(aVar, 1.0f), "ContactInformationSaveButton");
                    boolean zD = bVar.d(b5gVar.ordinal()) | bVar.K(function1) | bVar.K(gu5Var2);
                    Object objV = bVar.v();
                    if (zD || objV == c0020a) {
                        objV = new sr2(b5gVar, function1, gu5Var2);
                        bVar.p(objV);
                    }
                    gt6.h(strI, (gu5) objV, eVarA, null, z, false, null, null, null, bVar, 384, 488);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                String str = (String) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e eVarB = nub.b(aVar);
                    b5g b5gVar2 = b5g.c;
                    e eVarA2 = nub.a(eVarB, b5gVar == b5gVar2, "Add work experience failed", oub.SAVE);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarA2);
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
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    if (str == null) {
                        str = "";
                    }
                    m8g.a(function1, str, bVar2, 6);
                    bVar2.q();
                    if (b5gVar == b5gVar2) {
                        bVar2.L(-895679865);
                        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-work-experience", "error-toast", sp7.c.a.c, null, null, 24));
                        boolean zA = bVar2.a(true) | bVar2.K(gu5Var);
                        Object objV2 = bVar2.v();
                        if (zA || objV2 == c0020a) {
                            objV2 = new wc(8, gu5Var);
                            bVar2.p(objV2);
                        }
                        rg0.a((gu5) objV2, bVar2, 0);
                        bVar2.F();
                    } else {
                        bVar2.L(-895058842);
                        jh2.f(bVar2, g.h(aVar, v1c.d));
                        bVar2.F();
                    }
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ es2(b5g b5gVar, gu5 gu5Var, Function1 function1, String str) {
        this.b = b5gVar;
        this.c = gu5Var;
        this.d = function1;
        this.e = str;
    }
}
