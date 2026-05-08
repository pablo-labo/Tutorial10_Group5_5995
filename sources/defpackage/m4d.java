package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class m4d {
    public final Function1<et7, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public m4d(Function1<? super et7, j6g> function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4d) && this.a.equals(((m4d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestNavigateToSettingsEvent(callback=" + this.a + ")";
    }
}
