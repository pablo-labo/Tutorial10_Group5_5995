package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ue1<T> {
    public final a9c a;
    public final yd8<?> b;
    public final a9c c;
    public final Function2<qpd, v3b, T> d;
    public final uh8 e;
    public List<? extends yd8<?>> f;

    public static final class a extends mj8 implements Function1<yd8<?>, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(yd8<?> yd8Var) {
            yd8<?> yd8Var2 = yd8Var;
            yd8Var2.getClass();
            return zd8.a(yd8Var2);
        }
    }

    public ue1(a9c a9cVar, yd8 yd8Var, lve lveVar, Function2 function2, uh8 uh8Var) {
        a9cVar.getClass();
        yd8Var.getClass();
        this.a = a9cVar;
        this.b = yd8Var;
        this.c = lveVar;
        this.d = function2;
        this.e = uh8Var;
        this.f = zr4.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        ue1 ue1Var = (ue1) obj;
        return wl7.b(this.b, ue1Var.b) && wl7.b(this.c, ue1Var.c) && wl7.b(this.a, ue1Var.a);
    }

    public final int hashCode() {
        a9c a9cVar = this.c;
        int iHashCode = a9cVar != null ? a9cVar.hashCode() : 0;
        return this.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        String string = this.e.toString();
        String str3 = "'" + zd8.a(this.b) + '\'';
        a9c a9cVar = this.c;
        if (a9cVar != null) {
            str = ",qualifier:" + a9cVar;
        } else {
            str = "";
        }
        lve lveVar = zpd.c;
        a9c a9cVar2 = this.a;
        if (wl7.b(a9cVar2, lveVar)) {
            str2 = "";
        } else {
            str2 = ",scope:" + a9cVar2;
        }
        return "[" + string + ':' + str3 + str + str2 + (this.f.isEmpty() ? "" : ",binds:".concat(z92.W0(this.f, ",", null, null, a.a, 30))) + ']';
    }
}
