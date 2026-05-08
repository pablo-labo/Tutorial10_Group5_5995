package defpackage;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vo7 {
    public final String a;
    public final Function1<JsonObject, j6g> b;
    public final y03 c;

    public vo7() {
        throw null;
    }

    public vo7(String str, Function1 function1) {
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        k89Var.getClass();
        this.a = str;
        this.b = function1;
        this.c = k89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo7)) {
            return false;
        }
        vo7 vo7Var = (vo7) obj;
        return wl7.b(this.a, vo7Var.a) && wl7.b(this.b, vo7Var.b) && wl7.b(this.c, vo7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "JSONCallbackConfig(callbackId=" + this.a + ", callback=" + this.b + ", dispatcher=" + this.c + ")";
    }
}
