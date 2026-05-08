package defpackage;

import com.wlproctor.common.model.TestBucket;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class vob {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] d;
    public final String a;
    public final Map<String, TestBucket> b;
    public final Map<String, TestBucket> c;

    @sy3
    public static final /* synthetic */ class a implements sw5<vob> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.loader.jsonmodels.ProctorGroupsResultData", aVar, 3);
            pluginGeneratedSerialDescriptor.k("matrixVersion", false);
            pluginGeneratedSerialDescriptor.k("buckets", false);
            pluginGeneratedSerialDescriptor.k("dynamicBuckets", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = vob.d;
            return new KSerializer[]{mve.a, lazyArr[1].getValue(), lazyArr[2].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = vob.d;
            boolean z = true;
            int i = 0;
            String strO = null;
            Map map = null;
            Map map2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    map = (Map) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), map);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    map2 = (Map) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), map2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new vob(i, strO, map, map2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            vob vobVar = (vob) obj;
            vobVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = vob.d;
            vl2VarB.x(serialDescriptor, 0, vobVar.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), vobVar.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), vobVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<vob> serializer() {
            return a.a;
        }
    }

    static {
        ao0 ao0Var = new ao0(13);
        qt8 qt8Var = qt8.b;
        d = new Lazy[]{null, boa.E(qt8Var, ao0Var), boa.E(qt8Var, new bo0(17))};
    }

    public /* synthetic */ vob(int i, String str, Map map, Map map2) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vob.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + k20.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProctorGroupsResultData(matrixVersion=");
        sb.append(this.a);
        sb.append(", buckets=");
        sb.append(this.b);
        sb.append(", dynamicBuckets=");
        return b0.k(sb, this.c, ")");
    }

    public vob(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = str;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
    }
}
