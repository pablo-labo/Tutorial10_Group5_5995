package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xb8 extends tb8 {
    public final JsonObject Z;
    public final List<String> a0;
    public final int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb8(s98 s98Var, JsonObject jsonObject) {
        super(s98Var, jsonObject, (String) null, 12);
        s98Var.getClass();
        this.Z = jsonObject;
        List<String> listZ1 = z92.z1(jsonObject.a.keySet());
        this.a0 = listZ1;
        this.b0 = listZ1.size() * 2;
        this.c0 = -1;
    }

    @Override // defpackage.tb8, defpackage.i7
    public final String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return this.a0.get(i / 2);
    }

    @Override // defpackage.tb8, defpackage.p2, defpackage.ul2
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.tb8, defpackage.p2
    public final JsonElement m0(String str) {
        str.getClass();
        return this.c0 % 2 == 0 ? la8.c(str) : (JsonElement) lc9.Y(str, this.Z);
    }

    @Override // defpackage.tb8, defpackage.p2
    public final JsonElement o0() {
        return this.Z;
    }

    @Override // defpackage.tb8, defpackage.ul2
    public final int p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.c0;
        if (i >= this.b0 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.c0 = i2;
        return i2;
    }

    @Override // defpackage.tb8
    /* JADX INFO: renamed from: r0 */
    public final JsonObject o0() {
        return this.Z;
    }
}
