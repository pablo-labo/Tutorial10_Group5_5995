package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class itg {
    public static o4d a(Context context) {
        o4d o4dVar = new o4d(new w54(new ou7(context.getApplicationContext())), new qc1(new om6(0)));
        at1 at1Var = o4dVar.i;
        if (at1Var != null) {
            at1Var.e = true;
            at1Var.interrupt();
        }
        for (tfa tfaVar : o4dVar.h) {
            if (tfaVar != null) {
                tfaVar.e = true;
                tfaVar.interrupt();
            }
        }
        at1 at1Var2 = new at1(o4dVar.c, o4dVar.d, o4dVar.e, o4dVar.g);
        o4dVar.i = at1Var2;
        at1Var2.start();
        for (int i = 0; i < o4dVar.h.length; i++) {
            tfa tfaVar2 = new tfa(o4dVar.d, o4dVar.f, o4dVar.e, o4dVar.g);
            o4dVar.h[i] = tfaVar2;
            tfaVar2.start();
        }
        return o4dVar;
    }
}
