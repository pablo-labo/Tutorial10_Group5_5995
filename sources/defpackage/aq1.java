package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class aq1 {
    public static final Bundle a(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String strA = pair.a();
            Object objB = pair.b();
            if (objB == null) {
                bundle.putString(strA, null);
            } else if (objB instanceof Boolean) {
                bundle.putBoolean(strA, ((Boolean) objB).booleanValue());
            } else if (objB instanceof Byte) {
                bundle.putByte(strA, ((Number) objB).byteValue());
            } else if (objB instanceof Character) {
                bundle.putChar(strA, ((Character) objB).charValue());
            } else if (objB instanceof Double) {
                bundle.putDouble(strA, ((Number) objB).doubleValue());
            } else if (objB instanceof Float) {
                bundle.putFloat(strA, ((Number) objB).floatValue());
            } else if (objB instanceof Integer) {
                bundle.putInt(strA, ((Number) objB).intValue());
            } else if (objB instanceof Long) {
                bundle.putLong(strA, ((Number) objB).longValue());
            } else if (objB instanceof Short) {
                bundle.putShort(strA, ((Number) objB).shortValue());
            } else if (objB instanceof Bundle) {
                bundle.putBundle(strA, (Bundle) objB);
            } else if (objB instanceof CharSequence) {
                bundle.putCharSequence(strA, (CharSequence) objB);
            } else if (objB instanceof Parcelable) {
                bundle.putParcelable(strA, (Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(strA, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(strA, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(strA, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(strA, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(strA, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(strA, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(strA, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(strA, (short[]) objB);
            } else if (objB instanceof Object[]) {
                Class<?> componentType = objB.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(strA, (Parcelable[]) objB);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(strA, (String[]) objB);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(strA, (CharSequence[]) objB);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        p6.i("Illegal value array type ", componentType.getCanonicalName(), " for key \"", strA, 34);
                        return null;
                    }
                    bundle.putSerializable(strA, (Serializable) objB);
                }
            } else if (objB instanceof Serializable) {
                bundle.putSerializable(strA, (Serializable) objB);
            } else if (objB instanceof IBinder) {
                bundle.putBinder(strA, (IBinder) objB);
            } else if (objB instanceof Size) {
                bundle.putSize(strA, (Size) objB);
            } else {
                if (!(objB instanceof SizeF)) {
                    p6.i("Illegal value type ", objB.getClass().getCanonicalName(), " for key \"", strA, 34);
                    return null;
                }
                bundle.putSizeF(strA, (SizeF) objB);
            }
        }
        return bundle;
    }
}
