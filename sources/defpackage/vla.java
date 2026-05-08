package defpackage;

import defpackage.xh8;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class vla implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new b(new vla()));
    public static final tx5 b = new tx5();
    public static final ra8 c = sa8.a(new rg(9));
    public static final d2f d = new d2f(new qr0(8));

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vla vlaVar) {
            super(0);
            this.$this_inject = vlaVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vla.a(android.content.Context):void");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @o7e
    public static final class a {
        public static final b Companion = new b();
        public final String a;

        /* JADX INFO: renamed from: vla$a$a, reason: collision with other inner class name */
        @sy3
        public static final /* synthetic */ class C0457a implements sw5<a> {
            public static final C0457a a;
            private static final SerialDescriptor descriptor;

            static {
                C0457a c0457a = new C0457a();
                a = c0457a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.fcm.NotificationPreferencesTracker.NotificationDeliveryConfig", c0457a, 1);
                pluginGeneratedSerialDescriptor.k("importance", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(mve.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a(i, str);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.k(serialDescriptor, 0, mve.a, aVar.a);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a> serializer() {
                return C0457a.a;
            }
        }

        public /* synthetic */ a(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                ewa.M(i, 1, C0457a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("NotificationDeliveryConfig(importance=", this.a, ")");
        }

        public a(String str) {
            this.a = str;
        }
    }
}
