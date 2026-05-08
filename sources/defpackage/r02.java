package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r02 implements wu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ r02(n97 n97Var, o97 o97Var, String str, String str2, String str3, Function2 function2) {
        this.b = n97Var;
        this.c = str;
        this.d = str2;
        this.f = function2;
        this.e = str3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        e.a aVar = e.a.b;
        b.a.C0020a c0020a = b.a.a;
        vu5 vu5Var = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                n97 n97Var = (n97) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                Function2 function2 = (Function2) vu5Var;
                String str3 = (String) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((il5) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int size = n97Var.d.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str4 = n97Var.d.get(i2);
                        boolean z2 = (wl7.b(str, str4) && wl7.b(str2, n97Var.a)) ? z : false;
                        boolean zK = bVar.K(function2) | bVar.x(n97Var) | bVar.K(str4);
                        Object objV = bVar.v();
                        if (zK || objV == c0020a) {
                            objV = new s02(0, function2, n97Var, str4);
                            bVar.p(objV);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        boolean z3 = z;
                        sb.append("Button");
                        sb.append(i2);
                        int i3 = i2;
                        s12.a(str4, z2, (gu5) objV, sb.toString(), bVar, 0);
                        if (i3 < n97Var.e.size() - 1) {
                            bVar.L(1334617831);
                            jh2.f(bVar, f.f(aVar, 4.0f));
                        } else {
                            bVar.L(1327529898);
                        }
                        bVar.F();
                        i2 = i3 + 1;
                        z = z3;
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                o97 o97Var = (o97) obj7;
                jqg jqgVar = (jqg) obj6;
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                gu5 gu5Var3 = (gu5) vu5Var;
                gza gzaVar = (gza) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gzaVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= bVar2.K(gzaVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e eVarJ = f.j(g.d(aVar, 1.0f), 0.0f, gzaVar.d(), 0.0f, 0.0f, 13);
                    long j = o97Var.c.b.a;
                    ytc.a aVar2 = ytc.a;
                    e eVarB = a.b(eVarJ, j, aVar2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarB);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar3);
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
                    if (jqgVar.d) {
                        bVar2.L(1240040866);
                        dx4 dx4Var = new dx4(jqgVar.e, 95);
                        boolean zK2 = bVar2.K(gu5Var);
                        Object objV2 = bVar2.v();
                        if (zK2 || objV2 == c0020a) {
                            objV2 = new qy(4, gu5Var);
                            bVar2.p(objV2);
                        }
                        gu5 gu5Var4 = (gu5) objV2;
                        boolean zK3 = bVar2.K(gu5Var2);
                        Object objV3 = bVar2.v();
                        if (zK3 || objV3 == c0020a) {
                            objV3 = new nt(6, gu5Var2);
                            bVar2.p(objV3);
                        }
                        gu5 gu5Var5 = (gu5) objV3;
                        Object objV4 = bVar2.v();
                        if (objV4 == c0020a) {
                            objV4 = new vm1(20);
                            bVar2.p(objV4);
                        }
                        ee3.g(dx4Var, gu5Var4, gu5Var5, (gu5) objV4, false, bVar2, 27648);
                        bVar2 = bVar2;
                        bVar2.F();
                    } else {
                        bVar2.L(1240504130);
                        boolean zK4 = bVar2.K(gu5Var3);
                        Object objV5 = bVar2.v();
                        if (zK4 || objV5 == c0020a) {
                            objV5 = new l4e(1, gu5Var3);
                            bVar2.p(objV5);
                        }
                        androidx.compose.ui.viewinterop.a.a((Function1) objV5, a.b(f.j(g.d(aVar, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 5), o97Var.c.b.c, aVar2), null, bVar2, 0, 4);
                        bVar2.F();
                    }
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ r02(o97 o97Var, jqg jqgVar, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3) {
        this.b = o97Var;
        this.c = jqgVar;
        this.d = gu5Var;
        this.e = gu5Var2;
        this.f = gu5Var3;
    }
}
