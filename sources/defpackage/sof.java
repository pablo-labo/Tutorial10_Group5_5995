package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sof {
    public final String a;
    public final vmf b;
    public final Integer c;
    public final String d;
    public final Function1<s5e, j6g> e;

    public sof(String str, vmf vmfVar, Integer num, Function1 function1, int i) {
        str = (i & 1) != 0 ? null : str;
        vmfVar = (i & 2) != 0 ? vmf.b : vmfVar;
        num = (i & 4) != 0 ? null : num;
        String str2 = (i & 8) != 0 ? "UIPTopNavTitleBlock" : "InboxHeader";
        function1 = (i & 16) != 0 ? null : function1;
        this.a = str;
        this.b = vmfVar;
        this.c = num;
        this.d = str2;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sof)) {
            return false;
        }
        sof sofVar = (sof) obj;
        return wl7.b(this.a, sofVar.a) && this.b == sofVar.b && wl7.b(this.c, sofVar.c) && wl7.b(this.d, sofVar.d) && wl7.b(this.e, sofVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function1<s5e, j6g> function1 = this.e;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "TopNavTitleBlock(title=" + this.a + ", alignment=" + this.b + ", titleIcon=" + this.c + ", testTag=" + this.d + ", semantics=" + this.e + ")";
    }
}
