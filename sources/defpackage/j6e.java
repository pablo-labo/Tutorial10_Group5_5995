package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j6e implements p4a<a> {
    public final h6e a;

    public static final class a implements p4a.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "Data(sendConversationEvent=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final jk8 c;

        public b(String str, String str2, jk8 jk8Var) {
            this.a = str;
            this.b = str2;
            this.c = jk8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Event(__typename=", this.a, ", id=", this.b, ", lastEvent=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class c {
        public final String a;
        public final b b;

        public c(String str, b bVar) {
            this.a = str;
            this.b = bVar;
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
            return "SendConversationEvent(conversationId=" + this.a + ", event=" + this.b + ")";
        }
    }

    public j6e(h6e h6eVar) {
        h6eVar.getClass();
        this.a = h6eVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        l6e l6eVar = l6e.a;
        ha.g gVar = ha.a;
        return new ena(l6eVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation sendConversationEvent($input: SendConversationEventInput!) { sendConversationEvent(input: $input) { conversationId event { __typename ...LastEvent id } } }  fragment LastEvent on ConversationEvent { id type subType messagePreview publicationDateTime author { role } attachments { contentHash fileName fileExtension } __typename }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = q4a.d;
        snaVar.getClass();
        List<vd2> list = k6e.c;
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
        i6e.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6e) && wl7.b(this.a, ((j6e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "4cdad140d053ec0f299b0f7f6f90036d5b049bb74fd83779fd10178d8b1700fc";
    }

    @Override // defpackage.pua
    public final String name() {
        return "sendConversationEvent";
    }

    public final String toString() {
        return "SendConversationEventMutation(input=" + this.a + ")";
    }
}
