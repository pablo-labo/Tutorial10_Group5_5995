package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ta8 extends JsonPrimitive {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public ta8(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        obj.getClass();
        this.a = z;
        this.b = serialDescriptor;
        this.c = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        l5.q("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String a() {
        return this.c;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta8.class != obj.getClass()) {
            return false;
        }
        ta8 ta8Var = (ta8) obj;
        return this.a == ta8Var.a && wl7.b(this.c, ta8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        jve.a(sb, str);
        return sb.toString();
    }
}
