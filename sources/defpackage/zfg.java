package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zfg {
    public final aoe a;

    public zfg(aoe aoeVar) {
        this.a = aoeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfg) && this.a == ((zfg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateSourcingElectionInput(sourcingElection=" + this.a + ")";
    }
}
