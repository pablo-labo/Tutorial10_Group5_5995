package defpackage;

import defpackage.o85;
import defpackage.xj3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ng2 {
    public final List<hi7> a;
    public final List<Pair<fc9<? extends Object, ? extends Object>, Class<? extends Object>>> b;
    public final List<Pair<kh8<? extends Object>, Class<? extends Object>>> c;
    public final List<Pair<o85.a<? extends Object>, Class<? extends Object>>> d;
    public final List<xj3.a> e;

    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public a(ng2 ng2Var) {
            this.a = z92.B1(ng2Var.a);
            this.b = z92.B1(ng2Var.b);
            this.c = z92.B1(ng2Var.c);
            this.d = z92.B1(ng2Var.d);
            this.e = z92.B1(ng2Var.e);
        }

        public final void a(o85.a aVar, Class cls) {
            this.d.add(new Pair(aVar, cls));
        }

        public final void b(fc9 fc9Var, Class cls) {
            this.b.add(new Pair(fc9Var, cls));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ng2(List<? extends hi7> list, List<? extends Pair<? extends fc9<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends kh8<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends o85.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends xj3.a> list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ng2() {
        zr4 zr4Var = zr4.a;
        this(zr4Var, zr4Var, zr4Var, zr4Var, zr4Var);
    }
}
