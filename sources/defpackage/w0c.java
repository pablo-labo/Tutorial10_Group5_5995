package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new fzb(gVar, wu5Var, 1);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Remote Suggestion", true);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                g gVar2 = (g) obj5;
                wu5 wu5Var2 = (wu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX2 = bVar2.x(gVar2) | bVar2.K(wu5Var2);
                    Object objV2 = bVar2.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new dzb(gVar2, wu5Var2, 1);
                        bVar2.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar2, "Edit Work Well Being", true);
                } else {
                    bVar2.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objV3 = bVar3.v();
                    if (objV3 == c0020a) {
                        objV3 = new dd1(2, g4aVar);
                        bVar3.p(objV3);
                    }
                    y8g.a((Function1) objV3, (String) g4aVar.getValue(), gu5Var, bVar3, 54);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
