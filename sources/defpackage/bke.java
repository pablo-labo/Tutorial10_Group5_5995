package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bke {
    public final Function1<th7, lh7> a;
    public final jf5<lh7> b;

    /* JADX WARN: Multi-variable type inference failed */
    public bke(Function1<? super th7, lh7> function1, jf5<lh7> jf5Var) {
        this.a = function1;
        this.b = jf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bke)) {
            return false;
        }
        bke bkeVar = (bke) obj;
        return this.a.equals(bkeVar.a) && this.b.equals(bkeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
