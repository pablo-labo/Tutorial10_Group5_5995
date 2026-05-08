package defpackage;

import androidx.compose.runtime.b;
import defpackage.ig3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ro0(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                ((Boolean) obj2).booleanValue();
                g4aVar.setValue(num);
                break;
            case 1:
                Boolean bool = Boolean.FALSE;
                g4aVar.setValue(new ig3(null, bool, new ig3.b(bool, (s38) obj, (Integer) obj2)));
                break;
            default:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new wl4(2, g4aVar);
                        bVar.p(objV);
                    }
                    n76.b(54, (gu5) objV, bVar, null, "Start Auto Apply", false);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new pk4(1, g4aVar);
                        bVar.p(objV2);
                    }
                    n76.b(54, (gu5) objV2, bVar, null, "View Your Auto Applies", false);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
