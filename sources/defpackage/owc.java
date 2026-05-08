package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import defpackage.pwc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class owc extends pwc.b {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ pvf i;
    public final /* synthetic */ ae6 j;
    public final /* synthetic */ iyf k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owc(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, pvf pvfVar, ae6 ae6Var, iyf iyfVar, boolean z5, boolean z6) {
        super(str, field, z, z2);
        this.f = z3;
        this.g = method;
        this.h = z4;
        this.i = pvfVar;
        this.j = ae6Var;
        this.k = iyfVar;
        this.l = z5;
        this.m = z6;
    }

    @Override // pwc.b
    public final void a(nb8 nb8Var, int i, Object[] objArr) {
        Object objA = this.i.a(nb8Var);
        if (objA != null || !this.l) {
            objArr[i] = objA;
            return;
        }
        throw new JsonParseException("null is not allowed as value for record component '" + this.c + "' of primitive type; at path " + nb8Var.c());
    }

    @Override // pwc.b
    public final void b(nb8 nb8Var, Object obj) throws IllegalAccessException {
        Object objA = this.i.a(nb8Var);
        if (objA == null && this.l) {
            return;
        }
        boolean z = this.f;
        Field field = this.b;
        if (z) {
            pwc.a(obj, field);
        } else if (this.m) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(kwc.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // pwc.b
    public final void c(gc8 gc8Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.d) {
            boolean z = this.f;
            Field field = this.b;
            Method method = this.g;
            if (z) {
                if (method == null) {
                    pwc.a(obj, field);
                } else {
                    pwc.a(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new JsonIOException(l5.m("Accessor ", kwc.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            gc8Var.N(this.a);
            boolean z2 = this.h;
            pvf rvfVar = this.i;
            if (!z2) {
                rvfVar = new rvf(this.j, rvfVar, this.k.b);
            }
            rvfVar.b(gc8Var, objInvoke);
        }
    }
}
