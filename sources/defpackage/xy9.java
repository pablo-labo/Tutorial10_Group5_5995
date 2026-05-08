package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.ig3;
import defpackage.pm8;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xy9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xy9(ig3 ig3Var, Function1 function1, g4a g4aVar, g4a g4aVar2) {
        this.c = ig3Var;
        this.b = function1;
        this.d = g4aVar;
        this.e = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ig3 ig3Var = (ig3) obj5;
                g4a g4aVar = (g4a) obj3;
                s38 s38Var = (s38) obj;
                Integer num = (Integer) obj2;
                int iOrdinal = ((jt5) ((Pair) ((g4a) obj4).getValue()).e()).ordinal();
                Function1 function1 = this.b;
                if (iOrdinal == 0) {
                    ig3.a aVar = new ig3.a(ig3Var != null ? ig3Var.b : null, s38Var, num);
                    g4aVar.setValue(Boolean.valueOf(gz9.e(aVar, ig3Var != null ? ig3Var.c : null)));
                    function1.invoke(ig3Var != null ? ig3.a(ig3Var, aVar, null, null, 6) : ig3.a(v1c.b, aVar, null, null, 6));
                } else {
                    if (iOrdinal != 1) {
                        l.g();
                        return null;
                    }
                    ig3.b bVar = new ig3.b(ig3Var != null ? ig3Var.b : null, s38Var, num);
                    g4aVar.setValue(Boolean.valueOf(gz9.e(ig3Var != null ? ig3Var.a : null, bVar)));
                    function1.invoke(ig3Var != null ? ig3.a(ig3Var, null, null, bVar, 3) : ig3.a(v1c.b, null, null, bVar, 3));
                }
                return j6g.a;
            default:
                List list = (List) obj5;
                Function1 function12 = (Function1) obj4;
                List list2 = (List) obj3;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (bVar2.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e eVarJ = f.j(e.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarJ);
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
                    bVar2.L(-2146845915);
                    for (Object obj6 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u63.o0();
                            throw null;
                        }
                        String str = (String) obj6;
                        py8.b(str, new le0(str), null, null, this.b, false, false, null, function12, (sm5) list2.get(i2), bVar2, 0, 236);
                        i2 = i3;
                    }
                    bVar2.F();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ xy9(o97 o97Var, List list, Function1 function1, Function1 function12, List list2) {
        this.c = list;
        this.b = function1;
        this.d = function12;
        this.e = list2;
    }
}
