package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qh implements xu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ b5g e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ qh(iba ibaVar, String str, gu5 gu5Var, b5g b5gVar, g4a g4aVar) {
        this.d = ibaVar;
        this.b = str;
        this.c = gu5Var;
        this.e = b5gVar;
        this.f = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        gu5 gu5Var;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        g4a g4aVar = this.f;
        iba ibaVar = this.d;
        gu5 gu5Var2 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new rg(0);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                Object objV2 = bVar.v();
                if (objV2 == c0020a) {
                    objV2 = r.f(Boolean.FALSE);
                    bVar.p(objV2);
                }
                g4a g4aVar2 = (g4a) objV2;
                if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                    bVar.L(-1427822407);
                    boolean zX = bVar.x(ibaVar);
                    Object objV3 = bVar.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new ya(ibaVar, 2);
                        bVar.p(objV3);
                    }
                    gu5Var = (gu5) objV3;
                    bVar.F();
                } else {
                    bVar.L(-1427655565);
                    bVar.F();
                    gu5Var = null;
                }
                float fB = i3c.b(wc4.b.c(), wh.i);
                boolean zK = bVar.K(gu5Var2);
                Object objV4 = bVar.v();
                if (zK || objV4 == c0020a) {
                    objV4 = new sg(0, gu5Var2);
                    bVar.p(objV4);
                }
                gu5 gu5Var3 = (gu5) objV4;
                boolean zX2 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX2 || objV5 == c0020a) {
                    objV5 = new ab(ibaVar, 1);
                    bVar.p(objV5);
                }
                Float fValueOf = Float.valueOf(fB);
                ah2 ah2VarC = bh2.c(2113213797, new ug(0, g4aVar, g4aVar2), bVar);
                sb1.a(this.b, gu5Var3, gu5Var, 0, null, 0, (gu5) objV5, fValueOf, this.e, true, false, false, false, null, 0, ah2VarC, bVar, 805306368, 196608, 31800);
                return j6gVar;
            default:
                b bVar2 = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar2 = j6g.a;
                Object objV6 = bVar2.v();
                if (objV6 == c0020a) {
                    objV6 = new vg(1);
                    bVar2.p(objV6);
                }
                to4.b(j6gVar2, (Function1) objV6, bVar2);
                float fB2 = i3c.b(jv8.b.c(), wh.h);
                boolean zK2 = bVar2.K(gu5Var2);
                Object objV7 = bVar2.v();
                if (zK2 || objV7 == c0020a) {
                    objV7 = new eb(2, gu5Var2);
                    bVar2.p(objV7);
                }
                gu5 gu5Var4 = (gu5) objV7;
                boolean zX3 = bVar2.x(ibaVar);
                Object objV8 = bVar2.v();
                if (zX3 || objV8 == c0020a) {
                    objV8 = new xg(ibaVar, 2);
                    bVar2.p(objV8);
                }
                gu5 gu5Var5 = (gu5) objV8;
                boolean zX4 = bVar2.x(ibaVar);
                Object objV9 = bVar2.v();
                if (zX4 || objV9 == c0020a) {
                    objV9 = new qe(1, ibaVar, g4aVar);
                    bVar2.p(objV9);
                }
                gu5 gu5Var6 = (gu5) objV9;
                boolean zX5 = bVar2.x(ibaVar);
                Object objV10 = bVar2.v();
                if (zX5 || objV10 == c0020a) {
                    objV10 = new nd(ibaVar, 2);
                    bVar2.p(objV10);
                }
                Float fValueOf2 = Float.valueOf(fB2);
                ah2 ah2VarC2 = bh2.c(-2050229441, new gt(0, ibaVar, g4aVar), bVar2);
                sb1.a(this.b, gu5Var4, gu5Var5, 0, gu5Var6, 0, (gu5) objV10, fValueOf2, this.e, true, false, false, false, null, 0, ah2VarC2, bVar2, 805306368, 196608, 31784);
                return j6gVar2;
        }
    }

    public /* synthetic */ qh(String str, gu5 gu5Var, iba ibaVar, b5g b5gVar, g4a g4aVar) {
        this.b = str;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = b5gVar;
        this.f = g4aVar;
    }
}
