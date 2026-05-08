package com.datadog.android.core.internal.utils;

import com.datadog.android.lint.InternalApi;
import defpackage.ypd;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"HEX_RADIX", "", "toByteArray", "", "", "", "toHexString", "", "Ljava/math/BigInteger;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class NumberExtKt {
    public static final int HEX_RADIX = 16;

    public static final byte[] toByteArray(long j) {
        byte[] bArrArray = ByteBuffer.allocate(8).putLong(j).array();
        bArrArray.getClass();
        return bArrArray;
    }

    @InternalApi
    public static final String toHexString(int i) {
        ypd.s(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return string;
    }

    @InternalApi
    public static final String toHexString(long j) {
        ypd.s(16);
        String string = Long.toString(j, 16);
        string.getClass();
        return string;
    }

    @InternalApi
    public static final String toHexString(BigInteger bigInteger) {
        bigInteger.getClass();
        return toHexString(bigInteger.longValue());
    }

    public static final byte[] toByteArray(int i) {
        byte[] bArrArray = ByteBuffer.allocate(4).putInt(i).array();
        bArrArray.getClass();
        return bArrArray;
    }

    public static final byte[] toByteArray(short s) {
        byte[] bArrArray = ByteBuffer.allocate(2).putShort(s).array();
        bArrArray.getClass();
        return bArrArray;
    }
}
