package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    public class a implements a.InterfaceC0114a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0114a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0114a
        public final com.bumptech.glide.load.data.a<Object> b(Object obj) {
            return new C0115b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b, reason: collision with other inner class name */
    public static final class C0115b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0115b(Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public final Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public final void b() {
        }
    }
}
