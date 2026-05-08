package defpackage;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class q27 {
    public static q27 p;
    public static m27 q;
    public final z1b a;
    public final n27 b;
    public final o82 c;
    public final gze<f64> d;
    public t13<ot1, l82> e;
    public up1 f;
    public d89 g;
    public up1 h;
    public t07 i;
    public l1a j;
    public spb k;
    public vpb l;
    public yt0 m;
    public wva n;
    public fd0 o;

    public q27(n27 n27Var) {
        it5.a();
        this.b = n27Var;
        p27 p27Var = n27Var.v;
        p27Var.getClass();
        this.a = new z1b((ExecutorService) n27Var.i.d);
        this.c = new o82(n27Var.x);
        it5.a();
        this.d = n27Var.g;
        if (p27Var.d) {
            a17.d.getValue().c = true;
        }
    }

    public final fd0 a() {
        if (this.o == null) {
            bbb bbbVarF = f();
            n27 n27Var = this.b;
            gn3 gn3Var = n27Var.i;
            p27 p27Var = n27Var.v;
            t13<ot1, l82> t13VarB = b();
            p27Var.getClass();
            p27Var.getClass();
            p27Var.getClass();
            p27Var.getClass();
            if (!nn2.a0) {
                try {
                    Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(bbb.class, s15.class, t13.class, cls2, cls2, cls3, cls3, l7e.class);
                    Boolean bool = Boolean.FALSE;
                    Object objNewInstance = constructor.newInstance(bbbVarF, gn3Var, t13VarB, bool, bool, 30, 1000, null);
                    objNewInstance.getClass();
                    nn2.b0 = (fd0) objNewInstance;
                } catch (Throwable unused) {
                }
                if (nn2.b0 != null) {
                    nn2.a0 = true;
                }
            }
            this.o = nn2.b0;
        }
        return this.o;
    }

    public final t13<ot1, l82> b() {
        if (this.e == null) {
            n27 n27Var = this.b;
            r13 r13Var = n27Var.y;
            p27 p27Var = n27Var.v;
            sl3 sl3Var = n27Var.a;
            lia liaVar = n27Var.m;
            yg1 yg1Var = n27Var.b;
            p27Var.getClass();
            p27Var.getClass();
            r13Var.getClass();
            d89 d89Var = new d89(new q13(), yg1Var, sl3Var);
            liaVar.getClass();
            this.e = d89Var;
        }
        return this.e;
    }

    public final up1 c() {
        if (this.f == null) {
            t13<ot1, l82> t13VarB = b();
            jia jiaVar = this.b.j;
            jiaVar.getClass();
            this.f = new up1(t13VarB, new pnb(jiaVar));
        }
        return this.f;
    }

    public final up1 d() {
        if (this.h == null) {
            n27 n27Var = this.b;
            n27Var.getClass();
            if (this.g == null) {
                dn3 dn3Var = n27Var.h;
                lia liaVar = n27Var.m;
                d89 d89Var = new d89(new us4(), n27Var.c, dn3Var);
                liaVar.getClass();
                this.g = d89Var;
            }
            d89 d89Var2 = this.g;
            jia jiaVar = n27Var.j;
            jiaVar.getClass();
            this.h = new up1(d89Var2, new jh2(jiaVar));
        }
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Integer, m37] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 m27, still in use, count: 3, list:
          (r2v0 m27) from 0x0148: MOVE (r21v0 m27) = (r2v0 m27)
          (r2v0 m27) from 0x0100: MOVE (r21v2 m27) = (r2v0 m27)
          (r2v0 m27) from 0x009c: MOVE (r21v4 m27) = (r2v0 m27)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final defpackage.m27 e() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q27.e():m27");
    }

    public final bbb f() {
        if (this.m == null) {
            vfb vfbVar = this.b.o;
            ibb ibbVarG = g();
            vfbVar.getClass();
            ibbVarG.getClass();
            o82 o82Var = this.c;
            o82Var.getClass();
            ah1 ah1VarA = vfbVar.a();
            ah1VarA.getClass();
            this.m = new yt0(ah1VarA, o82Var);
        }
        return this.m;
    }

    public final ibb g() {
        if (this.n == null) {
            n27 n27Var = this.b;
            vfb vfbVar = n27Var.o;
            p27 p27Var = n27Var.v;
            p27Var.getClass();
            p27Var.getClass();
            ojh ojhVar = p27Var.c;
            vfbVar.getClass();
            ojhVar.getClass();
            ah1 ah1VarA = vfbVar.a();
            ah1VarA.getClass();
            int i = vfbVar.a.c.d;
            pgb pgbVar = new pgb(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = nj3.a;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
                byteBufferAllocate.getClass();
                pgbVar.a(byteBufferAllocate);
            }
            this.n = new wva(ah1VarA, pgbVar, ojhVar);
        }
        return this.n;
    }
}
