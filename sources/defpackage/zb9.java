package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zb9 extends ge4<Map<?, ?>> {
    public final zf8 a;
    public final owf<?> b;

    public zb9(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
        zf8 zf8Var2 = ((gg8) z92.O0(zf8Var.g())).b;
        if (!wl7.b(zf8Var2 != null ? zf8Var2.a() : null, fwc.a.b(String.class))) {
            h5.k(v40.e(z92.O0(zf8Var.g()), "The map key type should be String, but received ", "."));
            throw null;
        }
        gg8 gg8Var = (gg8) z92.R0(1, zf8Var.g());
        zf8 zf8Var3 = gg8Var != null ? gg8Var.b : null;
        if (zf8Var3 != null) {
            this.b = fxfVar.a(zf8Var3);
        } else {
            l5.q("The map type should contain the key type.");
            throw null;
        }
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return this.b.b();
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        ExpectedType expectedTypeC = this.b.c();
        expectedTypeC.getClass();
        return new ExpectedType(new SingleType(s23.e0, new ExpectedType[]{expectedTypeC}));
    }

    @Override // defpackage.ge4
    public final Map<?, ?> e(Object obj, gk0 gk0Var, boolean z) throws CollectionElementCastException {
        CodedException unexpectedException;
        owf<?> owfVar = this.b;
        if (owfVar.b() && !z) {
            return (Map) obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                linkedHashMap.put(key, owfVar.a(value, gk0Var, z));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                zf8 zf8Var = this.a;
                zf8 zf8Var2 = zf8Var.g().get(1).b;
                zf8Var2.getClass();
                value.getClass();
                throw new CollectionElementCastException(zf8Var, zf8Var2, (yd8<?>) fwc.a.b(value.getClass()), unexpectedException);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.ge4
    public final Map<?, ?> f(Dynamic dynamic, gk0 gk0Var, boolean z) throws DynamicCastException {
        ReadableMap readableMapAsMap = dynamic.asMap();
        if (readableMapAsMap == null) {
            throw new DynamicCastException(fwc.a.b(ReadableMap.class));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = readableMapAsMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(key, this.b.a(dynamicFromObject, gk0Var, z));
                j6g j6gVar = j6g.a;
                dynamicFromObject.recycle();
            } finally {
            }
        }
        return linkedHashMap;
    }
}
