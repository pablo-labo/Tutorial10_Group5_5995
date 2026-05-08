package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h26 implements c9c<a> {

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
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(onlineActivityPreferences=" + this.a + ")";
        }
    }

    public static final class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a.a);
        }

        public final String toString() {
            return "OnlineActivityPreferences(onlineStatusPreference=" + this.a + ")";
        }
    }

    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return "OnlineStatusPreference(isEnabled=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        j26 j26Var = j26.a;
        ha.g gVar = ha.a;
        return new ena(j26Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetOnlineStatusPreference { onlineActivityPreferences { onlineStatusPreference { isEnabled } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = g9c.b;
        snaVar.getClass();
        List<vd2> list = i26.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == h26.class;
    }

    public final int hashCode() {
        return fwc.a.b(h26.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "1aeeff43370ffe65fc4dd8ca318f7af4f855a788fcf79fb28cee6680eaa54154";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetOnlineStatusPreference";
    }
}
