package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class spa {
    public final int a;
    public final int b;
    public final Intent c;

    public spa(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spa)) {
            return false;
        }
        spa spaVar = (spa) obj;
        return this.a == spaVar.a && this.b == spaVar.b && wl7.b(this.c, spaVar.c);
    }

    public final int hashCode() {
        int iC = w40.c(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return iC + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        StringBuilder sbF = uz.f("OnActivityResultPayload(requestCode=", this.a, ", resultCode=", this.b, ", data=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }
}
