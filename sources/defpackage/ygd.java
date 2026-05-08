package defpackage;

import android.os.Parcelable;
import androidx.navigation.r;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.gwe;
import defpackage.zi7;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ygd {
    public static final r<Object> a(SerialDescriptor serialDescriptor, Map<zf8, ? extends r<?>> map) {
        Object next;
        r<?> rVar;
        boolean zEquals;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            zf8 zf8Var = (zf8) next;
            serialDescriptor.getClass();
            zf8Var.getClass();
            if (serialDescriptor.b() != zf8Var.i()) {
                zEquals = false;
            } else {
                KSerializer kSerializerN = awd.n(i8e.a, zf8Var);
                if (kSerializerN == null) {
                    r6.g("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                zEquals = serialDescriptor.equals(kSerializerN.getDescriptor());
            }
            if (zEquals) {
                break;
            }
        }
        zf8 zf8Var2 = (zf8) next;
        r<?> eVar = zf8Var2 != null ? map.get(zf8Var2) : null;
        if (eVar == null) {
            eVar = null;
        }
        r4g r4gVar = r4g.r;
        if (eVar == null) {
            serialDescriptor.getClass();
            switch (jca.b(serialDescriptor).ordinal()) {
                case 0:
                    rVar = r.b;
                    eVar = rVar;
                    break;
                case 1:
                    rVar = zi7.a;
                    eVar = rVar;
                    break;
                case 2:
                    rVar = r.l;
                    eVar = rVar;
                    break;
                case 3:
                    rVar = zi7.b;
                    eVar = rVar;
                    break;
                case 4:
                    rVar = zi7.c;
                    eVar = rVar;
                    break;
                case 5:
                    rVar = zi7.d;
                    eVar = rVar;
                    break;
                case 6:
                    rVar = r.i;
                    eVar = rVar;
                    break;
                case 7:
                    rVar = zi7.e;
                    eVar = rVar;
                    break;
                case 8:
                    rVar = r.f;
                    eVar = rVar;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    rVar = zi7.f;
                    eVar = rVar;
                    break;
                case 10:
                    rVar = zi7.g;
                    eVar = rVar;
                    break;
                case 11:
                    rVar = r.o;
                    eVar = rVar;
                    break;
                case 12:
                    rVar = r.d;
                    eVar = rVar;
                    break;
                case 13:
                    rVar = r.m;
                    eVar = rVar;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    rVar = zi7.i;
                    eVar = rVar;
                    break;
                case 15:
                    rVar = r.j;
                    eVar = rVar;
                    break;
                case 16:
                    rVar = r.g;
                    eVar = rVar;
                    break;
                case 17:
                    if (jca.b(serialDescriptor.h(0)) != cj7.Z) {
                        eVar = r4gVar;
                    } else {
                        rVar = r.p;
                        eVar = rVar;
                    }
                    break;
                case 18:
                    int iOrdinal = jca.b(serialDescriptor.h(0)).ordinal();
                    if (iOrdinal == 0) {
                        rVar = r.e;
                    } else if (iOrdinal == 2) {
                        rVar = r.n;
                    } else if (iOrdinal == 6) {
                        rVar = r.k;
                    } else if (iOrdinal == 8) {
                        rVar = r.h;
                    } else if (iOrdinal == 19) {
                        eVar = new zi7.e<>(jca.a(serialDescriptor.h(0)));
                    } else if (iOrdinal == 10) {
                        rVar = r.q;
                    } else if (iOrdinal != 11) {
                        eVar = r4gVar;
                    } else {
                        rVar = zi7.h;
                    }
                    eVar = rVar;
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    Class<?> clsA = jca.a(serialDescriptor);
                    eVar = Parcelable.class.isAssignableFrom(clsA) ? new r.t<>(clsA) : Enum.class.isAssignableFrom(clsA) ? new r.C0073r<>(clsA) : Serializable.class.isAssignableFrom(clsA) ? new r.v<>(clsA) : null;
                    if (eVar == null) {
                        eVar = r4gVar;
                    }
                    break;
                case 20:
                    Class<?> clsA2 = jca.a(serialDescriptor);
                    eVar = !Enum.class.isAssignableFrom(clsA2) ? r4gVar : new zi7.f<>(clsA2);
                    break;
                default:
                    eVar = r4gVar;
                    break;
            }
        }
        if (eVar.equals(r4gVar)) {
            return null;
        }
        return eVar;
    }

    public static final <T> int b(KSerializer<T> kSerializer) {
        int iHashCode = kSerializer.getDescriptor().getA().hashCode();
        int c = kSerializer.getDescriptor().getC();
        for (int i = 0; i < c; i++) {
            iHashCode = (iHashCode * 31) + kSerializer.getDescriptor().e(i).hashCode();
        }
        return iHashCode;
    }

    public static final String c(Object obj, LinkedHashMap linkedHashMap) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        KSerializer kSerializerM = awd.m(fwc.a.b(obj.getClass()));
        sgd sgdVar = new sgd(kSerializerM, linkedHashMap);
        kSerializerM.serialize(sgdVar, obj);
        Map mapG0 = lc9.g0(sgdVar.g);
        qgd qgdVar = new qgd(kSerializerM);
        xgd xgdVar = new xgd(mapG0, qgdVar);
        int c = kSerializerM.getDescriptor().getC();
        for (int i = 0; i < c; i++) {
            String strE = kSerializerM.getDescriptor().e(i);
            r<Object> rVar = (r) linkedHashMap.get(strE);
            if (rVar == null) {
                akb.n(ja.f(']', "Cannot locate NavType for argument [", strE));
                return null;
            }
            xgdVar.q(Integer.valueOf(i), strE, rVar);
        }
        return qgdVar.b + qgdVar.c + qgdVar.d;
    }

    public static final boolean d(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return wl7.b(serialDescriptor.f(), gwe.a.a) && serialDescriptor.isInline() && serialDescriptor.getC() == 1;
    }

    public static final String e(String str, String str2, String str3, String str4) {
        return m6.h(u40.f("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
