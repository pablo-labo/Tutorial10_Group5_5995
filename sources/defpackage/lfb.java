package defpackage;

import defpackage.m7e;
import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class lfb {
    public static final void a(r7e r7eVar, r7e r7eVar2, String str) {
        if (r7eVar instanceof atd) {
            SerialDescriptor descriptor = r7eVar2.get$$serialDesc();
            descriptor.getClass();
            if (ka2.j(descriptor).contains(str)) {
                l.i(u40.f("Sealed class '", r7eVar2.get$$serialDesc().getA(), "' cannot be serialized as base class '", ((atd) r7eVar).get$$serialDesc().getA(), "' because it has property name that conflicts with JSON class discriminator '"), str, "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public static final void b(m7e m7eVar) {
        m7eVar.getClass();
        if (m7eVar instanceof m7e.b) {
            r6.g("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (m7eVar instanceof ymb) {
            r6.g("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (m7eVar instanceof kfb) {
            r6.g("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(s98 s98Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        s98Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof z98) {
                return ((z98) annotation).discriminator();
            }
        }
        return s98Var.a.e;
    }
}
