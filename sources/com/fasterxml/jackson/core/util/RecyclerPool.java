package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool.WithPool;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface RecyclerPool<P extends WithPool<P>> extends Serializable {

    public static abstract class NonRecyclingPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return (P) acquirePooled();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P acquirePooled();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
        }
    }

    public static abstract class ThreadLocalPoolBase<P extends WithPool<P>> implements RecyclerPool<P> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public P acquireAndLinkPooled() {
            return (P) acquirePooled();
        }

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public abstract P acquirePooled();

        @Override // com.fasterxml.jackson.core.util.RecyclerPool
        public void releasePooled(P p) {
        }
    }

    public interface WithPool<P extends WithPool<P>> {
        P withPool(RecyclerPool<P> recyclerPool);
    }

    default P acquireAndLinkPooled() {
        return (P) acquirePooled().withPool(this);
    }

    P acquirePooled();

    void releasePooled(P p);
}
