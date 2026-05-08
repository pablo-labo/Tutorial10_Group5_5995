package com.facebook.cache.disk;

import com.facebook.cache.disk.b;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jB = ((b.a) obj).b();
        long jB2 = ((b.a) obj2).b();
        if (jB < jB2) {
            return -1;
        }
        return jB2 == jB ? 0 : 1;
    }
}
