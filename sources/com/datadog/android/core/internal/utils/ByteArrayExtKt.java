package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.lint.InternalApi;
import defpackage.gu5;
import defpackage.ma7;
import defpackage.mj8;
import defpackage.oa7;
import defpackage.pyd;
import defpackage.z92;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a4\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0000\u001a6\u0010\u0011\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u0019\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0001H\u0000\u001a\f\u0010\u001c\u001a\u00020\u001d*\u00020\u0001H\u0000¨\u0006\u001e"}, d2 = {"copyOfRangeSafe", "", "fromIndex", "", "toIndex", "copyTo", "", "srcPos", "dest", "destPos", "length", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "indexOf", "b", "", "startIndex", "join", "", "separator", "prefix", "suffix", "split", "", "delimiter", "toInt", "toLong", "", "toShort", "", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ByteArrayExtKt {
    public static final byte[] copyOfRangeSafe(byte[] bArr, int i, int i2) {
        bArr.getClass();
        try {
            return pyd.m(i, bArr, i2);
        } catch (IllegalArgumentException unused) {
            return new byte[0];
        } catch (IndexOutOfBoundsException unused2) {
            return new byte[0];
        }
    }

    public static final boolean copyTo(byte[] bArr, int i, byte[] bArr2, int i2, int i3, InternalLogger internalLogger) {
        bArr.getClass();
        bArr2.getClass();
        internalLogger.getClass();
        if (i2 + i3 > bArr2.length) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        if (i + i3 > bArr.length) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return false;
        }
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return true;
    }

    public static final int indexOf(byte[] bArr, byte b, int i) {
        bArr.getClass();
        if (i < 0) {
            return -1;
        }
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static /* synthetic */ int indexOf$default(byte[] bArr, byte b, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(bArr, b, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalApi
    public static final byte[] join(Collection<byte[]> collection, byte[] bArr, byte[] bArr2, byte[] bArr3, InternalLogger internalLogger) {
        collection.getClass();
        bArr.getClass();
        bArr2.getClass();
        bArr3.getClass();
        internalLogger.getClass();
        Collection<byte[]> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        int size = 0;
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        if (!collection.isEmpty()) {
            size = (collection.size() - 1) * bArr.length;
        }
        byte[] bArr4 = new byte[bArr2.length + length + size + bArr3.length];
        copyTo(bArr2, 0, bArr4, 0, bArr2.length, internalLogger);
        int length2 = bArr2.length;
        Iterator it2 = z92.G1(collection2).iterator();
        int length3 = length2;
        while (true) {
            oa7 oa7Var = (oa7) it2;
            if (!oa7Var.a.hasNext()) {
                copyTo(bArr3, 0, bArr4, length3, bArr3.length, internalLogger);
                return bArr4;
            }
            ma7 ma7Var = (ma7) oa7Var.next();
            byte[] bArr5 = (byte[]) ma7Var.b;
            copyTo(bArr5, 0, bArr4, length3, bArr5.length, internalLogger);
            length3 += ((byte[]) ma7Var.b).length;
            if (ma7Var.a != collection.size() - 1) {
                byte[] bArr6 = bArr;
                copyTo(bArr6, 0, bArr4, length3, bArr.length, internalLogger);
                length3 += bArr6.length;
                bArr = bArr6;
            }
        }
    }

    public static /* synthetic */ byte[] join$default(Collection collection, byte[] bArr, byte[] bArr2, byte[] bArr3, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = new byte[0];
        }
        if ((i & 4) != 0) {
            bArr3 = new byte[0];
        }
        return join(collection, bArr, bArr2, bArr3, internalLogger);
    }

    public static final List<byte[]> split(byte[] bArr, byte b, InternalLogger internalLogger) {
        byte[] bArr2;
        InternalLogger internalLogger2;
        bArr.getClass();
        internalLogger.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iIndexOf = indexOf(bArr, b, i);
            int length = iIndexOf >= 0 ? iIndexOf - i : bArr.length - i;
            if (length > 0) {
                byte[] bArr3 = new byte[length];
                bArr2 = bArr;
                internalLogger2 = internalLogger;
                copyTo(bArr2, i, bArr3, 0, length, internalLogger2);
                arrayList.add(bArr3);
            } else {
                bArr2 = bArr;
                internalLogger2 = internalLogger;
            }
            i = iIndexOf + 1;
            if (iIndexOf == -1) {
                return arrayList;
            }
            bArr = bArr2;
            internalLogger = internalLogger2;
        }
    }

    public static final int toInt(byte[] bArr) {
        bArr.getClass();
        return ByteBuffer.wrap(bArr).getInt();
    }

    public static final long toLong(byte[] bArr) {
        bArr.getClass();
        return ByteBuffer.wrap(bArr).getLong();
    }

    public static final short toShort(byte[] bArr) {
        bArr.getClass();
        return ByteBuffer.wrap(bArr).getShort();
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Cannot copy ByteArray, dest doesn't have enough space";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Cannot copy ByteArray, src doesn't have enough data";
        }
    }
}
