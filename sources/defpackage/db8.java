package defpackage;

import defpackage.gwe;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class db8 implements KSerializer<JsonObject> {
    public static final db8 a = new db8();
    public static final a b = a.b;

    public static final class a implements SerialDescriptor {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ ay8 a = qp1.a(mve.a, na8.a).c;

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
            return 2;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String e(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final m7e f() {
            this.a.getClass();
            return gwe.c.a;
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
        return new JsonObject(qp1.a(mve.a, na8.a).deserialize(decoder));
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        jsonObject.getClass();
        ie7.f(encoder);
        qp1.a(mve.a, na8.a).serialize(encoder, jsonObject);
    }
}
