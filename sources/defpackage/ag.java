package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ag implements p4a<c> {
    public final yf a;

    public static final class a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AddConversationLabels(conversation=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("Conversation(id=", this.a, ", __typename=", this.b, ")");
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
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "Data(addConversationLabels=" + this.a + ")";
        }
    }

    public ag(yf yfVar) {
        yfVar.getClass();
        this.a = yfVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        fg fgVar = fg.a;
        ha.g gVar = ha.a;
        return new ena(fgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation addConversationLabels($input: AddConversationLabelsInput!) { addConversationLabels(input: $input) { conversation { id __typename } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = q4a.d;
        snaVar.getClass();
        List<vd2> list = cg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        zf zfVar = zf.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        zfVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && wl7.b(this.a, ((ag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b18cfa2f2537a36dcf4c6b4c27edb1f6d6ce51802d54380a810cbf1608aadd00";
    }

    @Override // defpackage.pua
    public final String name() {
        return "addConversationLabels";
    }

    public final String toString() {
        return "AddConversationLabelsMutation(input=" + this.a + ")";
    }
}
