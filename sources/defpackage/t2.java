package defpackage;

import defpackage.gwe;
import defpackage.m7e;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t2 extends dl2 implements pa8 {
    public final s98 b;
    public final Function1<JsonElement, j6g> c;
    public final aa8 d;
    public String e;
    public String f;

    public t2(s98 s98Var, Function1 function1) {
        super(1);
        this.b = s98Var;
        this.c = function1;
        this.d = s98Var.a;
    }

    @Override // defpackage.dl2
    public String F(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        s98 s98Var = this.b;
        s98Var.getClass();
        wa8.d(s98Var, serialDescriptor);
        return serialDescriptor.e(i);
    }

    @Override // defpackage.dl2
    public final void G(Object obj, boolean z) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.dl2
    public final void H(Object obj, byte b) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Byte.valueOf(b)));
    }

    @Override // defpackage.dl2
    public final void I(Object obj, char c) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.c(String.valueOf(c)));
    }

    @Override // defpackage.dl2
    public final void J(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Double.valueOf(d)));
        this.d.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d);
        String string = W().toString();
        string.getClass();
        throw new JsonEncodingException(boa.Q(dValueOf, str, string));
    }

    @Override // defpackage.dl2
    public final void K(Object obj, SerialDescriptor serialDescriptor, int i) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        X(str, la8.c(serialDescriptor.e(i)));
    }

    @Override // defpackage.dl2
    public final void L(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Float.valueOf(f)));
        this.d.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        String string = W().toString();
        string.getClass();
        throw new JsonEncodingException(boa.Q(fValueOf, str, string));
    }

    @Override // defpackage.dl2
    public final Encoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (sue.a(serialDescriptor)) {
            return new s2(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(la8.a)) {
            return new r2(this, str, serialDescriptor);
        }
        ((ArrayList) this.a).add(str);
        return this;
    }

    @Override // defpackage.dl2
    public final void N(int i, Object obj) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Integer.valueOf(i)));
    }

    @Override // defpackage.dl2
    public final void O(Object obj, long j) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Long.valueOf(j)));
    }

    @Override // defpackage.dl2
    public final void P(Object obj, short s) {
        String str = (String) obj;
        str.getClass();
        X(str, la8.b(Short.valueOf(s)));
    }

    @Override // defpackage.dl2
    public final void Q(Object obj, String str) {
        String str2 = (String) obj;
        str2.getClass();
        str.getClass();
        X(str2, la8.c(str));
    }

    @Override // defpackage.dl2
    public final void R(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.c.invoke(W());
    }

    public abstract JsonElement W();

    public abstract void X(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.encoding.Encoder
    public final v1 a() {
        return this.b.b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final vl2 b(SerialDescriptor serialDescriptor) {
        t2 wb8Var;
        serialDescriptor.getClass();
        Function1 q2Var = z92.Z0((ArrayList) this.a) == null ? this.c : new q2(this, 0);
        m7e m7eVarF = serialDescriptor.f();
        boolean zB = wl7.b(m7eVarF, gwe.b.a);
        s98 s98Var = this.b;
        if (zB || (m7eVarF instanceof kfb)) {
            wb8Var = new wb8(s98Var, q2Var);
        } else if (wl7.b(m7eVarF, gwe.c.a)) {
            SerialDescriptor serialDescriptorA = e5h.a(serialDescriptor.h(0), s98Var.b);
            m7e m7eVarF2 = serialDescriptorA.f();
            if (!(m7eVarF2 instanceof ymb) && !wl7.b(m7eVarF2, m7e.b.a)) {
                throw boa.c(serialDescriptorA);
            }
            q2Var.getClass();
            yb8 yb8Var = new yb8(s98Var, q2Var);
            yb8Var.i = true;
            wb8Var = yb8Var;
        } else {
            wb8Var = new ub8(s98Var, q2Var);
        }
        String str = this.e;
        if (str != null) {
            if (wb8Var instanceof yb8) {
                yb8 yb8Var2 = (yb8) wb8Var;
                yb8Var2.X("key", la8.c(str));
                String a = this.f;
                if (a == null) {
                    a = serialDescriptor.getA();
                }
                yb8Var2.X("value", la8.c(a));
            } else {
                String a2 = this.f;
                if (a2 == null) {
                    a2 = serialDescriptor.getA();
                }
                wb8Var.X(str, la8.c(a2));
            }
            this.e = null;
            this.f = null;
        }
        return wb8Var;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (z92.Z0((ArrayList) this.a) == null) {
            return new hb8(this.b, this.c).i(serialDescriptor);
        }
        if (this.e != null) {
            this.f = serialDescriptor.getA();
        }
        return M(U(), serialDescriptor);
    }

    @Override // defpackage.vl2
    public final boolean m(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.d.getClass();
        return false;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n() {
        String str = (String) z92.Z0((ArrayList) this.a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            X(str, JsonNull.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void t(defpackage.r7e<? super T> r5, T r6) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = defpackage.z92.Z0(r0)
            s98 r1 = r4.b
            if (r0 != 0) goto L34
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            v1 r2 = r1.b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = defpackage.e5h.a(r0, r2)
            m7e r2 = r0.f()
            boolean r2 = r2 instanceof defpackage.ymb
            if (r2 != 0) goto L29
            m7e r0 = r0.f()
            m7e$b r2 = m7e.b.a
            if (r0 != r2) goto L34
        L29:
            hb8 r0 = new hb8
            kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonElement, j6g> r4 = r4.c
            r0.<init>(r1, r4)
            r0.t(r5, r6)
            return
        L34:
            aa8 r0 = r1.a
            boolean r2 = r5 instanceof defpackage.t3
            z52 r0 = r0.g
            if (r2 == 0) goto L41
            z52 r3 = defpackage.z52.a
            if (r0 == r3) goto L73
            goto L6a
        L41:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L73
            r3 = 1
            if (r0 == r3) goto L52
            r1 = 2
            if (r0 != r1) goto L4e
            goto L73
        L4e:
            defpackage.l.g()
            return
        L52:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            m7e r0 = r0.f()
            gwe$a r3 = gwe.a.a
            boolean r3 = defpackage.wl7.b(r0, r3)
            if (r3 != 0) goto L6a
            gwe$d r3 = gwe.d.a
            boolean r0 = defpackage.wl7.b(r0, r3)
            if (r0 == 0) goto L73
        L6a:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getDescriptor()
            java.lang.String r0 = defpackage.lfb.c(r1, r0)
            goto L74
        L73:
            r0 = 0
        L74:
            if (r2 == 0) goto L9d
            r1 = r5
            t3 r1 = (defpackage.t3) r1
            if (r6 == 0) goto L91
            r7e r1 = defpackage.ie7.l(r1, r4, r6)
            if (r0 == 0) goto L8f
            defpackage.lfb.a(r5, r1, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getDescriptor()
            m7e r5 = r5.f()
            defpackage.lfb.b(r5)
        L8f:
            r5 = r1
            goto L9d
        L91:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r1.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            defpackage.o6.m(r6, r4, r5)
            return
        L9d:
            if (r0 == 0) goto Lab
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r1 = r1.getA()
            r4.e = r0
            r4.f = r1
        Lab:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2.t(r7e, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void v() {
    }
}
