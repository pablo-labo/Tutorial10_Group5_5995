package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ph implements xu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ b5g e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ ph(String str, gu5 gu5Var, iba ibaVar, b5g b5gVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = str;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = b5gVar;
        this.f = g4aVar;
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        g4a g4aVar = this.f;
        iba ibaVar = this.d;
        gu5 gu5Var = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new lg(0);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                float fB = i3c.b(jv8.b.c(), wh.i);
                boolean zK = bVar.K(gu5Var);
                Object objV2 = bVar.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new mg(0, gu5Var);
                    bVar.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX = bVar.x(ibaVar);
                Object objV3 = bVar.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new ng(ibaVar, 0);
                    bVar.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX2 = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                if (zX2 || objV4 == c0020a) {
                    objV4 = new og(ibaVar, g4aVar, 0);
                    bVar.p(objV4);
                }
                gu5 gu5Var4 = (gu5) objV4;
                boolean zX3 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX3 || objV5 == c0020a) {
                    objV5 = new pg(ibaVar, 0);
                    bVar.p(objV5);
                }
                Float fValueOf = Float.valueOf(fB);
                ah2 ah2VarC = bh2.c(-524645242, new qg(0, ibaVar, g4aVar), bVar);
                sb1.a(this.b, gu5Var2, gu5Var3, 0, gu5Var4, 0, (gu5) objV5, fValueOf, this.e, true, false, false, false, null, 0, ah2VarC, bVar, 805306368, 196608, 31784);
                return j6gVar;
            default:
                b bVar2 = (b) obj3;
                ((Integer) obj4).getClass();
                ((bd0) obj).getClass();
                ((d) obj2).getClass();
                boolean zK2 = bVar2.K(gu5Var);
                Object objV6 = bVar2.v();
                if (zK2 || objV6 == c0020a) {
                    objV6 = new nt(0, gu5Var);
                    bVar2.p(objV6);
                }
                gu5 gu5Var5 = (gu5) objV6;
                boolean zX4 = bVar2.x(ibaVar);
                Object objV7 = bVar2.v();
                if (zX4 || objV7 == c0020a) {
                    objV7 = new bs(ibaVar, 1);
                    bVar2.p(objV7);
                }
                Float fValueOf2 = Float.valueOf(i3c.b(jv8.a.c(), wh.h));
                ah2 ah2VarC2 = bh2.c(407979286, new cs(ibaVar, g4aVar, 1), bVar2);
                sb1.a(this.b, gu5Var5, (gu5) objV7, 0, null, 0, null, fValueOf2, this.e, false, false, false, false, null, 0, ah2VarC2, bVar2, 0, 196608, 32376);
                return j6g.a;
        }
    }
}
