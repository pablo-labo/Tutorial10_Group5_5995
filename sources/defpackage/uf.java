package defpackage;

import android.net.Uri;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uf(int i, int i2, gu5 gu5Var, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = gu5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gu5 gu5Var;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                ig3 ig3Var = (ig3) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new nc(1, g4aVar);
                        bVar.p(objV);
                    }
                    xf.b(function1, ig3Var, (Function1) objV, bVar, 384);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                gu5 gu5Var2 = (gu5) obj5;
                gu5 gu5Var3 = (gu5) obj4;
                gu5 gu5Var4 = (gu5) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    n76.c(bh2.c(50862113, new x66(z ? 1 : 0, gu5Var2), bVar2), bVar2, 6);
                    n76.i(0, bVar2);
                    n76.c(bh2.c(694551576, new ox2(gu5Var3, gu5Var4), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                hp9.b((ArrayList) obj5, (gu5) obj4, (gu5) obj3, (b) obj, ka2.L(49));
                break;
            case 3:
                e8a e8aVar = (e8a) obj5;
                kjg kjgVar = (kjg) obj4;
                Map map = (Map) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qq0.a(e8aVar, kjgVar, v7a.c(map, j7f.c, bVar3), bVar3, 0);
                } else {
                    bVar3.D();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                y4b.a((ConversationRecord) obj5, (jta) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                break;
            default:
                d9d d9dVar = (d9d) obj5;
                x7d x7dVar = (x7d) obj4;
                Long l = (Long) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objV2 = bVar4.v();
                    Object obj6 = objV2;
                    if (objV2 == c0020a) {
                        g4a g4aVarF = r.f(Boolean.FALSE);
                        bVar4.p(g4aVarF);
                        obj6 = g4aVarF;
                    }
                    g4a g4aVar2 = (g4a) obj6;
                    gu5<? extends w0g> gu5Var5 = d9dVar.b;
                    if (gu5Var5 == null) {
                        bVar4.L(-571543517);
                        bVar4.F();
                        gu5Var = null;
                    } else {
                        bVar4.L(-571543516);
                        boolean zX = bVar4.x(d9dVar) | bVar4.K(gu5Var5);
                        Object objV3 = bVar4.v();
                        Object obj7 = objV3;
                        if (zX || objV3 == c0020a) {
                            ti tiVar = new ti(10, d9dVar, gu5Var5);
                            bVar4.p(tiVar);
                            obj7 = tiVar;
                        }
                        gu5Var = (gu5) obj7;
                        bVar4.F();
                    }
                    boolean z = d9dVar.F().g().f;
                    List<m07> list = d9dVar.F().g().c;
                    String str = d9dVar.F().g().d;
                    Uri uri = d9dVar.F().g().e;
                    boolean zX2 = bVar4.x(d9dVar);
                    Object objV4 = bVar4.v();
                    Object obj8 = objV4;
                    if (zX2 || objV4 == c0020a) {
                        fy fyVar = new fy(d9dVar, 17);
                        bVar4.p(fyVar);
                        obj8 = fyVar;
                    }
                    gu5 gu5Var6 = (gu5) obj8;
                    boolean zX3 = bVar4.x(x7dVar) | bVar4.x(d9dVar);
                    Object objV5 = bVar4.v();
                    Object obj9 = objV5;
                    if (zX3 || objV5 == c0020a) {
                        wj4 wj4Var = new wj4(6, x7dVar, d9dVar);
                        bVar4.p(wj4Var);
                        obj9 = wj4Var;
                    }
                    Function1 function12 = (Function1) obj9;
                    boolean zK = bVar4.K(gu5Var);
                    Object objV6 = bVar4.v();
                    Object obj10 = objV6;
                    if (zK || objV6 == c0020a) {
                        di diVar = new di(11, gu5Var);
                        bVar4.p(diVar);
                        obj10 = diVar;
                    }
                    gu5 gu5Var7 = (gu5) obj10;
                    Object objV7 = bVar4.v();
                    Object obj11 = objV7;
                    if (objV7 == c0020a) {
                        qu quVar = new qu(5, g4aVar2);
                        bVar4.p(quVar);
                        obj11 = quVar;
                    }
                    gu5 gu5Var8 = (gu5) obj11;
                    boolean zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
                    String str2 = d9dVar.F().g().b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    m9d.a(z, list, str, uri, gu5Var6, function12, gu5Var7, gu5Var8, zBooleanValue, str2, l, bVar4, 100663296);
                } else {
                    bVar4.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ uf(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
