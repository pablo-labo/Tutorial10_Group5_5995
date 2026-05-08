package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l06 implements c9c<b> {
    public final String a;
    public final String b;

    public static final class a {
        public final String a;
        public final d b;
        public final String c;

        public a(String str, d dVar, String str2) {
            this.a = str;
            this.b = dVar;
            this.c = str2;
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
            d dVar = this.b;
            return this.c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.a.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Conversation(id=");
            sb.append(this.a);
            sb.append(", eventsConnection=");
            sb.append(this.b);
            sb.append(", __typename=");
            return l6.i(sb, this.c, ")");
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
            return "Data(conversation=" + this.a + ")";
        }
    }

    public static final class c {
        public final f a;

        public c(f fVar) {
            this.a = fVar;
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
            return "Edge(node=" + this.a + ")";
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
            return m6.g("EventsConnection(edges=", ")", this.a);
        }
    }

    public static final class e {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("InboundEmailData(strippedHtml=", this.a, ", subject=", this.b, ")");
        }
    }

    public static final class f {
        public final e a;
        public final String b;
        public final String c;

        public f(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c);
        }

        public final int hashCode() {
            e eVar = this.a;
            return this.c.hashCode() + akb.d((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Node(inboundEmailData=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", __typename=");
            return l6.i(sb, this.c, ")");
        }
    }

    public l06(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.g15
    public final ena a() {
        o06 o06Var = o06.a;
        ha.g gVar = ha.a;
        return new ena(o06Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetInboundEmailDataByConversationIdAndEventId($conversationId: ID!, $eventId: ID!) { conversation(input: { conversationId: $conversationId } ) { id eventsConnection(input: { filter: { eventIds: [$eventId] }  } ) { edges { node { inboundEmailData { strippedHtml subject } id __typename } } } __typename } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = m06.f;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("conversationId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, this.a);
        hc8Var.u0("eventId");
        gVar.b(hc8Var, lb3Var, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l06)) {
            return false;
        }
        l06 l06Var = (l06) obj;
        return wl7.b(this.a, l06Var.a) && wl7.b(this.b, l06Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "e67373482710dc906aed2a183188fa7ccf99bdcd02d28aa445d0fad426e60a77";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetInboundEmailDataByConversationIdAndEventId";
    }

    public final String toString() {
        return akb.k("GetInboundEmailDataByConversationIdAndEventIdQuery(conversationId=", this.a, ", eventId=", this.b, ")");
    }
}
