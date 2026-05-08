package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class te implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ te(d4f d4fVar, String str, Function1 function1, Function1 function12, Function1 function13, int i) {
        this.a = 1;
        this.c = d4fVar;
        this.d = str;
        this.b = function1;
        this.e = function12;
        this.f = function13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i2) {
            case 0:
                boolean z = true;
                b5g b5gVar = (b5g) obj3;
                final Function1 function1 = (Function1) obj4;
                final g4a g4aVar = (g4a) obj7;
                final g4a g4aVar2 = (g4a) obj6;
                final g4a g4aVar3 = (g4a) obj5;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        int length = str.length();
                        objV = r.f(new jhf(str, cr8.c(length, length), 4));
                        bVar.p(objV);
                    }
                    g4a g4aVar4 = (g4a) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(lcf.c);
                        bVar.p(objV2);
                    }
                    g4a g4aVar5 = (g4a) objV2;
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = r.f(Boolean.FALSE);
                        bVar.p(objV3);
                    }
                    g4a g4aVar6 = (g4a) objV3;
                    e eVarB = nub.b(f.h(e.a.b, v1c.e, 0.0f, 2));
                    b5g b5gVar2 = b5g.c;
                    if (b5gVar != b5gVar2) {
                        z = false;
                    }
                    e eVarA = nub.a(eVarB, z, "Add certification failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
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
                    ue7.a(ak2.I(rz1.c.a(), bVar), false, null, 0L, 0.0f, null, bVar, 48, 60);
                    jhf jhfVar = (jhf) g4aVar4.getValue();
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        i = 0;
                        objV4 = new df(i, g4aVar4, g4aVar);
                        bVar.p(objV4);
                    } else {
                        i = 0;
                    }
                    Function1 function12 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new ef(i, g4aVar5);
                        bVar.p(objV5);
                    }
                    Function1 function13 = (Function1) objV5;
                    lcf lcfVar = (lcf) g4aVar5.getValue();
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new ff(i, g4aVar6);
                        bVar.p(objV6);
                    }
                    pcf.a(jhfVar, function12, function13, lcfVar, (Function1) objV6, ((Boolean) g4aVar6.getValue()).booleanValue(), null, null, bVar, 25008);
                    bVar.q();
                    if (b5gVar == b5gVar2) {
                        bVar.L(502139626);
                        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-certification", "error-toast", sp7.c.a.c, null, null, 24));
                        boolean zK = bVar.K(function1);
                        Object objV7 = bVar.v();
                        if (zK || objV7 == c0020a) {
                            objV7 = new gu5() { // from class: gf
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-certification", "refresh", null, null, 12));
                                    function1.invoke(new hz1(null, (String) g4aVar2.getValue(), (ig3) g4aVar3.getValue(), (String) g4aVar.getValue(), 5));
                                    return j6g.a;
                                }
                            };
                            bVar.p(objV7);
                        }
                        rg0.a((gu5) objV7, bVar, 0);
                    } else {
                        bVar.L(490896019);
                    }
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                le4.a((d4f) obj3, (String) obj7, (Function1) obj4, (Function1) obj6, (Function1) obj5, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                y78.a((List) obj7, (List) obj6, (gu5) obj5, (Function1) obj4, (b5g) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                i0b.a((String) obj3, (String) obj4, (String) obj7, (gu5) obj6, (gu5) obj5, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                g1d.a((List) obj7, (ArrayList) obj6, (gu5) obj5, (Function1) obj4, (b5g) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ te(b5g b5gVar, Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.a = 0;
        this.c = b5gVar;
        this.b = function1;
        this.d = g4aVar;
        this.e = g4aVar2;
        this.f = g4aVar3;
    }

    public /* synthetic */ te(String str, String str2, String str3, gu5 gu5Var, gu5 gu5Var2, int i) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = str3;
        this.e = gu5Var;
        this.f = gu5Var2;
    }

    public /* synthetic */ te(List list, List list2, gu5 gu5Var, Function1 function1, b5g b5gVar, int i, int i2) {
        this.a = i2;
        this.d = list;
        this.e = list2;
        this.f = gu5Var;
        this.b = function1;
        this.c = b5gVar;
    }
}
