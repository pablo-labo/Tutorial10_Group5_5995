package com.facebook.cache.disk;

import com.facebook.cache.disk.b;
import com.facebook.common.file.FileUtils;
import defpackage.a64;
import defpackage.fia;
import defpackage.g95;
import defpackage.gze;
import defpackage.hh2;
import defpackage.ot1;
import defpackage.s55;
import defpackage.wab;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {
    public final int a;
    public final gze<File> b;
    public final String c;
    public final fia d;
    public volatile a e = new a(null, null);

    public static class a {
        public final b a;
        public final File b;

        public a(DefaultDiskStorage defaultDiskStorage, File file) {
            this.a = defaultDiskStorage;
            this.b = file;
        }
    }

    public d(int i, a64.a aVar, String str, fia fiaVar) {
        this.a = i;
        this.d = fiaVar;
        this.b = aVar;
        this.c = str;
    }

    @Override // com.facebook.cache.disk.b
    public final void a() {
        i().a();
    }

    @Override // com.facebook.cache.disk.b
    public final void b() {
        try {
            i().b();
        } catch (IOException e) {
            s55.e(d.class, "purgeUnexpectedResources", e);
        }
    }

    @Override // com.facebook.cache.disk.b
    public final boolean c(String str, ot1 ot1Var) {
        return i().c(str, ot1Var);
    }

    @Override // com.facebook.cache.disk.b
    public final b.InterfaceC0126b d(Object obj, String str) {
        return i().d(obj, str);
    }

    @Override // com.facebook.cache.disk.b
    public final long e(b.a aVar) {
        return i().e(aVar);
    }

    @Override // com.facebook.cache.disk.b
    public final g95 f(Object obj, String str) {
        return i().f(obj, str);
    }

    @Override // com.facebook.cache.disk.b
    public final Collection<b.a> g() {
        return i().g();
    }

    public final void h() throws FileUtils.CreateDirectoryException {
        File file = new File(this.b.get(), this.c);
        try {
            FileUtils.a(file);
            String absolutePath = file.getAbsolutePath();
            s55.a.getClass();
            if (wab.p(3)) {
                wab.t(3, d.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.e = new a(new DefaultDiskStorage(file, this.a, this.d), file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.d.getClass();
            throw e;
        }
    }

    public final synchronized b i() {
        b bVar;
        File file;
        a aVar = this.e;
        if (aVar.a == null || (file = aVar.b) == null || !file.exists()) {
            if (this.e.a != null && this.e.b != null) {
                hh2.o(this.e.b);
            }
            h();
        }
        bVar = this.e.a;
        bVar.getClass();
        return bVar;
    }

    @Override // com.facebook.cache.disk.b
    public final boolean isExternal() {
        try {
            return i().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.b
    public final long remove(String str) {
        return i().remove(str);
    }
}
