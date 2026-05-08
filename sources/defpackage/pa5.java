package defpackage;

import defpackage.w5b;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pa5 {
    public static final qd8 a;
    public static final w5b b;

    static {
        qd8 qd8Var;
        try {
            Class.forName("java.nio.file.Files");
            qd8Var = new zha();
        } catch (ClassNotFoundException unused) {
            qd8Var = new qd8();
        }
        a = qd8Var;
        String str = w5b.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = w5b.a.a(property);
        ClassLoader classLoader = p5d.class.getClassLoader();
        classLoader.getClass();
        new p5d(classLoader);
    }

    public abstract fie a(w5b w5bVar);

    public abstract void b(w5b w5bVar, w5b w5bVar2);

    public final void c(w5b w5bVar) {
        zs0<w5b> zs0Var = new zs0();
        while (w5bVar != null && !g(w5bVar)) {
            zs0Var.addFirst(w5bVar);
            w5bVar = w5bVar.e();
        }
        for (w5b w5bVar2 : zs0Var) {
            w5bVar2.getClass();
            ((vp5) this).c.d(w5bVar2);
        }
    }

    public abstract void d(w5b w5bVar);

    public abstract void e(w5b w5bVar);

    public final void f(w5b w5bVar) {
        w5bVar.getClass();
        e(w5bVar);
    }

    public final boolean g(w5b w5bVar) {
        w5bVar.getClass();
        return j(w5bVar) != null;
    }

    public abstract List<w5b> h(w5b w5bVar);

    public final da5 i(w5b w5bVar) throws FileNotFoundException {
        w5bVar.getClass();
        da5 da5VarJ = j(w5bVar);
        if (da5VarJ != null) {
            return da5VarJ;
        }
        n6.b(w5bVar, "no such file: ");
        return null;
    }

    public abstract da5 j(w5b w5bVar);

    public abstract p95 k(w5b w5bVar);

    public abstract fie l(w5b w5bVar, boolean z);

    public abstract pne m(w5b w5bVar);
}
