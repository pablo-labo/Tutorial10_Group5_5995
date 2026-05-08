package defpackage;

import defpackage.p85;
import defpackage.yj3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class og2 {
    public final List<ii7> a;
    public final List<Pair<ec9<? extends Object, ? extends Object>, yd8<? extends Object>>> b;
    public final List<Pair<jh8<? extends Object>, yd8<? extends Object>>> c;
    public List<? extends gu5<? extends List<? extends Pair<? extends p85.a<? extends Object>, ? extends yd8<? extends Object>>>>> d;
    public List<? extends gu5<? extends List<? extends yj3.a>>> e;
    public final d2f f;
    public final d2f g;

    /* JADX WARN: Multi-variable type inference failed */
    public og2(List<? extends ii7> list, List<? extends Pair<? extends ec9<? extends Object, ? extends Object>, ? extends yd8<? extends Object>>> list2, List<? extends Pair<? extends jh8<? extends Object>, ? extends yd8<? extends Object>>> list3, List<? extends gu5<? extends List<? extends Pair<? extends p85.a<? extends Object>, ? extends yd8<? extends Object>>>>> list4, List<? extends gu5<? extends List<? extends yj3.a>>> list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = new d2f(new xh(this, 3));
        this.g = new d2f(new oe(this, 4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public og2() {
        zr4 zr4Var = zr4.a;
        this(zr4Var, zr4Var, zr4Var, zr4Var, zr4Var);
    }

    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public a(og2 og2Var) {
            this.a = z92.B1(og2Var.a);
            this.b = z92.B1(og2Var.b);
            this.c = z92.B1(og2Var.c);
            List list = (List) og2Var.f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new nj((Pair) it.next(), 6));
            }
            this.d = arrayList;
            List list2 = (List) og2Var.g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new nv((yj3.a) it2.next(), 4));
            }
            this.e = arrayList2;
        }

        public final void a(p85.a aVar, yd8 yd8Var) {
            this.d.add(new ti(3, aVar, yd8Var));
        }

        public final void b(ec9 ec9Var, yd8 yd8Var) {
            this.b.add(new Pair(ec9Var, yd8Var));
        }

        public final og2 c() {
            return new og2(aa2.a(this.a), aa2.a(this.b), aa2.a(this.c), aa2.a(this.d), aa2.a(this.e));
        }

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
