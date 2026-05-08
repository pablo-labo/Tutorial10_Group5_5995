package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o75 implements c9c<d> {
    public final dx2 a;
    public final int b;
    public final int c;
    public final hva<String> d;
    public final hva<String> e;
    public final hmf f;
    public final hva<Boolean> g;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("Attachment(contentHash=", this.a, ", fileName=", this.b, ", fileExtension="), this.c, ")");
        }
    }

    public static final class b {
        public final String a;
        public final gy2 b;

        public b(String str, gy2 gy2Var) {
            this.a = str;
            this.b = gy2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            gy2 gy2Var = this.b;
            return iHashCode + (gy2Var != null ? gy2Var.hashCode() : 0);
        }

        public final String toString() {
            return "Author(accountKey=" + this.a + ", role=" + this.b + ")";
        }
    }

    public static final class c {
        public final String a;
        public final f b;
        public final String c;
        public final jv2 d;

        public c(String str, f fVar, String str2, jv2 jv2Var) {
            this.a = str;
            this.b = fVar;
            this.c = str2;
            this.d = jv2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && wl7.b(this.b, cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            return this.d.hashCode() + akb.d((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "Conversation(__typename=" + this.a + ", eventsConnection=" + this.b + ", id=" + this.c + ", conversationDetails=" + this.d + ")";
        }
    }

    public static final class d implements c9c.a {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "Data(conversation=" + this.a + ")";
        }
    }

    public static final class e {
        public final String a;
        public final b b;
        public final sw2 c;
        public final qw2 d;
        public final String e;
        public final jw2 f;
        public final String g;
        public final Date h;
        public final ArrayList i;
        public final k j;
        public final String k;

        public e(String str, b bVar, sw2 sw2Var, qw2 qw2Var, String str2, jw2 jw2Var, String str3, Date date, ArrayList arrayList, k kVar, String str4) {
            this.a = str;
            this.b = bVar;
            this.c = sw2Var;
            this.d = qw2Var;
            this.e = str2;
            this.f = jw2Var;
            this.g = str3;
            this.h = date;
            this.i = arrayList;
            this.j = kVar;
            this.k = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c == eVar.c && this.d == eVar.d && wl7.b(this.e, eVar.e) && this.f == eVar.f && wl7.b(this.g, eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i) && wl7.b(this.j, eVar.j) && this.k.equals(eVar.k);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            qw2 qw2Var = this.d;
            int iHashCode2 = (iHashCode + (qw2Var == null ? 0 : qw2Var.hashCode())) * 31;
            String str = this.e;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            jw2 jw2Var = this.f;
            int iHashCode4 = (iHashCode3 + (jw2Var == null ? 0 : jw2Var.hashCode())) * 31;
            String str2 = this.g;
            int iD = z3.d(this.i, (this.h.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
            k kVar = this.j;
            return this.k.hashCode() + ((iD + (kVar != null ? kVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Event(id=");
            sb.append(this.a);
            sb.append(", author=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", subType=");
            sb.append(this.d);
            sb.append(", messageBody=");
            sb.append(this.e);
            sb.append(", messageContentFormat=");
            sb.append(this.f);
            sb.append(", cleanedMessageBody=");
            sb.append(this.g);
            sb.append(", publicationDateTime=");
            sb.append(this.h);
            sb.append(", attachments=");
            sb.append(this.i);
            sb.append(", timelineModuleResult=");
            sb.append(this.j);
            sb.append(", __typename=");
            return l6.i(sb, this.k, ")");
        }
    }

    public static final class f {
        public final ArrayList a;
        public final j b;

        public f(ArrayList arrayList, j jVar) {
            this.a = arrayList;
            this.b = jVar;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "EventsConnection(events=" + this.a + ", pageInfo=" + this.b + ")";
        }
    }

    public static final class g {
        public final String a;
        public final String b;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return akb.k("Icon(iflColorReference=", this.a, ", iflIconName=", this.b, ")");
        }
    }

    public static final class h {
        public final String a;
        public final String b;
        public final i c;
        public final String d;

        public h(String str, String str2, i iVar, String str3) {
            this.a = str;
            this.b = str2;
            this.c = iVar;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && wl7.b(this.b, hVar.b) && wl7.b(this.c, hVar.c) && wl7.b(this.d, hVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            i iVar = this.c;
            int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("OnTimelineModule(telContent=", this.a, ", timelineModuleType=", this.b, ", overrides=");
            sbF.append(this.c);
            sbF.append(", data=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class i {
        public final String a;
        public final String b;
        public final g c;

        public i(String str, String str2, g gVar) {
            this.a = str;
            this.b = str2;
            this.c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return wl7.b(this.a, iVar.a) && wl7.b(this.b, iVar.b) && wl7.b(this.c, iVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            g gVar = this.c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Overrides(message=", this.a, ", sender=", this.b, ", icon=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class j {
        public final boolean a;
        public final boolean b;
        public final String c;
        public final String d;

        public j(String str, String str2, boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && this.b == jVar.b && wl7.b(this.c, jVar.c) && wl7.b(this.d, jVar.d);
        }

        public final int hashCode() {
            int iF = ia.f(Boolean.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageInfo(hasNextPage=");
            sb.append(this.a);
            sb.append(", hasPreviousPage=");
            sb.append(this.b);
            sb.append(", endCursor=");
            return z3.n(sb, this.c, ", startCursor=", this.d, ")");
        }
    }

    public static final class k {
        public final String a;
        public final h b;

        public k(String str, h hVar) {
            str.getClass();
            this.a = str;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return wl7.b(this.a, kVar.a) && wl7.b(this.b, kVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            h hVar = this.b;
            return iHashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public final String toString() {
            return "TimelineModuleResult(__typename=" + this.a + ", onTimelineModule=" + this.b + ")";
        }
    }

    public o75(dx2 dx2Var, int i2, int i3, hva hvaVar, hmf hmfVar, hva.c cVar) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        aVar.getClass();
        this.a = dx2Var;
        this.b = i2;
        this.c = i3;
        this.d = hvaVar;
        this.e = aVar;
        this.f = hmfVar;
        this.g = cVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        t75 t75Var = t75.a;
        ha.g gVar = ha.a;
        return new ena(t75Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FetchConversationMessages($input: ConversationInput!, $first: Int!, $last: Int!, $before: String, $after: String, $timelineModuleResultInput: TimelineModuleInput!, $includeRequireResponse: Boolean! = true ) { conversation(input: $input) { __typename ...ConversationDetails eventsConnection(first: $first, after: $after, last: $last, before: $before) { events { id author { accountKey role } type subType messageBody messageContentFormat cleanedMessageBody publicationDateTime attachments { contentHash fileName fileExtension } timelineModuleResult(input: $timelineModuleResultInput) { __typename ... on TimelineModule { telContent timelineModuleType overrides { message sender icon { iflColorReference iflIconName } } data } } __typename } pageInfo { hasNextPage hasPreviousPage endCursor startCursor } } id } }  fragment JobData on Job { key url title location { formatted { short long } } sourceEmployerName employer { dossier { images { squareLogoUrls { url64 url128 } } } ugcStats { ratings { overallRating { value } } } } compensation { formattedText } attributes { key label } }  fragment LastEvent on ConversationEvent { id type subType messagePreview publicationDateTime author { role } attachments { contentHash fileName fileExtension } __typename }  fragment ConversationDetails on Conversation { id context userContext { requireResponse @include(if: $includeRequireResponse) { required timestamp } } userReadsInfo { lastVisited readCursor unreadCount } userLabelInfo { labels } participants { role accountKey participantName removed } job { __typename ...JobData } lastEvent { __typename ...LastEvent id } locks { primary reason timestamp } scope { key value } __typename }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = p75.k;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        dx2 dx2Var = this.a;
        dx2Var.getClass();
        hc8Var.u0("conversationId");
        ha.a.b(hc8Var, lb3Var, dx2Var.a);
        hc8Var.t();
        hc8Var.u0("first");
        ha.e eVar = ha.b;
        eVar.b(hc8Var, lb3Var, Integer.valueOf(this.b));
        hc8Var.u0("last");
        eVar.b(hc8Var, lb3Var, Integer.valueOf(this.c));
        hva<String> hvaVar = this.d;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("before");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
        hva<String> hvaVar2 = this.e;
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("after");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        hc8Var.u0("timelineModuleResultInput");
        io ioVar = io.c;
        hc8Var.j();
        ioVar.b(hc8Var, lb3Var, this.f);
        hc8Var.t();
        hva<Boolean> hvaVar3 = this.g;
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("includeRequireResponse");
            ha.f.b(hc8Var, lb3Var, ((hva.c) hvaVar3).a);
        } else if (z) {
            hc8Var.u0("includeRequireResponse");
            ha.m.b(hc8Var, lb3Var, Boolean.TRUE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o75)) {
            return false;
        }
        o75 o75Var = (o75) obj;
        return wl7.b(this.a, o75Var.a) && this.b == o75Var.b && this.c == o75Var.c && wl7.b(this.d, o75Var.d) && wl7.b(this.e, o75Var.e) && wl7.b(this.f, o75Var.f) && wl7.b(this.g, o75Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + b0.e(this.e, b0.e(this.d, w40.c(this.c, w40.c(this.b, this.a.a.hashCode() * 31, 31), 31), 31), 31)) * 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "fee29a69e01c4d1df047761d6743a982055424782af9c9b8dda351259b39c719";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FetchConversationMessages";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchConversationMessagesQuery(input=");
        sb.append(this.a);
        sb.append(", first=");
        sb.append(this.b);
        sb.append(", last=");
        sb.append(this.c);
        sb.append(", before=");
        sb.append(this.d);
        sb.append(", after=");
        sb.append(this.e);
        sb.append(", timelineModuleResultInput=");
        sb.append(this.f);
        sb.append(", includeRequireResponse=");
        return akb.l(sb, this.g, ")");
    }
}
