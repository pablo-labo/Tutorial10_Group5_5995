package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ud8<R> extends td8 {
    R call(Object... objArr);

    R callBy(Map<mf8, ? extends Object> map);

    String getName();

    List<mf8> getParameters();

    zf8 getReturnType();

    List<dg8> getTypeParameters();

    jg8 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
