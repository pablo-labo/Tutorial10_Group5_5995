package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qj8 implements Function2 {
    public final /* synthetic */ vu5 V;
    public final /* synthetic */ vu5 W;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ qj8(gu5 gu5Var, String str, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, gu5 gu5Var6, int i) {
        this.b = gu5Var;
        this.c = str;
        this.d = gu5Var2;
        this.e = gu5Var3;
        this.f = gu5Var4;
        this.V = gu5Var5;
        this.W = gu5Var6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        le0.b bVar;
        int iK;
        int i = this.a;
        vu5 vu5Var = this.W;
        vu5 vu5Var2 = this.V;
        vu5 vu5Var3 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                o97.a aVar = ((o97) obj5).c;
                zrd zrdVar = (zrd) obj4;
                List<wj8> list = (List) obj3;
                Function1 function1 = (Function1) vu5Var3;
                Function1 function12 = (Function1) vu5Var2;
                Function1 function13 = (Function1) vu5Var;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarM = pnb.M(a.b(g.d(e.a.b, 1.0f), aVar.b.a, ytc.a), zrdVar, true);
                    ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(i2)), c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarM);
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
                    bVar2.L(-1045861086);
                    for (wj8 wj8Var : list) {
                        boolean z = wj8Var.f;
                        String str = wj8Var.d;
                        String str2 = wj8Var.b;
                        b.a.C0020a c0020a = b.a.a;
                        if (z) {
                            bVar2.L(-80513876);
                            String str3 = str2 == null ? "" : str2;
                            bVar2.L(-141140230);
                            bVar = new le0.b();
                            bVar2.L(-141138555);
                            iK = bVar.k(new foe(aVar.a.b, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65534));
                            try {
                                iK = bVar.k(new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
                                bVar.f(str2);
                                bVar.i(iK);
                                bVar.g(" " + ak2.I(R.string.removed, bVar2));
                                j6g j6gVar = j6g.a;
                                bVar.i(iK);
                                bVar2.F();
                                le0 le0VarL = bVar.l();
                                bVar2.F();
                                boolean zK = bVar2.K(function1);
                                Object objV = bVar2.v();
                                if (zK || objV == c0020a) {
                                    objV = new ej4(function1, 1);
                                    bVar2.p(objV);
                                }
                                py8.a(str3, le0VarL, null, false, (Function1) objV, bVar2, 0, 12);
                                bVar2.F();
                            } catch (Throwable th) {
                                throw th;
                            } finally {
                            }
                        } else {
                            bVar2.L(-79454513);
                            String str4 = str2 == null ? "" : str2;
                            bVar = new le0.b();
                            to5 to5Var = to5.d0;
                            iK = bVar.k(new foe(0L, 0L, to5Var, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
                            if (str2 == null) {
                                str2 = "";
                            }
                            try {
                                bVar.g(str2);
                                j6g j6gVar2 = j6g.a;
                                if (str != null) {
                                    iK = bVar.k(new foe(0L, 0L, to5Var, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
                                    try {
                                        bVar.g(", ");
                                        bVar.i(iK);
                                        bVar.g(str);
                                    } finally {
                                    }
                                }
                                le0 le0VarL2 = bVar.l();
                                boolean zX = bVar2.x(list) | bVar2.K(function12);
                                Object objV2 = bVar2.v();
                                if (zX || objV2 == c0020a) {
                                    objV2 = new ed1(5, list, function12);
                                    bVar2.p(objV2);
                                }
                                Function1 function14 = (Function1) objV2;
                                boolean zK2 = bVar2.K(function13);
                                Object objV3 = bVar2.v();
                                if (zK2 || objV3 == c0020a) {
                                    objV3 = new vx0(function13, 6);
                                    bVar2.p(objV3);
                                }
                                b bVar3 = bVar2;
                                py8.b(str4, le0VarL2, null, null, function14, false, false, null, (Function1) objV3, null, bVar3, 0, 748);
                                bVar2 = bVar3;
                                bVar2.F();
                            } finally {
                            }
                        }
                    }
                    bVar2.F();
                    b bVar4 = bVar2;
                    mv.a(ak2.I(R.string.add_another, bVar2), this.b, false, 0, null, null, null, bVar4, 0, 124);
                    bVar4.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                pg8.f(this.b, (String) obj5, (gu5) obj4, (gu5) obj3, (gu5) vu5Var3, (gu5) vu5Var2, (gu5) vu5Var, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ qj8(o97 o97Var, zrd zrdVar, List list, gu5 gu5Var, Function1 function1, Function1 function12, Function1 function13) {
        this.c = o97Var;
        this.d = zrdVar;
        this.e = list;
        this.b = gu5Var;
        this.f = function1;
        this.V = function12;
        this.W = function13;
    }
}
