package defpackage;

import defpackage.ey8;

/* JADX INFO: loaded from: classes2.dex */
public final class ab8 extends ka8 {
    public final ey8<String, ka8> a;

    public ab8() {
        ey8.a aVar = ey8.a;
        this.a = new ey8<>(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ab8) && ((ab8) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(String str, ka8 ka8Var) {
        if (ka8Var == null) {
            ka8Var = xa8.a;
        }
        this.a.put(str, ka8Var);
    }

    public final void j(Number number, String str) {
        i(str, number == null ? xa8.a : new fb8(number));
    }

    public final void k(String str, Boolean bool) {
        i(str, bool == null ? xa8.a : new fb8(bool));
    }

    public final void l(String str, String str2) {
        i(str, str2 == null ? xa8.a : new fb8(str2));
    }

    public final ka8 m(String str) {
        return this.a.get(str);
    }
}
