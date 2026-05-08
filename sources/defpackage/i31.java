package defpackage;

import defpackage.sfa;

/* JADX INFO: loaded from: classes2.dex */
public final class i31 extends sfa {
    public final sfa.b a;
    public final sfa.a b;

    public i31(sfa.b bVar, sfa.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // defpackage.sfa
    public final sfa.a a() {
        return this.b;
    }

    @Override // defpackage.sfa
    public final sfa.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sfa)) {
            return false;
        }
        sfa sfaVar = (sfa) obj;
        sfa.b bVar = this.a;
        if (bVar == null) {
            if (sfaVar.b() != null) {
                return false;
            }
        } else if (!bVar.equals(sfaVar.b())) {
            return false;
        }
        sfa.a aVar = this.b;
        return aVar == null ? sfaVar.a() == null : aVar.equals(sfaVar.a());
    }

    public final int hashCode() {
        sfa.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        sfa.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
