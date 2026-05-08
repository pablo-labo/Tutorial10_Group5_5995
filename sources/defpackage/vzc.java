package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vzc implements c9c<a> {

    public static final class a implements c9c.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(remainingTopChoices=" + this.a + ")";
        }
    }

    public static final class b {
        public final int a;
        public final Object b;

        public b(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "RemainingTopChoices(amount=" + this.a + ", nextAvailableTimestamp=" + this.b + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        xzc xzcVar = xzc.a;
        ha.g gVar = ha.a;
        return new ena(xzcVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query RemainingTopChoices { remainingTopChoices { amount nextAvailableTimestamp } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = wzc.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == vzc.class;
    }

    public final int hashCode() {
        return fwc.a.b(vzc.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "190d0c7293361f02a72d1f3e3b98ed0ab6595ee4b197abd169068153fbe9a112";
    }

    @Override // defpackage.pua
    public final String name() {
        return "RemainingTopChoices";
    }
}
