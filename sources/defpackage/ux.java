package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ux implements p4a<b> {
    public final sx a;

    public static final class a {
        public final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "AddUDPInteraction(userDisplayPreference=" + this.a + ")";
        }
    }

    public static final class b implements p4a.a {
        public final f a;

        public b(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.a.hashCode();
        }

        public final String toString() {
            return "Data(userDisplayPreferenceMutations=" + this.a + ")";
        }
    }

    public static final class c {
        public final g a;
        public final int b;
        public final Instant c;
        public final Instant d;

        public c(g gVar, int i, Instant instant, Instant instant2) {
            this.a = gVar;
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
        public final a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "InteractionMutations(addUDPInteraction=" + this.a + ")";
        }
    }

    public static final class e {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("UserDisplayPreference(interactions=", ")", this.a);
        }
    }

    public static final class f {
        public final d a;

        public f(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UserDisplayPreferenceMutations(interactionMutations=" + this.a + ")";
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final String c;

        public g(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("UserInteraction(userInteractionType=", this.a, ", userInteractionTarget=", this.b, ", contextKey="), this.c, ")");
        }
    }

    public ux(sx sxVar) {
        this.a = sxVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        xx xxVar = xx.a;
        ha.g gVar = ha.a;
        return new ena(xxVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddUDPInteraction($input: AddUDPInteractionInput!) { userDisplayPreferenceMutations { interactionMutations { addUDPInteraction(input: $input) { userDisplayPreference { interactions { userInteraction { userInteractionType userInteractionTarget contextKey } interactionCount firstInteractionTimestamp lastInteractionTimestamp } } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = vx.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        tx txVar = tx.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        txVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux) && this.a.equals(((ux) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "97e15b37e9204030e5e9c36366d20483c183580aa669a276c94e4ef740d72874";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddUDPInteraction";
    }

    public final String toString() {
        return "AddUDPInteractionMutation(input=" + this.a + ")";
    }
}
