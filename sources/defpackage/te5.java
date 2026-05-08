package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class te5 implements c9c<b> {
    public final dzd a;

    public static final class a {
        public final String a;
        public final String b;
        public final ArrayList c;

        public a(String str, String str2, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Attribute(id=", this.a, ", label=", this.b, ", customClassIds=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class b implements c9c.a {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(findSegmentationTargetedLeverExperiments=" + this.a + ")";
        }
    }

    public static final class c {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("FindSegmentationTargetedLeverExperiments(leverConfigurations=", ")", this.a);
        }
    }

    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return l5.m("Lever(leverId=", this.a, ")");
        }
    }

    public static final class e {
        public final String a;
        public final f b;

        public e(String str, f fVar) {
            str.getClass();
            this.a = str;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            return "LeverConfiguration(__typename=" + this.a + ", onSegmentationWorkWellbeingConfiguration=" + this.b + ")";
        }
    }

    public static final class f {
        public final d a;
        public final ArrayList b;

        public f(d dVar, ArrayList arrayList) {
            this.a = dVar;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "OnSegmentationWorkWellbeingConfiguration(lever=" + this.a + ", workWellbeingQuestions=" + this.b + ")";
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final Integer c;
        public final ArrayList d;

        public g(String str, String str2, Integer num, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && wl7.b(this.b, gVar.b) && wl7.b(this.c, gVar.c) && this.d.equals(gVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            return this.d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("WorkWellbeingQuestion(id=", this.a, ", label=", this.b, ", questionAnswerLimit=");
            sbF.append(this.c);
            sbF.append(", attributes=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public te5(dzd dzdVar) {
        this.a = dzdVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        we5 we5Var = we5.a;
        ha.g gVar = ha.a;
        return new ena(we5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindSegmentationTargetedLeverExperiments($input: SegmentationTargetedLeverExperimentsInput!) { findSegmentationTargetedLeverExperiments(input: $input) { leverConfigurations { __typename ... on SegmentationWorkWellbeingConfiguration { lever { leverId } workWellbeingQuestions { id label questionAnswerLimit attributes { id label customClassIds } } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = ue5.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        ezd.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te5) && this.a.equals(((te5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "8356aa73683e81428d5a52db5bca6c33b40774c6938d7d55b69844a62b222cbb";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindSegmentationTargetedLeverExperiments";
    }

    public final String toString() {
        return "FindSegmentationTargetedLeverExperimentsQuery(input=" + this.a + ")";
    }
}
