package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w9 implements Function2 {
    public final /* synthetic */ vu5 V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ w9(s9 s9Var, e eVar, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, Function1 function1, int i) {
        this.c = s9Var;
        this.d = eVar;
        this.e = gu5Var;
        this.f = gu5Var2;
        this.V = gu5Var3;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vu5 vu5Var = this.V;
        vu5 vu5Var2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                aa.a((s9) obj5, (e) obj4, (gu5) obj3, (gu5) vu5Var2, (gu5) vu5Var, this.b, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                gza gzaVar = (gza) obj5;
                o97 o97Var = (o97) obj4;
                i12 i12Var = (i12) obj3;
                Function1 function1 = (Function1) vu5Var2;
                Function2 function2 = (Function2) vu5Var;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarE = f.e(aVar, gzaVar);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarE);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String strI = ak2.I(R.string.ccl_filter_text, bVar);
                    m02.a(null, 0.0f, bVar, 0, 3);
                    fif.b(strI, f.j(aVar, 12.0f, 8.0f, 12.0f, 0.0f, 8), o97Var.c.a.c, o97Var.e.f, o97Var.f.c, o97Var.d.a, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 130960);
                    String str = i12Var.a;
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new ue(4);
                        bVar.p(objV);
                    }
                    Function1 function12 = (Function1) objV;
                    e eVarA = androidx.compose.ui.platform.f.a(f.j(g.f(aVar, 1.0f), 12.0f, 8.0f, 12.0f, 0.0f, 8), "SearchField");
                    boolean zK = bVar.K(strI);
                    Object objV2 = bVar.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new d12(strI, 0);
                        bVar.p(objV2);
                    }
                    dz6.b(str, this.b, "", "ClearButton", function12, b5e.b(eVarA, false, (Function1) objV2), null, null, null, null, null, null, null, null, null, null, bVar, 28032, 0, 1048512);
                    m02.a(f.j(aVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0.0f, bVar, 0, 2);
                    boolean zX = bVar.x(i12Var) | bVar.K(function1) | bVar.K(function2);
                    Object objV3 = bVar.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new z02(i12Var, function1, function2);
                        bVar.p(objV3);
                    }
                    hn8.b(null, null, null, false, null, null, null, false, null, (Function1) objV3, bVar, 0, 511);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ w9(gza gzaVar, o97 o97Var, i12 i12Var, Function1 function1, Function1 function12, Function2 function2) {
        this.c = gzaVar;
        this.d = o97Var;
        this.e = i12Var;
        this.b = function1;
        this.f = function12;
        this.V = function2;
    }
}
