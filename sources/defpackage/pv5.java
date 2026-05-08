package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pv5 extends iv1 implements fv5, ve8 {
    private final int arity;
    private final int flags;

    public pv5(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // defpackage.iv1
    public ud8 computeReflected() {
        return fwc.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pv5) {
            pv5 pv5Var = (pv5) obj;
            return getName().equals(pv5Var.getName()) && getSignature().equals(pv5Var.getSignature()) && this.flags == pv5Var.flags && this.arity == pv5Var.arity && wl7.b(getBoundReceiver(), pv5Var.getBoundReceiver()) && wl7.b(getOwner(), pv5Var.getOwner());
        }
        if (obj instanceof ve8) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.fv5
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.iv1
    public ve8 getReflected() {
        return (ve8) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ve8
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ve8
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ve8
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ve8
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.iv1, defpackage.ud8
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ud8 ud8VarCompute = compute();
        if (ud8VarCompute != this) {
            return ud8VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public pv5(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public pv5(int i) {
        this(i, iv1.NO_RECEIVER, null, null, null, 0);
    }
}
