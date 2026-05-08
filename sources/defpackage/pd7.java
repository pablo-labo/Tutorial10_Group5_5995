package defpackage;

import defpackage.grg;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pd7 implements grg.c {
    public final drg<?>[] a;

    public pd7(drg<?>... drgVarArr) {
        this.a = drgVarArr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // grg.c
    public final brg a(Class cls, u2a u2aVar) {
        drg drgVar;
        Function1<p63, T> function1;
        yd8 yd8VarB = fwc.a.b(cls);
        drg<?>[] drgVarArr = this.a;
        drg[] drgVarArr2 = (drg[]) Arrays.copyOf(drgVarArr, drgVarArr.length);
        int length = drgVarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                drgVar = null;
                break;
            }
            drgVar = drgVarArr2[i];
            if (wl7.b(drgVar.a, yd8VarB)) {
                break;
            }
            i++;
        }
        brg brgVar = (drgVar == null || (function1 = drgVar.b) == 0) ? null : (brg) function1.invoke(u2aVar);
        if (brgVar != null) {
            return brgVar;
        }
        v40.n(yd8VarB.p(), "No initializer set for given class ");
        return null;
    }
}
