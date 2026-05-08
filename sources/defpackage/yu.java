package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yu implements xu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ g4a d;
    public final /* synthetic */ iba e;

    public /* synthetic */ yu(iba ibaVar, String str, gu5 gu5Var, g4a g4aVar) {
        this.e = ibaVar;
        this.b = str;
        this.c = gu5Var;
        this.d = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        gu5 gu5Var = null;
        b.a.C0020a c0020a = b.a.a;
        iba ibaVar = this.e;
        g4a g4aVar = this.d;
        gu5 gu5Var2 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new hu(0);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                Object objV2 = bVar.v();
                if (objV2 == c0020a) {
                    objV2 = r.f(Boolean.FALSE);
                    bVar.p(objV2);
                }
                g4a g4aVar2 = (g4a) objV2;
                float fB = i3c.b(u5b.d.c(), wh.f);
                if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                    bVar.L(-584852631);
                    boolean zX = bVar.x(ibaVar);
                    Object objV3 = bVar.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new vc(ibaVar, 2);
                        bVar.p(objV3);
                    }
                    gu5Var = (gu5) objV3;
                    bVar.F();
                } else {
                    bVar.L(-584737963);
                    bVar.F();
                }
                gu5 gu5Var3 = gu5Var;
                boolean zK = bVar.K(gu5Var2);
                Object objV4 = bVar.v();
                if (zK || objV4 == c0020a) {
                    objV4 = new wc(1, gu5Var2);
                    bVar.p(objV4);
                }
                gu5 gu5Var4 = (gu5) objV4;
                boolean zX2 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX2 || objV5 == c0020a) {
                    objV5 = new ng(ibaVar, 1);
                    bVar.p(objV5);
                }
                Float fValueOf = Float.valueOf(fB);
                ah2 ah2VarC = bh2.c(597771082, new iu(i2, g4aVar, g4aVar2), bVar);
                sb1.a(this.b, gu5Var4, gu5Var3, 0, null, 0, (gu5) objV5, fValueOf, null, false, false, false, false, null, 0, ah2VarC, bVar, 0, 196608, 32568);
                return j6gVar;
            default:
                b bVar2 = (b) obj3;
                ((Integer) obj4).getClass();
                ((bd0) obj).getClass();
                ((d) obj2).getClass();
                float fB2 = i3c.b(v6c.a.c(), wh.g);
                String str = (String) g4aVar.getValue();
                if (str == null) {
                    bVar2.L(965747879);
                } else {
                    bVar2.L(965747880);
                    if (zve.U(str)) {
                        bVar2.L(-573799411);
                        bVar2.F();
                    } else {
                        bVar2.L(-573920373);
                        boolean zX3 = bVar2.x(ibaVar);
                        Object objV6 = bVar2.v();
                        if (zX3 || objV6 == c0020a) {
                            objV6 = new ab(ibaVar, 2);
                            bVar2.p(objV6);
                        }
                        gu5Var = (gu5) objV6;
                        bVar2.F();
                    }
                }
                bVar2.F();
                gu5 gu5Var5 = gu5Var;
                boolean zK2 = bVar2.K(gu5Var2);
                Object objV7 = bVar2.v();
                if (zK2 || objV7 == c0020a) {
                    objV7 = new zv(0, gu5Var2);
                    bVar2.p(objV7);
                }
                Float fValueOf2 = Float.valueOf(fB2);
                String str2 = this.b;
                sb1.a(str2, (gu5) objV7, gu5Var5, 0, null, 0, null, fValueOf2, null, false, false, false, false, null, 0, bh2.c(334107893, new jd(str2, g4aVar), bVar2), bVar2, 0, 196608, 32632);
                return j6g.a;
        }
    }

    public /* synthetic */ yu(String str, gu5 gu5Var, g4a g4aVar, iba ibaVar) {
        this.b = str;
        this.c = gu5Var;
        this.d = g4aVar;
        this.e = ibaVar;
    }
}
