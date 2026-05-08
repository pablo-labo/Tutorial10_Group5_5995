package defpackage;

import defpackage.af1;
import defpackage.c20;

/* JADX INFO: loaded from: classes.dex */
public abstract class k73 {
    public static final /* synthetic */ int a = 0;

    public static final class a extends k73 {
        public static final /* synthetic */ int b = 0;

        static {
            new a();
        }

        @Override // defpackage.k73
        public final int a(int i, vl8 vl8Var) {
            return i / 2;
        }
    }

    public static final class b extends k73 {
        public static final /* synthetic */ int b = 0;

        static {
            new b();
        }

        @Override // defpackage.k73
        public final int a(int i, vl8 vl8Var) {
            if (vl8Var == vl8.a) {
                return i;
            }
            return 0;
        }
    }

    public static final class c extends k73 {
        public final c20.b b;

        public c(af1.a aVar) {
            this.b = aVar;
        }

        @Override // defpackage.k73
        public final int a(int i, vl8 vl8Var) {
            return this.b.a(0, i, vl8Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.b + ')';
        }
    }

    public static final class d extends k73 {
        public static final /* synthetic */ int b = 0;

        static {
            new d();
        }

        @Override // defpackage.k73
        public final int a(int i, vl8 vl8Var) {
            if (vl8Var == vl8.a) {
                return 0;
            }
            return i;
        }
    }

    public static final class e extends k73 {
        public final c20.c b;

        public e(af1.b bVar) {
            this.b = bVar;
        }

        @Override // defpackage.k73
        public final int a(int i, vl8 vl8Var) {
            return this.b.a(0, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.b + ')';
        }
    }

    static {
        int i = a.b;
        int i2 = d.b;
        int i3 = b.b;
    }

    public abstract int a(int i, vl8 vl8Var);
}
