package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vc5 implements c9c<b> {
    public final tc5 a;
    public final int b;
    public final int c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<Boolean> f;

    public static final class a {
        public final String a;
        public final String b;
        public final jv2 c;

        public a(String str, String str2, jv2 jv2Var) {
            this.a = str;
            this.b = str2;
            this.c = jv2Var;
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
            StringBuilder sbF = u40.f("Conversation(__typename=", this.a, ", id=", this.b, ", conversationDetails=");
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
            return cVar.hashCode();
        }

        public final String toString() {
            return "Data(findConversations=" + this.a + ")";
        }
    }

    public static final class c {
        public final ArrayList a;
        public final d b;

        public c(ArrayList arrayList, d dVar) {
            this.a = arrayList;
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FindConversations(conversations=" + this.a + ", pageInfo=" + this.b + ")";
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public d(String str, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return Boolean.hashCode(this.d) + ia.f((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("PageInfo(endCursor=", this.a, ", startCursor=", this.b, ", hasPreviousPage=");
            sbF.append(this.c);
            sbF.append(", hasNextPage=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public vc5(tc5 tc5Var, int i, int i2, hva hvaVar, hva.c cVar) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        aVar.getClass();
        this.a = tc5Var;
        this.b = i;
        this.c = i2;
        this.d = hvaVar;
        this.e = aVar;
        this.f = cVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        yc5 yc5Var = yc5.a;
        ha.g gVar = ha.a;
        return new ena(yc5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindConversations($input: FindConversationsInput!, $first: Int!, $last: Int!, $before: String, $after: String, $includeRequireResponse: Boolean! = true ) { findConversations(input: $input, first: $first, after: $after, last: $last, before: $before) { conversations { __typename ...ConversationDetails id } pageInfo { endCursor startCursor hasPreviousPage hasNextPage } } }  fragment JobData on Job { key url title location { formatted { short long } } sourceEmployerName employer { dossier { images { squareLogoUrls { url64 url128 } } } ugcStats { ratings { overallRating { value } } } } compensation { formattedText } attributes { key label } }  fragment LastEvent on ConversationEvent { id type subType messagePreview publicationDateTime author { role } attachments { contentHash fileName fileExtension } __typename }  fragment ConversationDetails on Conversation { id context userContext { requireResponse @include(if: $includeRequireResponse) { required timestamp } } userReadsInfo { lastVisited readCursor unreadCount } userLabelInfo { labels } participants { role accountKey participantName removed } job { __typename ...JobData } lastEvent { __typename ...LastEvent id } locks { primary reason timestamp } scope { key value } __typename }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = wc5.d;
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
        uc5.a.b(hc8Var, lb3Var, this.a);
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
        hva<Boolean> hvaVar3 = this.f;
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
        if (!(obj instanceof vc5)) {
            return false;
        }
        vc5 vc5Var = (vc5) obj;
        return wl7.b(this.a, vc5Var.a) && this.b == vc5Var.b && this.c == vc5Var.c && wl7.b(this.d, vc5Var.d) && wl7.b(this.e, vc5Var.e) && wl7.b(this.f, vc5Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, w40.c(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "f8f277cecaae4dec7adcf18b2c74d409ac16b753ff42b14645bce0affeec3962";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindConversations";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FindConversationsQuery(input=");
        sb.append(this.a);
        sb.append(", first=");
        sb.append(this.b);
        sb.append(", last=");
        sb.append(this.c);
        sb.append(", before=");
        sb.append(this.d);
        sb.append(", after=");
        return uz.e(sb, this.e, ", includeRequireResponse=", this.f, ")");
    }
}
