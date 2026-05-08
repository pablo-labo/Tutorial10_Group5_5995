package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.EnumNoSuchValueException;
import expo.modules.kotlin.exception.IncompatibleArgTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class cw4 extends ge4<Enum<?>> {
    public final yd8<Enum<?>> a;
    public final Enum<?>[] b;
    public final ve8<Enum<?>> c;

    public cw4(yd8<Enum<?>> yd8Var) {
        this.a = yd8Var;
        Object[] enumConstants = jh2.p(yd8Var).getEnumConstants();
        if (enumConstants == null) {
            l5.q("Passed type is not an enum type");
            throw null;
        }
        Enum<?>[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            l5.q("Passed enum type is empty");
            throw null;
        }
        this.b = enumArr;
        ve8<Enum<?>> ve8VarB = (ve8) z92.l1(yd8Var.k());
        ve8VarB = ve8VarB == null ? ne8.b(yd8Var) : ve8VarB;
        if (ve8VarB == null) {
            l5.q("Cannot convert js value to enum without the primary constructor");
            throw null;
        }
        this.c = ve8VarB;
        if (Enumerable.class.isAssignableFrom(jh2.p(yd8Var))) {
            return;
        }
        mz2.a.a(o39.Error, "Enum '" + yd8Var + "' should inherit from " + fwc.a.b(Enumerable.class) + ".", null);
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.f, s23.b);
    }

    @Override // defpackage.ge4
    public final Enum<?> e(Object obj, gk0 gk0Var, boolean z) throws IncompatibleArgTypeException {
        ve8<Enum<?>> ve8Var = this.c;
        boolean zIsEmpty = ve8Var.getParameters().isEmpty();
        Enum<?>[] enumArr = this.b;
        if (zIsEmpty) {
            return h(enumArr, (String) obj);
        }
        if (ve8Var.getParameters().size() != 1) {
            throw new IncompatibleArgTypeException(fwc.a.b(obj.getClass()), this.a);
        }
        String name = ((mf8) z92.O0(ve8Var.getParameters())).getName();
        name.getClass();
        return g(obj, enumArr, name);
    }

    @Override // defpackage.ge4
    public final Enum<?> f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException, IncompatibleArgTypeException {
        Class cls;
        yd8 yd8VarB;
        ve8<Enum<?>> ve8Var = this.c;
        boolean zIsEmpty = ve8Var.getParameters().isEmpty();
        Enum<?>[] enumArr = this.b;
        if (zIsEmpty) {
            String strAsString = dynamic.asString();
            if (strAsString != null) {
                return h(enumArr, strAsString);
            }
            throw new DynamicCastException(fwc.a.b(String.class));
        }
        if (ve8Var.getParameters().size() == 1) {
            String name = ((mf8) z92.O0(ve8Var.getParameters())).getName();
            name.getClass();
            return g(dynamic, enumArr, name);
        }
        ReadableType type = dynamic.getType();
        type.getClass();
        switch (nqc.a[type.ordinal()]) {
            case 1:
                cls = Object.class;
                yd8VarB = fwc.a.b(cls);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            case 2:
                cls = Boolean.TYPE;
                yd8VarB = fwc.a.b(cls);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            case 3:
                cls = Number.class;
                yd8VarB = fwc.a.b(cls);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            case 4:
                yd8VarB = fwc.a.b(String.class);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            case 5:
                cls = ReadableMap.class;
                yd8VarB = fwc.a.b(cls);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            case 6:
                cls = ReadableArray.class;
                yd8VarB = fwc.a.b(cls);
                throw new IncompatibleArgTypeException(yd8VarB, this.a);
            default:
                l.g();
                return null;
        }
    }

    public final Enum<?> g(Object obj, Enum<?>[] enumArr, String str) throws NoSuchFieldException {
        Enum<?> r5;
        yd8<Enum<?>> yd8Var = this.a;
        Field declaredField = jh2.p(yd8Var).getDeclaredField(str);
        if (declaredField == null) {
            h5.k(l5.m("Cannot find a property for ", str, " parameter"));
            return null;
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        type.getClass();
        Object objAsString = obj instanceof Dynamic ? type.equals(String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt()) : type.equals(String.class) ? (String) obj : obj instanceof Double ? Integer.valueOf((int) ((Number) obj).doubleValue()) : (Integer) obj;
        int length = enumArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r5 = null;
                break;
            }
            r5 = enumArr[i];
            if (wl7.b(declaredField.get(r5), objAsString)) {
                break;
            }
            i++;
        }
        if (r5 != null) {
            return r5;
        }
        String strR = yd8Var.r();
        StringBuilder sb = new StringBuilder("Couldn't convert '");
        sb.append(obj);
        sb.append("' to ");
        sb.append(strR);
        sb.append(" where ");
        h5.k(l6.i(sb, str, " is the enum parameter"));
        return null;
    }

    public final Enum h(Enum[] enumArr, String str) throws EnumNoSuchValueException {
        Enum r3;
        int length = enumArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r3 = null;
                break;
            }
            r3 = enumArr[i];
            if (wl7.b(r3.name(), str)) {
                break;
            }
            i++;
        }
        if (r3 != null) {
            return r3;
        }
        throw new EnumNoSuchValueException("'" + ((Object) str) + "' is not present in " + this.a.r() + " enum, it must be one of: " + ut0.t0(enumArr, ", ", null, null, new lg(5), 30), null);
    }
}
