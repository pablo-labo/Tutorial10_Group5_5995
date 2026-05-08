package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e7e implements SerialDescriptor, iu1 {
    public final SerialDescriptor a;
    public final String b;
    public final Set<String> c;

    public e7e(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.a = serialDescriptor;
        this.b = serialDescriptor.getA() + TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR;
        this.c = ka2.j(serialDescriptor);
    }

    @Override // defpackage.iu1
    public final Set<String> a() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int getC() {
        return this.a.getC();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e7e) {
            return wl7.b(this.a, ((e7e) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m7e f() {
        return this.a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final String getA() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
        return sb.toString();
    }
}
