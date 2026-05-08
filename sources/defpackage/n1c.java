package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import defpackage.o97;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 0;
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
                        objV = new ej(9, gVar, wu5Var);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Edit Work Schedule", true);
                } else {
                    bVar.D();
                }
                return j6g.a;
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
                        objV2 = new vyb(gVar2, wu5Var2, 1);
                        bVar2.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar2, "Review Summary Suggestion", true);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                List list = (List) obj5;
                o97 o97Var = (o97) obj4;
                o97.h hVar = o97Var.j;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((il5) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (Object obj6 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u63.o0();
                            throw null;
                        }
                        String str = (String) obj6;
                        o97.d dVar = o97Var.d;
                        cif.b(str, null, 0L, 0L, null, null, dVar.a, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.g, bVar3, 0, 0, 65470);
                        if (i2 < list.size() - 1) {
                            bVar3.L(761673987);
                            cif.b("·", null, 0L, 0L, null, null, dVar.a, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.g, bVar3, 6, 0, 65470);
                        } else {
                            bVar3.L(749824144);
                        }
                        bVar3.F();
                        i2 = i3;
                    }
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
