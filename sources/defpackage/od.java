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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class od implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ od(gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, int i) {
        this.a = 2;
        this.c = gu5Var;
        this.d = gu5Var2;
        this.b = gu5Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj5;
                g4a g4aVar = (g4a) obj4;
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) g4aVar.getValue();
                    if (str == null) {
                        str = "";
                    }
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        int length = str.length();
                        objV = r.f(new jhf(str, cr8.c(length, length), 4));
                        bVar.p(objV);
                    }
                    g4a g4aVar2 = (g4a) objV;
                    float f = v1c.e;
                    e.a aVar = e.a.b;
                    e eVarA = nub.a(nub.b(f.h(aVar, f, 0.0f, 2)), b5gVar == b5g.c, "Add award failed", oub.SAVE);
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
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(kcf.c);
                        bVar.p(objV2);
                    }
                    g4a g4aVar3 = (g4a) objV2;
                    w61 w61Var = w61.c;
                    String strI = ak2.I(w61Var.a(), bVar);
                    o97.g gVar = o97Var.i;
                    kv6.a(strI, f.j(aVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), null, null, false, null, bVar, 196608, 92);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    String strI2 = ak2.I(w61Var.a(), bVar);
                    kcf kcfVar = (kcf) g4aVar3.getValue();
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = new ud(g4aVar2, g4aVar, 0);
                        bVar.p(objV3);
                    }
                    Function1 function1 = (Function1) objV3;
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        objV4 = new vd(0, g4aVar3);
                        bVar.p(objV4);
                    }
                    Function1 function12 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new wd(0);
                        bVar.p(objV5);
                    }
                    qw6.a(jhfVar, strI2, "DescriptionTextAreaBulletButton", "DescriptionTextAreaNumberedButton", "DescriptionTextAreaClearButton", 128.0f, null, null, 0, false, kcfVar, function1, function12, (Function1) objV5, "TextAreaWithBasicLists", bVar, 28032, 14376960, 8128);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                e13 e13Var = (e13) obj5;
                fe1 fe1Var = (fe1) obj4;
                o97 o97Var2 = (o97) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e eVarA2 = androidx.compose.ui.platform.f.a(e.a.b, "ParticipantListTooltipTrigger");
                    boolean zX = bVar2.x(e13Var) | bVar2.K(fe1Var);
                    Object objV6 = bVar2.v();
                    if (zX || objV6 == c0020a) {
                        objV6 = new a10(3, e13Var, fe1Var);
                        bVar2.p(objV6);
                    }
                    rq6.b((gu5) objV6, eVarA2, false, null, null, bh2.c(960263749, new tk8(o97Var2, 1), bVar2), bVar2, 196656, 28);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                tsc.a((gu5) obj5, (gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ od(int i, o97 o97Var, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = o97Var;
    }
}
