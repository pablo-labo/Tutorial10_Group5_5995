package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p5a implements c9c<d> {
    public final hva<n5a> a;
    public final hva<Integer> b;
    public final hva<String> c;
    public final hva<Integer> d;
    public final hva<String> e;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Compensation(formattedText=", this.a, ")");
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && wl7.b(this.d, bVar.d);
        }

        public final int hashCode() {
            int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return z3.n(u40.f("Conversation(id=", this.a, ", key=", this.b, ", messageIdOfInvite="), this.c, ", message=", this.d, ")");
        }
    }

    public static final class c {
        public final String a;
        public final ss1 b;
        public final String c;
        public final String d;

        public c(String str, ss1 ss1Var, String str2, String str3) {
            this.a = str;
            this.b = ss1Var;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            String str2 = this.c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CtaButton(url=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", tooltip=");
            return z3.n(sb, this.c, ", label=", this.d, ")");
        }
    }

    public static final class d implements c9c.a {
        public final l a;

        public d(l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            l lVar = this.a;
            if (lVar == null) {
                return 0;
            }
            return lVar.a.hashCode();
        }

        public final String toString() {
            return "Data(myJobsInvitedJobs=" + this.a + ")";
        }
    }

    public static final class e {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Employer(name=", this.a, ")");
        }
    }

    public static final class f {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Formatted(long=", this.a, ")");
        }
    }

    public static final class g {
        public final vn7 a;
        public final xn7 b;
        public final boolean c;
        public final boolean d;
        public final Object e;
        public final m f;
        public final n g;
        public final ArrayList h;
        public final String i;

        public g(vn7 vn7Var, xn7 xn7Var, boolean z, boolean z2, Object obj, m mVar, n nVar, ArrayList arrayList, String str) {
            this.a = vn7Var;
            this.b = xn7Var;
            this.c = z;
            this.d = z2;
            this.e = obj;
            this.f = mVar;
            this.g = nVar;
            this.h = arrayList;
            this.i = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e.equals(gVar.e) && this.f.equals(gVar.f) && this.g.equals(gVar.g) && this.h.equals(gVar.h) && this.i.equals(gVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + z3.d(this.h, (this.g.hashCode() + akb.d((this.e.hashCode() + ia.f(ia.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f.a)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Invite(status=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", fullApplyRequested=");
            p6.j(sb, this.c, ", canTalkToEmployer=", this.d, ", sentAt=");
            sb.append(this.e);
            sb.append(", recipient=");
            sb.append(this.f);
            sb.append(", sender=");
            sb.append(this.g);
            sb.append(", ctaButtons=");
            sb.append(this.h);
            sb.append(", id=");
            return l6.i(sb, this.i, ")");
        }
    }

    public static final class h {
        public final i a;
        public final g b;
        public final b c;

        public h(i iVar, g gVar, b bVar) {
            this.a = iVar;
            this.b = gVar;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && this.b.equals(hVar.b) && wl7.b(this.c, hVar.c);
        }

        public final int hashCode() {
            i iVar = this.a;
            int iHashCode = (this.b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31)) * 31;
            b bVar = this.c;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "InvitedJob(job=" + this.a + ", invite=" + this.b + ", conversation=" + this.c + ")";
        }
    }

    public static final class i {
        public final String a;
        public final String b;
        public final a c;
        public final k d;
        public final List<j> e;
        public final e f;

        public i(String str, String str2, a aVar, k kVar, List<j> list, e eVar) {
            this.a = str;
            this.b = str2;
            this.c = aVar;
            this.d = kVar;
            this.e = list;
            this.f = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && wl7.b(this.b, iVar.b) && wl7.b(this.c, iVar.c) && wl7.b(this.d, iVar.d) && wl7.b(this.e, iVar.e) && wl7.b(this.f, iVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.c;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            k kVar = this.d;
            int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            List<j> list = this.e;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            e eVar = this.f;
            return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Job(key=", this.a, ", displayTitle=", this.b, ", compensation=");
            sbF.append(this.c);
            sbF.append(", location=");
            sbF.append(this.d);
            sbF.append(", jobTypes=");
            sbF.append(this.e);
            sbF.append(", employer=");
            sbF.append(this.f);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class j {
        public final String a;
        public final String b;

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return wl7.b(this.a, jVar.a) && wl7.b(this.b, jVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("JobType(key=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class k {
        public final f a;

        public k(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && wl7.b(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public final String toString() {
            return "Location(formatted=" + this.a + ")";
        }
    }

    public static final class l {
        public final ArrayList a;

        public l(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a.equals(((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("MyJobsInvitedJobs(invitedJobs=", ")", this.a);
        }
    }

    public static final class m {
        public final String a;

        public m(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a.equals(((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("Recipient(id=", this.a, ")");
        }
    }

    public static final class n {
        public final String a;
        public final String b;

        public n(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a.equals(nVar.a) && this.b.equals(nVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("Sender(name=", this.a, ", id=", this.b, ")");
        }
    }

    public p5a(Object obj) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        u5a u5aVar = u5a.a;
        ha.g gVar = ha.a;
        return new ena(u5aVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query MyJobsInvitedJobs($input: MyJobsInvitedJobsInput, $first: Int, $after: String, $last: Int, $before: String) { myJobsInvitedJobs(input: $input, first: $first, after: $after, last: $last, before: $before) { invitedJobs { job { key displayTitle compensation { formattedText } location { formatted { long } } jobTypes { key label } employer { name } } invite { status type fullApplyRequested canTalkToEmployer sentAt recipient { id } sender { name id } ctaButtons { url type tooltip label } id } conversation { id key messageIdOfInvite message } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = e9c.h;
        snaVar.getClass();
        List<vd2> list = q5a.n;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<n5a> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            ha.g gVar = ha.a;
            ena enaVar = new ena(o5a.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        hva<Integer> hvaVar2 = this.b;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("first");
            ha.a(ha.k).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        hva<String> hvaVar3 = this.c;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("after");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        hva<Integer> hvaVar4 = this.d;
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("last");
            ha.a(ha.k).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        hva<String> hvaVar5 = this.e;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("before");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5a)) {
            return false;
        }
        p5a p5aVar = (p5a) obj;
        return wl7.b(this.a, p5aVar.a) && wl7.b(this.b, p5aVar.b) && wl7.b(this.c, p5aVar.c) && wl7.b(this.d, p5aVar.d) && wl7.b(this.e, p5aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "132f0b9090b63ee27a3cdd78351e60cb690e4cb5cd76da9aeb1f9f7b3a92a06d";
    }

    @Override // defpackage.pua
    public final String name() {
        return "MyJobsInvitedJobs";
    }

    public final String toString() {
        StringBuilder sbG = v40.g("MyJobsInvitedJobsQuery(input=", this.a, ", first=", this.b, ", after=");
        w40.o(sbG, this.c, ", last=", this.d, ", before=");
        return akb.l(sbG, this.e, ")");
    }
}
