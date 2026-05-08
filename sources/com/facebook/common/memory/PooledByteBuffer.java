package com.facebook.common.memory;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int i(int i, int i2, int i3, byte[] bArr);

    boolean isClosed();

    byte o(int i);

    int size();
}
