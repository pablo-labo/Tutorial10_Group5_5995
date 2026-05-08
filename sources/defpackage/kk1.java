package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kk1 {
    public final String a;
    public final String b;
    public final String c;
    public final List<fo7> d;
    public final Function1<fo7, j6g> e;
    public final String f;
    public final boolean g;

    public kk1(String str, String str2, List list, Function1 function1, String str3, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = "";
        this.d = list;
        this.e = function1;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return wl7.b(this.a, kk1Var.a) && wl7.b(this.b, kk1Var.b) && wl7.b(this.c, kk1Var.c) && wl7.b(this.d, kk1Var.d) && wl7.b(this.e, kk1Var.e) && wl7.b(this.f, kk1Var.f) && this.g == kk1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + akb.d((this.e.hashCode() + ia.g(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("BottomSheetItemList(title=", this.a, ", jobKey=", this.b, ", appTk=");
        sbF.append(this.c);
        sbF.append(", itemList=");
        sbF.append(this.d);
        sbF.append(", onItemClick=");
        sbF.append(this.e);
        sbF.append(", tabName=");
        sbF.append(this.f);
        sbF.append(", isUpdateStatus=");
        return z3.o(sbF, this.g, ")");
    }
}
