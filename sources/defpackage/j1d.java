package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j1d implements p4a<a> {
    public final String a;

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
            return "Data(removeOffsiteCtkDeviceIdMap=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return l5.m("RemoveOffsiteCtkDeviceIdMap(externalId=", this.a, ")");
        }
    }

    public j1d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.g15
    public final ena a() {
        l1d l1dVar = l1d.a;
        ha.g gVar = ha.a;
        return new ena(l1dVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation RemoveOffsiteCtkDeviceIdMap($aaid: ID!) { removeOffsiteCtkDeviceIdMap(input: { externalId: $aaid } ) { externalId } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = k1d.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("aaid");
        ha.a.b(hc8Var, lb3Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1d) && wl7.b(this.a, ((j1d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "5cd31acb07f00e900904c3e1fc3615e9601bccc758e27af3bf6e4c1e95fe7007";
    }

    @Override // defpackage.pua
    public final String name() {
        return "RemoveOffsiteCtkDeviceIdMap";
    }

    public final String toString() {
        return l5.m("RemoveOffsiteCtkDeviceIdMapMutation(aaid=", this.a, ")");
    }
}
