package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class chc implements oec {
    public final e9a a;
    public final String b;

    public chc(e9a e9aVar, String str) {
        this.a = e9aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chc)) {
            return false;
        }
        chc chcVar = (chc) obj;
        return this.a.equals(chcVar.a) && this.b.equals(chcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        return aq1.a(new Pair("nativeContext", this.a.toBundle()), new Pair("homePageUrl", this.b));
    }

    public final String toString() {
        return "RNSearchProps(nativeContext=" + this.a + ", homePageUrl=" + this.b + ")";
    }
}
