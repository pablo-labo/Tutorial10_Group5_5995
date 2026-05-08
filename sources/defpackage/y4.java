package defpackage;

import defpackage.a5;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a5 a5Var = (a5) obj2;
                a5.a aVar = (a5.a) obj;
                aVar.getClass();
                cze czeVarJ = a5Var.j();
                List list = aVar.a;
                czeVarJ.a(a5Var, list, new kxf(a5Var), new z4(a5Var, 0));
                if (list.isEmpty()) {
                    ui8 ui8VarH = a5Var.h();
                    List listZ = ui8VarH != null ? u63.Z(ui8VarH) : null;
                    if (listZ == null) {
                        listZ = zr4.a;
                    }
                    list = listZ;
                }
                List<ui8> listZ1 = list instanceof List ? (List) list : null;
                if (listZ1 == null) {
                    listZ1 = z92.z1(list);
                }
                List<ui8> listM = a5Var.m(listZ1);
                listM.getClass();
                aVar.b = listM;
                return j6g.a;
            default:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
        }
    }
}
