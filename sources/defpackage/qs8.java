package defpackage;

import defpackage.mr8;
import defpackage.wle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qs8 {
    public final /* synthetic */ ss8 a;

    public qs8(ss8 ss8Var) {
        this.a = ss8Var;
    }

    public final mr8.b a(int i) {
        wle.a aVar = wle.e;
        ss8 ss8Var = this.a;
        aVar.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            is8 is8Var = (is8) ((gme) ss8Var.f).getValue();
            wle.a.e(wleVarA, wleVarB, function1E);
            return ss8Var.p.a(i, is8Var.j, ss8Var.d, new yb(i, is8Var));
        } catch (Throwable th) {
            wle.a.e(wleVarA, wleVarB, function1E);
            throw th;
        }
    }
}
