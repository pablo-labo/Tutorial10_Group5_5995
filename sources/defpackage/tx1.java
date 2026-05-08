package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tx1<T> {
    public final ArrayList a;
    public final long b;
    public final ah2 c;

    public tx1(ArrayList arrayList, long j, ah2 ah2Var) {
        this.a = arrayList;
        this.b = j;
        this.c = ah2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return wl7.b(this.a, tx1Var.a) && da2.c(this.b, tx1Var.b) && wl7.b(this.c, tx1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = da2.j;
        return this.c.hashCode() + ia.d(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "CardCarouselState(cardStates=" + this.a + ", pagerIndicatorBorderColor=" + da2.i(this.b) + ", cardBuilder=" + this.c + ")";
    }
}
