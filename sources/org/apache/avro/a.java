package org.apache.avro;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.akb;
import defpackage.l5;
import defpackage.p49;
import defpackage.xy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static Object a(Object obj, g gVar, p49 p49Var, xy2<?> xy2Var) {
        if (obj == null) {
            return null;
        }
        if (gVar == null || p49Var == null) {
            l5.q(l5.l("Parameters cannot be null! Parameter values:", Arrays.deepToString(new Object[]{obj, gVar, p49Var, xy2Var})));
            return null;
        }
        String str = p49Var.a;
        try {
            switch (gVar.K().ordinal()) {
                case 0:
                    throw new UnsupportedOperationException("fromRecord is not supported for " + str);
                case 1:
                    throw new UnsupportedOperationException("fromEnumSymbol is not supported for " + str);
                case 2:
                    throw new UnsupportedOperationException("fromArray is not supported for " + str);
                case 3:
                    throw new UnsupportedOperationException("fromMap is not supported for " + str);
                case 4:
                default:
                    return obj;
                case 5:
                    throw new UnsupportedOperationException("fromFixed is not supported for " + str);
                case 6:
                    throw new UnsupportedOperationException("fromCharSequence is not supported for " + str);
                case 7:
                    throw new UnsupportedOperationException("fromBytes is not supported for " + str);
                case 8:
                    throw new UnsupportedOperationException("fromInt is not supported for " + str);
                case DatadogLogGenerator.CRASH /* 9 */:
                    throw new UnsupportedOperationException("fromLong is not supported for " + str);
                case 10:
                    throw new UnsupportedOperationException("fromFloat is not supported for " + str);
                case 11:
                    throw new UnsupportedOperationException("fromDouble is not supported for " + str);
                case 12:
                    throw new UnsupportedOperationException("fromBoolean is not supported for " + str);
            }
        } catch (ClassCastException e) {
            throw new AvroRuntimeException(akb.k("Cannot convert ", String.valueOf(obj), ":", obj.getClass().getSimpleName(), ": expected generic type"), e);
        }
    }

    public static <T> Object b(Object obj, g gVar, p49 p49Var, xy2<T> xy2Var) {
        String str = p49Var.a;
        if (xy2Var == null) {
            l5.q(l5.l("Parameters cannot be null! Parameter values:", Arrays.deepToString(new Object[]{obj, gVar, p49Var, xy2Var})));
            return null;
        }
        try {
            Class<T> clsA = xy2Var.a();
            switch (gVar.K().ordinal()) {
                case 0:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toRecord is not supported for " + str);
                case 1:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toEnumSymbol is not supported for " + str);
                case 2:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toArray is not supported for " + str);
                case 3:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toMap is not supported for " + str);
                case 4:
                default:
                    return obj;
                case 5:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toFixed is not supported for " + str);
                case 6:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toCharSequence is not supported for " + str);
                case 7:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toBytes is not supported for " + str);
                case 8:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toInt is not supported for " + str);
                case DatadogLogGenerator.CRASH /* 9 */:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toLong is not supported for " + str);
                case 10:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toFloat is not supported for " + str);
                case 11:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toDouble is not supported for " + str);
                case 12:
                    clsA.cast(obj);
                    throw new UnsupportedOperationException("toBoolean is not supported for " + str);
            }
        } catch (ClassCastException e) {
            throw new AvroRuntimeException(akb.k("Cannot convert ", String.valueOf(obj), ":", obj.getClass().getSimpleName(), ": expected logical type"), e);
        }
    }
}
