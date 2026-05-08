package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.kt0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final RecyclableBufferedInputStream a;

    public static final class a implements a.InterfaceC0114a<InputStream> {
        public final kt0 a;

        public a(kt0 kt0Var) {
            this.a = kt0Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0114a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0114a
        public final com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, kt0 kt0Var) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, kt0Var);
        this.a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public final InputStream a() {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.a;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
        this.a.h();
    }
}
