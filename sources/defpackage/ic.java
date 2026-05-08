package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ic implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ic(b5g b5gVar, g4a g4aVar, o97 o97Var) {
        this.a = 0;
        this.b = b5gVar;
        this.c = g4aVar;
        this.d = o97Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj5;
                g4a g4aVar = (g4a) obj4;
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        int length = str.length();
                        objV = r.f(new jhf(str, cr8.c(length, length), 4));
                        bVar.p(objV);
                    }
                    g4a g4aVar2 = (g4a) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(Boolean.FALSE);
                        bVar.p(objV2);
                    }
                    float f = v1c.e;
                    e.a aVar = e.a.b;
                    e eVarA = nub.a(nub.b(f.h(aVar, f, 0.0f, 2)), b5gVar == b5g.c, "Add group failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
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
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = r.f(kcf.c);
                        bVar.p(objV3);
                    }
                    g4a g4aVar3 = (g4a) objV3;
                    qu0 qu0Var = qu0.c;
                    String strI = ak2.I(qu0Var.a(), bVar);
                    o97.g gVar = o97Var.i;
                    kv6.a(strI, f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), null, null, false, null, bVar, 196608, 92);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    String strI2 = ak2.I(qu0Var.a(), bVar);
                    kcf kcfVar = (kcf) g4aVar3.getValue();
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        objV4 = new kc(0, g4aVar2, g4aVar);
                        bVar.p(objV4);
                    }
                    Function1 function1 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new lc(0, g4aVar3);
                        bVar.p(objV5);
                    }
                    Function1 function12 = (Function1) objV5;
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new mc(i2);
                        bVar.p(objV6);
                    }
                    qw6.a(jhfVar, strI2, "DescriptionTextAreaBulletButton", "DescriptionTextAreaNumberedButton", "DescriptionTextAreaClearButton", 128.0f, null, null, 0, false, kcfVar, function1, function12, (Function1) objV6, "TextAreaWithBasicLists", bVar, 28032, 14376960, 8128);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                wo0.a((hw9) obj5, (xo0) obj4, (ah2) obj3, (b) obj, ka2.L(393));
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                w78.b((String) obj5, (List) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ((yxb) obj5).e(ka2.L(55), (gu5) obj3, (b) obj, (Function1) obj4);
                return j6g.a;
        }
    }

    public /* synthetic */ ic(Object obj, Object obj2, vu5 vu5Var, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = vu5Var;
    }
}
