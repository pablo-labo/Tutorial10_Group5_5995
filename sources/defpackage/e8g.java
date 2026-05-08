package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e8g implements p4a<a> {
    public final c8g a;

    public static final class a implements p4a.a {
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
            return "Data(updateConversationReadCursor=" + this.a + ")";
        }
    }

    public static final class b {
        public final Date a;

        public b(Date date) {
            this.a = date;
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
            return "UpdateConversationReadCursor(readCursor=" + this.a + ")";
        }
    }

    public e8g(c8g c8gVar) {
        c8gVar.getClass();
        this.a = c8gVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        g8g g8gVar = g8g.a;
        ha.g gVar = ha.a;
        return new ena(g8gVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation updateConversationReadCursor($input: UpdateConversationReadCursorInput!) { updateConversationReadCursor(input: $input) { readCursor } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = q4a.d;
        snaVar.getClass();
        List<vd2> list = f8g.b;
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
        d8g.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8g) && wl7.b(this.a, ((e8g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "c5f3d618a686dde3db8b2970aa7d3421a7d78479b07f7e237bd1f05206fb0033";
    }

    @Override // defpackage.pua
    public final String name() {
        return "updateConversationReadCursor";
    }

    public final String toString() {
        return "UpdateConversationReadCursorMutation(input=" + this.a + ")";
    }
}
