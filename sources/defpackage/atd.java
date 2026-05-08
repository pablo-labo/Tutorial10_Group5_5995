package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class atd<T> extends t3<T> {
    public final yd8<T> a;
    public final List<? extends Annotation> b;
    public final Lazy c;
    public final Map<yd8<? extends T>, KSerializer<? extends T>> d;
    public final LinkedHashMap e;

    public atd(String str, yd8<T> yd8Var, yd8<? extends T>[] yd8VarArr, KSerializer<? extends T>[] kSerializerArr) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = zr4.a;
        this.c = boa.E(qt8.b, new sj4(8, str, this));
        if (yd8VarArr.length != kSerializerArr.length) {
            bg.l("All subclasses of sealed class ", yd8Var.r(), " should be marked @Serializable");
            throw null;
        }
        Map<yd8<? extends T>, KSerializer<? extends T>> mapF0 = lc9.f0(ut0.J0(yd8VarArr, kSerializerArr));
        this.d = mapF0;
        Set<Map.Entry<yd8<? extends T>, KSerializer<? extends T>>> setEntrySet = mapF0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String a = ((KSerializer) entry.getValue()).get$$serialDesc().getA();
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                linkedHashMap.containsKey(a);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(a);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.t3
    public final i04<T> a(ul2 ul2Var, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : ul2Var.a().a0(c(), str);
    }

    @Override // defpackage.t3
    public final r7e<T> b(Encoder encoder, T t) {
        t.getClass();
        KSerializer<? extends T> kSerializer = this.d.get(fwc.a.b(t.getClass()));
        KSerializer<? extends T> kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, t);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // defpackage.t3
    public final yd8<T> c() {
        return this.a;
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return (SerialDescriptor) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atd(String str, yd8<T> yd8Var, yd8<? extends T>[] yd8VarArr, KSerializer<? extends T>[] kSerializerArr, Annotation[] annotationArr) {
        this(str, yd8Var, yd8VarArr, kSerializerArr);
        yd8Var.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
