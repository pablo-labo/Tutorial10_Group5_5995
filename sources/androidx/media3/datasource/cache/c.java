package androidx.media3.datasource.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache;
import defpackage.at2;
import defpackage.au1;
import defpackage.bt2;
import defpackage.fu1;
import defpackage.gu1;
import defpackage.i47;
import defpackage.jt1;
import defpackage.ka2;
import defpackage.kfe;
import defpackage.kt1;
import defpackage.l6;
import defpackage.mfe;
import defpackage.nm3;
import defpackage.r40;
import defpackage.r6;
import defpackage.sf3;
import defpackage.t40;
import defpackage.zkd;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Cache {
    public static final HashSet<File> k = new HashSet<>();
    public final File a;
    public final b b;
    public final gu1 c;
    public final kt1 d;
    public final HashMap<String, ArrayList<Cache.a>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public boolean i;
    public Cache.CacheException j;

    public c(File file, b bVar, sf3 sf3Var) {
        boolean zAdd;
        gu1 gu1Var = new gu1(sf3Var, file);
        kt1 kt1Var = sf3Var != null ? new kt1(sf3Var) : null;
        synchronized (c.class) {
            zAdd = k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            r6.g(l6.g(file, "Another SimpleCache instance uses the folder: "));
            throw null;
        }
        this.a = file;
        this.b = bVar;
        this.c = gu1Var;
        this.d = kt1Var;
        this.e = new HashMap<>();
        this.f = new Random();
        bVar.getClass();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new kfe(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void h(c cVar) {
        long j;
        kt1 kt1Var = cVar.d;
        gu1 gu1Var = cVar.c;
        File file = cVar.a;
        if (!file.exists()) {
            try {
                k(file);
            } catch (Cache.CacheException e) {
                cVar.j = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            zkd.w("SimpleCache", str);
            cVar.j = new Cache.CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    zkd.w("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        cVar.h = j;
        if (j == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                long j2 = 0;
                long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file3 = new File(file, t40.k(Long.toString(jAbs, 16), ".uid"));
                if (file3.createNewFile()) {
                    j2 = jAbs;
                } else {
                    r40.h(l6.g(file3, "Failed to create UID file: "));
                }
                cVar.h = j2;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                zkd.x("SimpleCache", str2, e2);
                cVar.j = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            gu1Var.e(cVar.h);
            if (kt1Var != null) {
                kt1Var.c(cVar.h);
                HashMap mapA = kt1Var.a();
                cVar.m(file, true, fileArrListFiles, mapA);
                kt1Var.d(mapA.keySet());
            } else {
                cVar.m(file, true, fileArrListFiles, null);
            }
            Iterator it = i47.k(gu1Var.a.keySet()).iterator();
            while (it.hasNext()) {
                gu1Var.f((String) it.next());
            }
            try {
                gu1Var.g();
            } catch (IOException e3) {
                zkd.x("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            zkd.x("SimpleCache", str3, e4);
            cVar.j = new Cache.CacheException(str3, e4);
        }
    }

    public static void k(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        zkd.w("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static synchronized void r(File file) {
        k.remove(file.getAbsoluteFile());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized nm3 a(String str) {
        fu1 fu1VarC;
        ka2.q(!this.i);
        fu1VarC = this.c.c(str);
        return fu1VarC != null ? fu1VarC.e : nm3.c;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void b(au1 au1Var) {
        ka2.q(!this.i);
        fu1 fu1VarC = this.c.c(au1Var.a);
        fu1VarC.getClass();
        long j = au1Var.b;
        ArrayList<fu1.a> arrayList = fu1VarC.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).a == j) {
                arrayList.remove(i);
                this.c.f(fu1VarC.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized mfe c(long j, String str, long j2) {
        ka2.q(!this.i);
        j();
        mfe mfeVarL = l(j, str, j2);
        if (mfeVarL.d) {
            return q(str, mfeVarL);
        }
        fu1 fu1VarD = this.c.d(str);
        long j3 = mfeVarL.c;
        ArrayList<fu1.a> arrayList = fu1VarD.d;
        for (int i = 0; i < arrayList.size(); i++) {
            fu1.a aVar = arrayList.get(i);
            long j4 = aVar.a;
            if (j4 <= j) {
                long j5 = aVar.b;
                if (j5 == -1 || j4 + j5 > j) {
                    return null;
                }
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    return null;
                }
            }
        }
        arrayList.add(new fu1.a(j, j3));
        return mfeVarL;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void d(File file, long j) {
        boolean z = true;
        ka2.q(!this.i);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            mfe mfeVarC = mfe.c(file, j, -9223372036854775807L, this.c);
            mfeVarC.getClass();
            fu1 fu1VarC = this.c.c(mfeVarC.a);
            fu1VarC.getClass();
            ka2.q(fu1VarC.a(mfeVarC.b, mfeVarC.c));
            long jA = at2.a(fu1VarC.e);
            if (jA != -1) {
                if (mfeVarC.b + mfeVarC.c > jA) {
                    z = false;
                }
                ka2.q(z);
            }
            if (this.d == null) {
                i(mfeVarC);
                this.c.g();
                notifyAll();
                return;
            }
            try {
                this.d.e(mfeVarC.c, file.getName(), mfeVarC.f);
                i(mfeVarC);
                try {
                    this.c.g();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized mfe e(long j, String str, long j2) {
        mfe mfeVarC;
        ka2.q(!this.i);
        j();
        while (true) {
            mfeVarC = c(j, str, j2);
            if (mfeVarC == null) {
                wait();
            }
        }
        return mfeVarC;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void f(String str, bt2 bt2Var) {
        ka2.q(!this.i);
        j();
        gu1 gu1Var = this.c;
        fu1 fu1VarD = gu1Var.d(str);
        nm3 nm3Var = fu1VarD.e;
        nm3 nm3VarB = nm3Var.b(bt2Var);
        fu1VarD.e = nm3VarB;
        if (!nm3VarB.equals(nm3Var)) {
            gu1Var.e.a(fu1VarD);
        }
        try {
            this.c.g();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized File g(long j, String str, long j2) {
        fu1 fu1VarC;
        File file;
        try {
            ka2.q(!this.i);
            j();
            fu1VarC = this.c.c(str);
            fu1VarC.getClass();
            ka2.q(fu1VarC.a(j, j2));
            if (!this.a.exists()) {
                k(this.a);
                p();
            }
            this.b.b(this, j2);
            file = new File(this.a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                k(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mfe.e(file, fu1VarC.a, j, System.currentTimeMillis());
    }

    public final void i(mfe mfeVar) {
        String str = mfeVar.a;
        this.c.d(str).c.add(mfeVar);
        ArrayList<Cache.a> arrayList = this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, mfeVar);
            }
        }
        this.b.a(this, mfeVar);
    }

    public final synchronized void j() {
        Cache.CacheException cacheException = this.j;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final mfe l(long j, String str, long j2) {
        mfe mfeVarFloor;
        long j3;
        fu1 fu1VarC = this.c.c(str);
        if (fu1VarC == null) {
            return new mfe(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            mfe mfeVar = new mfe(fu1VarC.b, j, -1L, -9223372036854775807L, null);
            TreeSet<mfe> treeSet = fu1VarC.c;
            mfeVarFloor = treeSet.floor(mfeVar);
            if (mfeVarFloor == null || mfeVarFloor.b + mfeVarFloor.c <= j) {
                mfe mfeVarCeiling = treeSet.ceiling(mfeVar);
                if (mfeVarCeiling != null) {
                    long jMin = mfeVarCeiling.b - j;
                    if (j2 != -1) {
                        jMin = Math.min(jMin, j2);
                    }
                    j3 = jMin;
                } else {
                    j3 = j2;
                }
                mfeVarFloor = new mfe(fu1VarC.b, j, j3, -9223372036854775807L, null);
            }
            if (!mfeVarFloor.d) {
                break;
            }
            File file = mfeVarFloor.e;
            file.getClass();
            if (file.length() == mfeVarFloor.c) {
                break;
            }
            p();
        }
        return mfeVarFloor;
    }

    public final void m(File file, boolean z, File[] fileArr, Map<String, jt1> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                jt1 jt1VarRemove = map != null ? map.remove(name) : null;
                if (jt1VarRemove != null) {
                    j = jt1VarRemove.a;
                    j2 = jt1VarRemove.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                mfe mfeVarC = mfe.c(file2, j, j2, this.c);
                if (mfeVarC != null) {
                    i(mfeVarC);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void n() {
        File file;
        if (this.i) {
            return;
        }
        this.e.clear();
        p();
        try {
            try {
                this.c.g();
                file = this.a;
            } catch (Throwable th) {
                r(this.a);
                this.i = true;
                throw th;
            }
        } catch (IOException e) {
            zkd.x("SimpleCache", "Storing index file failed", e);
            file = this.a;
        }
        r(file);
        this.i = true;
    }

    public final void o(au1 au1Var) {
        String str = au1Var.a;
        File file = au1Var.e;
        gu1 gu1Var = this.c;
        fu1 fu1VarC = gu1Var.c(str);
        if (fu1VarC == null || !fu1VarC.c.remove(au1Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        kt1 kt1Var = this.d;
        if (kt1Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) kt1Var.b).getClass();
                try {
                    ((sf3) kt1Var.a).getWritableDatabase().delete((String) kt1Var.b, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                t40.p("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        gu1Var.f(fu1VarC.b);
        ArrayList<Cache.a> arrayList = this.e.get(au1Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(au1Var);
            }
        }
        this.b.c(au1Var);
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (it.hasNext()) {
            for (mfe mfeVar : ((fu1) it.next()).c) {
                File file = mfeVar.e;
                file.getClass();
                if (file.length() != mfeVar.c) {
                    arrayList.add(mfeVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o((au1) arrayList.get(i));
        }
    }

    public final mfe q(String str, mfe mfeVar) {
        boolean z;
        File file;
        File file2 = mfeVar.e;
        if (!this.g) {
            return mfeVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j = mfeVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kt1 kt1Var = this.d;
        if (kt1Var != null) {
            try {
                kt1Var.e(j, name, jCurrentTimeMillis);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                zkd.T("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        fu1 fu1VarC = this.c.c(str);
        fu1VarC.getClass();
        TreeSet<mfe> treeSet = fu1VarC.c;
        ka2.q(treeSet.remove(mfeVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileE = mfe.e(parentFile, fu1VarC.a, mfeVar.b, jCurrentTimeMillis);
            if (file2.renameTo(fileE)) {
                file = fileE;
            } else {
                zkd.T("CachedContent", "Failed to rename " + file2 + " to " + fileE);
                file = file2;
            }
        } else {
            file = file2;
        }
        ka2.q(mfeVar.d);
        mfe mfeVar2 = new mfe(mfeVar.a, mfeVar.b, mfeVar.c, jCurrentTimeMillis, file);
        treeSet.add(mfeVar2);
        ArrayList<Cache.a> arrayList = this.e.get(mfeVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, mfeVar, mfeVar2);
            }
        }
        this.b.d(this, mfeVar, mfeVar2);
        return mfeVar2;
    }
}
