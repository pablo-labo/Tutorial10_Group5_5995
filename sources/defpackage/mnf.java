package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mnf {

    public class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public a a() {
            return mnf.this.new a(this.a + 1);
        }

        public final char b(int i) {
            mnf mnfVar = mnf.this;
            if (i == 0) {
                return mnfVar.e(e(0).b);
            }
            if (i == -1) {
                return mnfVar.e(e(0).b - 1);
            }
            if (i != 1) {
                return mnfVar.e(i > 0 ? e(i).b : e(i + 1).b - 1);
            }
            return mnfVar.e(e(0).c);
        }

        public final int c() {
            return e(0).c - e(0).b;
        }

        public final en6 d() {
            return e(0).a;
        }

        public final knf e(int i) {
            int i2 = this.a;
            mnf mnfVar = mnf.this;
            if (i2 < 0) {
                return new knf(null, mnfVar.d().a, mnfVar.d().a, 0, 0);
            }
            if (i2 > mnfVar.b().size()) {
                return new knf(null, mnfVar.d().b + 1, mnfVar.d().b + 1, 0, 0);
            }
            int size = (i2 < mnfVar.b().size() ? mnfVar.b().get(i2).d : mnfVar.a().size()) + i;
            return size < 0 ? new knf(null, mnfVar.d().a, mnfVar.d().a, 0, 0) : size >= mnfVar.a().size() ? new knf(null, mnfVar.d().b + 1, mnfVar.d().b + 1, 0, 0) : mnfVar.a().get(size);
        }

        public en6 f() {
            return e(1).a;
        }

        public final String toString() {
            return "Iterator: " + this.a + ": " + d();
        }
    }

    public abstract List<knf> a();

    public abstract List<knf> b();

    public abstract CharSequence c();

    public abstract oh7 d();

    public final char e(int i) {
        if (i >= d().a && i <= d().b) {
            return c().charAt(i);
        }
        return (char) 0;
    }

    public final class b extends a {
        public final List<oh7> c;
        public final int d;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(uu8 uu8Var, List list) {
            oh7 oh7Var = (oh7) z92.Q0(list);
            this(list, 0, oh7Var != null ? oh7Var.a : -1);
        }

        @Override // mnf.a
        public final en6 f() {
            oh7 oh7Var = (oh7) z92.R0(this.d, this.c);
            if (oh7Var == null) {
                return null;
            }
            int i = oh7Var.a;
            int i2 = oh7Var.b;
            int i3 = this.a + 1;
            if (i > i3 || i3 > i2) {
                return null;
            }
            return e(1).a;
        }

        @Override // mnf.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final b a() {
            List<oh7> list = this.c;
            int size = list.size();
            int i = this.d;
            if (i >= size) {
                return this;
            }
            int i2 = list.get(i).b;
            mnf mnfVar = mnf.this;
            int i3 = this.a;
            if (i3 != i2) {
                return mnfVar.new b(list, i, i3 + 1);
            }
            int i4 = i + 1;
            oh7 oh7Var = (oh7) z92.R0(i4, list);
            return mnfVar.new b(list, i4, oh7Var != null ? oh7Var.a : mnfVar.b().size());
        }

        public b(List<oh7> list, int i, int i2) {
            super(i2);
            this.c = list;
            this.d = i;
        }
    }
}
