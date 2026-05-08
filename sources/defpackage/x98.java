package defpackage;

import defpackage.gwe;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class x98 implements KSerializer<JsonArray> {
    public static final x98 a = new x98();
    public static final a b = a.b;

    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ ft0 a;

        public a() {
            SerialDescriptor descriptor = na8.a.get$$serialDesc();
            descriptor.getClass();
            this.a = new ft0(descriptor, 0);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int c(String str) {
            str.getClass();
            return this.a.c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: d */
        public final int getC() {
            this.a.getClass();
            return 1;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String e(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final m7e f() {
            this.a.getClass();
            return gwe.b.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> g(int i) {
            this.a.g(i);
            return zr4.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List<Annotation> getAnnotations() {
            this.a.getClass();
            return zr4.a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final SerialDescriptor h(int i) {
            return this.a.h(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: i */
        public final String getA() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean isInline() {
            this.a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean j(int i) {
            this.a.j(i);
            return false;
        }
    }

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        ie7.g(decoder);
        return new JsonArray((List) new gt0(na8.a, 0).e(decoder));
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        ie7.f(encoder);
        na8 na8Var = na8.a;
        SerialDescriptor descriptor = na8Var.get$$serialDesc();
        descriptor.getClass();
        ft0 ft0Var = new ft0(descriptor, 0);
        int size = jsonArray.size();
        vl2 vl2VarB = encoder.B(ft0Var);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            vl2VarB.y(ft0Var, i, na8Var, it.next());
        }
        vl2VarB.c(ft0Var);
    }
}
