package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q53 implements p4a<b> {
    public final String a;
    public final String b;

    public static final class a {
        public final String a;
        public final String b;
        public final woa c;

        public a(String str, String str2, woa woaVar) {
            this.a = str;
            this.b = str2;
            this.c = woaVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("CreateOffsiteCtkDeviceIdMap(ctk=", this.a, ", externalId=", this.b, ", externalIdType=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class b implements p4a.a {
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
            return "Data(createOffsiteCtkDeviceIdMap=" + this.a + ")";
        }
    }

    public q53(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.g15
    public final ena a() {
        t53 t53Var = t53.a;
        ha.g gVar = ha.a;
        return new ena(t53Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation CreateOffsiteCtkDeviceIdMap($ctk: ID!, $aaid: ID!) { createOffsiteCtkDeviceIdMap(input: { ctk: $ctk externalId: $aaid externalIdType: AAID } ) { ctk externalId externalIdType } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = r53.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("ctk");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, this.a);
        hc8Var.u0("aaid");
        gVar.b(hc8Var, lb3Var, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q53)) {
            return false;
        }
        q53 q53Var = (q53) obj;
        return this.a.equals(q53Var.a) && wl7.b(this.b, q53Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "e74f461c5c58cea54a0077b4cb4d5a7b577ac4b4080f7c1e901abe85e6be50d0";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CreateOffsiteCtkDeviceIdMap";
    }

    public final String toString() {
        return akb.k("CreateOffsiteCtkDeviceIdMapMutation(ctk=", this.a, ", aaid=", this.b, ")");
    }
}
