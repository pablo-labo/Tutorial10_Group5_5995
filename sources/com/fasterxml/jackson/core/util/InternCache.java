package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache instance = new InternCache();
    private static final long serialVersionUID = 1;
    private final Object lock;

    public InternCache(int i, float f, int i2) {
        super(i, f, i2);
        this.lock = new Object();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.lock) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }

    public InternCache() {
        this(180, 0.8f, 4);
    }
}
