package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class by6 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ by6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ux6 ux6Var = (ux6) obj3;
                ux6Var.getClass();
                ((Function1) obj2).invoke(ux6Var);
                ((g4a) obj).setValue(Boolean.TRUE);
                return j6g.a;
            default:
                gn9 gn9Var = (gn9) obj3;
                rp9 rp9Var = (rp9) obj2;
                je0 je0Var = (je0) obj;
                h04 h04Var = gn9Var.a;
                s5c s5cVarA = gn9Var.a(h04Var.c);
                List listZ1 = s5cVarA != null ? z92.z1(h04Var.a.e.g(s5cVarA, rp9Var, je0Var)) : null;
                return listZ1 == null ? zr4.a : listZ1;
        }
    }
}
