package kotlinx.serialization.descriptors;

import defpackage.m7e;
import defpackage.zr4;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i);

    m7e f();

    List<Annotation> g(int i);

    default List<Annotation> getAnnotations() {
        return zr4.a;
    }

    SerialDescriptor h(int i);

    String i();

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
