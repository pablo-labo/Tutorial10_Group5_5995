package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1c(int i, Object obj, Object obj2) {
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
                        objV = new myb(gVar, wu5Var, 1);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Work Schedule Suggestion", true);
                } else {
                    bVar.D();
                }
                break;
            default:
                Function1 function1 = (Function1) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zK = bVar2.K(function1);
                    Object objV2 = bVar2.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new m9f(function1, g4aVar, 0);
                        bVar2.p(objV2);
                    }
                    q9f.e(6, (gu5) objV2, bVar2, "View Job");
                    String str = (String) g4aVar.getValue();
                    Object objV3 = bVar2.v();
                    if (objV3 == c0020a) {
                        objV3 = new ru(4, g4aVar);
                        bVar2.p(objV3);
                    }
                    q9f.g("Job key", str, "1547992f9cc304b8", (Function1) objV3, false, bVar2, 3462, 16);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
