package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r11 {
    public final ArrayList a;
    public final byte[] b;

    public r11(ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r11)) {
            return false;
        }
        r11 r11Var = (r11) obj;
        if (this.a.equals(r11Var.a)) {
            return Arrays.equals(this.b, r11Var instanceof r11 ? r11Var.b : r11Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
