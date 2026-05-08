package defpackage;

import defpackage.ha;
import defpackage.hva;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ow implements p4a<c> {
    public final hva<wp> a;

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
            return "AddJobSeekerProfileStructuredDataPreferenceAttributes(preference=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final Object c;
        public final i68 d;
        public final String e;

        public b(String str, String str2, Object obj, i68 i68Var, String str3) {
            this.a = str;
            this.b = str2;
            this.c = obj;
            this.d = i68Var;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d && this.e.equals(bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Attribute(id=", this.a, ", label=", this.b, ", modifiedTime=");
            sbF.append(this.c);
            sbF.append(", sentiment=");
            sbF.append(this.d);
            sbF.append(", suid=");
            return l6.i(sbF, this.e, ")");
        }
    }

    public static final class c implements p4a.a {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(addJobSeekerProfileStructuredDataPreferenceAttributes=" + this.a + ")";
        }
    }

    public static final class d {
        public final String a;
        public final ArrayList b;

        public d(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", attributes=" + this.b + ")";
        }
    }

    public ow(hva<wp> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        sw swVar = sw.a;
        ha.g gVar = ha.a;
        return new ena(swVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddSdcAttributes($input: AddJobSeekerProfileStructuredDataPreferenceAttributesInput) { addJobSeekerProfileStructuredDataPreferenceAttributes(input: $input) { preference { id attributes { id label modifiedTime sentiment suid } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = pw.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<wp> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            xp xpVar = xp.b;
            ha.g gVar = ha.a;
            ena enaVar = new ena(xpVar, false);
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
        return (obj instanceof ow) && wl7.b(this.a, ((ow) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "877d643ad25be4017c9ed9a0ef471cb35709c6ddd18dc049ad5331a2d094b74b";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddSdcAttributes";
    }

    public final String toString() {
        return "AddSdcAttributesMutation(input=" + this.a + ")";
    }
}
