package defpackage;

import defpackage.ke8;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ee8 implements gu5 {
    public final ui8 a;
    public final ke8.a b;
    public final ke8 c;

    public ee8(ui8 ui8Var, ke8.a aVar, ke8 ke8Var) {
        this.a = ui8Var;
        this.b = aVar;
        this.c = ke8Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        v62 v62VarD = this.a.M0().d();
        if (!(v62VarD instanceof t52)) {
            s6.i(v62VarD, "Supertype not a class: ");
            return null;
        }
        Class<?> clsJ = akg.j((t52) v62VarD);
        ke8.a aVar = this.b;
        if (clsJ == null) {
            throw new qi8("Unsupported superclass of " + aVar + ": " + v62VarD);
        }
        Class<T> cls = this.c.b;
        if (wl7.b(cls.getSuperclass(), clsJ)) {
            Type genericSuperclass = cls.getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int iP0 = ut0.p0(clsJ, interfaces);
        if (iP0 >= 0) {
            Type type = cls.getGenericInterfaces()[iP0];
            type.getClass();
            return type;
        }
        throw new qi8("No superclass of " + aVar + " in Java reflection for " + v62VarD);
    }
}
