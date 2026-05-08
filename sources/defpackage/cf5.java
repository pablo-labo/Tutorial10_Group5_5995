package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cf5 implements c9c<a> {
    public final dzd a;

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
            return bVar.a.hashCode();
        }

        public final String toString() {
            return "Data(findSegmentationTargetedLeverExperiments=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("FindSegmentationTargetedLeverExperiments(leverConfigurations=", ")", this.a);
        }
    }

    public static final class c {
        public final String a;
        public final s1h b;

        public c(String str, s1h s1hVar) {
            str.getClass();
            this.a = str;
            this.b = s1hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            s1h s1hVar = this.b;
            return iHashCode + (s1hVar == null ? 0 : s1hVar.hashCode());
        }

        public final String toString() {
            return "LeverConfiguration(__typename=" + this.a + ", workAreasSelectionConfiguration=" + this.b + ")";
        }
    }

    public cf5(dzd dzdVar) {
        this.a = dzdVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ef5 ef5Var = ef5.a;
        ha.g gVar = ha.a;
        return new ena(ef5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindTargetedLeverExperiments($targetedLeverExperimentsInput: SegmentationTargetedLeverExperimentsInput!) { findSegmentationTargetedLeverExperiments(input: $targetedLeverExperimentsInput) { leverConfigurations { __typename ...workAreasSelectionConfiguration } } }  fragment workAreasSelectionConfiguration on SegmentationCrowtaxoWorkAreasSelectionConfiguration { lever { leverId } workAreaSelection { label selectionLimit workAreas { id label } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = df5.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("targetedLeverExperimentsInput");
        ha.g gVar = ha.a;
        hc8Var.j();
        ezd.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf5) && this.a.equals(((cf5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "4cadddbff20c5eaac95c3380adf928494b1e601fabe8ab61297a6fdcef25f4de";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindTargetedLeverExperiments";
    }

    public final String toString() {
        return "FindTargetedLeverExperimentsQuery(targetedLeverExperimentsInput=" + this.a + ")";
    }
}
