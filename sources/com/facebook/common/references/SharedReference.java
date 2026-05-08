package com.facebook.common.references;

import defpackage.a6d;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedReference<T> {
    public static final IdentityHashMap d = new IdentityHashMap();
    public T a;
    public int b;
    public final a6d<T> c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, a6d<T> a6dVar, boolean z) {
        t.getClass();
        this.a = t;
        this.c = a6dVar;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(t);
                    if (num == null) {
                        identityHashMap.put(t, 1);
                    } else {
                        identityHashMap.put(t, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized T a() {
        return this.a;
    }
}
