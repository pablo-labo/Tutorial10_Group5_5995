package defpackage;

import com.linecorp.linesdk.LineIdToken;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eo7 {
    public final qi7 a;
    public final List<tpd> b;
    public final LineIdToken c;

    public eo7(qi7 qi7Var, List<tpd> list, LineIdToken lineIdToken) {
        this.a = qi7Var;
        this.b = Collections.unmodifiableList(list);
        this.c = lineIdToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eo7.class != obj.getClass()) {
            return false;
        }
        eo7 eo7Var = (eo7) obj;
        if (!this.a.equals(eo7Var.a) || !this.b.equals(eo7Var.b)) {
            return false;
        }
        LineIdToken lineIdToken = eo7Var.c;
        LineIdToken lineIdToken2 = this.c;
        return lineIdToken2 != null ? lineIdToken2.equals(lineIdToken) : lineIdToken == null;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        LineIdToken lineIdToken = this.c;
        return iHashCode + (lineIdToken != null ? lineIdToken.hashCode() : 0);
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=#####, scopes=" + this.b + ", idToken=" + this.c + '}';
    }
}
