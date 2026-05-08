package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class f7e implements SerialDescriptor, iu1 {
    public final String a;
    public final m7e b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final SerialDescriptor[] k;
    public final d2f l;

    public f7e(String str, m7e m7eVar, int i, List<? extends SerialDescriptor> list, j62 j62Var) {
        m7eVar.getClass();
        this.a = str;
        this.b = m7eVar;
        this.c = i;
        this.d = j62Var.b;
        ArrayList arrayList = j62Var.c;
        this.e = z92.x1(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = ka2.t(j62Var.e);
        this.h = (List[]) j62Var.f.toArray(new List[0]);
        this.i = z92.s1(j62Var.g);
        strArr.getClass();
        na7 na7Var = new na7(new qr(strArr, 1));
        ArrayList arrayList2 = new ArrayList(t92.r0(na7Var, 10));
        Iterator it = na7Var.iterator();
        while (true) {
            oa7 oa7Var = (oa7) it;
            if (!oa7Var.a.hasNext()) {
                this.j = lc9.f0(arrayList2);
                this.k = ka2.t(list);
                this.l = new d2f(new cq0(this, 17));
                return;
            }
            ma7 ma7Var = (ma7) oa7Var.next();
            arrayList2.add(new Pair(ma7Var.b, Integer.valueOf(ma7Var.a)));
        }
    }

    @Override // defpackage.iu1
    public final Set<String> a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer num = this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int getC() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f7e) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.getA()) && Arrays.equals(this.k, ((f7e) obj).k)) {
                int c = serialDescriptor.getC();
                int i = this.c;
                if (i == c) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        if (wl7.b(serialDescriptorArr[i2].getA(), serialDescriptor.h(i2).getA()) && wl7.b(serialDescriptorArr[i2].f(), serialDescriptor.h(i2).f())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final String getA() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return zkd.P(this);
    }
}
