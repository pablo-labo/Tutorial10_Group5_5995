package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ar2 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ar2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                exb exbVar = (exb) obj5;
                o97 o97Var = (o97) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    yz7 yz7Var = exbVar.c;
                    if (yz7Var == null || (str = yz7Var.k) == null) {
                        str = "";
                    }
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, null, null, null, 0L, 3, 0L, null, null, 0, 16744447), bVar, 0, 0, 65534);
                } else {
                    bVar.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objV = bVar2.v();
                    if (objV == b.a.a) {
                        objV = new uf4(3, g4aVar);
                        bVar2.p(objV);
                    }
                    u8g.a((Function1) objV, (String) g4aVar.getValue(), gu5Var, bVar2, 54);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
