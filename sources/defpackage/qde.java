package defpackage;

import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class qde {
    public final int a;

    public /* synthetic */ qde(int i) {
        this.a = i;
    }

    public static final SharedObject a(int i, ohd ohdVar) {
        SharedObject sharedObject;
        b49 b49Var = ohdVar.g;
        synchronized (b49Var) {
            Pair pair = (Pair) ((LinkedHashMap) b49Var.c).get(new qde(i));
            sharedObject = pair != null ? (SharedObject) pair.d() : null;
        }
        return sharedObject;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qde) {
            return this.a == ((qde) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return bg.d(this.a, "SharedObjectId(value=", ")");
    }
}
