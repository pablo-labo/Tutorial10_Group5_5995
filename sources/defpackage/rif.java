package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rif {
    public final foe a;
    public final foe b;
    public final foe c;
    public final foe d;

    public rif(foe foeVar, foe foeVar2, foe foeVar3, foe foeVar4) {
        this.a = foeVar;
        this.b = foeVar2;
        this.c = foeVar3;
        this.d = foeVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rif)) {
            return false;
        }
        rif rifVar = (rif) obj;
        return wl7.b(this.a, rifVar.a) && wl7.b(this.b, rifVar.b) && wl7.b(this.c, rifVar.c) && wl7.b(this.d, rifVar.d);
    }

    public final int hashCode() {
        foe foeVar = this.a;
        int iHashCode = (foeVar != null ? foeVar.hashCode() : 0) * 31;
        foe foeVar2 = this.b;
        int iHashCode2 = (iHashCode + (foeVar2 != null ? foeVar2.hashCode() : 0)) * 31;
        foe foeVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (foeVar3 != null ? foeVar3.hashCode() : 0)) * 31;
        foe foeVar4 = this.d;
        return iHashCode3 + (foeVar4 != null ? foeVar4.hashCode() : 0);
    }

    public /* synthetic */ rif(foe foeVar, int i) {
        this((i & 1) != 0 ? null : foeVar, null, null, null);
    }

    public rif() {
        this(null, 15);
    }
}
