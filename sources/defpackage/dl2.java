package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class dl2 implements Encoder, vl2 {
    public Object a;

    public dl2(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(int i) {
        N(i, U());
    }

    @Override // defpackage.vl2
    public void C(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        J(T(serialDescriptor, i), d);
    }

    @Override // defpackage.vl2
    public void D(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        O(T(serialDescriptor, i), j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void E(String str) {
        str.getClass();
        Q(U(), str);
    }

    public abstract String F(SerialDescriptor serialDescriptor, int i);

    public abstract void G(Object obj, boolean z);

    public abstract void H(Object obj, byte b);

    public abstract void I(Object obj, char c);

    public abstract void J(Object obj, double d);

    public abstract void K(Object obj, SerialDescriptor serialDescriptor, int i);

    public abstract void L(Object obj, float f);

    public abstract Encoder M(Object obj, SerialDescriptor serialDescriptor);

    public abstract void N(int i, Object obj);

    public abstract void O(Object obj, long j);

    public abstract void P(Object obj, short s);

    public abstract void Q(Object obj, String str);

    public abstract void R(SerialDescriptor serialDescriptor);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean S(defpackage.qd6 r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.Object> r6 = r6.a
            if (r6 != 0) goto L5
            goto L24
        L5:
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L2e
            java.lang.Object r3 = r6.get(r2)
            boolean r4 = r3 instanceof defpackage.x20
            if (r4 == 0) goto L18
            if (r3 == r7) goto L24
            goto L26
        L18:
            boolean r4 = r3 instanceof defpackage.qd6
            if (r4 == 0) goto L29
            qd6 r3 = (defpackage.qd6) r3
            boolean r3 = r5.S(r3, r7)
            if (r3 == 0) goto L26
        L24:
            r5 = 1
            return r5
        L26:
            int r2 = r2 + 1
            goto Lb
        L29:
            java.lang.String r5 = "Unexpected child source info "
            defpackage.ja.i(r3, r5)
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl2.S(qd6, java.lang.Object):boolean");
    }

    public String T(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strF = F(serialDescriptor, i);
        strF.getClass();
        return strF;
    }

    public Object U() {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(u63.J(arrayList));
    }

    public void V(qd6 qd6Var, Object obj) {
        if (qd6Var == null || obj == null) {
            return;
        }
        S(qd6Var, obj);
    }

    @Override // defpackage.vl2
    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!((ArrayList) this.a).isEmpty()) {
            U();
        }
        R(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void d(double d) {
        J(U(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(byte b) {
        H(U(), b);
    }

    @Override // defpackage.vl2
    public void f(wmb wmbVar, int i, byte b) {
        wmbVar.getClass();
        H(T(wmbVar, i), b);
    }

    @Override // defpackage.vl2
    public void g(wmb wmbVar, int i, short s) {
        wmbVar.getClass();
        P(T(wmbVar, i), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        K(U(), serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(long j) {
        O(U(), j);
    }

    @Override // defpackage.vl2
    public void k(SerialDescriptor serialDescriptor, int i, r7e r7eVar, Object obj) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        ((ArrayList) this.a).add(T(serialDescriptor, i));
        if (r7eVar.getDescriptor().b()) {
            t(r7eVar, obj);
        } else if (obj == null) {
            n();
        } else {
            v();
            t(r7eVar, obj);
        }
    }

    @Override // defpackage.vl2
    public Encoder l(wmb wmbVar, int i) {
        wmbVar.getClass();
        return M(T(wmbVar, i), wmbVar.h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(short s) {
        P(U(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void p(boolean z) {
        G(U(), z);
    }

    @Override // defpackage.vl2
    public void q(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        L(T(serialDescriptor, i), f);
    }

    @Override // defpackage.vl2
    public void r(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        N(i2, T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(float f) {
        L(U(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(char c) {
        I(U(), c);
    }

    @Override // defpackage.vl2
    public void w(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        G(T(serialDescriptor, i), z);
    }

    @Override // defpackage.vl2
    public void x(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        Q(T(serialDescriptor, i), str);
    }

    @Override // defpackage.vl2
    public void y(SerialDescriptor serialDescriptor, int i, r7e r7eVar, Object obj) {
        serialDescriptor.getClass();
        r7eVar.getClass();
        ((ArrayList) this.a).add(T(serialDescriptor, i));
        t(r7eVar, obj);
    }

    @Override // defpackage.vl2
    public void z(wmb wmbVar, int i, char c) {
        wmbVar.getClass();
        I(T(wmbVar, i), c);
    }
}
