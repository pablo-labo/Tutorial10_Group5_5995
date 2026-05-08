package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iv1 implements ud8, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ud8 reflected;
    private final String signature;

    public static class a implements Serializable {
        public static final a a = new a();

        private Object readResolve() {
            return a;
        }
    }

    public iv1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.ud8
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.ud8
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ud8 compute() {
        ud8 ud8Var = this.reflected;
        if (ud8Var != null) {
            return ud8Var;
        }
        ud8 ud8VarComputeReflected = computeReflected();
        this.reflected = ud8VarComputeReflected;
        return ud8VarComputeReflected;
    }

    public abstract ud8 computeReflected();

    @Override // defpackage.td8
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.ud8
    public String getName() {
        return this.name;
    }

    public re8 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? fwc.a.c(cls) : fwc.a.b(cls);
    }

    @Override // defpackage.ud8
    public List<mf8> getParameters() {
        return getReflected().getParameters();
    }

    public ud8 getReflected() {
        ud8 ud8VarCompute = compute();
        if (ud8VarCompute != this) {
            return ud8VarCompute;
        }
        throw new ri8();
    }

    @Override // defpackage.ud8
    public zf8 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.ud8
    public List<dg8> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.ud8
    public jg8 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.ud8
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.ud8
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.ud8
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.ud8
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public iv1(Object obj) {
        this(obj, null, null, null, false);
    }

    public iv1() {
        this(NO_RECEIVER);
    }
}
