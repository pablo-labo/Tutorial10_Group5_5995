package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jwa {

    public static final class a extends jwa {
        public final v5b a;

        public a(v5b v5bVar) {
            this.a = v5bVar;
        }

        @Override // defpackage.jwa
        public final qtc a() {
            return this.a.getBounds();
        }
    }

    public static final class b extends jwa {
        public final qtc a;

        public b(qtc qtcVar) {
            this.a = qtcVar;
        }

        @Override // defpackage.jwa
        public final qtc a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return wl7.b(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class c extends jwa {
        public final zfd a;
        public final m80 b;

        public c(zfd zfdVar) {
            m80 m80VarA;
            this.a = zfdVar;
            if (ak2.t(zfdVar)) {
                m80VarA = null;
            } else {
                m80VarA = p80.a();
                m80VarA.o(zfdVar);
            }
            this.b = m80VarA;
        }

        @Override // defpackage.jwa
        public final qtc a() {
            zfd zfdVar = this.a;
            return new qtc(zfdVar.a, zfdVar.b, zfdVar.c, zfdVar.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return wl7.b(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public abstract qtc a();
}
