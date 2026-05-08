package defpackage;

import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class i7 implements Decoder, ul2 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public i7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new ArrayList();
                break;
        }
    }

    @Override // defpackage.ul2
    public short A(wmb wmbVar, int i) {
        wmbVar.getClass();
        return Q(Z(wmbVar, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String C() {
        return R(e0());
    }

    public abstract boolean D(Object obj);

    @Override // defpackage.ul2
    public boolean E(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return D(Z(serialDescriptor, i));
    }

    @Override // defpackage.ul2
    public double G(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return K(Z(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte H() {
        return I(e0());
    }

    public abstract byte I(Object obj);

    public abstract char J(Object obj);

    public abstract double K(Object obj);

    public abstract int L(Object obj, SerialDescriptor serialDescriptor);

    public abstract float M(Object obj);

    public abstract Decoder N(Object obj, SerialDescriptor serialDescriptor);

    public abstract int O(Object obj);

    public abstract long P(Object obj);

    public abstract short Q(Object obj);

    public abstract String R(Object obj);

    public String S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.e(i);
    }

    public abstract void T();

    public abstract View U();

    public String V() {
        return (String) this.c;
    }

    public abstract f W();

    public abstract MenuInflater X();

    public abstract CharSequence Y();

    public String Z(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strS = S(serialDescriptor, i);
        strS.getClass();
        return strS;
    }

    public abstract CharSequence a0();

    public abstract void b0();

    public abstract boolean c0();

    @Override // defpackage.ul2
    public Decoder d(wmb wmbVar, int i) {
        wmbVar.getClass();
        return N(Z(wmbVar, i), wmbVar.h(i));
    }

    public i7 d0() {
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int e(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return L(e0(), serialDescriptor);
    }

    public Object e0() {
        ArrayList arrayList = (ArrayList) this.c;
        Object objRemove = arrayList.remove(u63.J(arrayList));
        this.b = true;
        return objRemove;
    }

    @Override // defpackage.ul2
    public long f(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return P(Z(serialDescriptor, i));
    }

    public String f0() {
        ArrayList arrayList = (ArrayList) this.c;
        return arrayList.isEmpty() ? "$" : z92.W0(arrayList, ".", "$.", null, null, 60);
    }

    @Override // defpackage.ul2
    public char g(wmb wmbVar, int i) {
        wmbVar.getClass();
        return J(Z(wmbVar, i));
    }

    public abstract void g0(View view);

    @Override // defpackage.ul2
    public Object h(SerialDescriptor serialDescriptor, int i, i04 i04Var, Object obj) {
        serialDescriptor.getClass();
        i04Var.getClass();
        ((ArrayList) this.c).add(Z(serialDescriptor, i));
        Object objB = (i04Var.getDescriptor().b() || F()) ? B(i04Var) : null;
        if (!this.b) {
            e0();
        }
        this.b = false;
        return objB;
    }

    public abstract void h0(int i);

    public abstract void i0(CharSequence charSequence);

    @Override // defpackage.ul2
    public byte j(wmb wmbVar, int i) {
        wmbVar.getClass();
        return I(Z(wmbVar, i));
    }

    public abstract void j0(int i);

    @Override // kotlinx.serialization.encoding.Decoder
    public int k() {
        return O(e0());
    }

    public abstract void k0(CharSequence charSequence);

    public abstract void l0(boolean z);

    @Override // defpackage.ul2
    public int m(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return O(Z(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long n() {
        return P(e0());
    }

    @Override // defpackage.ul2
    public String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return R(Z(serialDescriptor, i));
    }

    public Integer r(i7 i7Var) {
        i7Var.getClass();
        hb9 hb9Var = zsg.a;
        if (this == i7Var) {
            return 0;
        }
        hb9 hb9Var2 = zsg.a;
        Integer num = (Integer) hb9Var2.get(this);
        Integer num2 = (Integer) hb9Var2.get(i7Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short t() {
        return Q(e0());
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return V();
            default:
                return super.toString();
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float u() {
        return M(e0());
    }

    @Override // defpackage.ul2
    public float v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return M(Z(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double w() {
        return K(e0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean x() {
        return D(e0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char y() {
        return J(e0());
    }

    @Override // defpackage.ul2
    public Object z(SerialDescriptor serialDescriptor, int i, i04 i04Var, Object obj) {
        serialDescriptor.getClass();
        i04Var.getClass();
        ((ArrayList) this.c).add(Z(serialDescriptor, i));
        Object objB = B(i04Var);
        if (!this.b) {
            e0();
        }
        this.b = false;
        return objB;
    }

    public i7(String str, boolean z) {
        this.a = 2;
        this.c = str;
        this.b = z;
    }
}
