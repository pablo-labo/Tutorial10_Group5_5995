package defpackage;

import defpackage.gwe;
import defpackage.xz3;
import expo.modules.imagepicker.FailedToReadFileException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class wa8 {
    public static final xz3.a<Map<String, Integer>> a = new xz3.a<>();

    public static final int a(SerialDescriptor serialDescriptor, s98 s98Var, String str) throws FailedToReadFileException, IOException {
        serialDescriptor.getClass();
        s98Var.getClass();
        str.getClass();
        d(s98Var, serialDescriptor);
        int iC = serialDescriptor.c(str);
        if (iC != -3 || !s98Var.a.f) {
            return iC;
        }
        xz3 xz3Var = s98Var.c;
        jp0 jp0Var = new jp0(7, serialDescriptor, s98Var);
        xz3Var.getClass();
        ConcurrentHashMap concurrentHashMap = xz3Var.a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        xz3.a<Map<String, Integer>> aVar = a;
        Object obj = map != null ? map.get(aVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = jp0Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(SerialDescriptor serialDescriptor, s98 s98Var, String str, String str2) throws FailedToReadFileException, IOException {
        serialDescriptor.getClass();
        s98Var.getClass();
        str.getClass();
        int iA = a(serialDescriptor, s98Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new SerializationException(serialDescriptor.getA() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(s98 s98Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        s98Var.getClass();
        if (s98Var.a.a) {
            return true;
        }
        List<Annotation> annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof qa8) {
                return true;
            }
        }
        return false;
    }

    public static final void d(s98 s98Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        s98Var.getClass();
        wl7.b(serialDescriptor.f(), gwe.a.a);
    }
}
