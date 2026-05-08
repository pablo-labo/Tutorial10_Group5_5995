package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class d7 implements oec {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public d7(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return wl7.b(this.a, d7Var.a) && wl7.b(this.b, d7Var.b) && wl7.b(this.c, d7Var.c) && wl7.b(this.d, d7Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        return aq1.a(new Pair("starterMessage", this.a), new Pair("agentType", this.b), new Pair("conversationId", this.c), new Pair("sourceContext", this.d));
    }

    public final String toString() {
        return z3.n(u40.f("AceConversationRNProps(starterMessage=", this.a, ", agentType=", this.b, ", conversationId="), this.c, ", sourceContext=", this.d, ")");
    }
}
