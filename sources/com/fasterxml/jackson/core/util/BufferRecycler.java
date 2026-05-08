package com.fasterxml.jackson.core.util;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.fasterxml.jackson.core.util.RecyclerPool;
import defpackage.bg;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public class BufferRecycler implements RecyclerPool.WithPool<BufferRecycler> {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, UiRumDebugListener.DEFAULT_ALPHA, UiRumDebugListener.DEFAULT_ALPHA};
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;
    private RecyclerPool<BufferRecycler> _pool;

    public interface Gettable {
        BufferRecycler bufferRecycler();
    }

    public BufferRecycler(int i, int i2) {
        this._byteBuffers = new AtomicReferenceArray<>(i);
        this._charBuffers = new AtomicReferenceArray<>(i2);
    }

    public byte[] allocByteBuffer(int i, int i2) {
        int iByteBufferLength = byteBufferLength(i);
        if (i2 < iByteBufferLength) {
            i2 = iByteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? balloc(i2) : andSet;
    }

    public char[] allocCharBuffer(int i, int i2) {
        int iCharBufferLength = charBufferLength(i);
        if (i2 < iCharBufferLength) {
            i2 = iCharBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? calloc(i2) : andSet;
    }

    public byte[] balloc(int i) {
        return new byte[i];
    }

    public int byteBufferLength(int i) {
        return BYTE_BUFFER_LENGTHS[i];
    }

    public char[] calloc(int i) {
        return new char[i];
    }

    public int charBufferLength(int i) {
        return CHAR_BUFFER_LENGTHS[i];
    }

    public void releaseByteBuffer(int i, byte[] bArr) {
        byte[] bArr2 = this._byteBuffers.get(i);
        if (bArr2 == null || bArr.length > bArr2.length) {
            this._byteBuffers.set(i, bArr);
        }
    }

    public void releaseCharBuffer(int i, char[] cArr) {
        char[] cArr2 = this._charBuffers.get(i);
        if (cArr2 == null || cArr.length > cArr2.length) {
            this._charBuffers.set(i, cArr);
        }
    }

    public void releaseToPool() {
        RecyclerPool<BufferRecycler> recyclerPool = this._pool;
        if (recyclerPool != null) {
            this._pool = null;
            recyclerPool.releasePooled(this);
        }
    }

    @Override // com.fasterxml.jackson.core.util.RecyclerPool.WithPool
    public BufferRecycler withPool(RecyclerPool<BufferRecycler> recyclerPool) {
        if (this._pool != null) {
            bg.n(recyclerPool, "BufferRecycler already linked to pool: ");
            return null;
        }
        Objects.requireNonNull(recyclerPool);
        this._pool = recyclerPool;
        return this;
    }

    public BufferRecycler() {
        this(4, 4);
    }

    @Override // com.fasterxml.jackson.core.util.RecyclerPool.WithPool
    public /* bridge */ /* synthetic */ RecyclerPool.WithPool withPool(RecyclerPool recyclerPool) {
        return withPool((RecyclerPool<BufferRecycler>) recyclerPool);
    }

    public final byte[] allocByteBuffer(int i) {
        return allocByteBuffer(i, 0);
    }

    public final char[] allocCharBuffer(int i) {
        return allocCharBuffer(i, 0);
    }
}
