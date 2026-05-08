package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h5a implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5a(int i, gu5 gu5Var, String str, boolean z) {
        this.b = z;
        this.c = str;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                i5a i5aVar = (i5a) obj4;
                kjg kjgVar = (kjg) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b.a.C0020a c0020a = b.a.a;
                    if (z) {
                        bVar.L(-648470419);
                        e8a e8aVarP = i5aVar.P();
                        boolean zX = bVar.x(i5aVar);
                        Object objV = bVar.v();
                        if (zX || objV == c0020a) {
                            objV = new pe(i5aVar, 6);
                            bVar.p(objV);
                        }
                        v7a.a(e8aVarP, kjgVar, (Function2) objV, bVar, 8);
                        bVar.F();
                    } else {
                        bVar.L(-648131651);
                        boolean zX2 = bVar.x(i5aVar);
                        Object objV2 = bVar.v();
                        if (zX2 || objV2 == c0020a) {
                            objV2 = new nj(i5aVar, 15);
                            bVar.p(objV2);
                        }
                        gu5 gu5Var = (gu5) objV2;
                        boolean zX3 = bVar.x(i5aVar);
                        Object objV3 = bVar.v();
                        if (zX3 || objV3 == c0020a) {
                            objV3 = new nv(i5aVar, 13);
                            bVar.p(objV3);
                        }
                        f6a.a(gu5Var, (gu5) objV3, bVar, 0);
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b4g.b(ka2.L(1), (gu5) obj3, (b) obj, (String) obj4, z);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ h5a(boolean z, i5a i5aVar, kjg kjgVar) {
        this.b = z;
        this.c = i5aVar;
        this.d = kjgVar;
    }
}
