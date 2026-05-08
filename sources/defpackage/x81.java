package defpackage;

import defpackage.by9;
import defpackage.o7d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lx81;", "Llu2;", "", "Lh13;", "Ljava/io/Serializable;", "completion", "<init>", "(Llu2;)V", "Lo7d;", "result", "Lj6g;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Llu2;)Llu2;", "value", "(Ljava/lang/Object;Llu2;)Llu2;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Llu2;", "getCompletion", "()Llu2;", "getCallerFrame", "()Lh13;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class x81 implements lu2<Object>, h13, Serializable {
    private final lu2<Object> completion;

    public x81(lu2<Object> lu2Var) {
        this.completion = lu2Var;
    }

    public lu2<j6g> create(lu2<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public h13 getCallerFrame() {
        lu2<Object> lu2Var = this.completion;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    public final lu2<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        uh3 uh3Var = (uh3) getClass().getAnnotation(uh3.class);
        String str = null;
        if (uh3Var == null) {
            return null;
        }
        int iV = uh3Var.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? uh3Var.l()[iIntValue] : -1;
        by9.a aVar = by9.b;
        by9.a aVar2 = by9.a;
        if (aVar == null) {
            try {
                by9.a aVar3 = new by9.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                by9.b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                by9.b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = aVar.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVar.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = uh3Var.c();
        } else {
            strC = str + '/' + uh3Var.c();
        }
        return new StackTraceElement(strC, uh3Var.m(), uh3Var.f(), i);
    }

    public abstract Object invokeSuspend(Object result);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.lu2
    public final void resumeWith(Object result) {
        ?? r2 = this;
        while (true) {
            x81 x81Var = (x81) r2;
            lu2<Object> lu2Var = x81Var.completion;
            lu2Var.getClass();
            try {
                result = x81Var.invokeSuspend(result);
                if (result == g13.a) {
                    return;
                }
            } catch (Throwable th) {
                result = new o7d.a(th);
            }
            x81Var.releaseIntercepted();
            if (!(lu2Var instanceof x81)) {
                lu2Var.resumeWith(result);
                return;
            }
            r2 = lu2Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public lu2<j6g> create(Object value, lu2<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
