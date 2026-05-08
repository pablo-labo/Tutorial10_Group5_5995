package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rz implements s03 {
    public final s03 a;
    public final float b;

    public rz(float f, s03 s03Var) {
        while (s03Var instanceof rz) {
            s03Var = ((rz) s03Var).a;
            f += ((rz) s03Var).b;
        }
        this.a = s03Var;
        this.b = f;
    }

    @Override // defpackage.s03
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return this.a.equals(rzVar.a) && this.b == rzVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
