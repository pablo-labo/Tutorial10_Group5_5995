package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class q4d {
    public final Function1<et7, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public q4d(Function1<? super et7, j6g> function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4d) && wl7.b(this.a, ((q4d) obj).a);
    }

    public final int hashCode() {
        Function1<et7, j6g> function1 = this.a;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    public final String toString() {
        return "RequestSystemPushAuthEvent(callback=" + this.a + ")";
    }
}
