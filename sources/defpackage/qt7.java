package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.pt7;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class qt7 {
    public static final void a(WritableArray writableArray, Object obj) {
        writableArray.getClass();
        if (obj == null || (obj instanceof j6g)) {
            writableArray.pushNull();
            return;
        }
        if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableArray.pushLong(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
        } else {
            bg.l("Could not put '", obj.getClass(), "' to WritableArray");
        }
    }

    public static final void b(WritableMap writableMap, String str, Object obj) {
        writableMap.getClass();
        str.getClass();
        if (obj == null || (obj instanceof j6g)) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            bg.l("Could not put '", obj.getClass(), "' to WritableMap");
        }
    }

    public static final <T> WritableArray c(Collection<? extends T> collection, pt7.a aVar) {
        collection.getClass();
        aVar.getClass();
        WritableArray writableArrayA = aVar.a();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            a(writableArrayA, pt7.b(it.next(), aVar));
        }
        return writableArrayA;
    }

    public static final WritableArray d(Pair<?, ?> pair, pt7.a aVar) {
        pair.getClass();
        aVar.getClass();
        WritableArray writableArrayA = aVar.a();
        Object objB = pt7.b(pair.d(), aVar);
        Object objB2 = pt7.b(pair.e(), aVar);
        a(writableArrayA, objB);
        a(writableArrayA, objB2);
        return writableArrayA;
    }

    public static final <T> WritableArray e(T[] tArr, pt7.a aVar) {
        tArr.getClass();
        aVar.getClass();
        WritableArray writableArrayA = aVar.a();
        for (T t : tArr) {
            a(writableArrayA, pt7.b(t, aVar));
        }
        return writableArrayA;
    }

    public static final WritableMap f(ftc ftcVar, pt7.a aVar) {
        Object next;
        ftcVar.getClass();
        aVar.getClass();
        WritableMap writableMapB = aVar.b();
        ArrayList<tf8> arrayListA = ne8.a(fwc.a.b(ftcVar.getClass()));
        ArrayList arrayList = new ArrayList(t92.r0(arrayListA, 10));
        for (tf8 tf8Var : arrayListA) {
            Iterator<T> it = tf8Var.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof w85) {
                    break;
                }
            }
            w85 w85Var = (w85) next;
            if (w85Var != null) {
                String strKey = w85Var.key();
                String name = wl7.b(strKey, "") ? null : strKey;
                if (name == null) {
                    name = tf8Var.getName();
                }
                if (tf8Var instanceof df8) {
                    Field fieldA = zvc.a(tf8Var);
                    if (fieldA != null) {
                        fieldA.setAccessible(true);
                    }
                    Method methodB = zvc.b(tf8Var.c());
                    if (methodB != null) {
                        methodB.setAccessible(true);
                    }
                    Method methodB2 = zvc.b(((df8) tf8Var).e());
                    if (methodB2 != null) {
                        methodB2.setAccessible(true);
                    }
                } else {
                    Field fieldA2 = zvc.a(tf8Var);
                    if (fieldA2 != null) {
                        fieldA2.setAccessible(true);
                    }
                    Method methodB3 = zvc.b(tf8Var.c());
                    if (methodB3 != null) {
                        methodB3.setAccessible(true);
                    }
                }
                b(writableMapB, name, pt7.b(tf8Var.get(ftcVar), aVar));
            }
            arrayList.add(j6g.a);
        }
        return writableMapB;
    }

    public static final WritableMap g(Bundle bundle, pt7.a aVar) {
        bundle.getClass();
        aVar.getClass();
        WritableMap writableMapB = aVar.b();
        for (String str : bundle.keySet()) {
            Object objB = pt7.b(bundle.get(str), aVar);
            str.getClass();
            b(writableMapB, str, objB);
        }
        return writableMapB;
    }

    public static final <K, V> WritableMap h(Map<K, ? extends V> map, pt7.a aVar) {
        map.getClass();
        aVar.getClass();
        WritableMap writableMapB = aVar.b();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            b(writableMapB, String.valueOf(key), pt7.b(entry.getValue(), aVar));
        }
        return writableMapB;
    }

    public static final Object i(Enum<?> r8) {
        r8.getClass();
        Class<?> cls = r8.getClass();
        iwc iwcVar = fwc.a;
        ve8 ve8VarB = ne8.b(iwcVar.b(cls));
        Object obj = null;
        if (ve8VarB == null) {
            l5.q("Cannot convert enum without the primary constructor to js value");
            return null;
        }
        if (ve8VarB.getParameters().isEmpty()) {
            return r8.name();
        }
        if (ve8VarB.getParameters().size() != 1) {
            ja.q("Enum '", r8.getClass(), "' cannot be used as return type (incompatible with JS)");
            return null;
        }
        String name = ((mf8) z92.O0(ve8VarB.getParameters())).getName();
        name.getClass();
        Collection<wd8<?>> collectionA = ((ke8) iwcVar.b(r8.getClass())).c.getValue().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionA) {
            wd8 wd8Var = (wd8) obj2;
            if (!(wd8Var.z().O() != null) && (wd8Var instanceof tf8)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (wl7.b(((tf8) next).getName(), name)) {
                obj = next;
                break;
            }
        }
        obj.getClass();
        return ((tf8) obj).get(r8);
    }

    public static final ArrayList j(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(t92.r0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(pt7.a(2, it.next()));
        }
        return arrayList;
    }

    public static final <K, V> Map<String, Object> k(Map<K, ? extends V> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            arrayList.add(new Pair(String.valueOf(entry.getKey()), pt7.a(2, entry.getValue())));
        }
        return lc9.f0(arrayList);
    }
}
