package defpackage;

import android.os.Handler;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class k8e {
    public final aw8 a;
    public final Handler b = new Handler();
    public a c;

    public static final class a implements Runnable {
        public final aw8 a;
        public final kv8.a b;
        public boolean c;

        public a(aw8 aw8Var, kv8.a aVar) {
            aw8Var.getClass();
            aVar.getClass();
            this.a = aw8Var;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            this.a.f(this.b);
            this.c = true;
        }
    }

    public k8e(fw8 fw8Var) {
        this.a = new aw8(fw8Var, true);
    }

    public final void a(kv8.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.b.postAtFrontOfQueue(aVar3);
    }
}
