package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ox2 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ox2(gu5 gu5Var, gu5 gu5Var2) {
        this.a = 1;
        this.b = gu5Var;
        this.c = gu5Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        e.a aVar = e.a.b;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    by2.d(0, gu5Var, bVar, str);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                gu5 gu5Var2 = (gu5) obj4;
                gu5 gu5Var3 = (gu5) obj5;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e eVarF = g.f(aVar, 1.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iG = bVar2.G();
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarF);
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
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar2, iG, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    n76.b(6, gu5Var2, bVar2, null, "Nav to application - in progress", false);
                    n76.b(6, gu5Var3, bVar2, null, "Nav to application - submitted", false);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                o97 o97Var = (o97) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    jhf jhfVar = (jhf) g4aVar.getValue();
                    o97.g gVar = o97Var.i;
                    fgd fgdVarA = ggd.a(8.0f);
                    o97.a aVar3 = o97Var.c;
                    long j = aVar3.a.b;
                    o97.a.C0340a c0340a = aVar3.b;
                    long j2 = c0340a.c;
                    long j3 = c0340a.g.i.a;
                    ar3 ar3VarE = ief.e(j, j2, j3, j3, j3, bVar3, 2096922);
                    e eVarA = f.a(g.f(androidx.compose.foundation.layout.f.g(aVar, 16.0f, 8.0f), 1.0f), "SearchField");
                    Object objV = bVar3.v();
                    if (objV == c0020a) {
                        objV = new nc(5, g4aVar);
                        bVar3.p(objV);
                    }
                    zff.a(jhfVar, (Function1) objV, eVarA, false, null, boa.b, bh2.c(-1909904924, new z9(o97Var, 2), bVar3), null, null, null, 0, 0, fgdVarA, ar3VarE, bVar3, 113246256, 0, 261752);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                androidx.fragment.app.g gVar2 = (androidx.fragment.app.g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zX = bVar4.x(gVar2) | bVar4.K(wu5Var);
                    Object objV2 = bVar4.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new uyb(gVar2, wu5Var, 0);
                        bVar4.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar4, "Review Patent Suggestion", true);
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ ox2(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
