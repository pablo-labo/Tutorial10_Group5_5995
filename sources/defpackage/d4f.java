package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class d4f extends e4f {
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> h = boa.E(qt8.b, new j7(17));

    public static final class a {
        public final KSerializer<d4f> serializer() {
            return (KSerializer) d4f.h.getValue();
        }
    }

    public static final /* synthetic */ void a(d4f d4fVar, vl2 vl2Var, SerialDescriptor serialDescriptor) {
        if (vl2Var.m(serialDescriptor) || d4fVar.a != null) {
            vl2Var.k(serialDescriptor, 0, mve.a, d4fVar.a);
        }
        if (vl2Var.m(serialDescriptor) || d4fVar.b != null) {
            vl2Var.k(serialDescriptor, 1, ni1.a, d4fVar.b);
        }
        if (vl2Var.m(serialDescriptor) || d4fVar.c != null) {
            vl2Var.k(serialDescriptor, 2, mve.a, d4fVar.c);
        }
        if (vl2Var.m(serialDescriptor) || d4fVar.e != null) {
            vl2Var.k(serialDescriptor, 3, mve.a, d4fVar.e);
        }
        if (!vl2Var.m(serialDescriptor) && d4fVar.f == null) {
            return;
        }
        vl2Var.k(serialDescriptor, 4, mve.a, d4fVar.f);
    }
}
