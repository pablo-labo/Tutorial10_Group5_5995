package defpackage;

import defpackage.hva;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ow2 {
    public final hva<Boolean> a;
    public final hva<List<Date>> b;
    public final hva<Boolean> c;

    public ow2() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow2)) {
            return false;
        }
        ow2 ow2Var = (ow2) obj;
        return wl7.b(this.a, ow2Var.a) && wl7.b(this.b, ow2Var.b) && wl7.b(this.c, ow2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("ConversationEventRemindersInput(enabled=", this.a, ", reminderTimes=", this.b, ", suppress="), this.c, ")");
    }
}
