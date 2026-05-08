package defpackage;

import defpackage.gwe;
import defpackage.m7e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e5h {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, v1 v1Var) {
        SerialDescriptor serialDescriptorA;
        KSerializer kSerializerX;
        serialDescriptor.getClass();
        v1Var.getClass();
        if (!wl7.b(serialDescriptor.f(), m7e.a.a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.h(0), v1Var) : serialDescriptor;
        }
        yd8 yd8VarM = nn2.m(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (yd8VarM != null && (kSerializerX = v1Var.X(yd8VarM, zr4.a)) != null) {
            descriptor = kSerializerX.get$$serialDesc();
        }
        return (descriptor == null || (serialDescriptorA = a(descriptor, v1Var)) == null) ? serialDescriptor : serialDescriptorA;
    }

    public static final d5h b(s98 s98Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        m7e m7eVarF = serialDescriptor.f();
        if (m7eVarF instanceof kfb) {
            return d5h.d;
        }
        if (wl7.b(m7eVarF, gwe.b.a)) {
            return d5h.b;
        }
        if (!wl7.b(m7eVarF, gwe.c.a)) {
            return d5h.a;
        }
        SerialDescriptor serialDescriptorA = a(serialDescriptor.h(0), s98Var.b);
        m7e m7eVarF2 = serialDescriptorA.f();
        if ((m7eVarF2 instanceof ymb) || wl7.b(m7eVarF2, m7e.b.a)) {
            return d5h.c;
        }
        throw boa.c(serialDescriptorA);
    }
}
