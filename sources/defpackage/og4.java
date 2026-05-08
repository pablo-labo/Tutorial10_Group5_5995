package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class og4 implements wu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o97 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og4(o97 o97Var, g4a g4aVar) {
        this.c = g4aVar;
        this.b = o97Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(1 & iIntValue, (iIntValue & 17) != 16)) {
                    String strC = v1c.c((String) g4aVar.getValue());
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        int length = strC.length();
                        objV = r.f(new jhf(strC, cr8.c(length, length), 4));
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
                    e eVarH = f.h(aVar, f, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
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
                        objV4 = new ig4(g4aVar2, g4aVar, 0);
                        bVar.p(objV4);
                    }
                    Function1 function1 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new jg4(0, g4aVar3);
                        bVar.p(objV5);
                    }
                    Function1 function12 = (Function1) objV5;
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new rg(3);
                        bVar.p(objV6);
                    }
                    qw6.a(jhfVar, strI2, "DescriptionTextAreaBulletButton", "DescriptionTextAreaNumberedButton", "DescriptionTextAreaClearButton", 128.0f, null, null, 0, false, kcfVar, function1, function12, (Function1) objV6, "TextAreaWithBasicLists", bVar, 28032, 14376960, 8128);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                String str = (String) obj4;
                fhd fhdVar = (fhd) obj;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= bVar2.K(fhdVar) ? 4 : 2;
                }
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    bh6.a(str, g.j(fhdVar.a(e.a.b, 1.4f), 24.0f, 0.0f, 2), o97Var.j.f, new dcf(3), bVar2, 0, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ og4(o97 o97Var, String str) {
        this.b = o97Var;
        this.c = str;
    }
}
