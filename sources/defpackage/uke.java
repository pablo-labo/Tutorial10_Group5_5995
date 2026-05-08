package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uke implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    public final /* synthetic */ qke a;
    public final /* synthetic */ qke b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ n65<qke> d;
    public final /* synthetic */ String e;

    public uke(qke qkeVar, qke qkeVar2, ArrayList arrayList, n65 n65Var, String str) {
        this.a = qkeVar;
        this.b = qkeVar2;
        this.c = arrayList;
        this.d = n65Var;
        this.e = str;
    }

    @Override // defpackage.wu5
    public final j6g q(Function2<? super b, ? super Integer, ? extends j6g> function2, b bVar, Integer num) {
        Function2<? super b, ? super Integer, ? extends j6g> function22 = function2;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.x(function22) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            qke qkeVar = this.b;
            final qke qkeVar2 = this.a;
            final boolean zB = wl7.b(qkeVar2, qkeVar);
            int i = zB ? 150 : 75;
            int i2 = (!zB || fz8.a(this.c).size() == 1) ? 0 : 75;
            dvf dvfVar = new dvf(i, i2, bf4.c);
            boolean zX = bVar2.x(qkeVar2);
            n65<qke> n65Var = this.d;
            boolean zX2 = zX | bVar2.x(n65Var);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX2 || objV == c0020a) {
                objV = new pi(10, qkeVar2, n65Var);
                bVar2.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            Object objV2 = bVar2.v();
            if (objV2 == c0020a) {
                objV2 = gc0.a(!zB ? 1.0f : 0.0f);
                bVar2.p(objV2);
            }
            zb0 zb0Var = (zb0) objV2;
            Boolean boolValueOf = Boolean.valueOf(zB);
            boolean zX3 = bVar2.x(zb0Var) | bVar2.a(zB) | bVar2.x(dvfVar) | bVar2.K(gu5Var);
            Object objV3 = bVar2.v();
            if (zX3 || objV3 == c0020a) {
                xke xkeVar = new xke(zb0Var, zB, dvfVar, gu5Var, null);
                bVar2.p(xkeVar);
                objV3 = xkeVar;
            }
            to4.d(bVar2, boolValueOf, (Function2) objV3);
            ae0<T, V> ae0Var = zb0Var.c;
            dvf dvfVar2 = new dvf(i, i2, bf4.a);
            Object objV4 = bVar2.v();
            if (objV4 == c0020a) {
                objV4 = gc0.a(zB ? 0.8f : 1.0f);
                bVar2.p(objV4);
            }
            zb0 zb0Var2 = (zb0) objV4;
            Boolean boolValueOf2 = Boolean.valueOf(zB);
            boolean zX4 = bVar2.x(zb0Var2) | bVar2.a(zB) | bVar2.x(dvfVar2);
            Object objV5 = bVar2.v();
            if (zX4 || objV5 == c0020a) {
                objV5 = new yke(zb0Var2, zB, dvfVar2, null);
                bVar2.p(objV5);
            }
            to4.d(bVar2, boolValueOf2, (Function2) objV5);
            ae0<T, V> ae0Var2 = zb0Var2.c;
            e eVarB = a.b(e.a.b, ((Number) ((gme) ae0Var2.b).getValue()).floatValue(), ((Number) ((gme) ae0Var2.b).getValue()).floatValue(), ((Number) ((gme) ae0Var.b).getValue()).floatValue(), 0.0f, null, 131064);
            boolean zA = bVar2.a(zB);
            final String str = this.e;
            boolean zK = zA | bVar2.K(str) | bVar2.x(qkeVar2);
            Object objV6 = bVar2.v();
            if (zK || objV6 == c0020a) {
                objV6 = new Function1() { // from class: tke
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s5e s5eVar = (s5e) obj;
                        if (zB) {
                            o5e.g(s5eVar, 0);
                        }
                        o5e.h(s5eVar, str);
                        s5eVar.a(v4e.u, new r5(null, new qr(qkeVar2, 22)));
                        return j6g.a;
                    }
                };
                bVar2.p(objV6);
            }
            e eVarB2 = b5e.b(eVarB, false, (Function1) objV6);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarB2);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            function22.invoke(bVar2, Integer.valueOf(iIntValue & 14));
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
