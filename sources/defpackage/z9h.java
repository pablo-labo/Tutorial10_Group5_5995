package defpackage;

import com.google.android.gms.common.Feature;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z9h {
    public final vg0 a;
    public final Feature b;

    public /* synthetic */ z9h(vg0 vg0Var, Feature feature) {
        this.a = vg0Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z9h)) {
            return false;
        }
        z9h z9hVar = (z9h) obj;
        return xna.a(this.a, z9hVar.a) && xna.a(this.b, z9hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        xna.a aVar = new xna.a(this);
        aVar.a(this.a, "key");
        aVar.a(this.b, "feature");
        return aVar.toString();
    }
}
