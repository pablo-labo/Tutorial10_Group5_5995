package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g66 implements c9c<a> {

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
            return Integer.hashCode(bVar.a);
        }

        public final String toString() {
            return "Data(getUnreadConversationCount=" + this.a + ")";
        }
    }

    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.d(this.a, "GetUnreadConversationCount(unreadConversationCount=", ")");
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        i66 i66Var = i66.a;
        ha.g gVar = ha.a;
        return new ena(i66Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetUnreadConversationCount { getUnreadConversationCount(input: { conversationFilter: { excludedLabels: [\"JS_MSG_FOLDER/ARCHIVE\",\"JS_MSG_FOLDER/SPAM\"] }  } ) { unreadConversationCount } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = h66.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g66.class;
    }

    public final int hashCode() {
        return fwc.a.b(g66.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "9566866b19c54c68d29addac9b413ef049ad9b2befc3b4b72680a2d4f4a98c93";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetUnreadConversationCount";
    }
}
