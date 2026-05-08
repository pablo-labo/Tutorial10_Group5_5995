package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b6c implements lna {
    public static final Charset f = Charset.forName("UTF-8");
    public static final x85 g;
    public static final x85 h;
    public static final ba8 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final kna<Object> d;
    public final e6c e = new e6c(this);

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        g = new x85("key", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(2);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        h = new x85("value", Collections.unmodifiableMap(new HashMap(map2)));
        i = new ba8(1);
    }

    public b6c(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, kna knaVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = knaVar;
    }

    public static int m(x85 x85Var) {
        z5c z5cVar = (z5c) ((Annotation) x85Var.b.get(z5c.class));
        if (z5cVar != null) {
            return z5cVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.lna
    public final lna a(Object obj, String str) {
        k(x85.a(str), obj, true);
        return this;
    }

    @Override // defpackage.lna
    public final lna b(x85 x85Var, Object obj) {
        k(x85Var, obj, true);
        return this;
    }

    public final void c(x85 x85Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        n((m(x85Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.lna
    public final lna d(int i2, String str) {
        e(x85.a(str), i2, true);
        return this;
    }

    public final void e(x85 x85Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        z5c z5cVar = (z5c) ((Annotation) x85Var.b.get(z5c.class));
        if (z5cVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = z5cVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            n(z5cVar.tag() << 3);
            n(i2);
        } else if (iOrdinal == 1) {
            n(z5cVar.tag() << 3);
            n((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            n((z5cVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    @Override // defpackage.lna
    public final lna f(x85 x85Var, boolean z) {
        e(x85Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.lna
    public final lna g(x85 x85Var, int i2) {
        e(x85Var, i2, true);
        return this;
    }

    @Override // defpackage.lna
    public final lna h(x85 x85Var, double d) throws IOException {
        c(x85Var, d, true);
        return this;
    }

    @Override // defpackage.lna
    public final lna i(x85 x85Var, long j) throws IOException {
        j(x85Var, j, true);
        return this;
    }

    public final void j(x85 x85Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        z5c z5cVar = (z5c) ((Annotation) x85Var.b.get(z5c.class));
        if (z5cVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = z5cVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            n(z5cVar.tag() << 3);
            o(j);
        } else if (iOrdinal == 1) {
            n(z5cVar.tag() << 3);
            o((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            n((z5cVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void k(x85 x85Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            n((m(x85Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            n(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                k(x85Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(i, x85Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            c(x85Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            n((m(x85Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            j(x85Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            e(x85Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            n((m(x85Var) << 3) | 2);
            n(bArr.length);
            this.a.write(bArr);
            return;
        }
        kna knaVar = (kna) this.b.get(obj.getClass());
        if (knaVar != null) {
            l(knaVar, x85Var, obj, z);
            return;
        }
        mlg mlgVar = (mlg) this.c.get(obj.getClass());
        if (mlgVar != null) {
            e6c e6cVar = this.e;
            e6cVar.a = false;
            e6cVar.c = x85Var;
            e6cVar.b = z;
            mlgVar.a(obj, e6cVar);
            return;
        }
        if (obj instanceof u5c) {
            e(x85Var, ((u5c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            e(x85Var, ((Enum) obj).ordinal(), true);
        } else {
            l(this.d, x85Var, obj, z);
        }
    }

    public final void l(kna knaVar, x85 x85Var, Object obj, boolean z) throws IOException {
        nu8 nu8Var = new nu8();
        nu8Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = nu8Var;
            try {
                knaVar.a(obj, this);
                this.a = outputStream;
                long j = nu8Var.a;
                nu8Var.close();
                if (z && j == 0) {
                    return;
                }
                n((m(x85Var) << 3) | 2);
                o(j);
                knaVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                nu8Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void n(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                i2 >>>= 7;
            }
        }
    }

    public final void o(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                j >>>= 7;
            }
        }
    }
}
