package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class kd8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kd8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IllegalPropertyDelegateAccessException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ld8 ld8Var = (ld8) obj;
                hp8 hp8Var = ld8Var.c;
                Collection collectionValues = ((Map) zte.c(hp8Var.X, hp8.b0[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    p14 p14VarA = ld8Var.b.a.d.a(hp8Var, (oi8) it.next());
                    if (p14VarA != null) {
                        arrayList.add(p14VarA);
                    }
                }
                return (in9[]) aqd.b(arrayList).toArray(new in9[0]);
            case 1:
                ke8 ke8Var = (ke8) obj;
                if (ke8Var.b.isAnonymousClass()) {
                    return null;
                }
                a62 a62VarG = ke8Var.G();
                if (a62VarG.c) {
                    return null;
                }
                return a62VarG.a().a.a;
            case 2:
                sf8 sf8Var = (sf8) obj;
                Object objD = sf8Var.D();
                try {
                    Object obj2 = xf8.b0;
                    Object objE = sf8Var.C() ? sf8Var.E() : null;
                    if (objE == obj2) {
                        objE = null;
                    }
                    sf8Var.C();
                    AccessibleObject accessibleObject = objD != null ? (AccessibleObject) objD : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(xd8.a(sf8Var));
                    }
                    if (objD == null) {
                        return null;
                    }
                    if (objD instanceof Field) {
                        return ((Field) objD).get(objE);
                    }
                    if (!(objD instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objD + " neither field nor method");
                    }
                    int length = ((Method) objD).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objD).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objD;
                        if (objE == null) {
                            Class<?> cls = ((Method) objD).getParameterTypes()[0];
                            cls.getClass();
                            objE = akg.e(cls);
                        }
                        return method.invoke(null, objE);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objD;
                        Class<?> cls2 = ((Method) objD).getParameterTypes()[1];
                        cls2.getClass();
                        return method2.invoke(null, objE, akg.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objD + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
            default:
                Class<?>[] declaredClasses = ((gp8) obj).o.a.getDeclaredClasses();
                declaredClasses.getClass();
                return z92.E1(a7e.W(a7e.V(new cc5(ut0.e0(declaredClasses), false, x32.f), y32.e)));
        }
    }
}
