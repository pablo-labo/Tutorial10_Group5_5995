package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class bv2 {
    public final hva.c a;

    public bv2(hva.c cVar) {
        ry2 ry2Var = ry2.HQM_DRADIS;
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv2)) {
            return false;
        }
        ry2 ry2Var = ry2.HQM_DRADIS;
        return this.a.equals(((bv2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ry2.HQM_DRADIS.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationContextAndScopeInput(context=" + ry2.HQM_DRADIS + ", scope=" + this.a + ")";
    }
}
