package defpackage;

import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public class awd {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static void c(Appendable appendable, Object obj, Function1 function1) {
        appendable.getClass();
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static TextView d(MaterialToolbar materialToolbar, CharSequence charSequence) {
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        f(j3, j6, jArr4, 0);
        f(j2, j5, jArr4, 2);
        f(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void f(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void g(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        e(jArr, jArr2, jArr4);
        j(jArr4, jArr3);
    }

    public static final KSerializer i(yd8 yd8Var, ArrayList arrayList, gu5 gu5Var) {
        KSerializer gt0Var;
        KSerializer nucVar;
        yd8Var.getClass();
        iwc iwcVar = fwc.a;
        if (yd8Var.equals(iwcVar.b(Collection.class)) || yd8Var.equals(iwcVar.b(List.class)) || yd8Var.equals(iwcVar.b(List.class)) || yd8Var.equals(iwcVar.b(ArrayList.class))) {
            gt0Var = new gt0((KSerializer) arrayList.get(0), 0);
        } else if (yd8Var.equals(iwcVar.b(HashSet.class))) {
            gt0Var = new gt0((KSerializer) arrayList.get(0), 1);
        } else if (yd8Var.equals(iwcVar.b(Set.class)) || yd8Var.equals(iwcVar.b(Set.class)) || yd8Var.equals(iwcVar.b(LinkedHashSet.class))) {
            gt0Var = new dy8((KSerializer) arrayList.get(0));
        } else if (yd8Var.equals(iwcVar.b(HashMap.class))) {
            gt0Var = new lg6((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else if (yd8Var.equals(iwcVar.b(Map.class)) || yd8Var.equals(iwcVar.b(Map.class)) || yd8Var.equals(iwcVar.b(LinkedHashMap.class))) {
            gt0Var = new by8((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else {
            if (yd8Var.equals(iwcVar.b(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                nucVar = new qb9(kSerializer, kSerializer2);
            } else if (yd8Var.equals(iwcVar.b(Pair.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                nucVar = new b3b(kSerializer3, kSerializer4);
            } else if (yd8Var.equals(iwcVar.b(muf.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                gt0Var = new nuf(kSerializer5, kSerializer6, kSerializer7);
            } else if (jh2.p(yd8Var).isArray()) {
                Object objInvoke = gu5Var.invoke();
                objInvoke.getClass();
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                kSerializer8.getClass();
                nucVar = new nuc((yd8) objInvoke, kSerializer8);
            } else {
                gt0Var = null;
            }
            gt0Var = nucVar;
        }
        if (gt0Var != null) {
            return gt0Var;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return hh2.n(jh2.p(yd8Var), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static final KSerializer k(v1 v1Var, zf8 zf8Var) {
        v1Var.getClass();
        zf8Var.getClass();
        KSerializer<Object> kSerializerA = h8e.a(v1Var, zf8Var, true);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        throw new SerializationException(ka2.C(ka2.B(zf8Var)));
    }

    public static final KSerializer l(v1 v1Var, Type type) {
        v1Var.getClass();
        type.getClass();
        KSerializer<Object> kSerializerC = g8e.c(v1Var, type, true);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        Class<?> clsA = g8e.a(type);
        clsA.getClass();
        throw new SerializationException(ka2.C(fwc.a.b(clsA)));
    }

    public static final KSerializer m(yd8 yd8Var) throws IllegalAccessException, InvocationTargetException {
        yd8Var.getClass();
        KSerializer kSerializerO = o(yd8Var);
        if (kSerializerO != null) {
            return kSerializerO;
        }
        throw new SerializationException(ka2.C(yd8Var));
    }

    public static final KSerializer n(v1 v1Var, zf8 zf8Var) {
        v1Var.getClass();
        zf8Var.getClass();
        return h8e.a(v1Var, zf8Var, false);
    }

    public static final KSerializer o(yd8 yd8Var) throws IllegalAccessException, InvocationTargetException {
        yd8Var.getClass();
        KSerializer kSerializerN = hh2.n(jh2.p(yd8Var), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return kSerializerN == null ? (KSerializer) hnb.a.get(yd8Var) : kSerializerN;
    }

    public static final ArrayList p(v1 v1Var, List list, boolean z) {
        v1Var.getClass();
        list.getClass();
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(k(v1Var, (zf8) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            KSerializer kSerializerN = n(v1Var, (zf8) it2.next());
            if (kSerializerN == null) {
                return null;
            }
            arrayList2.add(kSerializerN);
        }
        return arrayList2;
    }

    public static void q(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[4];
        g(jArr, jArr3);
        j(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            g(jArr2, jArr3);
            j(jArr3, jArr2);
        }
    }

    public static int r(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String u(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        o6.h();
        return null;
    }
}
