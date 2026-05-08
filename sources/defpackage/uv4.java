package defpackage;

import defpackage.gwe;
import defpackage.m7e;
import io.jsonwebtoken.JwtParser;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class uv4 extends PluginGeneratedSerialDescriptor {
    public final m7e.b m;
    public final d2f n;

    public uv4(final String str, final int i) {
        super(str, null, i);
        this.m = m7e.b.a;
        this.n = new d2f(new gu5() { // from class: tv4
            @Override // defpackage.gu5
            public final Object invoke() {
                int i2 = i;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = i7e.c(str + JwtParser.SEPARATOR_CHAR + this.e[i3], gwe.d.a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.f() == m7e.b.a && this.a.equals(serialDescriptor.getA()) && wl7.b(ka2.j(this), ka2.j(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return this.m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return ((SerialDescriptor[]) this.n.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        g7e g7eVar = new g7e(this);
        int iHashCode2 = 1;
        while (g7eVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) g7eVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return z92.W0(new h7e(this), ", ", this.a.concat("("), ")", null, 56);
    }
}
