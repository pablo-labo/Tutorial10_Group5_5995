package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class vb8 extends p2 {
    public final JsonArray V;
    public final int W;
    public int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb8(s98 s98Var, JsonArray jsonArray) {
        super(s98Var, jsonArray, null);
        s98Var.getClass();
        this.V = jsonArray;
        this.W = jsonArray.a.size();
        this.X = -1;
    }

    @Override // defpackage.i7
    public final String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.p2
    public final JsonElement m0(String str) {
        str.getClass();
        return this.V.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.p2
    public final JsonElement o0() {
        return this.V;
    }

    @Override // defpackage.ul2
    public final int p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.X;
        if (i >= this.W - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.X = i2;
        return i2;
    }
}
