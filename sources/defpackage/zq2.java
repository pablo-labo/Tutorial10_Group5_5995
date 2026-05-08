package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq2 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zq2(o97 o97Var, g4a g4aVar) {
        this.a = 1;
        this.b = o97Var;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj5;
                o97 o97Var = (o97) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, null, null, null, 0L, 3, 0L, null, null, 0, 16744447), bVar, 0, 0, 65534);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                o97 o97Var2 = (o97) obj4;
                g4a g4aVar = (g4a) obj5;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e.a aVar = e.a.b;
                    e eVarC = c.c(bVar2, aVar);
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
                    String strC = v1c.c((String) g4aVar.getValue());
                    Object objV = bVar2.v();
                    if (objV == c0020a) {
                        int length = strC.length();
                        objV = r.f(new jhf(strC, cr8.c(length, length), 4));
                        bVar2.p(objV);
                    }
                    g4a g4aVar2 = (g4a) objV;
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(kcf.c);
                        bVar2.p(objV2);
                    }
                    g4a g4aVar3 = (g4a) objV2;
                    String strI = ak2.I(R.string.description, bVar2);
                    o97.g gVar = o97Var2.i;
                    kv6.a(strI, f.j(aVar, 0.0f, 0.0f, 0.0f, 4.0f, 7), null, null, false, null, bVar2, 196608, 92);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    String strI2 = ak2.I(R.string.description, bVar2);
                    kcf kcfVar = (kcf) g4aVar3.getValue();
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = new yc1(3, g4aVar2, g4aVar);
                        bVar2.p(objV3);
                    }
                    Function1 function1 = (Function1) objV3;
                    Object objV4 = bVar2.v();
                    if (objV4 == c0020a) {
                        objV4 = new ug4(0, g4aVar3);
                        bVar2.p(objV4);
                    }
                    Function1 function12 = (Function1) objV4;
                    Object objV5 = bVar2.v();
                    if (objV5 == c0020a) {
                        objV5 = new nf(9);
                        bVar2.p(objV5);
                    }
                    qw6.a(jhfVar, strI2, "DescriptionTextAreaBulletButton", "DescriptionTextAreaNumberedButton", "DescriptionTextAreaClearButton", 128.0f, null, null, 0, false, kcfVar, function1, function12, (Function1) objV5, "TextAreaWithBasicLists", bVar2, 28032, 14376960, 8128);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                g gVar2 = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zX = bVar3.x(gVar2) | bVar3.K(wu5Var);
                    Object objV6 = bVar3.v();
                    if (zX || objV6 == c0020a) {
                        objV6 = new czb(gVar2, wu5Var, 1);
                        bVar3.p(objV6);
                    }
                    q1c.c(48, (gu5) objV6, bVar3, "Edit Relocation", true);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                gu5 gu5Var = (gu5) obj5;
                hne hneVar = (hne) obj4;
                fhd fhdVar = (fhd) obj;
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= bVar4.K(fhdVar) ? 4 : 2;
                }
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    if (gu5Var == null) {
                        bVar4.L(-891406189);
                    } else {
                        bVar4.L(-891406188);
                        e eVarA = fhdVar.a(e.a.b, 1.0f);
                        ehd ehdVarA = chd.a(vs0.b, c20.a.j, bVar4, 6);
                        int iHashCode2 = Long.hashCode(bVar4.k());
                        t8b t8bVarM2 = bVar4.m();
                        e eVarC2 = c.c(bVar4, eVarA);
                        gl2.j.getClass();
                        pm8.a aVar3 = gl2.a.b;
                        if (bVar4.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar4.B();
                        if (bVar4.f()) {
                            bVar4.y(aVar3);
                        } else {
                            bVar4.n();
                        }
                        ygg.y(bVar4, ehdVarA, gl2.a.g);
                        ygg.y(bVar4, t8bVarM2, gl2.a.f);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar4, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar4, eVarC2, gl2.a.d);
                        boolean zK = bVar4.K(hneVar) | bVar4.K(gu5Var);
                        Object objV7 = bVar4.v();
                        if (zK || objV7 == c0020a) {
                            objV7 = new as(17, hneVar, gu5Var);
                            bVar4.p(objV7);
                        }
                        rq6.b((gu5) objV7, null, false, null, null, yj2.a, bVar4, 196608, 30);
                        bVar4.q();
                    }
                    bVar4.F();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ zq2(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
