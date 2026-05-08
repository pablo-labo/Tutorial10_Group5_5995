package defpackage;

import defpackage.gwe;
import defpackage.m7e;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p2 extends i7 implements ha8 {
    public final s98 d;
    public final String e;
    public final aa8 f;

    public p2(s98 s98Var, JsonElement jsonElement, String str) {
        super(1);
        this.d = s98Var;
        this.e = str;
        this.f = s98Var.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final <T> T B(i04<? extends T> i04Var) {
        i04Var.getClass();
        if (!(i04Var instanceof t3)) {
            return i04Var.deserialize(this);
        }
        s98 s98Var = this.d;
        aa8 aa8Var = s98Var.a;
        t3 t3Var = (t3) i04Var;
        String strC = lfb.c(s98Var, t3Var.getDescriptor());
        JsonElement jsonElementN0 = n0();
        String a = t3Var.getDescriptor().getA();
        if (!(jsonElementN0 instanceof JsonObject)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonObject.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementN0.getClass()).r());
            sb.append(" as the serialized body of ");
            sb.append(a);
            sb.append(" at element: ");
            sb.append(f0());
            throw boa.f(-1, sb.toString(), jsonElementN0.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementN0;
        JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
        String strA = null;
        if (jsonElement != null) {
            JsonPrimitive jsonPrimitiveG = la8.g(jsonElement);
            if (!(jsonPrimitiveG instanceof JsonNull)) {
                strA = jsonPrimitiveG.a();
            }
        }
        try {
            return (T) jh2.A(s98Var, strC, jsonObject, ie7.k((t3) i04Var, this, strA));
        } catch (SerializationException e) {
            String message = e.getMessage();
            message.getClass();
            throw boa.f(-1, message, jsonObject.toString());
        }
    }

    @Override // defpackage.i7
    public final boolean D(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of boolean at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            wd7 wd7Var = la8.a;
            Boolean boolB = jve.b(jsonPrimitive.a());
            if (boolB != null) {
                return boolB.booleanValue();
            }
            q0(jsonPrimitive, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "boolean", str);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean F() {
        return !(n0() instanceof JsonNull);
    }

    @Override // defpackage.i7
    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jI = la8.i(jsonPrimitive);
            Byte bValueOf = (-128 > jI || jI > 127) ? null : Byte.valueOf((byte) jI);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            q0(jsonPrimitive, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "byte", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of char at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            String strA = jsonPrimitive.a();
            strA.getClass();
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "char", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of double at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            wd7 wd7Var = la8.a;
            double d = Double.parseDouble(jsonPrimitive.a());
            aa8 aa8Var = this.d.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String string = n0().toString();
            string.getClass();
            throw boa.e(-1, boa.Q(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "double", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final int L(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        JsonElement jsonElementM0 = m0(str);
        String a = serialDescriptor.getA();
        if (jsonElementM0 instanceof JsonPrimitive) {
            return wa8.b(serialDescriptor, this.d, ((JsonPrimitive) jsonElementM0).a(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        iwc iwcVar = fwc.a;
        sb.append(iwcVar.b(JsonPrimitive.class).r());
        sb.append(", but had ");
        sb.append(iwcVar.b(jsonElementM0.getClass()).r());
        sb.append(" as the serialized body of ");
        sb.append(a);
        sb.append(" at element: ");
        sb.append(p0(str));
        throw boa.f(-1, sb.toString(), jsonElementM0.toString());
    }

    @Override // defpackage.i7
    public final float M(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of float at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            wd7 wd7Var = la8.a;
            float f = Float.parseFloat(jsonPrimitive.a());
            aa8 aa8Var = this.d.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String string = n0().toString();
            string.getClass();
            throw boa.e(-1, boa.Q(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "float", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final Decoder N(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!sue.a(serialDescriptor)) {
            ((ArrayList) this.c).add(str);
            return this;
        }
        JsonElement jsonElementM0 = m0(str);
        String a = serialDescriptor.getA();
        if (jsonElementM0 instanceof JsonPrimitive) {
            String strA = ((JsonPrimitive) jsonElementM0).a();
            s98 s98Var = this.d;
            s98Var.getClass();
            strA.getClass();
            return new ia8(new eve(strA), s98Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        iwc iwcVar = fwc.a;
        sb.append(iwcVar.b(JsonPrimitive.class).r());
        sb.append(", but had ");
        sb.append(iwcVar.b(jsonElementM0.getClass()).r());
        sb.append(" as the serialized body of ");
        sb.append(a);
        sb.append(" at element: ");
        sb.append(p0(str));
        throw boa.f(-1, sb.toString(), jsonElementM0.toString());
    }

    @Override // defpackage.i7
    public final int O(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of int at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jI = la8.i(jsonPrimitive);
            Integer numValueOf = (-2147483648L > jI || jI > 2147483647L) ? null : Integer.valueOf((int) jI);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            q0(jsonPrimitive, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "int", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final long P(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                return la8.i(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                this.q0(jsonPrimitive, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        iwc iwcVar = fwc.a;
        sb.append(iwcVar.b(JsonPrimitive.class).r());
        sb.append(", but had ");
        sb.append(iwcVar.b(jsonElementM0.getClass()).r());
        sb.append(" as the serialized body of long at element: ");
        sb.append(p0(str));
        throw boa.f(-1, sb.toString(), jsonElementM0.toString());
    }

    @Override // defpackage.i7
    public final short Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of short at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jI = la8.i(jsonPrimitive);
            Short shValueOf = (-32768 > jI || jI > 32767) ? null : Short.valueOf((short) jI);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            q0(jsonPrimitive, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            q0(jsonPrimitive, "short", str);
            throw null;
        }
    }

    @Override // defpackage.i7
    public final String R(Object obj) {
        String str = (String) obj;
        str.getClass();
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonPrimitive.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementM0.getClass()).r());
            sb.append(" as the serialized body of string at element: ");
            sb.append(p0(str));
            throw boa.f(-1, sb.toString(), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        if (!(jsonPrimitive instanceof ta8)) {
            StringBuilder sbM = akb.m("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbM.append(p0(str));
            throw boa.f(-1, sbM.toString(), n0().toString());
        }
        ta8 ta8Var = (ta8) jsonPrimitive;
        if (ta8Var.a || this.d.a.b) {
            return ta8Var.c;
        }
        StringBuilder sbM2 = akb.m("String literal for key '", str, "' should be quoted at element: ");
        sbM2.append(p0(str));
        sbM2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw boa.f(-1, sbM2.toString(), n0().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ul2
    public final v1 a() {
        return this.d.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public ul2 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        JsonElement jsonElementN0 = n0();
        m7e m7eVarF = serialDescriptor.f();
        boolean zB = wl7.b(m7eVarF, gwe.b.a);
        s98 s98Var = this.d;
        if (zB || (m7eVarF instanceof kfb)) {
            String a = serialDescriptor.getA();
            if (jsonElementN0 instanceof JsonArray) {
                return new vb8(s98Var, (JsonArray) jsonElementN0);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            iwc iwcVar = fwc.a;
            sb.append(iwcVar.b(JsonArray.class).r());
            sb.append(", but had ");
            sb.append(iwcVar.b(jsonElementN0.getClass()).r());
            sb.append(" as the serialized body of ");
            sb.append(a);
            sb.append(" at element: ");
            sb.append(f0());
            throw boa.f(-1, sb.toString(), jsonElementN0.toString());
        }
        if (!wl7.b(m7eVarF, gwe.c.a)) {
            String a2 = serialDescriptor.getA();
            if (jsonElementN0 instanceof JsonObject) {
                return new tb8(s98Var, (JsonObject) jsonElementN0, this.e, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            iwc iwcVar2 = fwc.a;
            sb2.append(iwcVar2.b(JsonObject.class).r());
            sb2.append(", but had ");
            sb2.append(iwcVar2.b(jsonElementN0.getClass()).r());
            sb2.append(" as the serialized body of ");
            sb2.append(a2);
            sb2.append(" at element: ");
            sb2.append(f0());
            throw boa.f(-1, sb2.toString(), jsonElementN0.toString());
        }
        SerialDescriptor serialDescriptorA = e5h.a(serialDescriptor.h(0), s98Var.b);
        m7e m7eVarF2 = serialDescriptorA.f();
        if (!(m7eVarF2 instanceof ymb) && !wl7.b(m7eVarF2, m7e.b.a)) {
            throw boa.c(serialDescriptorA);
        }
        String a3 = serialDescriptor.getA();
        if (jsonElementN0 instanceof JsonObject) {
            return new xb8(s98Var, (JsonObject) jsonElementN0);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        iwc iwcVar3 = fwc.a;
        sb3.append(iwcVar3.b(JsonObject.class).r());
        sb3.append(", but had ");
        sb3.append(iwcVar3.b(jsonElementN0.getClass()).r());
        sb3.append(" as the serialized body of ");
        sb3.append(a3);
        sb3.append(" at element: ");
        sb3.append(f0());
        throw boa.f(-1, sb3.toString(), jsonElementN0.toString());
    }

    @Override // defpackage.ul2
    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.ha8
    public final JsonElement i() {
        return n0();
    }

    public abstract JsonElement m0(String str);

    public final JsonElement n0() {
        JsonElement jsonElementM0;
        String str = (String) z92.Z0((ArrayList) this.c);
        return (str == null || (jsonElementM0 = m0(str)) == null) ? o0() : jsonElementM0;
    }

    public abstract JsonElement o0();

    public final String p0(String str) {
        str.getClass();
        return f0() + JwtParser.SEPARATOR_CHAR + str;
    }

    public final void q0(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw boa.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + (wve.K(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + p0(str2), n0().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder s(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (z92.Z0((ArrayList) this.c) != null) {
            return N(e0(), serialDescriptor);
        }
        return new gb8(this.d, o0(), this.e).s(serialDescriptor);
    }
}
