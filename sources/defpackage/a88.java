package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.messaging.data.events.EventRecord;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a88 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a88(g4a g4aVar, g4a g4aVar2) {
        this.a = 3;
        this.c = g4aVar;
        this.b = g4aVar2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        String strConcat;
        int i = this.a;
        String strI = null;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                c88 c88Var = (c88) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                ggg gggVar = c88Var.B;
                String strI2 = ak2.I(gggVar.b, bVar);
                String strI3 = ak2.I(gggVar.c, bVar);
                String strI4 = ak2.I(gggVar.d, bVar);
                if (c88Var.x) {
                    bVar.L(-532921176);
                    strI = ak2.I(gggVar.e, bVar);
                } else {
                    bVar.L(659394724);
                }
                bVar.F();
                String str = strI;
                gu5<j6g> gu5Var = gggVar.i;
                gu5<j6g> gu5Var2 = gggVar.j;
                boolean zK = bVar.K(c88Var);
                Object objV = bVar.v();
                if (zK || objV == c0020a) {
                    objV = new ig(c88Var, 11);
                    bVar.p(objV);
                }
                gu5 gu5Var3 = (gu5) objV;
                boolean zK2 = bVar.K(c88Var);
                Object objV2 = bVar.v();
                if (zK2 || objV2 == c0020a) {
                    objV2 = new yi(10, c88Var, g4aVar);
                    bVar.p(objV2);
                }
                le7.b(null, strI2, strI3, str, gu5Var3, strI4, gu5Var, (gu5) objV2, gu5Var2, bVar, 0);
                break;
            case 1:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                String str2 = DateFormat.getTimeInstance(3).format(new Date(((EventRecord) obj5).getTimestamp()));
                str2.getClass();
                fif.b(str2, f.h(e.a.b, 0.0f, 4.0f, 1), o97Var.c.a.b, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((tjf) bVar2.M(fif.a)).d(o97Var.j.h), bVar2, 0, 0, 65528);
                break;
            case 2:
                e13 e13Var = (e13) obj5;
                hw9 hw9Var = (hw9) obj4;
                b bVar3 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.W1;
                    boolean zX = bVar3.x(e13Var) | bVar3.x(hw9Var);
                    Object objV3 = bVar3.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new qo0(e13Var, hw9Var, 1);
                        bVar3.p(objV3);
                    }
                    ev6.b(fv6Var, androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV3, 15), null, null, 0L, null, bVar3, 6, 60);
                } else {
                    bVar3.D();
                }
                break;
            case 3:
                g4a g4aVar2 = (g4a) obj4;
                g4a g4aVar3 = (g4a) obj5;
                hs7 hs7Var = (hs7) obj;
                String str3 = (String) obj3;
                hs7Var.getClass();
                str3.getClass();
                int iOrdinal = hs7Var.ordinal();
                if (iOrdinal == 0) {
                    strConcat = "COMPLETED: ".concat(str3);
                } else if (iOrdinal == 1) {
                    strConcat = "DELETED: ".concat(str3);
                } else if (iOrdinal == 2) {
                    strConcat = "CANCELLED";
                } else if (iOrdinal != 3) {
                    l.g();
                } else {
                    strConcat = "ERROR";
                }
                g4aVar2.setValue(strConcat + " " + obj2);
                g4aVar3.setValue(Boolean.TRUE);
                break;
            default:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar4 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar4.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX2 = bVar4.x(gVar) | bVar4.K(wu5Var);
                    Object objV4 = bVar4.v();
                    if (zX2 || objV4 == c0020a) {
                        objV4 = new syb(gVar, wu5Var, 0);
                        bVar4.p(objV4);
                    }
                    q1c.c(48, (gu5) objV4, bVar4, "Edit Job Type", true);
                } else {
                    bVar4.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ a88(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
