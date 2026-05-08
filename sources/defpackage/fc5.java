package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class fc5 {
    public final String a;
    public final hva<Object> b;

    public fc5() {
        throw null;
    }

    public fc5(int i) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        this.a = "US";
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc5)) {
            return false;
        }
        fc5 fc5Var = (fc5) obj;
        return wl7.b(this.a, fc5Var.a) && wl7.b(this.b, fc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FindCategoricalOQVTTaxonomiesInput(marketCountry=" + ((Object) this.a) + ", marketLanguage=" + this.b + ")";
    }
}
