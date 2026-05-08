package defpackage;

import defpackage.lxf;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kj7 implements kwf, lj7 {
    public ui8 a;
    public final LinkedHashSet<ui8> b;
    public final int c;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            ui8 ui8Var = (ui8) t;
            ui8Var.getClass();
            Function1 function1 = this.a;
            String string = function1.invoke(ui8Var).toString();
            ui8 ui8Var2 = (ui8) t2;
            ui8Var2.getClass();
            return ak2.i(string, function1.invoke(ui8Var2).toString());
        }
    }

    public kj7(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet<ui8> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // defpackage.kwf
    public final Collection<ui8> b() {
        return this.b;
    }

    @Override // defpackage.kwf
    public final v62 d() {
        return null;
    }

    @Override // defpackage.kwf
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj7)) {
            return false;
        }
        return wl7.b(this.b, ((kj7) obj).b);
    }

    public final mge f() {
        gwf.b.getClass();
        return yi8.e(gwf.c, this, zr4.a, false, lxf.a.a(this.b, "member scope for intersection type"), new x1(this, 2));
    }

    public final String g(Function1<? super ui8, ? extends Object> function1) {
        function1.getClass();
        return z92.W0(z92.p1(this.b, new a(function1)), " & ", "{", "}", new i03(function1, 2), 24);
    }

    @Override // defpackage.kwf
    public final List<rxf> getParameters() {
        return zr4.a;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.kwf
    public final ei8 l() {
        ei8 ei8VarL = this.b.iterator().next().M0().l();
        ei8VarL.getClass();
        return ei8VarL;
    }

    public final String toString() {
        return g(uv5.c);
    }
}
