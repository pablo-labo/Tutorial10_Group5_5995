package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y56 implements c9c<a> {

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
            return "Data(findUserDisplayPreference=" + this.a + ")";
        }
    }

    public static final class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "FindUserDisplayPreference(userDisplayPreference=" + this.a + ")";
        }
    }

    public static final class c {
        public final e a;
        public final int b;
        public final Instant c;
        public final Instant d;

        public c(e eVar, int i, Instant instant, Instant instant2) {
            this.a = eVar;
            this.b = i;
            this.c = instant;
            this.d = instant2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c.equals(cVar.c) && this.d.equals(cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + w40.c(this.b, this.a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "Interaction(userInteraction=" + this.a + ", interactionCount=" + this.b + ", firstInteractionTimestamp=" + this.c + ", lastInteractionTimestamp=" + this.d + ")";
        }
    }

    public static final class d {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("UserDisplayPreference(interactions=", ")", this.a);
        }
    }

    public static final class e {
        public final String a;
        public final String b;
        public final String c;

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("UserInteraction(userInteractionType=", this.a, ", userInteractionTarget=", this.b, ", contextKey="), this.c, ")");
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        a66 a66Var = a66.a;
        ha.g gVar = ha.a;
        return new ena(a66Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetUDPInteractions { findUserDisplayPreference { userDisplayPreference { interactions { userInteraction { userInteractionType userInteractionTarget contextKey } interactionCount firstInteractionTimestamp lastInteractionTimestamp } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = z56.e;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == y56.class;
    }

    public final int hashCode() {
        return fwc.a.b(y56.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "8e620cde49082f875a901dbd5f3891718ff8efab42c974dadd9e49052b979a90";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetUDPInteractions";
    }
}
