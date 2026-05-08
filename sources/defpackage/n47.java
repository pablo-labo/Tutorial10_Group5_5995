package defpackage;

import defpackage.ko7;
import defpackage.oz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class n47 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final io7 b;
    public final List<String> c;
    public final ko7 d;
    public final oz e;

    @sy3
    public static final /* synthetic */ class a implements sw5<n47> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.logging.ImpressionLogPayload", aVar, 5);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k("itemType", false);
            pluginGeneratedSerialDescriptor.k("itemUids", false);
            pluginGeneratedSerialDescriptor.k("itemsAttributes", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = n47.f;
            return new KSerializer[]{mve.a, lazyArr[1].getValue(), lazyArr[2].getValue(), ko7.a.a, oz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = n47.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            io7 io7Var = null;
            List list = null;
            ko7 ko7Var = null;
            oz ozVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    io7Var = (io7) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), io7Var);
                    i |= 2;
                } else if (iP == 2) {
                    list = (List) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), list);
                    i |= 4;
                } else if (iP == 3) {
                    ko7Var = (ko7) ul2VarB.z(serialDescriptor, 3, ko7.a.a, ko7Var);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    ozVar = (oz) ul2VarB.z(serialDescriptor, 4, oz.a.a, ozVar);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new n47(i, strO, io7Var, list, ko7Var, ozVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            n47 n47Var = (n47) obj;
            n47Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = n47.f;
            vl2VarB.x(serialDescriptor, 0, n47Var.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), n47Var.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), n47Var.c);
            vl2VarB.y(serialDescriptor, 3, ko7.a.a, n47Var.d);
            vl2VarB.y(serialDescriptor, 4, oz.a.a, n47Var.e);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<n47> serializer() {
            return a.a;
        }
    }

    static {
        qr0 qr0Var = new qr0(3);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, boa.E(qt8Var, qr0Var), boa.E(qt8Var, new cn0(5)), null, null};
    }

    public /* synthetic */ n47(int i, String str, io7 io7Var, List list, ko7 ko7Var, oz ozVar) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = io7Var;
        this.c = list;
        this.d = ko7Var;
        this.e = ozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n47)) {
            return false;
        }
        n47 n47Var = (n47) obj;
        return wl7.b(this.a, n47Var.a) && this.b == n47Var.b && wl7.b(this.c, n47Var.c) && wl7.b(this.d, n47Var.d) && wl7.b(this.e, n47Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ia.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImpressionLogPayload(pageLoadTk=" + this.a + ", itemType=" + this.b + ", itemUids=" + this.c + ", itemsAttributes=" + this.d + ", additionalParams=" + this.e + ")";
    }

    public n47(String str, io7 io7Var, ArrayList arrayList, ko7 ko7Var, oz ozVar) {
        str.getClass();
        io7Var.getClass();
        ko7Var.getClass();
        ozVar.getClass();
        this.a = str;
        this.b = io7Var;
        this.c = arrayList;
        this.d = ko7Var;
        this.e = ozVar;
    }
}
