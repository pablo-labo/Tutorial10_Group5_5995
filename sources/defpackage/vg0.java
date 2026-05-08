package defpackage;

import defpackage.vf0;
import java.util.Arrays;
import vf0.d;

/* JADX INFO: loaded from: classes2.dex */
public final class vg0<O extends vf0.d> {
    public final int a;
    public final vf0 b;
    public final vf0.d c;
    public final String d;

    public vg0(vf0 vf0Var, vf0.d dVar, String str) {
        this.b = vf0Var;
        this.c = dVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{vf0Var, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return xna.a(this.b, vg0Var.b) && xna.a(this.c, vg0Var.c) && xna.a(this.d, vg0Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
