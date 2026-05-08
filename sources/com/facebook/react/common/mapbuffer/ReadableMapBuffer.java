package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.common.mapbuffer.a;
import defpackage.a32;
import defpackage.f84;
import defpackage.h5;
import defpackage.ie7;
import defpackage.oh7;
import defpackage.p6;
import defpackage.uz7;
import defpackage.w40;
import defpackage.wl7;
import defpackage.z92;
import defpackage.ze8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0019\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/common/mapbuffer/a;", "Ljava/nio/ByteBuffer;", "buffer", "", "offsetToMapBuffer", "<init>", "(Ljava/nio/ByteBuffer;I)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReadableMapBuffer extends HybridClassBase implements com.facebook.react.common.mapbuffer.a {
    public static final a.b[] d = a.b.values();
    public final ByteBuffer a;
    public final int b;
    public final int c;

    public final class a implements a.c {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final long a() {
            g(a.b.f);
            return ReadableMapBuffer.this.a.getLong(this.a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final String b() {
            g(a.b.d);
            int i = this.a + 4;
            a.b[] bVarArr = ReadableMapBuffer.d;
            return ReadableMapBuffer.this.i(i);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final double c() {
            g(a.b.c);
            return ReadableMapBuffer.this.a.getDouble(this.a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final com.facebook.react.common.mapbuffer.a d() {
            g(a.b.e);
            int i = this.a + 4;
            a.b[] bVarArr = ReadableMapBuffer.d;
            return ReadableMapBuffer.this.g(i);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final int e() {
            g(a.b.b);
            return ReadableMapBuffer.this.a.getInt(this.a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final boolean f() {
            g(a.b.a);
            int i = this.a + 4;
            a.b[] bVarArr = ReadableMapBuffer.d;
            return ReadableMapBuffer.this.a.getInt(i) == 1;
        }

        public final void g(a.b bVar) {
            a.b type = getType();
            if (bVar == type) {
                return;
            }
            w40.k(getKey(), bVar, " found ", type);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final int getKey() {
            return ReadableMapBuffer.this.a.getShort(this.a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public final a.b getType() {
            ByteBuffer byteBuffer = ReadableMapBuffer.this.a;
            boolean zEnableAndroidTextMeasurementOptimizations = ie7.g0.enableAndroidTextMeasurementOptimizations();
            int i = this.a;
            return zEnableAndroidTextMeasurementOptimizations ? ReadableMapBuffer.d[byteBuffer.getShort(i + 2) & 65535] : a.b.values()[byteBuffer.getShort(i + 2) & 65535];
        }
    }

    public static final class b implements Iterator<a.c>, ze8 {
        public int a;
        public final int b;

        public b() {
            this.b = ReadableMapBuffer.this.c - 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a <= this.b;
        }

        @Override // java.util.Iterator
        public final a.c next() {
            int i = this.a;
            this.a = i + 1;
            a.b[] bVarArr = ReadableMapBuffer.d;
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            return readableMapBuffer.new a(readableMapBuffer.d(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @f84
    private ReadableMapBuffer(ByteBuffer byteBuffer, int i) {
        this.a = byteBuffer;
        this.b = i;
        if (byteBuffer.getShort() != 254) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.c = byteBuffer.getShort(byteBuffer.position()) & 65535;
    }

    public final int b(int i) {
        com.facebook.react.common.mapbuffer.a.U.getClass();
        oh7 oh7Var = a.C0130a.b;
        int i2 = oh7Var.a;
        if (i <= oh7Var.b && i2 <= i) {
            short s = (short) i;
            int i3 = this.c - 1;
            int i4 = 0;
            while (i4 <= i3) {
                int i5 = (i4 + i3) >>> 1;
                int i6 = this.a.getShort(d(i5)) & 65535;
                int i7 = 65535 & s;
                if (wl7.c(i6, i7) < 0) {
                    i4 = i5 + 1;
                } else {
                    if (wl7.c(i6, i7) <= 0) {
                        return i5;
                    }
                    i3 = i5 - 1;
                }
            }
        }
        return -1;
    }

    public final int d(int i) {
        return (i * 12) + this.b + 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = ((ReadableMapBuffer) obj).a;
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2 == byteBuffer) {
            return true;
        }
        byteBuffer2.rewind();
        byteBuffer.rewind();
        return byteBuffer2.equals(byteBuffer);
    }

    public final int f(int i, a.b bVar) {
        int iB = b(i);
        if (iB == -1) {
            h5.k(p6.c(i, "Key not found: "));
            return 0;
        }
        int i2 = this.a.getShort(d(iB) + 2) & 65535;
        a.b bVar2 = ie7.g0.enableAndroidTextMeasurementOptimizations() ? d[i2] : a.b.values()[i2];
        if (bVar2 == bVar) {
            return d(iB) + 4;
        }
        w40.k(i, bVar, ", found ", bVar2);
        return 0;
    }

    public final ReadableMapBuffer g(int i) {
        int iD = d(this.c);
        ByteBuffer byteBuffer = this.a;
        int i2 = byteBuffer.getInt(i) + iD + 4;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i2);
        return new ReadableMapBuffer(byteBufferDuplicate, i2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final boolean getBoolean(int i) {
        return this.a.getInt(f(i, a.b.a)) == 1;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: getCount, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final double getDouble(int i) {
        return this.a.getDouble(f(i, a.b.c));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final int getInt(int i) {
        return this.a.getInt(f(i, a.b.b));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final String getString(int i) {
        return i(f(i, a.b.d));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final boolean h1(int i) {
        return b(i) != -1;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.rewind();
        return byteBuffer.hashCode();
    }

    public final String i(int i) {
        int iD = d(this.c);
        ByteBuffer byteBuffer = this.a;
        int i2 = byteBuffer.getInt(i) + iD;
        int i3 = byteBuffer.getInt(i2);
        byte[] bArr = new byte[i3];
        byteBuffer.position(i2 + 4);
        byteBuffer.get(bArr, 0, i3);
        return new String(bArr, a32.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<a.c> iterator() {
        return new b();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public final com.facebook.react.common.mapbuffer.a j0(int i) {
        return g(f(i, a.b.e));
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder("{");
        z92.V0(this, sb, null, null, null, new uz7(6), 62);
        sb.append('}');
        return sb.toString();
    }
}
