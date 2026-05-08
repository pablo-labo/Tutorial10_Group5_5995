package defpackage;

import defpackage.j29;
import defpackage.uxf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jp8 implements pya {
    public final mp8 a;
    public final eu1<mq5, hp8> b;

    public jp8(sv7 sv7Var) {
        this.a = new mp8(sv7Var, uxf.a.a, new md7(null));
        this.b = sv7Var.a.a();
    }

    @Override // defpackage.pya
    public final boolean a(mq5 mq5Var) {
        mq5Var.getClass();
        this.a.a.b.b(mq5Var);
        return false;
    }

    @Override // defpackage.nya
    @sy3
    public final List<hp8> b(mq5 mq5Var) {
        mq5Var.getClass();
        return u63.Z(d(mq5Var));
    }

    @Override // defpackage.pya
    public final void c(mq5 mq5Var, ArrayList arrayList) {
        mq5Var.getClass();
        arrayList.add(d(mq5Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hp8 d(mq5 mq5Var) throws Throwable {
        ip8 ip8Var = new ip8(this, this.a.a.b.b(mq5Var));
        j29.b bVar = (j29.b) this.b;
        bVar.getClass();
        V vInvoke = bVar.invoke(new j29.e(mq5Var, ip8Var));
        if (vInvoke != 0) {
            return (hp8) vInvoke;
        }
        j29.b.a(3);
        throw null;
    }

    @Override // defpackage.nya
    public final Collection q(mq5 mq5Var, Function1 function1) {
        mq5Var.getClass();
        List<mq5> listInvoke = d(mq5Var).Z.invoke();
        if (listInvoke == null) {
            listInvoke = zr4.a;
        }
        return listInvoke;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.a.a.o;
    }
}
