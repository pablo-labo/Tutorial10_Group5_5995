package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ol1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                bxe bxeVar = (bxe) obj;
                iq2 iq2Var = (iq2) obj2;
                break;
            case 1:
                ((Integer) obj2).getClass();
                vj7.a(ka2.L(1), (b) obj, (e) obj4, (String) obj3);
                break;
            case 2:
                break;
            case 3:
                gu5 gu5Var = (gu5) obj4;
                String str = (String) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zK || objV == c0020a) {
                        objV = new ib1(7, gu5Var);
                        bVar.p(objV);
                    }
                    gu5 gu5Var2 = (gu5) objV;
                    e eVarA = f.a(e.a.b, "ClearButton");
                    boolean zK2 = bVar.K(str);
                    Object objV2 = bVar.v();
                    if (zK2 || objV2 == c0020a) {
                        objV2 = new ux4(str, 6);
                        bVar.p(objV2);
                    }
                    rq6.b(gu5Var2, b5e.b(eVarA, false, (Function1) objV2), false, null, null, h4.V, bVar, 196608, 28);
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((ddf) obj4).a((Drawable) obj3, (b) obj, ka2.L(49));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ol1(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
