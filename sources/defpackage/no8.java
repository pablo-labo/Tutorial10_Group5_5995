package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class no8 {
    public final qn8 a;
    public final ArrayList<a> b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List<ld6> h;
    public int i;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b implements yn8 {
        public static final b a = new b();
    }

    public static final class c {
        public final int a;
        public final List<ld6> b;

        public c(int i, List<ld6> list) {
            this.a = i;
            this.b = list;
        }
    }

    public no8(qn8 qn8Var) {
        this.a = qn8Var;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = zr4.a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    public final c b(int i) {
        List<ld6> list;
        int i2 = this.i;
        int i3 = i * i2;
        int iD = d() - i3;
        if (i2 > iD) {
            i2 = iD;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.h.size()) {
            list = this.h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new ld6(1L));
            }
            this.h = arrayList;
            list = arrayList;
        }
        return new c(i3, list);
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            de7.a("ItemIndex > total count");
        }
        return i / this.i;
    }

    public final int d() {
        return this.a.b.a;
    }

    public final int e(int i) {
        mj7 mj7VarB = this.a.b.b(i);
        int i2 = i - mj7VarB.a;
        return (int) ((pn8) mj7VarB.c).a.invoke(b.a, Integer.valueOf(i2)).a;
    }
}
