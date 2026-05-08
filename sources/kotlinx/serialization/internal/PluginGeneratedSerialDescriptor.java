package kotlinx.serialization.internal;

import defpackage.boa;
import defpackage.bs4;
import defpackage.dd;
import defpackage.gwe;
import defpackage.iu1;
import defpackage.m7e;
import defpackage.oq;
import defpackage.qq;
import defpackage.qt8;
import defpackage.sw5;
import defpackage.wl7;
import defpackage.zkd;
import defpackage.zr4;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Liu1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, iu1 {
    public final String a;
    public final sw5<?> b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List<Annotation>[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map<String, Integer> i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public PluginGeneratedSerialDescriptor(String str, sw5<?> sw5Var, int i) {
        this.a = str;
        this.b = sw5Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.h = new boolean[i3];
        this.i = bs4.a;
        oq oqVar = new oq(this, 17);
        qt8 qt8Var = qt8.b;
        this.j = boa.E(qt8Var, oqVar);
        this.k = boa.E(qt8Var, new dd(this, 14));
        this.l = boa.E(qt8Var, new qq(this, 18));
    }

    @Override // defpackage.iu1
    public final Set<String> a() {
        return this.i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer num = this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.getA()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).k.getValue())) {
                int c = serialDescriptor.getC();
                int i = this.c;
                if (i == c) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (wl7.b(h(i2).getA(), serialDescriptor.h(i2).getA()) && wl7.b(h(i2).f(), serialDescriptor.h(i2).f())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public m7e f() {
        return gwe.a.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        List<Annotation> list = this.f[i];
        return list == null ? zr4.a : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? zr4.a : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return ((KSerializer[]) this.j.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.h[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = map;
        }
    }

    public final void l(Annotation annotation) {
        annotation.getClass();
        if (this.g == null) {
            this.g = new ArrayList(1);
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public String toString() {
        return zkd.P(this);
    }
}
