package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.oz;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class yig {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f;
    public final String a;
    public final q7 b;
    public final io7 c;
    public final String d;
    public final oz e;

    @sy3
    public static final /* synthetic */ class a implements sw5<yig> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.logging.UserActionLogPayload", aVar, 5);
            pluginGeneratedSerialDescriptor.k("pageLoadTk", false);
            pluginGeneratedSerialDescriptor.k(RumEventDeserializer.EVENT_TYPE_ACTION, false);
            pluginGeneratedSerialDescriptor.k("itemType", false);
            pluginGeneratedSerialDescriptor.k("itemUid", false);
            pluginGeneratedSerialDescriptor.k("additionalParams", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = yig.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, lazyArr[1].getValue(), lazyArr[2].getValue(), mveVar, oz.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = yig.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            q7 q7Var = null;
            io7 io7Var = null;
            String strO2 = null;
            oz ozVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    q7Var = (q7) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), q7Var);
                    i |= 2;
                } else if (iP == 2) {
                    io7Var = (io7) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), io7Var);
                    i |= 4;
                } else if (iP == 3) {
                    strO2 = ul2VarB.o(serialDescriptor, 3);
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
            return new yig(i, strO, q7Var, io7Var, strO2, ozVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            yig yigVar = (yig) obj;
            yigVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = yig.f;
            vl2VarB.x(serialDescriptor, 0, yigVar.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), yigVar.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), yigVar.c);
            vl2VarB.x(serialDescriptor, 3, yigVar.d);
            vl2VarB.y(serialDescriptor, 4, oz.a.a, yigVar.e);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<yig> serializer() {
            return a.a;
        }
    }

    static {
        ag3 ag3Var = new ag3(15);
        qt8 qt8Var = qt8.b;
        f = new Lazy[]{null, boa.E(qt8Var, ag3Var), boa.E(qt8Var, new k7(22)), null, null};
    }

    public /* synthetic */ yig(int i, String str, q7 q7Var, io7 io7Var, String str2, oz ozVar) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = q7Var;
        this.c = io7Var;
        this.d = str2;
        this.e = ozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yig)) {
            return false;
        }
        yig yigVar = (yig) obj;
        return wl7.b(this.a, yigVar.a) && this.b == yigVar.b && this.c == yigVar.c && wl7.b(this.d, yigVar.d) && wl7.b(this.e, yigVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + akb.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "UserActionLogPayload(pageLoadTk=" + this.a + ", action=" + this.b + ", itemType=" + this.c + ", itemUid=" + this.d + ", additionalParams=" + this.e + ")";
    }

    public yig(String str, q7 q7Var, io7 io7Var, String str2, oz ozVar) {
        str.getClass();
        q7Var.getClass();
        io7Var.getClass();
        str2.getClass();
        ozVar.getClass();
        this.a = str;
        this.b = q7Var;
        this.c = io7Var;
        this.d = str2;
        this.e = ozVar;
    }
}
