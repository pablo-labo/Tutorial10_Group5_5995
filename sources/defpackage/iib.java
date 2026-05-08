package defpackage;

import defpackage.cfe;
import defpackage.lf0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class iib implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ iib(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                rw7 rw7Var = zib.b;
                c0106a.a((String) obj2, rw7Var, rw7Var);
                return j6g.a;
            case 1:
                cfe.a.C0106a c0106a2 = (cfe.a.C0106a) obj;
                c0106a2.getClass();
                c0106a2.c((String) obj2, zib.a);
                return j6g.a;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                String str = (String) pair.a();
                String str2 = (String) pair.b();
                List listZ = u63.Z(jf0.a(((rc8) obj2).a.d, akb.k("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                return listZ.isEmpty() ? lf0.a.a : new nf0(listZ);
        }
    }
}
