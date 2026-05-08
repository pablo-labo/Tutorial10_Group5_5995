package defpackage;

import android.os.IBinder;
import defpackage.tn6;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class vna<T> extends tn6.a {
    public final Object a;

    public vna(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static <T> T h(tn6 tn6Var) {
        if (tn6Var instanceof vna) {
            return (T) ((vna) tn6Var).a;
        }
        IBinder iBinderAsBinder = tn6Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        fib.i(field);
        if (field.isAccessible()) {
            l5.q("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
