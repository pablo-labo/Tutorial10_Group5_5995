package defpackage;

import android.content.Context;
import defpackage.q55;
import defpackage.w27;
import defpackage.xqc;

/* JADX INFO: loaded from: classes.dex */
public interface m17 {

    public static final class a {
        public final Context a;
        public final w27.b b = w27.b.o;
        public og2 c = null;
        public final q55.a d = new q55.a();

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public final xqc a() {
            q55.a aVar = this.d;
            aVar.getClass();
            q55 q55Var = new q55(aa2.b(aVar.a));
            w27.b bVar = this.b;
            w27.b bVar2 = new w27.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, q55Var);
            d2f d2fVar = new d2f(new oe(this, 8));
            d2f d2fVar2 = new d2f(new vz0(6));
            og2 og2Var = this.c;
            if (og2Var == null) {
                og2Var = new og2();
            }
            return new xqc(new xqc.b(this.a, bVar2, d2fVar, d2fVar2, og2Var));
        }
    }

    j74 a(w27 w27Var);

    Object b(w27 w27Var, pu2 pu2Var);
}
