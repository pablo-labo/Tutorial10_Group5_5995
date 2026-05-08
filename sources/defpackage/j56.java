package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j56 implements c9c<b> {
    public final hva<sye> a;

    public static final class a {
        public final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "AiMessaging(suggestedMessages=" + this.a + ")";
        }
    }

    public static final class b implements c9c.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(AiMessaging=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("SuggestedMessage(messageBody=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class d {
        public final ArrayList a;
        public final String b;

        public d(String str, ArrayList arrayList) {
            this.a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "SuggestedMessages(suggestedMessages=" + this.a + ", trackingKey=" + this.b + ")";
        }
    }

    public j56(hva<sye> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        m56 m56Var = m56.a;
        ha.g gVar = ha.a;
        return new ena(m56Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query getSuggestedMessages($input: SuggestedMessageInput) { AiMessaging { suggestedMessages(input: $input) { suggestedMessages { messageBody label } trackingKey } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = k56.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<sye> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            zm zmVar = zm.c;
            ha.g gVar = ha.a;
            ena enaVar = new ena(zmVar, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j56) && wl7.b(this.a, ((j56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "57cb1b8e937d29ca5789fa4675eb132c77e58cad022945cedb0847176c0c81a2";
    }

    @Override // defpackage.pua
    public final String name() {
        return "getSuggestedMessages";
    }

    public final String toString() {
        return "GetSuggestedMessagesQuery(input=" + this.a + ")";
    }
}
