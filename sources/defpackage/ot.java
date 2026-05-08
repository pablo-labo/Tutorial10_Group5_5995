package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ot implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ot(Function2 function2, o97 o97Var, Function2 function22) {
        this.a = 2;
        this.c = function2;
        this.b = o97Var;
        this.d = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                st.a((Function1) obj5, (gu5) obj4, (b5g) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                zw0.a((File) obj5, (gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                Function2 function2 = (Function2) obj5;
                o97 o97Var = (o97) obj4;
                Function2 function22 = (Function2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (function2 == null) {
                        bVar.L(-971902187);
                    } else {
                        bVar.L(-971902186);
                        e eVarF = g.f(e.a.b, 1.0f);
                        o97.g gVar = o97Var.i;
                        e eVarF2 = f.f(eVarF, 16.0f);
                        ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(0)), c20.a.m, bVar, 0);
                        int iHashCode = Long.hashCode(bVar.k());
                        t8b t8bVarM = bVar.m();
                        e eVarC = c.c(bVar, eVarF2);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
                        if (bVar.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar.B();
                        if (bVar.f()) {
                            bVar.y(aVar);
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
                        function2.invoke(bVar, 0);
                        if (function22 == null) {
                            bVar.L(-130044030);
                        } else {
                            bVar.L(-130044029);
                            function22.invoke(bVar, 0);
                        }
                        bVar.F();
                        bVar.q();
                    }
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ ot(int i, int i2, gu5 gu5Var, Object obj, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.b = gu5Var;
        this.d = obj2;
    }
}
