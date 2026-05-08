package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import defpackage.xth;
import defpackage.zth;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zth<MessageType extends zth<MessageType, BuilderType>, BuilderType extends xth<MessageType, BuilderType>> implements l3i {
    protected int zza = 0;

    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        Charset charset = mzh.a;
        iterable.getClass();
        if (iterable instanceof q1i) {
            List<?> listZzd = ((q1i) iterable).zzd();
            q1i q1iVar = (q1i) list;
            int size = list.size();
            for (Object obj : listZzd) {
                if (obj == null) {
                    int size2 = q1iVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = q1iVar.size() - 1; size3 >= size; size3--) {
                        q1iVar.remove(size3);
                    }
                    ja.k(string);
                    return;
                }
                if (obj instanceof fvh) {
                    q1iVar.O1((fvh) obj);
                } else {
                    q1iVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof b5i) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                ja.k(string2);
                return;
            }
            list.add(t);
        }
    }

    public final byte[] b() {
        try {
            dzh dzhVar = (dzh) this;
            int iE = dzhVar.e();
            byte[] bArr = new byte[iE];
            Logger logger = zzev.e;
            zzev.a aVar = new zzev.a(bArr, iE);
            dzhVar.d(aVar);
            if (aVar.l2() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            l6.p(ja.g(name.length() + 72, "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public void i(int i) {
        throw new UnsupportedOperationException();
    }
}
