package androidx.compose.runtime;

import defpackage.e13;
import defpackage.ex7;
import defpackage.im2;
import defpackage.j6g;
import defpackage.k0d;
import defpackage.q1;
import defpackage.qy7;
import defpackage.u63;
import defpackage.v03;
import defpackage.vr4;
import defpackage.vw1;
import defpackage.z03;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e13, k0d {
    public static final vw1 d = new vw1();
    public final v03 a;
    public final k b = this;
    public volatile v03 c;

    public static final class a extends q1 implements z03 {
        public final /* synthetic */ im2 b;
        public final /* synthetic */ k c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(im2 im2Var, k kVar) {
            super(z03.a.a);
            this.b = im2Var;
            this.c = kVar;
        }

        @Override // defpackage.z03
        public final void N0(v03 v03Var, Throwable th) throws Throwable {
            im2 im2Var = this.b;
            k kVar = this.c;
            im2Var.c(kVar, th);
            z03 z03Var = (z03) kVar.a.h1(z03.a.a);
            if (z03Var == null) {
                throw th;
            }
            z03Var.N0(v03Var, th);
        }
    }

    public k(v03 v03Var) {
        this.a = v03Var;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                v03 v03Var = this.c;
                if (v03Var == null) {
                    this.c = d;
                } else {
                    u63.o(v03Var, new ForgottenCoroutineScopeException());
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k0d
    public final void b() {
    }

    @Override // defpackage.k0d
    public final void d() {
        a();
    }

    @Override // defpackage.k0d
    public final void e() {
        a();
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        v03 v03VarD1;
        v03 v03Var = this.c;
        if (v03Var == null || v03Var == d) {
            im2 im2Var = (im2) this.a.h1(im2.b);
            v03 aVar = im2Var != null ? new a(im2Var, this) : vr4.a;
            synchronized (this.b) {
                try {
                    v03 v03Var2 = this.c;
                    if (v03Var2 == null) {
                        v03 v03Var3 = this.a;
                        v03VarD1 = v03Var3.d1(new qy7((ex7) v03Var3.h1(ex7.a.a))).d1(vr4.a).d1(aVar);
                    } else if (v03Var2 == d) {
                        v03 v03Var4 = this.a;
                        qy7 qy7Var = new qy7((ex7) v03Var4.h1(ex7.a.a));
                        qy7Var.q(new ForgottenCoroutineScopeException());
                        v03VarD1 = v03Var4.d1(qy7Var).d1(vr4.a).d1(aVar);
                    } else {
                        v03VarD1 = v03Var2;
                    }
                    this.c = v03VarD1;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            v03Var = v03VarD1;
        }
        v03Var.getClass();
        return v03Var;
    }
}
