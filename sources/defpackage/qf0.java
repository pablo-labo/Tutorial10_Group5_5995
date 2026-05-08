package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.ArgumentCastException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qf0 {
    public final String a;
    public final rf0[] b;
    public boolean c;
    public zf8 d;
    public boolean e;
    public final int f;

    public qf0(String str, rf0[] rf0VarArr) {
        List listH0;
        str.getClass();
        this.a = str;
        this.b = rf0VarArr;
        this.e = true;
        if (rf0VarArr.length == 0) {
            listH0 = zr4.a;
        } else {
            listH0 = ut0.H0(rf0VarArr);
            Collections.reverse(listH0);
        }
        Iterator it = listH0.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (!((rf0) it.next()).a.i()) {
                break;
            } else {
                i++;
            }
        }
        this.f = i >= 0 ? this.b.length - i : 0;
    }

    public static Object[] b(qf0 qf0Var, Object[] objArr, gk0 gk0Var) throws InvalidArgsNumberException, ArgumentCastException {
        CodedException unexpectedException;
        CodedException codedException;
        rf0[] rf0VarArr = qf0Var.b;
        objArr.getClass();
        int i = qf0Var.f;
        if (i > objArr.length || objArr.length > rf0VarArr.length) {
            int length = objArr.length;
            int length2 = rf0VarArr.length;
            throw new InvalidArgsNumberException(i < length2 ? w20.k(uz.f("Received ", length, " arguments, but ", length2, " was expected and at least "), i, " is required") : w40.e("Received ", length, " arguments, but ", length2, " was expected"), null);
        }
        Object[] objArr2 = rf0VarArr.length == objArr.length ? objArr : new Object[rf0VarArr.length];
        int length3 = objArr.length;
        for (int i2 = 0; i2 < length3; i2++) {
            Object obj = objArr[i2];
            rf0 rf0Var = rf0VarArr[i2];
            try {
                d2f d2fVar = rf0Var.c;
                objArr2[i2] = (!((owf) d2fVar.getValue()).b() || (obj instanceof Dynamic)) ? ((owf) d2fVar.getValue()).a(obj, gk0Var, false) : obj;
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    codedException = (CodedException) th;
                } else {
                    if (th instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                        unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th);
                    }
                    codedException = unexpectedException;
                }
                zf8 zf8Var = rf0Var.a;
                String strValueOf = String.valueOf(obj != null ? obj.getClass() : null);
                zf8Var.getClass();
                int i3 = i2 + 1;
                int i4 = i3 % 100;
                String str = "th";
                if (11 > i4 || i4 >= 14) {
                    int i5 = i3 % 10;
                    if (i5 == 1) {
                        str = "st";
                    } else if (i5 == 2) {
                        str = "nd";
                    } else if (i5 == 3) {
                        str = "rd";
                    }
                }
                StringBuilder sb = new StringBuilder("The ");
                sb.append(i3 + str);
                sb.append(" argument cannot be cast to type ");
                sb.append(zf8Var);
                sb.append(" (received ");
                throw new ArgumentCastException(l6.i(sb, strValueOf, ")"), codedException);
            }
        }
        return objArr2;
    }

    public abstract void a(gk0 gk0Var, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str);

    public final ArrayList c() {
        rf0[] rf0VarArr = this.b;
        ArrayList arrayList = new ArrayList(rf0VarArr.length);
        for (rf0 rf0Var : rf0VarArr) {
            arrayList.add(((owf) rf0Var.c.getValue()).c());
        }
        return arrayList;
    }

    public final boolean d() {
        zf8 zf8Var;
        if (!this.c) {
            return false;
        }
        rf0 rf0Var = (rf0) ut0.k0(this.b);
        oe8 oe8VarA = (rf0Var == null || (zf8Var = rf0Var.a) == null) ? null : zf8Var.a();
        yd8 yd8Var = oe8VarA instanceof yd8 ? (yd8) oe8VarA : null;
        if (yd8Var == null) {
            return false;
        }
        if (yd8Var.equals(fwc.a.b(JavaScriptObject.class))) {
            return true;
        }
        zf8 zf8Var2 = this.d;
        oe8 oe8VarA2 = zf8Var2 != null ? zf8Var2.a() : null;
        yd8 yd8Var2 = oe8VarA2 instanceof yd8 ? (yd8) oe8VarA2 : null;
        if (yd8Var2 == null) {
            return false;
        }
        return yd8Var.equals(yd8Var2);
    }

    public final void e() {
        this.c = true;
    }

    public final void f(zf8 zf8Var) {
        this.d = zf8Var;
    }
}
